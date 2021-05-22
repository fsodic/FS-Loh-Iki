package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0124h;
import c.a.a.a.p.a;
import java.util.NoSuchElementException;

public class e implements AbstractC0124h {

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC0121e[] f915a;

    /* renamed from: b  reason: collision with root package name */
    protected int f916b = b(-1);

    /* renamed from: c  reason: collision with root package name */
    protected String f917c;

    public e(AbstractC0121e[] eVarArr, String str) {
        a.a(eVarArr, "Header array");
        this.f915a = eVarArr;
        this.f917c = str;
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        String str = this.f917c;
        return str == null || str.equalsIgnoreCase(this.f915a[i].getName());
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        if (i < -1) {
            return -1;
        }
        int length = this.f915a.length - 1;
        boolean z = false;
        while (!z && i < length) {
            i++;
            z = a(i);
        }
        if (z) {
            return i;
        }
        return -1;
    }

    @Override // c.a.a.a.AbstractC0124h
    public boolean hasNext() {
        return this.f916b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextHeader();
    }

    @Override // c.a.a.a.AbstractC0124h
    public AbstractC0121e nextHeader() {
        int i = this.f916b;
        if (i >= 0) {
            this.f916b = b(i);
            return this.f915a[i];
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
