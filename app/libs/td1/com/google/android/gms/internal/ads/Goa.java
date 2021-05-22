package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class Goa extends C1687lga implements Eoa {
    Goa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC0501Mb mb) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, mb);
        b(10, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(C0578Pa pa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, pa);
        b(6, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2434wb wbVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, wbVar);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2503xb xbVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, xbVar);
        b(4, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2599yoa yoa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, yoa);
        b(2, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(String str, AbstractC0293Eb eb, AbstractC0241Cb cb) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        C1756mga.a(Jb, eb);
        C1756mga.a(Jb, cb);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final Doa sb() {
        Doa doa;
        Parcel a2 = a(1, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            doa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            doa = queryLocalInterface instanceof Doa ? (Doa) queryLocalInterface : new Foa(readStrongBinder);
        }
        a2.recycle();
        return doa;
    }
}
