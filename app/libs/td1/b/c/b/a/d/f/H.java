package b.c.b.a.d.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class H extends a {
    public static final Parcelable.Creator<H> CREATOR = new J();

    /* renamed from: a  reason: collision with root package name */
    public final long f472a;

    /* renamed from: b  reason: collision with root package name */
    public final long f473b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f474c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;

    public H(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f472a = j;
        this.f473b = j2;
        this.f474c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f472a);
        c.a(parcel, 2, this.f473b);
        c.a(parcel, 3, this.f474c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e, false);
        c.a(parcel, 6, this.f, false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, a2);
    }
}
