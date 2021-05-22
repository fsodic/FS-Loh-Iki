package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sl  reason: case insensitive filesystem */
public final class C2178sl {
    private static int a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return a(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder(41);
                sb.append("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ IOException | BufferUnderflowException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ IOException | BufferUnderflowException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01aa A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) {
        /*
        // Method dump skipped, instructions count: 808
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2178sl.a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] a(int[] iArr, AbstractC0368Gy[] gyArr) {
        long j;
        AbstractC0368Gy[] gyArr2 = gyArr;
        int length = gyArr2.length;
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= length) {
                break;
            }
            j3 += ((gyArr2[i2].size() + 1048576) - 1) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr.length][];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                byte[] bArr2 = new byte[((c(iArr[i4]) * i3) + 5)];
                bArr2[0] = 90;
                a(i3, bArr2, 1);
                bArr[i4] = bArr2;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[iArr.length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String b2 = b(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(b2);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(String.valueOf(b2).concat(" digest not supported"), e);
                }
            }
            int length2 = gyArr2.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                AbstractC0368Gy gy = gyArr2[i6];
                long j4 = j2;
                long size = gy.size();
                while (size > j2) {
                    int min = (int) Math.min(size, j);
                    a(min, bArr3, 1);
                    for (MessageDigest messageDigest : messageDigestArr) {
                        messageDigest.update(bArr3);
                    }
                    try {
                        gy.a(messageDigestArr, j4, min);
                        int i8 = 0;
                        while (i8 < iArr.length) {
                            int i9 = iArr[i8];
                            byte[] bArr4 = bArr[i8];
                            int c2 = c(i9);
                            MessageDigest messageDigest2 = messageDigestArr[i8];
                            int digest = messageDigest2.digest(bArr4, (i7 * c2) + 5, c2);
                            if (digest == c2) {
                                i8++;
                                bArr3 = bArr3;
                                length2 = length2;
                                messageDigestArr = messageDigestArr;
                            } else {
                                String algorithm = messageDigest2.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        long j5 = (long) min;
                        size -= j5;
                        i7++;
                        bArr3 = bArr3;
                        j = 1048576;
                        j4 += j5;
                        j2 = 0;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i++;
                i6++;
                gyArr2 = gyArr;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr5 = new byte[iArr.length][];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                byte[] bArr6 = bArr[i10];
                String b3 = b(i11);
                try {
                    bArr5[i10] = MessageDigest.getInstance(b3).digest(bArr6);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(String.valueOf(b3).concat(" digest not supported"), e3);
                }
            }
            return bArr5;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[Catch:{ all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0268  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate[][] a(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2178sl.a(java.lang.String):java.security.cert.X509Certificate[][]");
    }

    private static X509Certificate[][] a(FileChannel fileChannel, C1880oZ oZVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a2 = a(C1880oZ.a(oZVar));
                int i = 0;
                while (a2.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(a(a(a2), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    long b2 = C1880oZ.b(oZVar);
                    long c2 = C1880oZ.c(oZVar);
                    long d = C1880oZ.d(oZVar);
                    ByteBuffer e2 = C1880oZ.e(oZVar);
                    if (!hashMap.isEmpty()) {
                        C2030qfa qfa = new C2030qfa(fileChannel, 0, b2);
                        C2030qfa qfa2 = new C2030qfa(fileChannel, c2, d - c2);
                        ByteBuffer duplicate = e2.duplicate();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        Rga.a(duplicate, b2);
                        ZL zl = new ZL(duplicate);
                        int[] iArr = new int[hashMap.size()];
                        int i2 = 0;
                        for (Integer num : hashMap.keySet()) {
                            iArr[i2] = num.intValue();
                            i2++;
                        }
                        try {
                            byte[][] a3 = a(iArr, new AbstractC0368Gy[]{qfa, qfa2, zl});
                            for (int i3 = 0; i3 < iArr.length; i3++) {
                                int i4 = iArr[i3];
                                if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), a3[i3])) {
                                    throw new SecurityException(String.valueOf(b(i4)).concat(" digest of contents did not verify"));
                                }
                            }
                            return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                        } catch (DigestException e3) {
                            throw new SecurityException("Failed to compute digest(s) of contents", e3);
                        }
                    } else {
                        throw new SecurityException("No digests provided");
                    }
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e5);
        }
    }

    private static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    private static int c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
