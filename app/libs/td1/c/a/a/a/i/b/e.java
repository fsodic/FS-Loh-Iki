package c.a.a.a.i.b;

import c.a.a.a.b.h;
import c.a.a.a.f.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class e implements h, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final TreeSet<c> f760a = new TreeSet<>(new c.a.a.a.f.e());

    @Override // c.a.a.a.b.h
    public synchronized void a(c cVar) {
        if (cVar != null) {
            this.f760a.remove(cVar);
            if (!cVar.isExpired(new Date())) {
                this.f760a.add(cVar);
            }
        }
    }

    @Override // c.a.a.a.b.h
    public synchronized boolean clearExpired(Date date) {
        boolean z = false;
        if (date == null) {
            return false;
        }
        Iterator<c> it = this.f760a.iterator();
        while (it.hasNext()) {
            if (it.next().isExpired(date)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // c.a.a.a.b.h
    public synchronized List<c> getCookies() {
        return new ArrayList(this.f760a);
    }

    public synchronized String toString() {
        return this.f760a.toString();
    }
}
