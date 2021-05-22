package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bga  reason: case insensitive filesystem */
public class C0999bga {

    /* renamed from: a  reason: collision with root package name */
    private final C1823nfa f3919a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3920b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3921c;
    private final int d = 2;
    private volatile Method e = null;
    private final Class<?>[] f;
    private CountDownLatch g = new CountDownLatch(1);

    public C0999bga(C1823nfa nfa, String str, String str2, Class<?>... clsArr) {
        this.f3919a = nfa;
        this.f3920b = str;
        this.f3921c = str2;
        this.f = clsArr;
        this.f3919a.e().submit(new RunnableC0930aga(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.f3919a.g().a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:4:? A[ExcHandler: Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:6:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.nfa r0 = r3.f3919a     // Catch:{ all -> 0x0035 }
            dalvik.system.DexClassLoader r0 = r0.f()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.nfa r1 = r3.f3919a     // Catch:{ all -> 0x0035 }
            byte[] r1 = r1.h()     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r3.f3920b     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ all -> 0x0035 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001e
        L_0x0018:
            java.util.concurrent.CountDownLatch r0 = r3.g
            r0.countDown()
            return
        L_0x001e:
            com.google.android.gms.internal.ads.nfa r1 = r3.f3919a     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            byte[] r1 = r1.h()     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r2 = r3.f3921c     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.String r1 = r3.a(r1, r2)     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.Class<?>[] r2 = r3.f     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            r3.e = r0     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            java.lang.reflect.Method r0 = r3.e     // Catch:{ Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, Qca | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018 }
            goto L_0x0018
        L_0x0035:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r3.g
            r1.countDown()
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0999bga.b():void");
    }

    public final Method a() {
        if (this.e != null) {
            return this.e;
        }
        try {
            if (!this.g.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.e;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
