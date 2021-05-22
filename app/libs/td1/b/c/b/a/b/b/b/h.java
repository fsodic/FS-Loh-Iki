package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    private final int f283a;

    /* renamed from: b  reason: collision with root package name */
    final String f284b;

    /* renamed from: c  reason: collision with root package name */
    final a.C0012a<?, ?> f285c;

    h(int i, String str, a.C0012a<?, ?> aVar) {
        this.f283a = i;
        this.f284b = str;
        this.f285c = aVar;
    }

    h(String str, a.C0012a<?, ?> aVar) {
        this.f283a = 1;
        this.f284b = str;
        this.f285c = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f283a);
        c.a(parcel, 2, this.f284b, false);
        c.a(parcel, 3, (Parcelable) this.f285c, i, false);
        c.a(parcel, a2);
    }
}
