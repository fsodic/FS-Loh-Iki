package b.c.b.a.d.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f323a;

    /* renamed from: b  reason: collision with root package name */
    private final String f324b;

    protected a(IBinder iBinder, String str) {
        this.f323a = iBinder;
        this.f324b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Jb() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f324b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f323a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f323a;
    }
}
