package b.c.b.a.d.d;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class N extends AbstractC0065f<Integer> implements Q<Integer>, Ca, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final N f378b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f379c;
    private int d;

    static {
        N n = new N(new int[0], 0);
        f378b = n;
        n.f();
    }

    N() {
        this(new int[10], 0);
    }

    private N(int[] iArr, int i) {
        this.f379c = iArr;
        this.d = i;
    }

    private final void a(int i, int i2) {
        int i3;
        a();
        if (i < 0 || i > (i3 = this.d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        int[] iArr = this.f379c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f379c, i, iArr2, i + 1, this.d - i);
            this.f379c = iArr2;
        }
        this.f379c[i] = i2;
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
    public final /* synthetic */ Q<Integer> a(int i) {
        if (i >= this.d) {
            return new N(Arrays.copyOf(this.f379c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        O.a(collection);
        if (!(collection instanceof N)) {
            return super.addAll(collection);
        }
        N n = (N) collection;
        int i = n.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f379c;
            if (i3 > iArr.length) {
                this.f379c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(n.f379c, 0, this.f379c, this.d, n.d);
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
        if (!(obj instanceof N)) {
            return super.equals(obj);
        }
        N n = (N) obj;
        if (this.d != n.d) {
            return false;
        }
        int[] iArr = n.f379c;
        for (int i = 0; i < this.d; i++) {
            if (this.f379c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        i(i);
        return this.f379c[i];
    }

    @Override // b.c.b.a.d.d.AbstractC0065f
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.f379c[i2];
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        i(i);
        int[] iArr = this.f379c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // b.c.b.a.d.d.AbstractC0065f, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.f379c[i]))) {
                int[] iArr = this.f379c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
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
            int[] iArr = this.f379c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i);
        int[] iArr = this.f379c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.d;
    }
}
