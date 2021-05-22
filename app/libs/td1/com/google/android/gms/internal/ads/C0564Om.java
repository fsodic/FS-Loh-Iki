package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.Om  reason: case insensitive filesystem */
public final class C0564Om extends AbstractC0356Gm {
    @Override // com.google.android.gms.internal.ads.AbstractC0356Gm
    public final AbstractC0382Hm a(Context context, AbstractC0798Xm xm, int i, boolean z, L l, C0824Ym ym) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        return i == 2 ? new TextureView$SurfaceTextureListenerC1150dn(context, new C0876_m(context, xm.q(), xm.getRequestId(), l, xm.N()), xm, z, AbstractC0356Gm.a(xm), ym) : new TextureView$SurfaceTextureListenerC2249tm(context, z, AbstractC0356Gm.a(xm), ym, new C0876_m(context, xm.q(), xm.getRequestId(), l, xm.N()));
    }
}
