package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.LinkedList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sS  reason: case insensitive filesystem */
public final class C2148sS {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<CS<?>> f5513a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int f5514b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5515c;
    private final QS d;

    public C2148sS(int i, int i2) {
        this.f5514b = i;
        this.f5515c = i2;
        this.d = new QS();
    }

    private final void h() {
        while (!this.f5513a.isEmpty()) {
            if (q.j().a() - this.f5513a.getFirst().d >= ((long) this.f5515c)) {
                this.d.g();
                this.f5513a.remove();
            } else {
                return;
            }
        }
    }

    public final long a() {
        return this.d.a();
    }

    public final boolean a(CS<?> cs) {
        this.d.e();
        h();
        if (this.f5513a.size() == this.f5514b) {
            return false;
        }
        this.f5513a.add(cs);
        return true;
    }

    public final int b() {
        h();
        return this.f5513a.size();
    }

    public final CS<?> c() {
        this.d.e();
        h();
        if (this.f5513a.isEmpty()) {
            return null;
        }
        CS<?> remove = this.f5513a.remove();
        if (remove != null) {
            this.d.f();
        }
        return remove;
    }

    public final long d() {
        return this.d.b();
    }

    public final int e() {
        return this.d.c();
    }

    public final String f() {
        return this.d.d();
    }

    public final TS g() {
        return this.d.h();
    }
}
