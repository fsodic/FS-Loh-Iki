package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.c.c;

/* renamed from: com.google.android.gms.internal.ads.Zb  reason: case insensitive filesystem */
public final class C0839Zb extends c<AbstractC1470ib> {
    public C0839Zb() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ AbstractC1470ib a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof AbstractC1470ib ? (AbstractC1470ib) queryLocalInterface : new C1401hb(iBinder);
    }
}
