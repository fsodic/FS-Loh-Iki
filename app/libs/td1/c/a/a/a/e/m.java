package c.a.a.a.e;

import c.a.a.a.o;
import c.a.a.a.p.a;
import java.net.InetAddress;
import java.net.InetSocketAddress;

@Deprecated
public class m extends InetSocketAddress {

    /* renamed from: a  reason: collision with root package name */
    private final o f703a;

    public m(o oVar, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        a.a(oVar, "HTTP host");
        this.f703a = oVar;
    }

    public o a() {
        return this.f703a;
    }

    public String toString() {
        return this.f703a.d() + ":" + getPort();
    }
}
