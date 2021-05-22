package b.c.b.a.d.d;

import b.c.b.a.d.d.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class F<FieldDescriptorType extends H<FieldDescriptorType>> {

    /* renamed from: a  reason: collision with root package name */
    private static final F f345a = new F(true);

    /* renamed from: b  reason: collision with root package name */
    final Ia<FieldDescriptorType, Object> f346b = Ia.a(16);

    /* renamed from: c  reason: collision with root package name */
    private boolean f347c;
    private boolean d = false;

    private F() {
    }

    private F(boolean z) {
        e();
    }

    public static int a(H<?> h, Object obj) {
        kb S = h.S();
        int O = h.O();
        if (!h.R()) {
            return a(S, O, obj);
        }
        int i = 0;
        if (h.P()) {
            for (Object obj2 : (List) obj) {
                i += b(S, obj2);
            }
            return AbstractC0100x.b(O) + i + AbstractC0100x.i(i);
        }
        for (Object obj3 : (List) obj) {
            i += a(S, O, obj3);
        }
        return i;
    }

    static int a(kb kbVar, int i, Object obj) {
        int b2 = AbstractC0100x.b(i);
        if (kbVar == kb.GROUP) {
            O.a((AbstractC0089ra) obj);
            b2 <<= 1;
        }
        return b2 + b(kbVar, obj);
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f346b.get(fielddescriptortype);
        if (!(obj instanceof V)) {
            return obj;
        }
        V.c();
        throw null;
    }

    private static Object a(Object obj) {
        if (obj instanceof AbstractC0101xa) {
            return ((AbstractC0101xa) obj).J();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof b.c.b.a.d.d.V) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof b.c.b.a.d.d.P) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(b.c.b.a.d.d.kb r2, java.lang.Object r3) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.F.a(b.c.b.a.d.d.kb, java.lang.Object):void");
    }

    private static boolean a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.Q() == pb.MESSAGE) {
            if (key.R()) {
                for (AbstractC0089ra raVar : (List) entry.getValue()) {
                    if (!raVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof AbstractC0089ra) {
                    if (!((AbstractC0089ra) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof V) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int b(kb kbVar, Object obj) {
        switch (G.f349b[kbVar.ordinal()]) {
            case 1:
                return AbstractC0100x.b(((Double) obj).doubleValue());
            case 2:
                return AbstractC0100x.b(((Float) obj).floatValue());
            case 3:
                return AbstractC0100x.d(((Long) obj).longValue());
            case 4:
                return AbstractC0100x.e(((Long) obj).longValue());
            case 5:
                return AbstractC0100x.c(((Integer) obj).intValue());
            case 6:
                return AbstractC0100x.g(((Long) obj).longValue());
            case 7:
                return AbstractC0100x.f(((Integer) obj).intValue());
            case 8:
                return AbstractC0100x.b(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0100x.b((AbstractC0089ra) obj);
            case 10:
                return obj instanceof V ? AbstractC0100x.a((V) obj) : AbstractC0100x.a((AbstractC0089ra) obj);
            case 11:
                return obj instanceof AbstractC0071i ? AbstractC0100x.a((AbstractC0071i) obj) : AbstractC0100x.a((String) obj);
            case 12:
                return obj instanceof AbstractC0071i ? AbstractC0100x.a((AbstractC0071i) obj) : AbstractC0100x.b((byte[]) obj);
            case 13:
                return AbstractC0100x.d(((Integer) obj).intValue());
            case 14:
                return AbstractC0100x.g(((Integer) obj).intValue());
            case 15:
                return AbstractC0100x.h(((Long) obj).longValue());
            case 16:
                return AbstractC0100x.e(((Integer) obj).intValue());
            case 17:
                return AbstractC0100x.f(((Long) obj).longValue());
            case 18:
                return obj instanceof P ? AbstractC0100x.h(((P) obj).O()) : AbstractC0100x.h(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.R()) {
            a(fielddescriptortype.S(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(fielddescriptortype.S(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof V) {
            this.d = true;
        }
        this.f346b.put(fielddescriptortype, obj);
    }

    private final void b(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof V) {
            V.c();
            throw null;
        } else if (key.R()) {
            Object a2 = a((H) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.f346b.put(key, a2);
        } else if (key.Q() == pb.MESSAGE) {
            Object a3 = a((H) key);
            if (a3 == null) {
                this.f346b.put(key, a(value));
            } else {
                this.f346b.put(key, a3 instanceof AbstractC0101xa ? key.a((AbstractC0101xa) a3, (AbstractC0101xa) value) : key.a(((AbstractC0089ra) a3).f(), (AbstractC0089ra) value).a());
            }
        } else {
            this.f346b.put(key, a(value));
        }
    }

    private static int c(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.Q() != pb.MESSAGE || key.R() || key.P()) ? a((H<?>) key, value) : value instanceof V ? AbstractC0100x.b(entry.getKey().O(), (V) value) : AbstractC0100x.b(entry.getKey().O(), (AbstractC0089ra) value);
    }

    public static <T extends H<T>> F<T> f() {
        return f345a;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        return this.d ? new Y(this.f346b.e().iterator()) : this.f346b.e().iterator();
    }

    public final void a(F<FieldDescriptorType> f) {
        for (int i = 0; i < f.f346b.c(); i++) {
            b(f.f346b.b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : f.f346b.d()) {
            b(entry);
        }
    }

    public final boolean b() {
        return this.f347c;
    }

    public final boolean c() {
        for (int i = 0; i < this.f346b.c(); i++) {
            if (!a((Map.Entry) this.f346b.b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f346b.d()) {
            if (!a((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        F f = new F();
        for (int i = 0; i < this.f346b.c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b2 = this.f346b.b(i);
            f.b(b2.getKey(), b2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f346b.d()) {
            f.b(entry.getKey(), entry.getValue());
        }
        f.d = this.d;
        return f;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> d() {
        return this.d ? new Y(this.f346b.entrySet().iterator()) : this.f346b.entrySet().iterator();
    }

    public final void e() {
        if (!this.f347c) {
            this.f346b.b();
            this.f347c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        return this.f346b.equals(((F) obj).f346b);
    }

    public final int g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f346b.c(); i2++) {
            i += c(this.f346b.b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f346b.d()) {
            i += c(entry);
        }
        return i;
    }

    public final int hashCode() {
        return this.f346b.hashCode();
    }
}
