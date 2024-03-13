package com.plasmovoice.testaddon;

import su.plo.voice.api.server.PlasmoVoiceServer;
import su.plo.voice.api.server.audio.provider.AudioFrameProvider;
import su.plo.voice.api.server.audio.provider.AudioFrameResult;
import su.plo.voice.api.server.audio.source.AudioSender;
import su.plo.voice.api.server.audio.source.ServerPlayerSource;

public final class CustomFrameProvider {

    /**
     * Sends the audio samples to an audio source in specified distance.
     *
     * @param source The audio source to send audio.
     * @param distance The distance to send audio.
     */
    private void createCustomFrameProvider(
            ServerPlayerSource source,
            short distance
    ) {
        TestAudioFrameProvider frameProvider = new TestAudioFrameProvider();

        AudioSender audioSender = source.createAudioSender(frameProvider, distance);
        // or
        // AudioSender audioSender = source.createAudioSender(frameProvider);
        // if you are using direct or broadcast source

        audioSender.start();
        audioSender.onStop(() -> {
            // you also need to remove the source from the source line
            // if you don't need it after the audio was sent
            source.remove();
        });
    }

    public class TestAudioFrameProvider implements AudioFrameProvider {

        @Override
        public AudioFrameResult provide20ms() {
            if (/* end of the audio stream*/) {
                // [EndOfStream] means that [AudioFrameProvider] reaches the end of the current stream,
                // but not completely closed and frames could be sent later
                return AudioFrameResult.EndOfStream.INSTANCE;
            } else if (/* audio stream finished */) {
                // [Finished] means that [AudioFrameProvider] is completely closed and will not return any frames
                return AudioFrameResult.Finished.INSTANCE;
            }

            // null frame means that frame is not ready yet
            // return new AudioFrameResult.Provided(null);

            byte[] encryptedFrame = new byte[100];
            return new AudioFrameResult.Provided(encryptedFrame);
        }
    }
}
