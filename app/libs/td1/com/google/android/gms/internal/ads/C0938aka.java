package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aka  reason: case insensitive filesystem */
public final class C0938aka {

    /* renamed from: a  reason: collision with root package name */
    public final Lja f3834a;

    /* renamed from: b  reason: collision with root package name */
    public final _ja f3835b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3836c;
    public final Oga[] d;

    public C0938aka(Lja lja, _ja _ja, Object obj, Oga[] ogaArr) {
        this.f3834a = lja;
        this.f3835b = _ja;
        this.f3836c = obj;
        this.d = ogaArr;
    }

    public final boolean a(C0938aka aka, int i) {
        return aka != null && Jka.a(this.f3835b.a(i), aka.f3835b.a(i)) && Jka.a(this.d[i], aka.d[i]);
    }
}
