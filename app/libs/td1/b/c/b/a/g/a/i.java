package b.c.b.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.s;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f529a;

    /* renamed from: b  reason: collision with root package name */
    private final s f530b;

    i(int i, s sVar) {
        this.f529a = i;
        this.f530b = sVar;
    }

    public i(s sVar) {
        this(1, sVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f529a);
        c.a(parcel, 2, (Parcelable) this.f530b, i, false);
        c.a(parcel, a2);
    }
}
