package b.c.b.a.d.f;

import android.os.Bundle;
import android.os.Parcel;

public abstract class G extends A implements E {
    public G() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.A
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i((Bundle) q.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
