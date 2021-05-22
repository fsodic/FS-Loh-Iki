package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Ur  reason: case insensitive filesystem */
public final class C0725Ur extends C0952at {
    private final View h;
    private final AbstractC1564jo i;
    private final C1872oR j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private AbstractC1149dma n;
    private final C0595Pr o;

    C0725Ur(C0882_s _sVar, View view, AbstractC1564jo joVar, C1872oR oRVar, int i2, boolean z, boolean z2, C0595Pr pr) {
        super(_sVar);
        this.h = view;
        this.i = joVar;
        this.j = oRVar;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.o = pr;
    }

    public final void a(long j2) {
        this.o.a(j2);
    }

    public final void a(Xla xla) {
        AbstractC1564jo joVar = this.i;
        if (joVar != null) {
            joVar.a(xla);
        }
    }

    public final void a(AbstractC1149dma dma) {
        this.n = dma;
    }

    public final boolean g() {
        AbstractC1564jo joVar = this.i;
        return (joVar == null || joVar.d() == null || !this.i.d().g()) ? false : true;
    }

    public final int h() {
        return this.k;
    }

    public final boolean i() {
        return this.l;
    }

    public final boolean j() {
        return this.m;
    }

    public final C1872oR k() {
        return JR.a(this.f3847b.o, this.j);
    }

    public final View l() {
        return this.h;
    }

    public final boolean m() {
        AbstractC1564jo joVar = this.i;
        return joVar != null && joVar.F();
    }

    public final AbstractC1149dma n() {
        return this.n;
    }
}
