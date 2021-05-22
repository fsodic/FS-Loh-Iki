package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Bpa extends BinderC1618kga implements AbstractC2601ypa {
    public Bpa() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            hb();
        } else if (i == 2) {
            ea();
        } else if (i == 3) {
            X();
        } else if (i == 4) {
            Y();
        } else if (i != 5) {
            return false;
        } else {
            c(C1756mga.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
