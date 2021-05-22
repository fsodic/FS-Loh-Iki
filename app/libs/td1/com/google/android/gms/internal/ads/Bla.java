package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Bla {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1650a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f1651b;

    /* renamed from: c  reason: collision with root package name */
    private List<C2593yla> f1652c = new LinkedList();

    public final C2593yla a(boolean z) {
        synchronized (this.f1650a) {
            C2593yla yla = null;
            if (this.f1652c.size() == 0) {
                C0745Vl.a("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f1652c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (C2593yla yla2 : this.f1652c) {
                    int a2 = yla2.a();
                    if (a2 > i2) {
                        i = i3;
                        yla = yla2;
                        i2 = a2;
                    }
                    i3++;
                }
                this.f1652c.remove(i);
                return yla;
            }
            C2593yla yla3 = this.f1652c.get(0);
            if (z) {
                this.f1652c.remove(0);
            } else {
                yla3.f();
            }
            return yla3;
        }
    }

    public final boolean a(C2593yla yla) {
        synchronized (this.f1650a) {
            return this.f1652c.contains(yla);
        }
    }

    public final boolean b(C2593yla yla) {
        synchronized (this.f1650a) {
            Iterator<C2593yla> it = this.f1652c.iterator();
            while (it.hasNext()) {
                C2593yla next = it.next();
                if (!q.g().i().j()) {
                    if (yla != next && next.c().equals(yla.c())) {
                        it.remove();
                        return true;
                    }
                } else if (!q.g().i().g() && yla != next && next.e().equals(yla.e())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(C2593yla yla) {
        synchronized (this.f1650a) {
            if (this.f1652c.size() >= 10) {
                int size = this.f1652c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C0745Vl.a(sb.toString());
                this.f1652c.remove(0);
            }
            int i = this.f1651b;
            this.f1651b = i + 1;
            yla.a(i);
            yla.i();
            this.f1652c.add(yla);
        }
    }
}
