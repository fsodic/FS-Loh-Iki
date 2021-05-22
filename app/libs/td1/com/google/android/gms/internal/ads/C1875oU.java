package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1511jB;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oU  reason: case insensitive filesystem */
public final class C1875oU implements AbstractC1806nU {

    /* renamed from: a  reason: collision with root package name */
    private static final C1511jB f5130a;

    static {
        C1511jB.a u = C1511jB.u();
        u.e("E");
        f5130a = (C1511jB) u.j();
    }

    C1875oU() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1806nU
    public final C1511jB a() {
        return f5130a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1806nU
    public final C1511jB a(Context context) {
        return C0911aU.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
