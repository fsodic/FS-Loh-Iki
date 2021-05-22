package com.google.android.gms.internal.ads;

import a.c.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.aC  reason: case insensitive filesystem */
public final class BinderC0893aC extends AbstractBinderC2089rb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3780a;

    /* renamed from: b  reason: collision with root package name */
    private final C0707Tz f3781b;

    /* renamed from: c  reason: collision with root package name */
    private C1924pA f3782c;
    private C0525Mz d;

    public BinderC0893aC(Context context, C0707Tz tz, C1924pA pAVar, C0525Mz mz) {
        this.f3780a = context;
        this.f3781b = tz;
        this.f3782c = pAVar;
        this.d = mz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final String J() {
        return this.f3781b.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final void Sa() {
        String x = this.f3781b.x();
        if ("Google".equals(x)) {
            C0745Vl.d("Illegal argument specified for omid partner name.");
            return;
        }
        C0525Mz mz = this.d;
        if (mz != null) {
            mz.a(x, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final List<String> Wa() {
        g<String, BinderC0474La> w = this.f3781b.w();
        g<String, String> y = this.f3781b.y();
        String[] strArr = new String[(w.size() + y.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < w.size()) {
            strArr[i3] = w.b(i2);
            i2++;
            i3++;
        }
        while (i < y.size()) {
            strArr[i3] = y.b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final boolean db() {
        a v = this.f3781b.v();
        if (v != null) {
            q.r().a(v);
            return true;
        }
        C0745Vl.d("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final void destroy() {
        C0525Mz mz = this.d;
        if (mz != null) {
            mz.a();
        }
        this.d = null;
        this.f3782c = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final AbstractC2532xpa getVideoController() {
        return this.f3781b.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final boolean ob() {
        C0525Mz mz = this.d;
        return (mz == null || mz.l()) && this.f3781b.u() != null && this.f3781b.t() == null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final String p(String str) {
        return this.f3781b.y().get(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final void p(a aVar) {
        C0525Mz mz;
        Object Q = b.Q(aVar);
        if ((Q instanceof View) && this.f3781b.v() != null && (mz = this.d) != null) {
            mz.b((View) Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final void r(String str) {
        C0525Mz mz = this.d;
        if (mz != null) {
            mz.a(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final void u() {
        C0525Mz mz = this.d;
        if (mz != null) {
            mz.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final AbstractC0812Ya v(String str) {
        return this.f3781b.w().get(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final boolean v(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof ViewGroup)) {
            return false;
        }
        C1924pA pAVar = this.f3782c;
        if (!(pAVar != null && pAVar.a((ViewGroup) Q))) {
            return false;
        }
        this.f3781b.t().a(new _B(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final a yb() {
        return b.a(this.f3780a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final a z() {
        return null;
    }
}
