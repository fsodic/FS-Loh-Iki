package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.g.a;
import com.google.android.gms.ads.g.d;
import com.google.android.gms.ads.o;

public final class Jpa {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC1684lf f2358a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2359b;

    /* renamed from: c  reason: collision with root package name */
    private final _na f2360c;
    private c d;
    private Ona e;
    private Loa f;
    private String g;
    private a h;
    private com.google.android.gms.ads.a.a i;
    private com.google.android.gms.ads.a.c j;
    private d k;
    private boolean l;
    private boolean m;
    private o n;

    public Jpa(Context context) {
        this(context, _na.f3764a, null);
    }

    private Jpa(Context context, _na _na, e eVar) {
        this.f2358a = new BinderC1684lf();
        this.f2359b = context;
        this.f2360c = _na;
    }

    private final void b(String str) {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Bundle a() {
        try {
            if (this.f != null) {
                return this.f.I();
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final void a(c cVar) {
        try {
            this.d = cVar;
            if (this.f != null) {
                this.f.b(cVar != null ? new Vna(cVar) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.h = aVar;
            if (this.f != null) {
                this.f.a(aVar != null ? new Wna(aVar) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(d dVar) {
        try {
            this.k = dVar;
            if (this.f != null) {
                this.f.a(dVar != null ? new BinderC0222Bi(dVar) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(Fpa fpa) {
        try {
            if (this.f == null) {
                if (this.g == null) {
                    b("loadAd");
                }
                C1015boa M = this.l ? C1015boa.M() : new C1015boa();
                C1565joa b2 = C2392voa.b();
                Context context = this.f2359b;
                this.f = (Loa) new C1841noa(b2, context, M, this.g, this.f2358a).a(context, false);
                if (this.d != null) {
                    this.f.b(new Vna(this.d));
                }
                if (this.e != null) {
                    this.f.a(new Nna(this.e));
                }
                if (this.h != null) {
                    this.f.a(new Wna(this.h));
                }
                if (this.i != null) {
                    this.f.a(new BinderC1290foa(this.i));
                }
                if (this.j != null) {
                    this.f.a(new X(this.j));
                }
                if (this.k != null) {
                    this.f.a(new BinderC0222Bi(this.k));
                }
                this.f.a(new dqa(this.n));
                this.f.a(this.m);
            }
            if (this.f.a(_na.a(this.f2359b, fpa))) {
                this.f2358a.a(fpa.n());
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(Ona ona) {
        try {
            this.e = ona;
            if (this.f != null) {
                this.f.a(ona != null ? new Nna(ona) : null);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(String str) {
        if (this.g == null) {
            this.g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a(boolean z) {
        try {
            this.m = z;
            if (this.f != null) {
                this.f.a(z);
            }
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void b(boolean z) {
        this.l = true;
    }

    public final boolean b() {
        try {
            if (this.f == null) {
                return false;
            }
            return this.f.p();
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final void c() {
        try {
            b("show");
            this.f.showInterstitial();
        } catch (RemoteException e2) {
            C0745Vl.d("#008 Must be called on the main UI thread.", e2);
        }
    }
}
