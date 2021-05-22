package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe  reason: case insensitive filesystem */
public final class C2027qe extends C1905om<AbstractC0244Ce> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5332c = new Object();
    private final C2302ue d;
    private boolean e;

    public C2027qe(C2302ue ueVar) {
        this.d = ueVar;
    }

    public final void c() {
        synchronized (this.f5332c) {
            if (!this.e) {
                this.e = true;
                a(new C2233te(this), new C1767mm());
                a(new C2164se(this), new C2371ve(this));
            }
        }
    }
}
