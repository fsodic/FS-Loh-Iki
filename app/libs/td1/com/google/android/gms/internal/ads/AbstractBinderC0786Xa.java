package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Xa  reason: case insensitive filesystem */
public abstract class AbstractBinderC0786Xa extends BinderC1618kga implements AbstractC0812Ya {
    public AbstractBinderC0786Xa() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static AbstractC0812Ya a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof AbstractC0812Ya ? (AbstractC0812Ya) queryLocalInterface : new C0864_a(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i == 1) {
            a Ja = Ja();
            parcel2.writeNoException();
            C1756mga.a(parcel2, Ja);
        } else if (i == 2) {
            Uri uri = getUri();
            parcel2.writeNoException();
            C1756mga.b(parcel2, uri);
        } else if (i != 3) {
            if (i == 4) {
                i3 = getWidth();
            } else if (i != 5) {
                return false;
            } else {
                i3 = getHeight();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            double Ya = Ya();
            parcel2.writeNoException();
            parcel2.writeDouble(Ya);
        }
        return true;
    }
}
