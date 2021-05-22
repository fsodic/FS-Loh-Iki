package b.c.b.a.d.f;

import android.os.IBinder;
import android.os.IInterface;

public abstract class C extends A implements D {
    public static D a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof D ? (D) queryLocalInterface : new F(iBinder);
    }
}
