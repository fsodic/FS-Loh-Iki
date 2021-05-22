package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Uf  reason: case insensitive filesystem */
public class C0713Uf extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final C1912opa f3261a;

    /* renamed from: b  reason: collision with root package name */
    private long f3262b;

    public C0713Uf() {
        this.f3261a = null;
    }

    public C0713Uf(C1912opa opa) {
        this.f3261a = opa;
    }

    public C0713Uf(String str) {
        super(str);
        this.f3261a = null;
    }

    public C0713Uf(Throwable th) {
        super(th);
        this.f3261a = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.f3262b = j;
    }
}
