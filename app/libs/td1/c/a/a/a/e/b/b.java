package c.a.a.a.e.b;

import c.a.a.a.e.b.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.p.h;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class b implements e, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final o f660a;

    /* renamed from: b  reason: collision with root package name */
    private final InetAddress f661b;

    /* renamed from: c  reason: collision with root package name */
    private final List<o> f662c;
    private final e.b d;
    private final e.a e;
    private final boolean f;

    public b(o oVar) {
        this(oVar, (InetAddress) null, (List<o>) Collections.emptyList(), false, e.b.PLAIN, e.a.PLAIN);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(o oVar, InetAddress inetAddress, o oVar2, boolean z) {
        this(oVar, inetAddress, Collections.singletonList(oVar2), z, z ? e.b.TUNNELLED : e.b.PLAIN, z ? e.a.LAYERED : e.a.PLAIN);
        a.a(oVar2, "Proxy host");
    }

    private b(o oVar, InetAddress inetAddress, List<o> list, boolean z, e.b bVar, e.a aVar) {
        a.a(oVar, "Target host");
        this.f660a = a(oVar);
        this.f661b = inetAddress;
        this.f662c = (list == null || list.isEmpty()) ? null : new ArrayList(list);
        if (bVar == e.b.TUNNELLED) {
            a.a(this.f662c != null, "Proxy required if tunnelled");
        }
        this.f = z;
        this.d = bVar == null ? e.b.PLAIN : bVar;
        this.e = aVar == null ? e.a.PLAIN : aVar;
    }

    public b(o oVar, InetAddress inetAddress, boolean z) {
        this(oVar, inetAddress, Collections.emptyList(), z, e.b.PLAIN, e.a.PLAIN);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(o oVar, InetAddress inetAddress, o[] oVarArr, boolean z, e.b bVar, e.a aVar) {
        this(oVar, inetAddress, oVarArr != null ? Arrays.asList(oVarArr) : null, z, bVar, aVar);
    }

    private static int a(String str) {
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        return "https".equalsIgnoreCase(str) ? 443 : -1;
    }

    private static o a(o oVar) {
        if (oVar.e() >= 0) {
            return oVar;
        }
        InetAddress c2 = oVar.c();
        String f2 = oVar.f();
        return c2 != null ? new o(c2, a(f2), f2) : new o(oVar.d(), a(f2), f2);
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f == bVar.f && this.d == bVar.d && this.e == bVar.e && h.a(this.f660a, bVar.f660a) && h.a(this.f661b, bVar.f661b) && h.a(this.f662c, bVar.f662c);
    }

    @Override // c.a.a.a.e.b.e
    public final int getHopCount() {
        List<o> list = this.f662c;
        if (list != null) {
            return 1 + list.size();
        }
        return 1;
    }

    @Override // c.a.a.a.e.b.e
    public final o getHopTarget(int i) {
        a.a(i, "Hop index");
        int hopCount = getHopCount();
        a.a(i < hopCount, "Hop index exceeds tracked route length");
        return i < hopCount - 1 ? this.f662c.get(i) : this.f660a;
    }

    @Override // c.a.a.a.e.b.e
    public final InetAddress getLocalAddress() {
        return this.f661b;
    }

    @Override // c.a.a.a.e.b.e
    public final o getProxyHost() {
        List<o> list = this.f662c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f662c.get(0);
    }

    @Override // c.a.a.a.e.b.e
    public final o getTargetHost() {
        return this.f660a;
    }

    public final int hashCode() {
        int a2 = h.a(h.a(17, this.f660a), this.f661b);
        List<o> list = this.f662c;
        if (list != null) {
            for (o oVar : list) {
                a2 = h.a(a2, oVar);
            }
        }
        return h.a(h.a(h.a(a2, this.f), this.d), this.e);
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isLayered() {
        return this.e == e.a.LAYERED;
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isSecure() {
        return this.f;
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isTunnelled() {
        return this.d == e.b.TUNNELLED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        InetAddress inetAddress = this.f661b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.d == e.b.TUNNELLED) {
            sb.append('t');
        }
        if (this.e == e.a.LAYERED) {
            sb.append('l');
        }
        if (this.f) {
            sb.append('s');
        }
        sb.append("}->");
        List<o> list = this.f662c;
        if (list != null) {
            for (o oVar : list) {
                sb.append(oVar);
                sb.append("->");
            }
        }
        sb.append(this.f660a);
        return sb.toString();
    }
}
