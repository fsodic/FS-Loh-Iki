package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ln  reason: case insensitive filesystem */
public final class C0487Ln implements Iterable<C0435Jn> {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0435Jn> f2536a = new ArrayList();

    public static boolean a(AbstractC0798Xm xm) {
        C0435Jn b2 = b(xm);
        if (b2 == null) {
            return false;
        }
        b2.e.b();
        return true;
    }

    static C0435Jn b(AbstractC0798Xm xm) {
        Iterator<C0435Jn> it = q.y().iterator();
        while (it.hasNext()) {
            C0435Jn next = it.next();
            if (next.d == xm) {
                return next;
            }
        }
        return null;
    }

    public final void a(C0435Jn jn) {
        this.f2536a.add(jn);
    }

    public final void b(C0435Jn jn) {
        this.f2536a.remove(jn);
    }

    @Override // java.lang.Iterable
    public final Iterator<C0435Jn> iterator() {
        return this.f2536a.iterator();
    }
}
