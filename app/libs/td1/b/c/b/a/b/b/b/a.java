package b.c.b.a.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: b.c.b.a.b.b.b.a$a  reason: collision with other inner class name */
    public static class C0012a<I, O> extends com.google.android.gms.common.internal.a.a {
        public static final d CREATOR = new d();

        /* renamed from: a  reason: collision with root package name */
        private final int f271a;

        /* renamed from: b  reason: collision with root package name */
        protected final int f272b;

        /* renamed from: c  reason: collision with root package name */
        protected final boolean f273c;
        protected final int d;
        protected final boolean e;
        protected final String f;
        protected final int g;
        protected final Class<? extends a> h;
        private final String i;
        private f j;
        private b<I, O> k;

        C0012a(int i2, int i3, boolean z, int i4, boolean z2, String str, int i5, String str2, b.c.b.a.b.b.a.b bVar) {
            this.f271a = i2;
            this.f272b = i3;
            this.f273c = z;
            this.d = i4;
            this.e = z2;
            this.f = str;
            this.g = i5;
            if (str2 == null) {
                this.h = null;
                this.i = null;
            } else {
                this.h = c.class;
                this.i = str2;
            }
            if (bVar == null) {
                this.k = null;
            } else {
                this.k = (b<I, O>) bVar.L();
            }
        }

        private C0012a(int i2, boolean z, int i3, boolean z2, String str, int i4, Class<? extends a> cls, b<I, O> bVar) {
            this.f271a = 1;
            this.f272b = i2;
            this.f273c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.g = i4;
            this.h = cls;
            this.i = cls == null ? null : cls.getCanonicalName();
            this.k = bVar;
        }

        private final String O() {
            String str = this.i;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final b.c.b.a.b.b.a.b P() {
            b<I, O> bVar = this.k;
            if (bVar == null) {
                return null;
            }
            return b.c.b.a.b.b.a.b.a(bVar);
        }

        public static C0012a<Boolean, Boolean> a(String str, int i2) {
            return new C0012a<>(6, false, 6, false, str, i2, null, null);
        }

        public static C0012a a(String str, int i2, b<?, ?> bVar, boolean z) {
            return new C0012a(bVar.J(), z, bVar.K(), false, str, i2, null, bVar);
        }

        public static <T extends a> C0012a<T, T> a(String str, int i2, Class<T> cls) {
            return new C0012a<>(11, false, 11, false, str, i2, cls, null);
        }

        public static C0012a<Integer, Integer> b(String str, int i2) {
            return new C0012a<>(0, false, 0, false, str, i2, null, null);
        }

        public static <T extends a> C0012a<ArrayList<T>, ArrayList<T>> b(String str, int i2, Class<T> cls) {
            return new C0012a<>(11, true, 11, true, str, i2, cls, null);
        }

        public static C0012a<String, String> c(String str, int i2) {
            return new C0012a<>(7, false, 7, false, str, i2, null, null);
        }

        public int L() {
            return this.g;
        }

        public final boolean M() {
            return this.k != null;
        }

        public final Map<String, C0012a<?, ?>> N() {
            r.a((Object) this.i);
            r.a(this.j);
            return this.j.a(this.i);
        }

        public final I a(O o) {
            return this.k.a(o);
        }

        public final void a(f fVar) {
            this.j = fVar;
        }

        public String toString() {
            q.a a2 = q.a(this);
            a2.a("versionCode", Integer.valueOf(this.f271a));
            a2.a("typeIn", Integer.valueOf(this.f272b));
            a2.a("typeInArray", Boolean.valueOf(this.f273c));
            a2.a("typeOut", Integer.valueOf(this.d));
            a2.a("typeOutArray", Boolean.valueOf(this.e));
            a2.a("outputFieldName", this.f);
            a2.a("safeParcelFieldId", Integer.valueOf(this.g));
            a2.a("concreteTypeName", O());
            Class<? extends a> cls = this.h;
            if (cls != null) {
                a2.a("concreteType.class", cls.getCanonicalName());
            }
            b<I, O> bVar = this.k;
            if (bVar != null) {
                a2.a("converterName", bVar.getClass().getCanonicalName());
            }
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            int a2 = c.a(parcel);
            c.a(parcel, 1, this.f271a);
            c.a(parcel, 2, this.f272b);
            c.a(parcel, 3, this.f273c);
            c.a(parcel, 4, this.d);
            c.a(parcel, 5, this.e);
            c.a(parcel, 6, this.f, false);
            c.a(parcel, 7, L());
            c.a(parcel, 8, O(), false);
            c.a(parcel, 9, (Parcelable) P(), i2, false);
            c.a(parcel, a2);
        }
    }

    public interface b<I, O> {
        int J();

        int K();

        I a(O o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    protected static <O, I> I a(C0012a<I, O> aVar, Object obj) {
        return ((C0012a) aVar).k != null ? aVar.a(obj) : obj;
    }

    private static void a(StringBuilder sb, C0012a aVar, Object obj) {
        String str;
        int i = aVar.f272b;
        if (i == 11) {
            str = ((a) aVar.h.cast(obj)).toString();
        } else if (i == 7) {
            str = "\"";
            sb.append(str);
            sb.append(l.a((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(str);
    }

    /* access modifiers changed from: protected */
    public Object a(C0012a aVar) {
        String str = aVar.f;
        if (aVar.h == null) {
            return a(str);
        }
        r.b(a(str) == null, "Concrete field shouldn't be value object: %s", aVar.f);
        boolean z = aVar.e;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object a(String str);

    public abstract Map<String, C0012a<?, ?>> a();

    /* access modifiers changed from: protected */
    public boolean b(C0012a aVar) {
        if (aVar.d != 11) {
            return b(aVar.f);
        }
        if (aVar.e) {
            String str = aVar.f;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = aVar.f;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(String str);

    public String toString() {
        String str;
        String str2;
        Map<String, C0012a<?, ?>> a2 = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str3 : a2.keySet()) {
            C0012a<?, ?> aVar = a2.get(str3);
            if (b(aVar)) {
                Object a3 = a(aVar, a(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str3);
                sb.append("\":");
                if (a3 != null) {
                    switch (aVar.d) {
                        case 8:
                            sb.append("\"");
                            str = com.google.android.gms.common.util.b.a((byte[]) a3);
                            sb.append(str);
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            str = com.google.android.gms.common.util.b.b((byte[]) a3);
                            sb.append(str);
                            sb.append("\"");
                            break;
                        case 10:
                            m.a(sb, (HashMap) a3);
                            break;
                        default:
                            if (aVar.f273c) {
                                ArrayList arrayList = (ArrayList) a3;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        a(sb, aVar, obj);
                                    }
                                }
                                str2 = "]";
                                break;
                            } else {
                                a(sb, aVar, a3);
                                break;
                            }
                    }
                } else {
                    str2 = "null";
                }
                sb.append(str2);
            }
        }
        sb.append(sb.length() > 0 ? "}" : "{}");
        return sb.toString();
    }
}
