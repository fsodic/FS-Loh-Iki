package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.Uma;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.uS  reason: case insensitive filesystem */
final class C2286uS implements AbstractC2079rS {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<BS, C2148sS> f5719a;

    /* renamed from: b  reason: collision with root package name */
    private C2562yS f5720b;

    /* renamed from: c  reason: collision with root package name */
    private C2424wS f5721c = new C2424wS();

    public C2286uS(C2562yS ySVar) {
        this.f5719a = new ConcurrentHashMap<>(ySVar.h);
        this.f5720b = ySVar;
    }

    private final void a(CS<?> cs, TS ts) {
        if (cs != null) {
            Uma.c n = Uma.n();
            Uma.a.C0035a n2 = Uma.a.n();
            n2.a(Uma.b.IN_MEMORY);
            Uma.d.a n3 = Uma.d.n();
            n3.a(ts.f3178a);
            n3.a(ts.f3179b);
            n2.a(n3);
            n.a(n2);
            cs.f1694a.c().c((Uma) n.j());
        }
        b();
    }

    private final void b() {
        if (C2562yS.L()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5720b.f);
            sb.append(" PoolCollection");
            sb.append(this.f5721c.g());
            int i = 0;
            for (Map.Entry<BS, C2148sS> entry : this.f5719a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().b(); i2++) {
                    sb.append("[O]");
                }
                for (int b2 = entry.getValue().b(); b2 < this.f5720b.h; b2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().f());
                sb.append("\n");
            }
            while (i < this.f5720b.g) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            C0745Vl.a(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2079rS
    @Deprecated
    public final BS a(Zna zna, String str, C1496ioa ioa) {
        return new ES(zna, str, new C1002bi(this.f5720b.d).a().o, this.f5720b.j, ioa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2079rS
    public final C2562yS a() {
        return this.f5720b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2079rS
    public final synchronized boolean a(BS bs) {
        C2148sS sSVar = this.f5719a.get(bs);
        if (sSVar != null) {
            return sSVar.b() < this.f5720b.h;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2079rS
    public final synchronized boolean a(BS bs, CS<?> cs) {
        boolean a2;
        ConcurrentHashMap<BS, C2148sS> concurrentHashMap;
        C2148sS sSVar = this.f5719a.get(bs);
        cs.d = q.j().a();
        if (sSVar == null) {
            sSVar = new C2148sS(this.f5720b.h, this.f5720b.i * 1000);
            if (this.f5719a.size() == this.f5720b.g) {
                int i = C2217tS.f5612a[this.f5720b.l - 1];
                long j = Long.MAX_VALUE;
                BS bs2 = null;
                if (i == 1) {
                    for (Map.Entry<BS, C2148sS> entry : this.f5719a.entrySet()) {
                        if (entry.getValue().a() < j) {
                            j = entry.getValue().a();
                            bs2 = entry.getKey();
                        }
                    }
                    if (bs2 != null) {
                        concurrentHashMap = this.f5719a;
                    }
                    this.f5721c.d();
                } else if (i != 2) {
                    if (i == 3) {
                        int i2 = Integer.MAX_VALUE;
                        for (Map.Entry<BS, C2148sS> entry2 : this.f5719a.entrySet()) {
                            if (entry2.getValue().e() < i2) {
                                i2 = entry2.getValue().e();
                                bs2 = entry2.getKey();
                            }
                        }
                        if (bs2 != null) {
                            concurrentHashMap = this.f5719a;
                        }
                    }
                    this.f5721c.d();
                } else {
                    for (Map.Entry<BS, C2148sS> entry3 : this.f5719a.entrySet()) {
                        if (entry3.getValue().d() < j) {
                            j = entry3.getValue().d();
                            bs2 = entry3.getKey();
                        }
                    }
                    if (bs2 != null) {
                        concurrentHashMap = this.f5719a;
                    }
                    this.f5721c.d();
                }
                concurrentHashMap.remove(bs2);
                this.f5721c.d();
            }
            this.f5719a.put(bs, sSVar);
            this.f5721c.c();
        }
        a2 = sSVar.a(cs);
        this.f5721c.e();
        C2355vS f = this.f5721c.f();
        TS g = sSVar.g();
        if (cs != null) {
            Uma.c n = Uma.n();
            Uma.a.C0035a n2 = Uma.a.n();
            n2.a(Uma.b.IN_MEMORY);
            Uma.e.a n3 = Uma.e.n();
            n3.a(f.f5807a);
            n3.b(f.f5808b);
            n3.a(g.f3179b);
            n2.a(n3);
            n.a(n2);
            cs.f1694a.c().b((Uma) ((AbstractC2092rca) n.j()));
        }
        b();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2079rS
    public final synchronized CS<?> b(BS bs) {
        CS<?> cs;
        C2148sS sSVar = this.f5719a.get(bs);
        cs = null;
        if (sSVar != null) {
            cs = sSVar.c();
            if (cs == null) {
                this.f5721c.b();
            }
            a(cs, sSVar.g());
        } else {
            this.f5721c.a();
            a((CS<?>) null, (TS) null);
        }
        return cs;
    }
}
