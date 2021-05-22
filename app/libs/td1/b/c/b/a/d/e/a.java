package b.c.b.a.d.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f462a;

    /* renamed from: b  reason: collision with root package name */
    private final String f463b;

    protected a(IBinder iBinder, String str) {
        this.f462a = iBinder;
        this.f463b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f462a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f462a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f462a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel ub() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f463b);
        return obtain;
    }
}
