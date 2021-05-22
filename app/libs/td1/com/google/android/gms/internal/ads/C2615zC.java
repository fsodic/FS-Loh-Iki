package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.zC  reason: case insensitive filesystem */
public final class C2615zC extends C0952at {
    private final Context h;
    private final WeakReference<AbstractC1564jo> i;
    private final AbstractC0732Uy j;
    private final C0211Ax k;
    private final C0702Tu l;
    private final C0209Av m;
    private final C2329ut n;
    private final AbstractC0508Mi o;
    private final C1186eU p;
    private boolean q = false;

    C2615zC(C0882_s _sVar, Context context, AbstractC1564jo joVar, AbstractC0732Uy uy, C0211Ax ax, C0702Tu tu, C0209Av av, C2329ut utVar, C1941pR pRVar, C1186eU eUVar) {
        super(_sVar);
        this.h = context;
        this.j = uy;
        this.i = new WeakReference<>(joVar);
        this.k = ax;
        this.l = tu;
        this.m = av;
        this.n = utVar;
        this.p = eUVar;
        this.o = new BinderC1004bj(pRVar.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r5, android.app.Activity r6) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2615zC.a(boolean, android.app.Activity):boolean");
    }

    public final void finalize() {
        try {
            AbstractC1564jo joVar = this.i.get();
            if (((Boolean) C2392voa.e().a(C2474x.Ee)).booleanValue()) {
                if (!this.q && joVar != null) {
                    VW vw = C0875_l.e;
                    joVar.getClass();
                    vw.execute(RunnableC2546yC.a(joVar));
                }
            } else if (joVar != null) {
                joVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle g() {
        return this.m.Q();
    }

    public final boolean h() {
        return this.n.a();
    }

    public final boolean i() {
        return this.q;
    }

    public final AbstractC0508Mi j() {
        return this.o;
    }

    public final boolean k() {
        AbstractC1564jo joVar = this.i.get();
        return joVar != null && !joVar.n();
    }
}
