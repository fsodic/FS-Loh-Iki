package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0124h;
import c.a.a.a.p.a;
import c.a.a.a.p.b;
import java.util.List;
import java.util.NoSuchElementException;

public class l implements AbstractC0124h {

    /* renamed from: a  reason: collision with root package name */
    protected final List<AbstractC0121e> f930a;

    /* renamed from: b  reason: collision with root package name */
    protected int f931b = b(-1);

    /* renamed from: c  reason: collision with root package name */
    protected int f932c = -1;
    protected String d;

    public l(List<AbstractC0121e> list, String str) {
        a.a((Object) list, "Header list");
        this.f930a = list;
        this.d = str;
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        if (this.d == null) {
            return true;
        }
        return this.d.equalsIgnoreCase(this.f930a.get(i).getName());
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f930a.size() - 1;
        boolean z = false;
        while (!z && i < size) {
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
        return this.f931b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextHeader();
    }

    @Override // c.a.a.a.AbstractC0124h
    public AbstractC0121e nextHeader() {
        int i = this.f931b;
        if (i >= 0) {
            this.f932c = i;
            this.f931b = b(i);
            return this.f930a.get(i);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public void remove() {
        b.a(this.f932c >= 0, "No header to remove");
        this.f930a.remove(this.f932c);
        this.f932c = -1;
        this.f931b--;
    }
}
