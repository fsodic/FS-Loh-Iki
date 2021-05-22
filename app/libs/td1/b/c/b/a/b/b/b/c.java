package b.c.b.a.b.b.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final int f274a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f275b;

    /* renamed from: c  reason: collision with root package name */
    private final int f276c = 2;
    private final f d;
    private final String e;
    private int f;
    private int g;

    c(int i, Parcel parcel, f fVar) {
        this.f274a = i;
        r.a(parcel);
        this.f275b = parcel;
        this.d = fVar;
        f fVar2 = this.d;
        this.e = fVar2 == null ? null : fVar2.M();
        this.f = 2;
    }

    private static void a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(l.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(b.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(b.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                m.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private final void a(StringBuilder sb, Map<String, a.C0012a<?, ?>> map, Parcel parcel) {
        Object obj;
        String str;
        String str2;
        Object[] objArr;
        Object obj2;
        Object obj3;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, a.C0012a<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().L(), entry);
        }
        sb.append('{');
        int b2 = com.google.android.gms.common.internal.a.b.b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.a.b.a(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(com.google.android.gms.common.internal.a.b.a(a2));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                a.C0012a<?, ?> aVar = (a.C0012a) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (aVar.M()) {
                    int i = aVar.d;
                    switch (i) {
                        case 0:
                            obj3 = Integer.valueOf(com.google.android.gms.common.internal.a.b.w(parcel, a2));
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 1:
                            obj3 = com.google.android.gms.common.internal.a.b.c(parcel, a2);
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 2:
                            obj3 = Long.valueOf(com.google.android.gms.common.internal.a.b.x(parcel, a2));
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 3:
                            obj3 = Float.valueOf(com.google.android.gms.common.internal.a.b.u(parcel, a2));
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 4:
                            obj3 = Double.valueOf(com.google.android.gms.common.internal.a.b.t(parcel, a2));
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 5:
                            obj3 = com.google.android.gms.common.internal.a.b.a(parcel, a2);
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 6:
                            obj3 = Boolean.valueOf(com.google.android.gms.common.internal.a.b.s(parcel, a2));
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 7:
                            obj3 = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 8:
                        case 9:
                            obj3 = com.google.android.gms.common.internal.a.b.g(parcel, a2);
                            obj2 = a.a(aVar, obj3);
                            break;
                        case 10:
                            Bundle f2 = com.google.android.gms.common.internal.a.b.f(parcel, a2);
                            HashMap hashMap = new HashMap();
                            for (String str3 : f2.keySet()) {
                                hashMap.put(str3, f2.getString(str3));
                            }
                            obj2 = a.a(aVar, hashMap);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                    b(sb, aVar, obj2);
                } else {
                    if (aVar.e) {
                        sb.append("[");
                        switch (aVar.d) {
                            case 0:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.j(parcel, a2));
                                break;
                            case 1:
                                objArr = com.google.android.gms.common.internal.a.b.d(parcel, a2);
                                com.google.android.gms.common.util.a.a(sb, objArr);
                                break;
                            case 2:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.l(parcel, a2));
                                break;
                            case 3:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.i(parcel, a2));
                                break;
                            case 4:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.h(parcel, a2));
                                break;
                            case 5:
                                objArr = com.google.android.gms.common.internal.a.b.b(parcel, a2);
                                com.google.android.gms.common.util.a.a(sb, objArr);
                                break;
                            case 6:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.e(parcel, a2));
                                break;
                            case 7:
                                com.google.android.gms.common.util.a.a(sb, com.google.android.gms.common.internal.a.b.p(parcel, a2));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] n = com.google.android.gms.common.internal.a.b.n(parcel, a2);
                                int length = n.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    n[i2].setDataPosition(0);
                                    a(sb, aVar.N(), n[i2]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str2 = "]";
                    } else {
                        switch (aVar.d) {
                            case 0:
                                sb.append(com.google.android.gms.common.internal.a.b.w(parcel, a2));
                                break;
                            case 1:
                                obj = com.google.android.gms.common.internal.a.b.c(parcel, a2);
                                sb.append(obj);
                                break;
                            case 2:
                                sb.append(com.google.android.gms.common.internal.a.b.x(parcel, a2));
                                break;
                            case 3:
                                sb.append(com.google.android.gms.common.internal.a.b.u(parcel, a2));
                                break;
                            case 4:
                                sb.append(com.google.android.gms.common.internal.a.b.t(parcel, a2));
                                break;
                            case 5:
                                obj = com.google.android.gms.common.internal.a.b.a(parcel, a2);
                                sb.append(obj);
                                break;
                            case 6:
                                sb.append(com.google.android.gms.common.internal.a.b.s(parcel, a2));
                                break;
                            case 7:
                                String o = com.google.android.gms.common.internal.a.b.o(parcel, a2);
                                sb.append("\"");
                                str = l.a(o);
                                sb.append(str);
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] g2 = com.google.android.gms.common.internal.a.b.g(parcel, a2);
                                sb.append("\"");
                                str = b.a(g2);
                                sb.append(str);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] g3 = com.google.android.gms.common.internal.a.b.g(parcel, a2);
                                sb.append("\"");
                                str = b.b(g3);
                                sb.append(str);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle f3 = com.google.android.gms.common.internal.a.b.f(parcel, a2);
                                Set<String> keySet = f3.keySet();
                                keySet.size();
                                sb.append("{");
                                boolean z2 = true;
                                for (String str4 : keySet) {
                                    if (!z2) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\"");
                                    sb.append(":");
                                    sb.append("\"");
                                    sb.append(l.a(f3.getString(str4)));
                                    sb.append("\"");
                                    z2 = false;
                                }
                                str2 = "}";
                                break;
                            case 11:
                                Parcel m = com.google.android.gms.common.internal.a.b.m(parcel, a2);
                                m.setDataPosition(0);
                                a(sb, aVar.N(), m);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb.append(str2);
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b2) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b2);
        throw new b.a(sb3.toString(), parcel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel b() {
        /*
            r2 = this;
            int r0 = r2.f
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f275b
            int r0 = com.google.android.gms.common.internal.a.c.a(r0)
            r2.g = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f275b
            int r1 = r2.g
            com.google.android.gms.common.internal.a.c.a(r0, r1)
            r0 = 2
            r2.f = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f275b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.b.b.b.c.b():android.os.Parcel");
    }

    private final void b(StringBuilder sb, a.C0012a<?, ?> aVar, Object obj) {
        if (aVar.f273c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                a(sb, aVar.f272b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        a(sb, aVar.f272b, obj);
    }

    @Override // b.c.b.a.b.b.b.b, b.c.b.a.b.b.b.a
    public Object a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // b.c.b.a.b.b.b.a
    public Map<String, a.C0012a<?, ?>> a() {
        f fVar = this.d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this.e);
    }

    @Override // b.c.b.a.b.b.b.b, b.c.b.a.b.b.b.a
    public boolean b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // b.c.b.a.b.b.b.a
    public String toString() {
        r.a(this.d, "Cannot convert to JSON on client side.");
        Parcel b2 = b();
        b2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        a(sb, this.d.a(this.e), b2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f fVar;
        int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f274a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, b(), false);
        int i2 = this.f276c;
        if (i2 == 0) {
            fVar = null;
        } else if (i2 == 1 || i2 == 2) {
            fVar = this.d;
        } else {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) fVar, i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, a2);
    }
}
