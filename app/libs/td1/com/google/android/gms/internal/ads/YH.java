package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.c.a;

public final class YH extends AbstractBinderC0430Ji implements AbstractC2331uv {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0326Fi f3545a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC2538xv f3546b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1095cy f3547c;

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void D(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.D(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void J(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.J(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void N(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.N(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void a(Bundle bundle) {
        if (this.f3545a != null) {
            this.f3545a.a(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void a(a aVar, C0456Ki ki) {
        if (this.f3545a != null) {
            this.f3545a.a(aVar, ki);
        }
    }

    public final synchronized void a(AbstractC0326Fi fi) {
        this.f3545a = fi;
    }

    public final synchronized void a(AbstractC1095cy cyVar) {
        this.f3547c = cyVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2331uv
    public final synchronized void a(AbstractC2538xv xvVar) {
        this.f3546b = xvVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void b(a aVar, int i) {
        if (this.f3545a != null) {
            this.f3545a.b(aVar, i);
        }
        if (this.f3547c != null) {
            this.f3547c.a(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void c(a aVar, int i) {
        if (this.f3545a != null) {
            this.f3545a.c(aVar, i);
        }
        if (this.f3546b != null) {
            this.f3546b.c(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void h(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.h(aVar);
        }
        if (this.f3546b != null) {
            this.f3546b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void j(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.j(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void n(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.n(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void u(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.u(aVar);
        }
        if (this.f3547c != null) {
            this.f3547c.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final synchronized void y(a aVar) {
        if (this.f3545a != null) {
            this.f3545a.y(aVar);
        }
    }
}
