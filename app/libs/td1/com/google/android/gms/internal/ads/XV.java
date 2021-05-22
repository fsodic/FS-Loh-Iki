package com.google.android.gms.internal.ads;

import java.io.OutputStream;

final class XV extends OutputStream {
    XV() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C1945pV.a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C1945pV.a(bArr);
    }
}
