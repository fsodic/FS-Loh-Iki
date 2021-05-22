package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C0952at;
import java.util.LinkedList;

public final class LS<AdT extends C0952at> {

    /* renamed from: a  reason: collision with root package name */
    private final C1873oS f2487a;

    /* renamed from: b  reason: collision with root package name */
    private RS f2488b;

    /* renamed from: c  reason: collision with root package name */
    private C1052cX<CS<AdT>> f2489c;
    private SW<CS<AdT>> d;
    private int e = AS.g;
    private final AbstractC2079rS f;
    private final OS<AdT> g;
    private final LinkedList<RS> h;
    private final GW<CS<AdT>> i = new MS(this);

    public LS(AbstractC2079rS rSVar, C1873oS oSVar, OS<AdT> os) {
        this.f = rSVar;
        this.f2487a = oSVar;
        this.g = os;
        this.h = new LinkedList<>();
        this.f2487a.a(new NS(this));
    }

    private final boolean b() {
        SW<CS<AdT>> sw = this.d;
        return sw == null || sw.isDone();
    }

    /* access modifiers changed from: private */
    public final void c(RS rs) {
        while (b()) {
            if (rs != null || !this.h.isEmpty()) {
                if (rs == null) {
                    rs = this.h.remove();
                }
                if (rs.b() == null || !this.f.a(rs.b())) {
                    rs = null;
                } else {
                    this.f2488b = rs.c();
                    this.f2489c = C1052cX.h();
                    this.d = this.g.a(this.f2488b);
                    JW.a(this.d, this.i, rs.a());
                    return;
                }
            } else {
                return;
            }
        }
        if (rs != null) {
            this.h.add(rs);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(CS cs) {
        SW a2;
        synchronized (this) {
            a2 = JW.a(new PS(cs, this.f2488b));
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        synchronized (this) {
            c(this.f2488b);
        }
    }

    public final void a(RS rs) {
        this.h.add(rs);
    }

    public final synchronized SW<PS<AdT>> b(RS rs) {
        if (b()) {
            return null;
        }
        this.e = AS.i;
        if (this.f2488b.b() == null || rs.b() == null || !this.f2488b.b().equals(rs.b())) {
            return null;
        }
        this.e = AS.h;
        return JW.a(this.f2489c, new KS(this), rs.a());
    }
}
