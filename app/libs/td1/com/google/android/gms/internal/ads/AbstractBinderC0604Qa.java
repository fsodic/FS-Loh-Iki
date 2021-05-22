package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qa  reason: case insensitive filesystem */
public abstract class AbstractBinderC0604Qa extends BinderC1618kga implements AbstractC0630Ra {
    public AbstractBinderC0604Qa() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static AbstractC0630Ra a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof AbstractC0630Ra ? (AbstractC0630Ra) queryLocalInterface : new C0682Ta(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String text = getText();
            parcel2.writeNoException();
            parcel2.writeString(text);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<AbstractC0812Ya> Hb = Hb();
            parcel2.writeNoException();
            parcel2.writeList(Hb);
            return true;
        }
    }
}
