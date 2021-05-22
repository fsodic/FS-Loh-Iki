package c.a.a.a.e.b;

import c.a.a.a.e.b.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.p.b;
import c.a.a.a.p.h;
import java.net.InetAddress;

public final class f implements e, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final o f669a;

    /* renamed from: b  reason: collision with root package name */
    private final InetAddress f670b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f671c;
    private o[] d;
    private e.b e;
    private e.a f;
    private boolean g;

    public f(b bVar) {
        this(bVar.getTargetHost(), bVar.getLocalAddress());
    }

    public f(o oVar, InetAddress inetAddress) {
        a.a(oVar, "Target host");
        this.f669a = oVar;
        this.f670b = inetAddress;
        this.e = e.b.PLAIN;
        this.f = e.a.PLAIN;
    }

    public final void a(o oVar, boolean z) {
        a.a(oVar, "Proxy host");
        b.a(!this.f671c, "Already connected");
        this.f671c = true;
        this.d = new o[]{oVar};
        this.g = z;
    }

    public final void a(boolean z) {
        b.a(!this.f671c, "Already connected");
        this.f671c = true;
        this.g = z;
    }

    public final void b(boolean z) {
        b.a(this.f671c, "No layered protocol unless connected");
        this.f = e.a.LAYERED;
        this.g = z;
    }

    public final void c(boolean z) {
        b.a(this.f671c, "No tunnel unless connected");
        b.a(this.d, "No tunnel without proxy");
        this.e = e.b.TUNNELLED;
        this.g = z;
    }

    public final boolean c() {
        return this.f671c;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public void d() {
        this.f671c = false;
        this.d = null;
        this.e = e.b.PLAIN;
        this.f = e.a.PLAIN;
        this.g = false;
    }

    public final b e() {
        if (!this.f671c) {
            return null;
        }
        return new b(this.f669a, this.f670b, this.d, this.g, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f671c == fVar.f671c && this.g == fVar.g && this.e == fVar.e && this.f == fVar.f && h.a(this.f669a, fVar.f669a) && h.a(this.f670b, fVar.f670b) && h.a(this.d, fVar.d);
    }

    @Override // c.a.a.a.e.b.e
    public final int getHopCount() {
        if (!this.f671c) {
            return 0;
        }
        o[] oVarArr = this.d;
        if (oVarArr == null) {
            return 1;
        }
        return 1 + oVarArr.length;
    }

    @Override // c.a.a.a.e.b.e
    public final o getHopTarget(int i) {
        a.a(i, "Hop index");
        int hopCount = getHopCount();
        a.a(i < hopCount, "Hop index exceeds tracked route length");
        return i < hopCount - 1 ? this.d[i] : this.f669a;
    }

    @Override // c.a.a.a.e.b.e
    public final InetAddress getLocalAddress() {
        return this.f670b;
    }

    @Override // c.a.a.a.e.b.e
    public final o getProxyHost() {
        o[] oVarArr = this.d;
        if (oVarArr == null) {
            return null;
        }
        return oVarArr[0];
    }

    @Override // c.a.a.a.e.b.e
    public final o getTargetHost() {
        return this.f669a;
    }

    public final int hashCode() {
        int a2 = h.a(h.a(17, this.f669a), this.f670b);
        o[] oVarArr = this.d;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                a2 = h.a(a2, oVar);
            }
        }
        return h.a(h.a(h.a(h.a(a2, this.f671c), this.g), this.e), this.f);
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isLayered() {
        return this.f == e.a.LAYERED;
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isSecure() {
        return this.g;
    }

    @Override // c.a.a.a.e.b.e
    public final boolean isTunnelled() {
        return this.e == e.b.TUNNELLED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.f670b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.f671c) {
            sb.append('c');
        }
        if (this.e == e.b.TUNNELLED) {
            sb.append('t');
        }
        if (this.f == e.a.LAYERED) {
            sb.append('l');
        }
        if (this.g) {
            sb.append('s');
        }
        sb.append("}->");
        o[] oVarArr = this.d;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                sb.append(oVar);
                sb.append("->");
            }
        }
        sb.append(this.f669a);
        sb.append(']');
        return sb.toString();
    }
}
