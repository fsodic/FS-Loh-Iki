package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pr  reason: case insensitive filesystem */
public final class C0595Pr {

    /* renamed from: a  reason: collision with root package name */
    private final C1859oE f2887a;

    /* renamed from: b  reason: collision with root package name */
    private final BR f2888b;

    public C0595Pr(C1859oE oEVar, BR br) {
        this.f2887a = oEVar;
        this.f2888b = br;
    }

    public final void a(long j) {
        C1790nE a2 = this.f2887a.a();
        a2.a(this.f2888b.f1611b.f6181b);
        a2.a("action", "ad_closed");
        a2.a("show_time", String.valueOf(j));
        a2.a("ad_format", "appopen");
        a2.a();
    }
}
