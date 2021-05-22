package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.c.c;

/* renamed from: com.google.android.gms.internal.ads._b  reason: case insensitive filesystem */
public final class C0865_b extends c<AbstractC1057cb> {
    public C0865_b() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.c.c
    public final /* synthetic */ AbstractC1057cb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof AbstractC1057cb ? (AbstractC1057cb) queryLocalInterface : new C1263fb(iBinder);
    }
}
