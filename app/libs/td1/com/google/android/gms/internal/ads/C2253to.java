package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.to  reason: case insensitive filesystem */
public final /* synthetic */ class C2253to implements AbstractC2220tV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5657a;

    /* renamed from: b  reason: collision with root package name */
    private final C1153dp f5658b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5659c;
    private final boolean d;
    private final boolean e;
    private final C1955pca f;
    private final C0823Yl g;
    private final L h = null;
    private final i i;
    private final a j;
    private final Dma k;
    private final AbstractC1286fma l;
    private final boolean m;

    C2253to(Context context, C1153dp dpVar, String str, boolean z, boolean z2, C1955pca pca, C0823Yl yl, L l2, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z3) {
        this.f5657a = context;
        this.f5658b = dpVar;
        this.f5659c = str;
        this.d = z;
        this.e = z2;
        this.f = pca;
        this.g = yl;
        this.i = iVar;
        this.j = aVar;
        this.k = dma;
        this.l = fma;
        this.m = z3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2220tV
    public final Object get() {
        Context context = this.f5657a;
        C1153dp dpVar = this.f5658b;
        String str = this.f5659c;
        boolean z = this.d;
        boolean z2 = this.e;
        C1955pca pca = this.f;
        C0823Yl yl = this.g;
        L l2 = this.h;
        i iVar = this.i;
        a aVar = this.j;
        Dma dma = this.k;
        C2667zo zoVar = new C2667zo(ViewTreeObserver$OnGlobalLayoutListenerC0202Ao.a(context, dpVar, str, z, z2, pca, yl, l2, iVar, aVar, dma, this.l, this.m));
        zoVar.setWebViewClient(q.e().a(zoVar, dma, z2));
        zoVar.setWebChromeClient(new C1014bo(zoVar));
        return zoVar;
    }
}
