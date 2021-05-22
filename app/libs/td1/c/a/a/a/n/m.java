package c.a.a.a.n;

import c.a.a.a.D;
import c.a.a.a.l;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;
import c.a.a.a.w;

public class m implements s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f970a;

    @Deprecated
    public m() {
        this(false);
    }

    public m(boolean z) {
        this.f970a = z;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        if (!rVar.containsHeader("Expect") && (rVar instanceof c.a.a.a.m)) {
            D protocolVersion = rVar.getRequestLine().getProtocolVersion();
            l entity = ((c.a.a.a.m) rVar).getEntity();
            if (entity != null && entity.getContentLength() != 0 && !protocolVersion.c(w.e) && rVar.getParams().getBooleanParameter("http.protocol.expect-continue", this.f970a)) {
                rVar.addHeader("Expect", "100-continue");
            }
        }
    }
}
