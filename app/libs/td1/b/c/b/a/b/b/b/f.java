package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final int f277a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Map<String, a.C0012a<?, ?>>> f278b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<g> f279c = null;
    private final String d;

    f(int i, ArrayList<g> arrayList, String str) {
        this.f277a = i;
        HashMap<String, Map<String, a.C0012a<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            String str2 = gVar.f281b;
            HashMap hashMap2 = new HashMap();
            int size2 = gVar.f282c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                h hVar = gVar.f282c.get(i3);
                hashMap2.put(hVar.f284b, hVar.f285c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f278b = hashMap;
        r.a((Object) str);
        this.d = str;
        L();
    }

    public final void L() {
        for (String str : this.f278b.keySet()) {
            Map<String, a.C0012a<?, ?>> map = this.f278b.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).a(this);
            }
        }
    }

    public final String M() {
        return this.d;
    }

    public final Map<String, a.C0012a<?, ?>> a(String str) {
        return this.f278b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f278b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, a.C0012a<?, ?>> map = this.f278b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f277a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f278b.keySet()) {
            arrayList.add(new g(str, this.f278b.get(str)));
        }
        c.c(parcel, 2, arrayList, false);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, a2);
    }
}
