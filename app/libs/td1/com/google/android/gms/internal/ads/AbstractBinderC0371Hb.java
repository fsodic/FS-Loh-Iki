package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Hb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0371Hb extends BinderC1618kga implements AbstractC0293Eb {
    public AbstractBinderC0371Hb() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static AbstractC0293Eb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof AbstractC0293Eb ? (AbstractC0293Eb) queryLocalInterface : new C0345Gb(iBinder);
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
        a(sbVar);
        parcel2.writeNoException();
        return true;
    }
}
