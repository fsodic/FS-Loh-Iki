package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.Qc  reason: case insensitive filesystem */
public final class C0606Qc extends b<AbstractC0736Vc> {
    C0606Qc(Context context, Looper looper, AbstractC0176b.a aVar, AbstractC0176b.AbstractC0028b bVar) {
        super(C1690li.b(context), looper, 166, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof AbstractC0736Vc ? (AbstractC0736Vc) queryLocalInterface : new C0814Yc(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String v() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String w() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final AbstractC0736Vc z() {
        return (AbstractC0736Vc) super.u();
    }
}
