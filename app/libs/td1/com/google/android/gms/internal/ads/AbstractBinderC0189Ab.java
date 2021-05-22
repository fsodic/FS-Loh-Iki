package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ab  reason: case insensitive filesystem */
public abstract class AbstractBinderC0189Ab extends BinderC1618kga implements AbstractC2503xb {
    public AbstractBinderC0189Ab() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public static AbstractC2503xb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof AbstractC2503xb ? (AbstractC2503xb) queryLocalInterface : new C2641zb(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC1883ob obVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            obVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            obVar = queryLocalInterface instanceof AbstractC1883ob ? (AbstractC1883ob) queryLocalInterface : new C2021qb(readStrongBinder);
        }
        a(obVar);
        parcel2.writeNoException();
        return true;
    }
}
