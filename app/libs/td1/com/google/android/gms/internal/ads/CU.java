package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.common.internal.AbstractC0176b;

public final class CU extends b<FU> {
    private final int D;

    public CU(Context context, Looper looper, AbstractC0176b.a aVar, AbstractC0176b.AbstractC0028b bVar, int i) {
        super(context, looper, 116, aVar, bVar, null);
        this.D = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof FU ? (FU) queryLocalInterface : new JU(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final int g() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String v() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String w() {
        return "com.google.android.gms.gass.START";
    }

    public final FU z() {
        return (FU) super.u();
    }
}
