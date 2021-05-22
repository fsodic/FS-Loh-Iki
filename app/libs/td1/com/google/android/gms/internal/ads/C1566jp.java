package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.jp  reason: case insensitive filesystem */
public final class C1566jp {
    public static AbstractC1564jo a(Context context, C1153dp dpVar, String str, boolean z, boolean z2, C1955pca pca, C0823Yl yl, L l, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z3) {
        try {
            return (AbstractC1564jo) C0251Cl.a(new C1497ip(context, dpVar, str, z, z2, pca, yl, null, iVar, aVar, dma, fma, z3));
        } catch (Throwable th) {
            q.g().a(th, "AdWebViewFactory.newAdWebView2");
            throw new C2391vo("Webview initialization failed.", th);
        }
    }
}
