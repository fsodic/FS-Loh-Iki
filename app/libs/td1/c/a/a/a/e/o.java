package c.a.a.a.e;

import c.a.a.a.AbstractC0125i;
import c.a.a.a.e.b.b;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import java.util.concurrent.TimeUnit;

@Deprecated
public interface o extends AbstractC0125i, n, p, i {
    void a(b bVar, e eVar, g gVar);

    void a(e eVar, g gVar);

    void a(boolean z, g gVar);

    @Override // c.a.a.a.e.n
    b getRoute();

    void markReusable();

    void setIdleDuration(long j, TimeUnit timeUnit);

    void setState(Object obj);

    void unmarkReusable();
}
