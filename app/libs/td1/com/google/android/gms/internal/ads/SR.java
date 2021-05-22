package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import b.c.b.a.c.b;
import java.util.List;

public final class SR {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1960pf f3085a;

    public SR(AbstractC1960pf pfVar) {
        this.f3085a = pfVar;
    }

    public final void a() {
        try {
            this.f3085a.destroy();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context) {
        try {
            this.f3085a.x(b.a(context));
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, AbstractC0326Fi fi, List<String> list) {
        try {
            this.f3085a.a(b.a(context), fi, list);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, Zna zna, String str, AbstractC0326Fi fi, String str2) {
        try {
            this.f3085a.a(b.a(context), zna, (String) null, fi, str2);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, Zna zna, String str, AbstractC2304uf ufVar) {
        try {
            this.f3085a.a(b.a(context), zna, str, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        try {
            this.f3085a.a(b.a(context), zna, str, str2, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, Zna zna, String str, String str2, AbstractC2304uf ufVar, C0578Pa pa, List<String> list) {
        try {
            this.f3085a.a(b.a(context), zna, str, str2, ufVar, pa, list);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, C1015boa boa, Zna zna, String str, AbstractC2304uf ufVar) {
        try {
            this.f3085a.a(b.a(context), boa, zna, str, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, C1015boa boa, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        try {
            this.f3085a.a(b.a(context), boa, zna, str, str2, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Context context, AbstractC1267fd fdVar, List<C1818nd> list) {
        try {
            this.f3085a.a(b.a(context), fdVar, list);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(Zna zna, String str) {
        try {
            this.f3085a.a(zna, str);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void a(boolean z) {
        try {
            this.f3085a.a(z);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final AbstractC2532xpa b() {
        try {
            return this.f3085a.getVideoController();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void b(Context context) {
        try {
            this.f3085a.K(b.a(context));
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void b(Context context, Zna zna, String str, AbstractC2304uf ufVar) {
        try {
            this.f3085a.b(b.a(context), zna, str, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final View c() {
        try {
            return (View) b.Q(this.f3085a.xb());
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void c(Context context, Zna zna, String str, AbstractC2304uf ufVar) {
        try {
            this.f3085a.c(b.a(context), zna, str, ufVar);
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final boolean d() {
        try {
            return this.f3085a.isInitialized();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void e() {
        try {
            this.f3085a.pause();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void f() {
        try {
            this.f3085a.resume();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void g() {
        try {
            this.f3085a.showInterstitial();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final void h() {
        try {
            this.f3085a.showVideo();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final AbstractC2580yf i() {
        try {
            return this.f3085a.nb();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final AbstractC0271Df j() {
        try {
            return this.f3085a.bb();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final boolean k() {
        try {
            return this.f3085a.sa();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final AbstractC0297Ef l() {
        try {
            return this.f3085a.Cb();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final C0194Ag m() {
        try {
            return this.f3085a.fa();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final C0194Ag n() {
        try {
            return this.f3085a.da();
        } catch (Throwable th) {
            throw new MR(th);
        }
    }
}
