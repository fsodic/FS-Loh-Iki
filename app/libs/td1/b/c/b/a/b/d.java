package b.c.b.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    private final String f291a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final int f292b;

    /* renamed from: c  reason: collision with root package name */
    private final long f293c;

    public d(String str, int i, long j) {
        this.f291a = str;
        this.f292b = i;
        this.f293c = j;
    }

    public long L() {
        long j = this.f293c;
        return j == -1 ? (long) this.f292b : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return ((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && L() == dVar.L();
        }
    }

    public String getName() {
        return this.f291a;
    }

    public int hashCode() {
        return q.a(getName(), Long.valueOf(L()));
    }

    public String toString() {
        q.a a2 = q.a(this);
        a2.a("name", getName());
        a2.a("version", Long.valueOf(L()));
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, getName(), false);
        c.a(parcel, 2, this.f292b);
        c.a(parcel, 3, L());
        c.a(parcel, a2);
    }
}
