package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ta  reason: case insensitive filesystem */
public final class C0682Ta extends C1687lga implements AbstractC0630Ra {
    C0682Ta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0630Ra
    public final List<AbstractC0812Ya> Hb() {
        Parcel a2 = a(3, Jb());
        ArrayList b2 = C1756mga.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0630Ra
    public final String getText() {
        Parcel a2 = a(2, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
