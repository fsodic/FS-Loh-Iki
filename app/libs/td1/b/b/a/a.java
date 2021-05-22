package b.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: b.b.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0008a extends Binder implements a {

        /* renamed from: b.b.a.a$a$a  reason: collision with other inner class name */
        private static class C0009a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f245a;

            C0009a(IBinder iBinder) {
                this.f245a = iBinder;
            }

            @Override // b.b.a.a
            public int N() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    this.f245a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f245a;
            }

            @Override // b.b.a.a
            public int b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f245a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b.a.a
            public int f(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f245a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b.a.a
            public int g(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f245a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b.a.a
            public int h(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f245a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.enhance.gameservice.IGameTuningService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0009a(iBinder) : (a) queryLocalInterface;
        }
    }

    int N();

    int b(boolean z);

    int f(int i);

    int g(int i);

    int h(int i);
}
