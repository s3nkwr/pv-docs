package com.plasmovoice.testaddon

import su.plo.voice.api.server.audio.provider.AudioFrameProvider
import su.plo.voice.api.server.audio.provider.AudioFrameResult
import su.plo.voice.api.server.audio.provider.AudioFrameResult.Provided
import su.plo.voice.api.server.audio.source.ServerPlayerSource

class CustomFrameProvider {

    /**
     * Sends the audio samples to an audio source in specified distance.
     *
     * @param source The audio source to send audio.
     * @param distance The distance to send audio.
     */
    private fun createCustomFrameProvider(
        source: ServerPlayerSource,
        distance: Short
    ) {
        val frameProvider = TestAudioFrameProvider()

        val audioSender = source.createAudioSender(frameProvider, distance)
        // or
        // AudioSender audioSender = source.createAudioSender(frameProvider);
        // if you are using direct or broadcast source

        audioSender.start()

        audioSender.onStop {
            // you also need to remove the source from the source line
            // if you don't need it after the audio was sent
            source.remove()
        }
    }

    inner class TestAudioFrameProvider : AudioFrameProvider {

        override fun provide20ms(): AudioFrameResult {
            if (/* end of the audio stream*/) {
                // [EndOfStream] means that [AudioFrameProvider] reaches the end of the current stream,
                // but not completely closed and frames could be sent later
                return AudioFrameResult.EndOfStream
            } else if (/* audio stream finished */) {
                // [Finished] means that [AudioFrameProvider] is completely closed and will not return any frames
                return AudioFrameResult.Finished
            }

            // null frame means that frame is not ready yet
            // return Provided(null);

            val encryptedFrame = ByteArray(100)
            return Provided(encryptedFrame)
        }
    }
}
