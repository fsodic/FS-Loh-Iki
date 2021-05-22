package c.a.a.a.n;

import c.a.a.a.C;
import c.a.a.a.D;
import c.a.a.a.j;
import c.a.a.a.o;
import c.a.a.a.p;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;
import c.a.a.a.w;
import java.net.InetAddress;

public class n implements s {
    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        f a2 = f.a(eVar);
        D protocolVersion = rVar.getRequestLine().getProtocolVersion();
        if ((!rVar.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") || !protocolVersion.c(w.e)) && !rVar.containsHeader("Host")) {
            o c2 = a2.c();
            if (c2 == null) {
                j a3 = a2.a();
                if (a3 instanceof p) {
                    p pVar = (p) a3;
                    InetAddress remoteAddress = pVar.getRemoteAddress();
                    int remotePort = pVar.getRemotePort();
                    if (remoteAddress != null) {
                        c2 = new o(remoteAddress.getHostName(), remotePort);
                    }
                }
                if (c2 == null) {
                    if (!protocolVersion.c(w.e)) {
                        throw new C("Target host missing");
                    }
                    return;
                }
            }
            rVar.addHeader("Host", c2.g());
        }
    }
}
