package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.py  reason: case insensitive filesystem */
public final class C1990py extends C0952at {
    private final Context h;
    private final WeakReference<AbstractC1564jo> i;
    private final C0211Ax j;
    private final AbstractC0732Uy k;
    private final C2329ut l;
    private final C1186eU m;
    private final C0702Tu n;
    private boolean o = false;

    C1990py(C0882_s _sVar, Context context, AbstractC1564jo joVar, C0211Ax ax, AbstractC0732Uy uy, C2329ut utVar, C1186eU eUVar, C0702Tu tu) {
        super(_sVar);
        this.h = context;
        this.i = new WeakReference<>(joVar);
        this.j = ax;
        this.k = uy;
        this.l = utVar;
        this.m = eUVar;
        this.n = tu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1990py.a(boolean):boolean");
    }

    public final void finalize() {
        try {
            AbstractC1564jo joVar = this.i.get();
            if (((Boolean) C2392voa.e().a(C2474x.Ee)).booleanValue()) {
                if (!this.o && joVar != null) {
                    VW vw = C0875_l.e;
                    joVar.getClass();
                    vw.execute(RunnableC1921oy.a(joVar));
                }
            } else if (joVar != null) {
                joVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.l.a();
    }
}
