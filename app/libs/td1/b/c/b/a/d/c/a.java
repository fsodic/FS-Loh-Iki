package b.c.b.a.d.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f328a;

    /* renamed from: b  reason: collision with root package name */
    private final String f329b;

    protected a(IBinder iBinder, String str) {
        this.f328a = iBinder;
        this.f329b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f328a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f328a;
    }

    /* access modifiers changed from: protected */
    public final Parcel ub() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f329b);
        return obtain;
    }
}
