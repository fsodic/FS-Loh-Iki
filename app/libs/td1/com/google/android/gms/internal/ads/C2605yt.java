package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yt  reason: case insensitive filesystem */
public final class C2605yt<T> {

    /* renamed from: a  reason: collision with root package name */
    private final BF f6142a;

    /* renamed from: b  reason: collision with root package name */
    private final LF f6143b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f6144c;
    private final BT d;
    private final C0828Yq e;
    private final VI<T> f;
    private final C0652Rw g;
    private final BR h;
    private final C1379hG i;
    private final C2055qu j;
    private final Executor k;
    private final C1172eG l;

    C2605yt(BF bf, LF lf, GR gr, BT bt, C0828Yq yq, VI<T> vi, C0652Rw rw, BR br, C1379hG hGVar, C2055qu quVar, Executor executor, C1172eG eGVar) {
        this.f6142a = bf;
        this.f6143b = lf;
        this.f6144c = gr;
        this.d = bt;
        this.e = yq;
        this.f = vi;
        this.g = rw;
        this.h = br;
        this.i = hGVar;
        this.j = quVar;
        this.k = executor;
        this.l = eGVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.t */
    /* JADX WARN: Multi-variable type inference failed */
    private final SW<BR> b(SW<C0715Uh> sw) {
        C2218tT a2;
        AbstractC2221tW tWVar;
        C2218tT a3;
        C2080rT a4;
        SW<BR> a5;
        if (this.h != null) {
            a4 = this.d.a(EnumC2563yT.SERVER_TRANSACTION);
            a5 = JW.a(this.h);
        } else {
            q.i().a();
            if (this.f6144c.d.s != null) {
                a4 = this.d.a(EnumC2563yT.SERVER_TRANSACTION);
                a5 = this.f6143b.a();
            } else {
                if (((Boolean) C2392voa.e().a(C2474x.df)).booleanValue()) {
                    a2 = this.d.a(EnumC2563yT.SERVER_TRANSACTION, sw);
                    C1172eG eGVar = this.l;
                    eGVar.getClass();
                    tWVar = C2536xt.a(eGVar);
                } else {
                    a2 = this.d.a(EnumC2563yT.SERVER_TRANSACTION, sw);
                    tWVar = this.f6142a;
                }
                a3 = a2.a(tWVar);
                return a3.a();
            }
        }
        a3 = a4.a(a5);
        return a3.a();
    }

    public final SW<BR> a() {
        return b(this.j.b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.t */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.internal.ads.t */
    /* JADX WARN: Multi-variable type inference failed */
    public final SW<T> a(SW<BR> sw) {
        C2218tT a2;
        if (((Boolean) C2392voa.e().a(C2474x.wd)).booleanValue()) {
            a2 = this.d.a(EnumC2563yT.RENDERER, sw).a((AbstractC2221tW) this.e).a((AbstractC2221tW) this.f);
        } else {
            a2 = this.d.a(EnumC2563yT.RENDERER, sw).a((AbstractC2221tW) this.e).a((AbstractC2221tW) this.f).a((long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS);
        }
        return a2.a();
    }

    public final SW<BR> a(C0715Uh uh) {
        return b(JW.a(uh));
    }

    public final SW<C0715Uh> a(C2562yS ySVar) {
        C1598kT a2 = this.d.a(EnumC2563yT.GET_CACHE_KEY, this.j.b()).a((AbstractC2221tW) new C0233Bt(this, ySVar)).a();
        JW.a(a2, new C0207At(this), this.k);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C2562yS ySVar, C0715Uh uh) {
        uh.j = ySVar;
        return this.i.a(uh);
    }

    public final SW<T> b() {
        return a(a());
    }

    public final SW<T> b(C0715Uh uh) {
        return a(a(uh));
    }

    public final C0652Rw c() {
        return this.g;
    }

    public final SW<Void> c(C0715Uh uh) {
        C1598kT a2 = this.d.a(EnumC2563yT.NOTIFY_CACHE_HIT, this.i.b(uh)).a();
        JW.a(a2, new C0285Dt(this), this.k);
        return a2;
    }
}
