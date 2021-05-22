package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public final class YV {

    /* renamed from: a  reason: collision with root package name */
    private static final OutputStream f3564a = new XV();

    public static byte[] a(InputStream inputStream) {
        int i;
        C1945pV.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        for (int i3 = 0; i3 < 2147483639; i3 = i) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i3)];
            arrayDeque.add(bArr);
            i = i3;
            int i4 = 0;
            while (i4 < bArr.length) {
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                if (read == -1) {
                    return a(arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            i2 = ZV.a(i2, 2);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
