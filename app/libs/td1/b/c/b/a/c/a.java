package b.c.b.a.c;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.d.c.b;

public interface a extends IInterface {

    /* renamed from: b.c.b.a.c.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0013a extends b implements a {

        /* renamed from: b.c.b.a.c.a$a$a  reason: collision with other inner class name */
        public static class C0014a extends b.c.b.a.d.c.a implements a {
            C0014a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0013a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0014a(iBinder);
        }
    }
}
