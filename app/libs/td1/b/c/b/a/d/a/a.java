package b.c.b.a.d.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f320a;

    /* renamed from: b  reason: collision with root package name */
    private final String f321b;

    protected a(IBinder iBinder, String str) {
        this.f320a = iBinder;
        this.f321b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Jb() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f321b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f320a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f320a;
    }
}
