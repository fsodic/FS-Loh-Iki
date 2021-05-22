package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Bb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0215Bb extends BinderC1618kga implements AbstractC0241Cb {
    public AbstractBinderC0215Bb() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static AbstractC0241Cb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof AbstractC0241Cb ? (AbstractC0241Cb) queryLocalInterface : new C0319Fb(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC2158sb sbVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            sbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            sbVar = queryLocalInterface instanceof AbstractC2158sb ? (AbstractC2158sb) queryLocalInterface : new C2296ub(readStrongBinder);
        }
        a(sbVar, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
