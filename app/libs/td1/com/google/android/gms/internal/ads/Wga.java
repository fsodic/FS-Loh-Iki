package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class Wga {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3443a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f3444b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3445c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f3443a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static Hga a(Dka dka, String str, String str2, Dha dha) {
        int i = f3444b[(dka.g() & 192) >> 6];
        int g = dka.g();
        int i2 = d[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return Hga.a(str, "audio/ac3", null, -1, -1, i2, i, null, dha, 0, str2);
    }

    public static Hga b(Dka dka, String str, String str2, Dha dha) {
        dka.d(2);
        int i = f3444b[(dka.g() & 192) >> 6];
        int g = dka.g();
        int i2 = d[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return Hga.a(str, "audio/eac3", null, -1, -1, i2, i, null, dha, 0, str2);
    }
}
