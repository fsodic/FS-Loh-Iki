package b.c.b.a.b.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final int f269a;

    /* renamed from: b  reason: collision with root package name */
    private final a f270b;

    b(int i, a aVar) {
        this.f269a = i;
        this.f270b = aVar;
    }

    private b(a aVar) {
        this.f269a = 1;
        this.f270b = aVar;
    }

    public static b a(a.b<?, ?> bVar) {
        if (bVar instanceof a) {
            return new b((a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final a.b<?, ?> L() {
        a aVar = this.f270b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f269a);
        c.a(parcel, 2, (Parcelable) this.f270b, i, false);
        c.a(parcel, a2);
    }
}
