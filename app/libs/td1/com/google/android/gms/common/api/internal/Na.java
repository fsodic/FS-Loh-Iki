package com.google.android.gms.common.api.internal;

import android.util.Log;
import b.c.b.a.h.b;
import b.c.b.a.h.e;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Map;

final class Na implements b<Map<za<?>, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ La f1229a;

    private Na(La la) {
        this.f1229a = la;
    }

    @Override // b.c.b.a.h.b
    public final void a(e<Map<za<?>, String>> eVar) {
        La la;
        b.c.b.a.b.b bVar;
        Map map;
        this.f1229a.f.lock();
        try {
            if (this.f1229a.n) {
                if (eVar.d()) {
                    this.f1229a.o = new a.c.b(this.f1229a.f1224a.size());
                    for (Ka ka : this.f1229a.f1224a.values()) {
                        this.f1229a.o.put(ka.e(), b.c.b.a.b.b.f260a);
                    }
                } else {
                    if (eVar.a() instanceof c) {
                        c cVar = (c) eVar.a();
                        if (this.f1229a.l) {
                            this.f1229a.o = new a.c.b(this.f1229a.f1224a.size());
                            for (Ka ka2 : this.f1229a.f1224a.values()) {
                                za e = ka2.e();
                                b.c.b.a.b.b a2 = cVar.a(ka2);
                                if (this.f1229a.a(ka2, a2)) {
                                    map = this.f1229a.o;
                                    a2 = new b.c.b.a.b.b(16);
                                } else {
                                    map = this.f1229a.o;
                                }
                                map.put(e, a2);
                            }
                        } else {
                            this.f1229a.o = cVar.a();
                        }
                        la = this.f1229a;
                        bVar = this.f1229a.e();
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", eVar.a());
                        this.f1229a.o = Collections.emptyMap();
                        la = this.f1229a;
                        bVar = new b.c.b.a.b.b(8);
                    }
                    la.r = bVar;
                }
                if (this.f1229a.p != null) {
                    this.f1229a.o.putAll(this.f1229a.p);
                    this.f1229a.r = this.f1229a.e();
                }
                if (this.f1229a.r == null) {
                    this.f1229a.c();
                    this.f1229a.d();
                } else {
                    this.f1229a.n = false;
                    this.f1229a.e.a(this.f1229a.r);
                }
                this.f1229a.i.signalAll();
            }
        } finally {
            this.f1229a.f.unlock();
        }
    }
}
