package b.c.b.a.d.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.c.b.a.d.f.a  reason: case insensitive filesystem */
public class C0106a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f482a;

    /* renamed from: b  reason: collision with root package name */
    private final String f483b;

    protected C0106a(IBinder iBinder, String str) {
        this.f482a = iBinder;
        this.f483b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Jb() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f483b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f482a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f482a;
    }
}
