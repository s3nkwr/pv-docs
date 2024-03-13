package com.plasmovoice.testaddon;

import su.plo.voice.api.server.PlasmoVoiceServer;
import su.plo.voice.api.server.audio.provider.ArrayAudioFrameProvider;
import su.plo.voice.api.server.audio.source.AudioSender;
import su.plo.voice.api.server.audio.source.ServerPlayerSource;

public final class TestAudioSender {

    /**
     * Sends the audio samples to an audio source in specified distance.
     *
     * @param voiceServer Plasmo Voice Server API.
     * @param source The audio source to send audio.
     * @param samples 48kHz 16-bit mono audio samples.
     * @param distance The distance to send audio.
     */
    private void sendPacketsToSource(
            PlasmoVoiceServer voiceServer,
            ServerPlayerSource source,
            short[] samples,
            short distance
    ) {
        ArrayAudioFrameProvider frameProvider = new ArrayAudioFrameProvider(voiceServer, false);

        AudioSender audioSender = source.createAudioSender(frameProvider, distance);
        // or
        // AudioSender audioSender = source.createAudioSender(frameProvider);
        // if you are using direct or broadcast source

        frameProvider.addSamples(samples);

        audioSender.start();

        audioSender.onStop(() -> {
            // you need to close the ArrayAudioFrameProvider,
            // because it contains the encoder which should be closed after being used,
            // otherwise it will cause a memory leak
            frameProvider.close();

            // you also need to remove the source from the source line
            // if you don't need it after the audio was sent
            source.remove();
        });

        // you can also manually stop the AudioSender:
        // audioSender.stop()

        // or pause/resume:
        // audioSender.pause()
        // audioSender.resume()
    }
}
