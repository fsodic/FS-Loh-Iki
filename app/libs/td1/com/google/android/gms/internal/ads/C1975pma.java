package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.pma  reason: case insensitive filesystem */
public final class C1975pma extends b<AbstractC2319uma> {
    C1975pma(Context context, Looper looper, AbstractC0176b.a aVar, AbstractC0176b.AbstractC0028b bVar) {
        super(C1690li.b(context), looper, 123, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof AbstractC2319uma ? (AbstractC2319uma) queryLocalInterface : new C2250tma(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String v() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String w() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final AbstractC2319uma z() {
        return (AbstractC2319uma) super.u();
    }
}
