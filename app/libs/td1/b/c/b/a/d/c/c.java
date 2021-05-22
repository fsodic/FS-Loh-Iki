package b.c.b.a.d.c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f330a = c.class.getClassLoader();

    private c() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
