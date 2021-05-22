package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ip  reason: case insensitive filesystem */
public final /* synthetic */ class C1497ip implements AbstractC2220tV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4609a;

    /* renamed from: b  reason: collision with root package name */
    private final C1153dp f4610b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4611c;
    private final boolean d;
    private final boolean e;
    private final C1955pca f;
    private final C0823Yl g;
    private final L h;
    private final i i;
    private final a j;
    private final Dma k;
    private final AbstractC1286fma l;
    private final boolean m;

    C1497ip(Context context, C1153dp dpVar, String str, boolean z, boolean z2, C1955pca pca, C0823Yl yl, L l2, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z3) {
        this.f4609a = context;
        this.f4610b = dpVar;
        this.f4611c = str;
        this.d = z;
        this.e = z2;
        this.f = pca;
        this.g = yl;
        this.h = l2;
        this.i = iVar;
        this.j = aVar;
        this.k = dma;
        this.l = fma;
        this.m = z3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2220tV
    public final Object get() {
        Context context = this.f4609a;
        C1153dp dpVar = this.f4610b;
        String str = this.f4611c;
        boolean z = this.d;
        boolean z2 = this.e;
        C1955pca pca = this.f;
        C0823Yl yl = this.g;
        L l2 = this.h;
        i iVar = this.i;
        a aVar = this.j;
        Dma dma = this.k;
        AbstractC1286fma fma = this.l;
        boolean z3 = this.m;
        C1085cp cpVar = new C1085cp();
        ViewTreeObserver$OnGlobalLayoutListenerC1704lp lpVar = new ViewTreeObserver$OnGlobalLayoutListenerC1704lp(new C0947ap(context), cpVar, dpVar, str, z, z2, pca, yl, l2, iVar, aVar, dma, fma, z3);
        C2667zo zoVar = new C2667zo(lpVar);
        lpVar.setWebChromeClient(new C1014bo(zoVar));
        cpVar.a(zoVar, z2);
        return zoVar;
    }
}
