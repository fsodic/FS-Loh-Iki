package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wpa  reason: case insensitive filesystem */
public abstract class AbstractBinderC2463wpa extends BinderC1618kga implements AbstractC2532xpa {
    public AbstractBinderC2463wpa() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static AbstractC2532xpa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof AbstractC2532xpa ? (AbstractC2532xpa) queryLocalInterface : new C2670zpa(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        float f;
        AbstractC2601ypa ypa;
        switch (i) {
            case 1:
                pb();
                parcel2.writeNoException();
                return true;
            case 2:
                pause();
                parcel2.writeNoException();
                return true;
            case 3:
                f(C1756mga.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                z = isMuted();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 5:
                int P = P();
                parcel2.writeNoException();
                parcel2.writeInt(P);
                return true;
            case 6:
                f = getDuration();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 7:
                f = ba();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ypa = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    ypa = queryLocalInterface instanceof AbstractC2601ypa ? (AbstractC2601ypa) queryLocalInterface : new Apa(readStrongBinder);
                }
                a(ypa);
                parcel2.writeNoException();
                return true;
            case 9:
                f = W();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 10:
                z = qb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 11:
                AbstractC2601ypa vb = vb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, vb);
                return true;
            case 12:
                z = la();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 13:
                stop();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
