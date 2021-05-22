package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.c.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cs  reason: case insensitive filesystem */
public final class C1089cs extends AbstractC0951as {
    private final Context h;
    private final View i;
    private final AbstractC1564jo j;
    private final C1872oR k;
    private final AbstractC0804Xs l;
    private final C1098dA m;
    private final C0627Qx n;
    private final Lea<BinderC1658lK> o;
    private final Executor p;
    private C1015boa q;

    C1089cs(C0882_s _sVar, Context context, C1872oR oRVar, View view, AbstractC1564jo joVar, AbstractC0804Xs xs, C1098dA dAVar, C0627Qx qx, Lea<BinderC1658lK> lea, Executor executor) {
        super(_sVar);
        this.h = context;
        this.i = view;
        this.j = joVar;
        this.k = oRVar;
        this.l = xs;
        this.m = dAVar;
        this.n = qx;
        this.o = lea;
        this.p = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final void a(ViewGroup viewGroup, C1015boa boa) {
        AbstractC1564jo joVar;
        if (viewGroup != null && (joVar = this.j) != null) {
            joVar.a(C1153dp.a(boa));
            viewGroup.setMinimumHeight(boa.f3942c);
            viewGroup.setMinimumWidth(boa.f);
            this.q = boa;
        }
    }

    @Override // com.google.android.gms.internal.ads.C0952at
    public final void b() {
        this.p.execute(new RunnableC1295fs(this));
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final AbstractC2532xpa g() {
        try {
            return this.l.getVideoController();
        } catch (MR unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final C1872oR h() {
        boolean z;
        C1015boa boa = this.q;
        if (boa != null) {
            return JR.a(boa);
        }
        C1941pR pRVar = this.f3847b;
        if (pRVar.U) {
            Iterator<String> it = pRVar.f5229a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new C1872oR(this.i.getWidth(), this.i.getHeight(), false);
            }
        }
        return JR.a(this.f3847b.o, this.k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final View i() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final C1872oR j() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final int k() {
        return this.f3846a.f1611b.f6181b.f5411c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final void l() {
        this.n.Q();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        if (this.m.d() != null) {
            try {
                this.m.d().a(this.o.get(), b.a(this.h));
            } catch (RemoteException e) {
                C0745Vl.b("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
