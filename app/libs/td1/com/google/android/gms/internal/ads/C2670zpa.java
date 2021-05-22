package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zpa  reason: case insensitive filesystem */
public final class C2670zpa extends C1687lga implements AbstractC2532xpa {
    C2670zpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float W() {
        Parcel a2 = a(9, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void a(AbstractC2601ypa ypa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, ypa);
        b(8, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float ba() {
        Parcel a2 = a(7, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float getDuration() {
        Parcel a2 = a(6, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final AbstractC2601ypa vb() {
        AbstractC2601ypa ypa;
        Parcel a2 = a(11, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            ypa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            ypa = queryLocalInterface instanceof AbstractC2601ypa ? (AbstractC2601ypa) queryLocalInterface : new Apa(readStrongBinder);
        }
        a2.recycle();
        return ypa;
    }
}
