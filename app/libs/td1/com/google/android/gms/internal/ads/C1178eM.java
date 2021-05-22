package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eM  reason: case insensitive filesystem */
public final class C1178eM implements AbstractC1180eO<Object> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4203a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final String f4204b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4205c;
    private final C0467Kt d;
    private final C0909aS e;
    private final GR f;

    public C1178eM(String str, String str2, C0467Kt kt, C0909aS aSVar, GR gr) {
        this.f4204b = str;
        this.f4205c = str2;
        this.d = kt;
        this.e = aSVar;
        this.f = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<Object> a() {
        Bundle bundle = new Bundle();
        if (((Boolean) C2392voa.e().a(C2474x.Ad)).booleanValue()) {
            this.d.a(this.f.d);
            bundle.putAll(this.e.a());
        }
        return JW.a(new C1110dM(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (!((Boolean) C2392voa.e().a(C2474x.Ad)).booleanValue()) {
            if (((Boolean) C2392voa.e().a(C2474x.zd)).booleanValue()) {
                synchronized (f4203a) {
                    this.d.a(this.f.d);
                    bundle2.putBundle("quality_signals", this.e.a());
                }
                bundle2.putString("seq_num", this.f4204b);
                bundle2.putString("session_id", this.f4205c);
            }
            this.d.a(this.f.d);
            bundle = this.e.a();
        }
        bundle2.putBundle("quality_signals", bundle);
        bundle2.putString("seq_num", this.f4204b);
        bundle2.putString("session_id", this.f4205c);
    }
}
