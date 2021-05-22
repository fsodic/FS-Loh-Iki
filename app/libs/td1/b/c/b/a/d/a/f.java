package b.c.b.a.d.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // b.c.b.a.d.a.d
    public final boolean c() {
        Parcel a2 = a(6, Jb());
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // b.c.b.a.d.a.d
    public final boolean g(boolean z) {
        Parcel Jb = Jb();
        c.a(Jb, true);
        Parcel a2 = a(2, Jb);
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // b.c.b.a.d.a.d
    public final String getId() {
        Parcel a2 = a(1, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
