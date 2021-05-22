package b.c.b.a.g.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class b extends a implements i {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final int f526a;

    /* renamed from: b  reason: collision with root package name */
    private int f527b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f528c;

    public b() {
        this(0, null);
    }

    b(int i, int i2, Intent intent) {
        this.f526a = i;
        this.f527b = i2;
        this.f528c = intent;
    }

    private b(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.i
    public final Status E() {
        return this.f527b == 0 ? Status.f1175a : Status.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f526a);
        c.a(parcel, 2, this.f527b);
        c.a(parcel, 3, (Parcelable) this.f528c, i, false);
        c.a(parcel, a2);
    }
}
