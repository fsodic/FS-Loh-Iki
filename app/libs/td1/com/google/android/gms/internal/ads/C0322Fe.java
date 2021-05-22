package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Fe  reason: case insensitive filesystem */
public final class C0322Fe {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1975a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f1976b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private C0556Oe f1977c;
    private C0556Oe d;

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final C0556Oe a(Context context, C0823Yl yl) {
        C0556Oe oe;
        synchronized (this.f1976b) {
            if (this.d == null) {
                this.d = new C0556Oe(a(context), yl, C2570ya.f6101b.a());
            }
            oe = this.d;
        }
        return oe;
    }

    public final C0556Oe b(Context context, C0823Yl yl) {
        C0556Oe oe;
        synchronized (this.f1975a) {
            if (this.f1977c == null) {
                this.f1977c = new C0556Oe(a(context), yl, (String) C2392voa.e().a(C2474x.f5942a));
            }
            oe = this.f1977c;
        }
        return oe;
    }
}
