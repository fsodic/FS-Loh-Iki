package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.i;

/* renamed from: com.google.android.gms.internal.ads.ro  reason: case insensitive filesystem */
public final class C2115ro {
    public static SW<AbstractC1564jo> a(Context context, C0823Yl yl, String str, C1955pca pca, a aVar) {
        return JW.a(JW.a((Object) null), new C2322uo(context, pca, yl, aVar, str), C0875_l.e);
    }

    public static AbstractC1564jo a(Context context, C1153dp dpVar, String str, boolean z, boolean z2, C1955pca pca, C0823Yl yl, L l, i iVar, a aVar, Dma dma, AbstractC1286fma fma, boolean z3) {
        C2474x.a(context);
        if (C0214Ba.f1618b.a().booleanValue()) {
            return C1566jp.a(context, dpVar, str, z, z2, pca, yl, null, iVar, aVar, dma, fma, z3);
        }
        try {
            return (AbstractC1564jo) C0251Cl.a(new C2253to(context, dpVar, str, z, z2, pca, yl, null, iVar, aVar, dma, fma, z3));
        } catch (Throwable th) {
            throw new C2391vo("Webview initialization failed.", th);
        }
    }
}
