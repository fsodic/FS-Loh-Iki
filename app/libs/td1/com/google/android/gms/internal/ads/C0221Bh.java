package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.Bh  reason: case insensitive filesystem */
public final class C0221Bh extends b<AbstractC0351Gh> {
    public C0221Bh(Context context, Looper looper, AbstractC0176b.a aVar, AbstractC0176b.AbstractC0028b bVar) {
        super(C1690li.b(context), looper, 8, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof AbstractC0351Gh ? (AbstractC0351Gh) queryLocalInterface : new C0429Jh(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String v() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String w() {
        return "com.google.android.gms.ads.service.START";
    }

    public final AbstractC0351Gh z() {
        return (AbstractC0351Gh) super.u();
    }
}
