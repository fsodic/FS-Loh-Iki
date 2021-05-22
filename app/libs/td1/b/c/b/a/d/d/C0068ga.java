package b.c.b.a.d.d;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: b.c.b.a.d.d.ga  reason: case insensitive filesystem */
final class C0068ga extends AbstractC0065f<Long> implements Q<Long>, Ca, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0068ga f425b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f426c;
    private int d;

    static {
        C0068ga gaVar = new C0068ga(new long[0], 0);
        f425b = gaVar;
        gaVar.f();
    }

    C0068ga() {
        this(new long[10], 0);
    }

    private C0068ga(long[] jArr, int i) {
        this.f426c = jArr;
        this.d = i;
    }

    private final void a(int i, long j) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        long[] jArr = this.f426c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f426c, i, jArr2, i + 1, this.d - i);
            this.f426c = jArr2;
        }
        this.f426c[i] = j;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* Return type fixed from 'b.c.b.a.d.d.Q' to match base method */
    @Override // b.c.b.a.d.d.Q
    public final /* synthetic */ Q<Long> a(int i) {
        if (i >= this.d) {
            return new C0068ga(Arrays.copyOf(this.f426c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        O.a(collection);
        if (!(collection instanceof C0068ga)) {
            return super.addAll(collection);
        }
        C0068ga gaVar = (C0068ga) collection;
        int i = gaVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f426c;
            if (i3 > jArr.length) {
                this.f426c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(gaVar.f426c, 0, this.f426c, this.d, gaVar.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0068ga)) {
            return super.equals(obj);
        }
        C0068ga gaVar = (C0068ga) obj;
        if (this.d != gaVar.d) {
            return false;
        }
        long[] jArr = gaVar.f426c;
        for (int i = 0; i < this.d; i++) {
            if (this.f426c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(h(i));
    }

    public final long h(int i) {
        i(i);
        return this.f426c[i];
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + O.a(this.f426c[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        i(i);
        long[] jArr = this.f426c;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.f426c[i]))) {
                long[] jArr = this.f426c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d - i) - 1);
                this.d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            long[] jArr = this.f426c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i);
        long[] jArr = this.f426c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.d;
    }
}
