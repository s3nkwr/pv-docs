---
outline: deep
---

# Audio Encoding & Encryption
Plasmo Voice uses the 'Opus' codec to encode audio packets and 'AES/CBC/PKCS5Padding' encryption to encrypt the audio packets.

## Encoding & Encryption
:::tip
For most use-cases it's easier to use an [AudioSender](/docs/api/sources#audio-sender).
:::

If you want to send your own PCM audio frames, you need to encode each frame with `Opus` and then encrypt it with `AES`.

Each frame should be a `20ms 48kHz 16-bit` frame.

:::code-group
```java
PlasmoVoiceServer voiceServer = /**/;
short[] audioFrame = new short[960];

AudioEncoder encoder = voiceServer.createOpusEncoder(false); // false means mono
Encryption encryption = voiceServer.getDefaultEncryption();

try {
    byte[] encodedFrame = encoder.encode(audioFrame);
    byte[] encryptedFrame = encryption.encrypt(encodedFrame);
    
    // .. send encryptedFrame to the source
} catch (CodecException e) {
    throw new RuntimeException("Failed to encode audio frame", e);
} catch (EncryptionException e) {
    throw new RuntimeException("Failed to encrypt audio frame", e);
}

encoder.close()
```

```kotlin
val voiceServer: PlasmoVoiceServer = /**/;
val audioFrame = ShortArray(960) { 0 }

val encoder = voiceServer.createOpusEncoder(false); // false means mono
val encryption = voiceServer.defaultEncryption

try {
    val encodedFrame = encoder.encode(audioFrame);
    val encryptedFrame = encryption.encrypt(encodedFrame);

    // ... send encryptedFrame to the source
} catch (e: CodecException) {
    throw RuntimeException("Failed to encode audio frame", e);
} catch (e: EncryptionException) {
    throw RuntimeException("Failed to encrypt audio frame", e);
}

encoder.close()
```
:::

:::warning
To prevent memory leaks, you need to close the `AudioEncoder` if it is no longer used.
:::

## Decoding & Decryption
To obtain a raw PCM audio frame received from the client, decrypt it with `AES` and decode it with `Opus`:

:::code-group
```java
PlasmoVoiceServer voiceServer = /**/;
byte[] encryptedFrame = /**/;

AudioDecoder decoder = voiceServer.createOpusDecoder(false);
Encryption encryption = voiceServer.getDefaultEncryption();

try {
    byte[] decryptedFrame = encryption.decrypt(encryptedFrame);
    short[] audioFrame = decoder.decode(decryptedFrame);
    
    // do whatever you want
} catch (CodecException e) {
    throw new RuntimeException("Failed to decrypt audio frame", e);
} catch (EncryptionException e) {
    throw new RuntimeException("Failed to decode audio frame", e);
}

decoder.close();
```

```kotlin
val voiceServer: PlasmoVoiceServer = /**/;
val encryptedFrame: ByteArray = /**/;

val decoder = voiceServer.createOpusDecoder(false)
val encryption = voiceServer.defaultEncryption

try {
    val decryptedFrame = encryption.decrypt(encryptedFrame)
    val audioFrame = decoder.decode(decryptedFrame)

    // ...
} catch (e: CodecException) {
    throw RuntimeException("Failed to decrypt audio frame", e)
} catch (e: EncryptionException) {
    throw RuntimeException("Failed to decode audio frame", e)
}

decoder.close()
```
:::

:::warning
To prevent memory leaks, you need to close the `AudioDecoder` if it is no longer used.
:::
