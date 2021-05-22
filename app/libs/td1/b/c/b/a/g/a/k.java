package b.c.b.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.t;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final int f531a;

    /* renamed from: b  reason: collision with root package name */
    private final b f532b;

    /* renamed from: c  reason: collision with root package name */
    private final t f533c;

    public k(int i) {
        this(new b(8, null), null);
    }

    k(int i, b bVar, t tVar) {
        this.f531a = i;
        this.f532b = bVar;
        this.f533c = tVar;
    }

    private k(b bVar, t tVar) {
        this(1, bVar, null);
    }

    public final b L() {
        return this.f532b;
    }

    public final t M() {
        return this.f533c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f531a);
        c.a(parcel, 2, (Parcelable) this.f532b, i, false);
        c.a(parcel, 3, (Parcelable) this.f533c, i, false);
        c.a(parcel, a2);
    }
}
