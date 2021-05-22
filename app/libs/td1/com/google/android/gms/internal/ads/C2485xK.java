package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;
import com.google.android.gms.internal.ads.C1856oB;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xK  reason: case insensitive filesystem */
public final class C2485xK {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5967a = false;

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f5968b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5969c = new Object();
    private static final Object d = new Object();
    static CountDownLatch e = new CountDownLatch(1);

    private static C1511jB a(C1511jB.d dVar) {
        C1511jB.a u = C1511jB.u();
        u.u((long) dVar.a());
        return (C1511jB) u.j();
    }

    static String a(C1511jB jBVar, String str) {
        byte[] bArr;
        AbstractC0993bda j;
        byte[] f = jBVar.f();
        if (((Boolean) C2392voa.e().a(C2474x.Hb)).booleanValue()) {
            Vector<byte[]> a2 = a(f, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = a(a(C1511jB.d.PSN_ENCODE_SIZE_FAIL).f(), str, true);
                return C2415wJ.a(bArr, true);
            }
            C1856oB.a n = C1856oB.n();
            Iterator<byte[]> it = a2.iterator();
            while (it.hasNext()) {
                n.a(Iba.a(a(it.next(), str, false)));
            }
            n.b(Iba.a(a(f)));
            j = n.j();
        } else if (C2374vfa.f5820a != null) {
            byte[] a3 = C2374vfa.f5820a.a(f, str != null ? str.getBytes() : new byte[0]);
            C1856oB.a n2 = C1856oB.n();
            n2.a(Iba.a(a3));
            n2.a(SE.TINK_HYBRID);
            j = n2.j();
        } else {
            throw new GeneralSecurityException();
        }
        bArr = ((C1856oB) j).f();
        return C2415wJ.a(bArr, true);
    }

    private static Vector<byte[]> a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (d) {
            if (!f5967a) {
                f5967a = true;
                new Thread(new RunnableC2555yL()).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (f5969c) {
            MessageDigest b2 = b();
            if (b2 != null) {
                b2.reset();
                b2.update(bArr);
                digest = f5968b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = a(C1511jB.d.PSN_ENCODE_SIZE_FAIL).f();
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (AbstractC0974bO bOVar : new C0904aN().Lc) {
            bOVar.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C2435wba(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        boolean z;
        MessageDigest messageDigest;
        a();
        try {
            z = e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f5968b) != null) {
            return messageDigest;
        }
        return null;
    }
}
