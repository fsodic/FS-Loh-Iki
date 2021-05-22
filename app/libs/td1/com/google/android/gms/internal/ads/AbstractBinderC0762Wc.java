package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Wc  reason: case insensitive filesystem */
public abstract class AbstractBinderC0762Wc extends BinderC1618kga implements AbstractC0684Tc {
    public AbstractBinderC0762Wc() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        b((ParcelFileDescriptor) C1756mga.a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
