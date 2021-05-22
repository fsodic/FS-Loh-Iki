package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.c.b;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.s;
import com.google.android.gms.ads.t;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Hpa {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC1684lf f2181a;

    /* renamed from: b  reason: collision with root package name */
    private final _na f2182b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f2183c;
    private final s d;
    private final C2323uoa e;
    private Ona f;
    private c g;
    private f[] h;
    private a i;
    private Loa j;
    private com.google.android.gms.ads.a.c k;
    private t l;
    private String m;
    private ViewGroup n;
    private int o;
    private boolean p;
    private o q;

    public Hpa(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, _na.f3764a, i2);
    }

    private Hpa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, _na _na, int i2) {
        this(viewGroup, attributeSet, z, _na, null, i2);
    }

    private Hpa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, _na _na, Loa loa, int i2) {
        C1015boa boa;
        this.f2181a = new BinderC1684lf();
        this.d = new s();
        this.e = new Gpa(this);
        this.n = viewGroup;
        this.f2182b = _na;
        this.j = null;
        this.f2183c = new AtomicBoolean(false);
        this.o = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C1634koa koa = new C1634koa(context, attributeSet);
                this.h = koa.a(z);
                this.m = koa.a();
                if (viewGroup.isInEditMode()) {
                    C0459Kl a2 = C2392voa.a();
                    f fVar = this.h[0];
                    int i3 = this.o;
                    if (fVar.equals(f.i)) {
                        boa = C1015boa.O();
                    } else {
                        C1015boa boa2 = new C1015boa(context, fVar);
                        boa2.j = a(i3);
                        boa = boa2;
                    }
                    a2.a(viewGroup, boa, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                C2392voa.a().a(viewGroup, new C1015boa(context, f.f1064a), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static C1015boa a(Context context, f[] fVarArr, int i2) {
        for (f fVar : fVarArr) {
            if (fVar.equals(f.i)) {
                return C1015boa.O();
            }
        }
        C1015boa boa = new C1015boa(context, fVarArr);
        boa.j = a(i2);
        return boa;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a() {
        try {
            if (this.j != null) {
                this.j.destroy();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.i = aVar;
            if (this.j != null) {
                this.j.a(aVar != null ? new BinderC1290foa(aVar) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.a.c cVar) {
        this.k = cVar;
        try {
            if (this.j != null) {
                this.j.a(cVar != null ? new X(cVar) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(c cVar) {
        this.g = cVar;
        this.e.a(cVar);
    }

    public final void a(o oVar) {
        try {
            this.q = oVar;
            if (this.j != null) {
                this.j.a(new dqa(oVar));
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(t tVar) {
        this.l = tVar;
        try {
            if (this.j != null) {
                this.j.a(tVar == null ? null : new C1028c(tVar));
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(Fpa fpa) {
        try {
            if (this.j == null) {
                if ((this.h == null || this.m == null) && this.j == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.n.getContext();
                C1015boa a2 = a(context, this.h, this.o);
                this.j = (Loa) ("search_v2".equals(a2.f3940a) ? new C1910ooa(C2392voa.b(), context, a2, this.m).a(context, false) : new C1703loa(C2392voa.b(), context, a2, this.m, this.f2181a).a(context, false));
                this.j.b(new Vna(this.e));
                if (this.f != null) {
                    this.j.a(new Nna(this.f));
                }
                if (this.i != null) {
                    this.j.a(new BinderC1290foa(this.i));
                }
                if (this.k != null) {
                    this.j.a(new X(this.k));
                }
                if (this.l != null) {
                    this.j.a(new C1028c(this.l));
                }
                this.j.a(new dqa(this.q));
                this.j.d(this.p);
                try {
                    b.c.b.a.c.a Ab = this.j.Ab();
                    if (Ab != null) {
                        this.n.addView((View) b.Q(Ab));
                    }
                } catch (RemoteException e2) {
                    C0745Vl.d("#007 Could not call remote method.", e2);
                }
            }
            if (this.j.a(_na.a(this.n.getContext(), fpa))) {
                this.f2181a.a(fpa.n());
            }
        } catch (RemoteException e3) {
            C0745Vl.d("#007 Could not call remote method.", e3);
        }
    }

    public final void a(Ona ona) {
        try {
            this.f = ona;
            if (this.j != null) {
                this.j.a(ona != null ? new Nna(ona) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(String str) {
        if (this.m == null) {
            this.m = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void a(boolean z) {
        this.p = z;
        try {
            if (this.j != null) {
                this.j.d(this.p);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(f... fVarArr) {
        if (this.h == null) {
            b(fVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final c b() {
        return this.g;
    }

    public final void b(f... fVarArr) {
        this.h = fVarArr;
        try {
            if (this.j != null) {
                this.j.a(a(this.n.getContext(), this.h, this.o));
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
        this.n.requestLayout();
    }

    public final f c() {
        C1015boa ib;
        try {
            if (!(this.j == null || (ib = this.j.ib()) == null)) {
                return ib.P();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
        f[] fVarArr = this.h;
        if (fVarArr != null) {
            return fVarArr[0];
        }
        return null;
    }

    public final f[] d() {
        return this.h;
    }

    public final String e() {
        Loa loa;
        if (this.m == null && (loa = this.j) != null) {
            try {
                this.m = loa.zb();
            } catch (RemoteException e2) {
                C0745Vl.d("#007 Could not call remote method.", e2);
            }
        }
        return this.m;
    }

    public final a f() {
        return this.i;
    }

    public final String g() {
        try {
            if (this.j != null) {
                return this.j.Z();
            }
            return null;
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final com.google.android.gms.ads.a.c h() {
        return this.k;
    }

    public final r i() {
        AbstractC2187spa spa = null;
        try {
            if (this.j != null) {
                spa = this.j.C();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
        return r.a(spa);
    }

    public final s j() {
        return this.d;
    }

    public final t k() {
        return this.l;
    }

    public final void l() {
        try {
            if (this.j != null) {
                this.j.pause();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final void m() {
        try {
            if (this.j != null) {
                this.j.resume();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
        }
    }

    public final AbstractC2532xpa n() {
        Loa loa = this.j;
        if (loa == null) {
            return null;
        }
        try {
            return loa.getVideoController();
        } catch (RemoteException e2) {
            C0745Vl.d("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
