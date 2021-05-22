package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* renamed from: com.google.android.gms.internal.ads.Fk  reason: case insensitive filesystem */
public class C0328Fk extends C0354Gk {
    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public boolean a(View view) {
        return super.a(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final long e() {
        if (!((Boolean) C2392voa.e().a(C2474x.Tb)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
