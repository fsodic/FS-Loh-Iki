package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.Map;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f280a;

    /* renamed from: b  reason: collision with root package name */
    final String f281b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<h> f282c;

    g(int i, String str, ArrayList<h> arrayList) {
        this.f280a = i;
        this.f281b = str;
        this.f282c = arrayList;
    }

    g(String str, Map<String, a.C0012a<?, ?>> map) {
        ArrayList<h> arrayList;
        this.f280a = 1;
        this.f281b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new h(str2, map.get(str2)));
            }
        }
        this.f282c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f280a);
        c.a(parcel, 2, this.f281b, false);
        c.c(parcel, 3, this.f282c, false);
        c.a(parcel, a2);
    }
}
