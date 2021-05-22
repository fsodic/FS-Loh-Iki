package b.c.b.a.d.d;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.c.b.a.d.d.aa  reason: case insensitive filesystem */
public final class C0056aa extends AbstractC0065f<String> implements AbstractC0058ba, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0056aa f405b;

    /* renamed from: c  reason: collision with root package name */
    private static final AbstractC0058ba f406c = f405b;
    private final List<Object> d;

    static {
        C0056aa aaVar = new C0056aa();
        f405b = aaVar;
        aaVar.f();
    }

    public C0056aa() {
        this(10);
    }

    public C0056aa(int i) {
        this(new ArrayList(i));
    }

    private C0056aa(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0071i ? ((AbstractC0071i) obj).a() : O.c((byte[]) obj);
    }

    @Override // b.c.b.a.d.d.Q
    public final /* synthetic */ Q a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new C0056aa(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof AbstractC0058ba) {
            collection = ((AbstractC0058ba) collection).g();
        }
        boolean addAll = this.d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final void clear() {
        a();
        this.d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, b.c.b.a.d.d.Q
    public final /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final Object f(int i) {
        return this.d.get(i);
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final List<?> g() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0071i) {
            AbstractC0071i iVar = (AbstractC0071i) obj;
            String a2 = iVar.a();
            if (iVar.b()) {
                this.d.set(i, a2);
            }
            return a2;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = O.c(bArr);
        if (O.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // b.c.b.a.d.d.AbstractC0058ba
    public final AbstractC0058ba j() {
        return e() ? new _a(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.d.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return a(this.d.set(i, (String) obj));
    }

    public final int size() {
        return this.d.size();
    }
}
