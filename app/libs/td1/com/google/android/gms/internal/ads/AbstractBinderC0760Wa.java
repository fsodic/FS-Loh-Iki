package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Wa  reason: case insensitive filesystem */
public abstract class AbstractBinderC0760Wa extends BinderC1618kga implements AbstractC0708Ua {
    public AbstractBinderC0760Wa() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        float f;
        IInterface iInterface;
        AbstractC0423Jb jb;
        switch (i) {
            case 2:
                f = W();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 3:
                i(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                iInterface = Pa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 5:
                f = getDuration();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 6:
                f = ba();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 7:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 8:
                boolean xa = xa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, xa);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    jb = queryLocalInterface instanceof AbstractC0423Jb ? (AbstractC0423Jb) queryLocalInterface : new C0397Ib(readStrongBinder);
                }
                a(jb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
