package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tn  reason: case insensitive filesystem */
public final class C2251tn implements AbstractC2307uga, AbstractC1969pja, AbstractC2177ska<AbstractC1213eka>, AbstractC0940ala {

    /* renamed from: a  reason: collision with root package name */
    private static int f5652a;

    /* renamed from: b  reason: collision with root package name */
    private static int f5653b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5654c;
    private final C2045qn d;
    private final Mga e;
    private final Mga f;
    private final Sja g;
    private final C0824Ym h;
    private AbstractC2376vga i;
    private ByteBuffer j;
    private boolean k;
    private AbstractC0227Bn l;
    private int m;
    private Set<WeakReference<C1769mn>> n = new HashSet();

    public C2251tn(Context context, C0824Ym ym) {
        this.f5654c = context;
        this.h = ym;
        this.d = new C2045qn();
        this.e = new Uka(this.f5654c, Nia.f2688a, 0, C2452wk.f5921a, this, -1);
        this.f = new C2034qha(Nia.f2688a);
        this.g = new Rja();
        if (C1763mk.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            C1763mk.f(sb.toString());
        }
        f5652a++;
        this.i = C2652zga.a(new Mga[]{this.f, this.e}, this.g, this.d);
        this.i.a(this);
    }

    private final AbstractC2382vja a(Uri uri, String str) {
        C2182sn snVar;
        if (!this.k || this.j.limit() <= 0) {
            AbstractC1420hka wnVar = this.h.i > 0 ? new C2458wn(this, str) : new C2320un(this, str);
            C2527xn ynVar = this.h.j ? new C2596yn(this, wnVar) : wnVar;
            if (this.j.limit() > 0) {
                byte[] bArr = new byte[this.j.limit()];
                this.j.get(bArr);
                ynVar = new C2527xn(ynVar, bArr);
            }
            snVar = ynVar;
        } else {
            byte[] bArr2 = new byte[this.j.limit()];
            this.j.get(bArr2);
            snVar = new C2182sn(bArr2);
        }
        Qha qha = ((Boolean) C2392voa.e().a(C2474x.n)).booleanValue() ? C0201An.f1559a : C2665zn.f6210a;
        C0824Ym ym = this.h;
        return new C2038qja(uri, snVar, qha, ym.k, C2452wk.f5921a, this, null, ym.g);
    }

    public static int e() {
        return f5652a;
    }

    public static int f() {
        return f5653b;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1213eka a(AbstractC1420hka hka) {
        return new C1907on(this.f5654c, hka.a(), this, new C0253Cn(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1213eka a(String str) {
        C2251tn tnVar = this.h.j ? null : this;
        C0824Ym ym = this.h;
        return new C1695lka(str, null, tnVar, ym.d, ym.f, true, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, boolean z) {
        if (this.i != null) {
            C2445wga wga = new C2445wga(this.f, 2, Float.valueOf(f2));
            if (z) {
                this.i.a(wga);
                return;
            }
            this.i.b(wga);
        }
    }

    public final void a(int i2) {
        for (WeakReference<C1769mn> weakReference : this.n) {
            C1769mn mnVar = weakReference.get();
            if (mnVar != null) {
                mnVar.a(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(int i2, int i3, int i4, float f2) {
        AbstractC0227Bn bn = this.l;
        if (bn != null) {
            bn.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(int i2, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(Surface surface) {
    }

    /* access modifiers changed from: package-private */
    public final void a(Surface surface, boolean z) {
        if (this.i != null) {
            C2445wga wga = new C2445wga(this.e, 1, surface);
            if (z) {
                this.i.a(wga);
                return;
            }
            this.i.b(wga);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(Bha bha) {
    }

    public final void a(AbstractC0227Bn bn) {
        this.l = bn;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(Hga hga) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(Lja lja, _ja _ja) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(Nga nga) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(Sga sga, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(C2169sga sga) {
        AbstractC0227Bn bn = this.l;
        if (bn != null) {
            bn.a("onPlayerError", sga);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1969pja
    public final void a(IOException iOException) {
        AbstractC0227Bn bn = this.l;
        if (bn != null) {
            bn.a("onLoadError", iOException);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* bridge */ /* synthetic */ void a(AbstractC1213eka eka) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* synthetic */ void a(AbstractC1213eka eka, int i2) {
        this.m += i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.jka] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* synthetic */ void a(AbstractC1213eka eka, C1557jka jka) {
        this.m = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void a(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2307uga
    public final void a(boolean z, int i2) {
        AbstractC0227Bn bn = this.l;
        if (bn != null) {
            bn.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z, long j2) {
        AbstractC0227Bn bn = this.l;
        if (bn != null) {
            bn.a(z, j2);
        }
    }

    public final void a(Uri[] uriArr, String str) {
        a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        AbstractC2382vja vja;
        if (this.i != null) {
            this.j = byteBuffer;
            this.k = z;
            if (uriArr.length == 1) {
                vja = a(uriArr[0], str);
            } else {
                AbstractC2382vja[] vjaArr = new AbstractC2382vja[uriArr.length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    vjaArr[i2] = a(uriArr[i2], str);
                }
                vja = new C2451wja(vjaArr);
            }
            this.i.a(vja);
            f5653b++;
        }
    }

    public final long b() {
        return (long) this.m;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1213eka b(String str) {
        C2251tn tnVar = this.h.j ? null : this;
        C0824Ym ym = this.h;
        C1769mn mnVar = new C1769mn(str, tnVar, ym.d, ym.f, ym.i);
        this.n.add(new WeakReference<>(mnVar));
        return mnVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0940ala
    public final void b(Bha bha) {
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.R(); i2++) {
                this.g.a(i2, !z);
            }
        }
    }

    public final void c() {
        AbstractC2376vga vga = this.i;
        if (vga != null) {
            vga.b(this);
            this.i.a();
            this.i = null;
            f5653b--;
        }
    }

    public final AbstractC2376vga d() {
        return this.i;
    }

    public final void finalize() {
        f5652a--;
        if (C1763mk.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            C1763mk.f(sb.toString());
        }
    }

    public final C2045qn g() {
        return this.d;
    }
}
