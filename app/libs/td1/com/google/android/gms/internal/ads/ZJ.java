package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;

public final class ZJ implements e {

    /* renamed from: a  reason: collision with root package name */
    private e f3626a;

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a() {
        if (this.f3626a != null) {
            this.f3626a.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a(View view) {
        if (this.f3626a != null) {
            this.f3626a.a(view);
        }
    }

    public final synchronized void a(e eVar) {
        this.f3626a = eVar;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void b() {
        if (this.f3626a != null) {
            this.f3626a.b();
        }
    }
}
