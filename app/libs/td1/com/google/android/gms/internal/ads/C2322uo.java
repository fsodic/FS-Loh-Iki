package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uo  reason: case insensitive filesystem */
public final /* synthetic */ class C2322uo implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5758a;

    /* renamed from: b  reason: collision with root package name */
    private final C1955pca f5759b;

    /* renamed from: c  reason: collision with root package name */
    private final C0823Yl f5760c;
    private final a d;
    private final String e;

    C2322uo(Context context, C1955pca pca, C0823Yl yl, a aVar, String str) {
        this.f5758a = context;
        this.f5759b = pca;
        this.f5760c = yl;
        this.d = aVar;
        this.e = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        Context context = this.f5758a;
        C1955pca pca = this.f5759b;
        C0823Yl yl = this.f5760c;
        a aVar = this.d;
        String str = this.e;
        q.d();
        AbstractC1564jo a2 = C2115ro.a(context, C1153dp.b(), BuildConfig.FLAVOR, false, false, pca, yl, null, null, aVar, Dma.a(), null, false);
        C1491im c2 = C1491im.c(a2);
        a2.d().a(new C2529xo(c2));
        a2.loadUrl(str);
        return c2;
    }
}
