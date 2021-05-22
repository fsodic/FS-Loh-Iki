package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;

public final class MC {

    /* renamed from: a  reason: collision with root package name */
    private final C2115ro f2560a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2561b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f2562c;
    private final C1955pca d;
    private final C0823Yl e;
    private final a f;
    private final Dma g;
    private final C0729Uv h;
    private final AbstractC1286fma i;

    public MC(C2115ro roVar, Context context, GR gr, C1955pca pca, C0823Yl yl, a aVar, Dma dma, C0729Uv uv, C1645ky kyVar) {
        this.f2560a = roVar;
        this.f2561b = context;
        this.f2562c = gr;
        this.d = pca;
        this.e = yl;
        this.f = aVar;
        this.g = dma;
        this.h = uv;
        this.i = kyVar;
    }

    public final AbstractC1564jo a(C1015boa boa) {
        return a(boa, false);
    }

    public final AbstractC1564jo a(C1015boa boa, boolean z) {
        return C2115ro.a(this.f2561b, C1153dp.a(boa), boa.f3940a, false, false, this.d, this.e, null, new PC(this), this.f, this.g, this.i, z);
    }
}
