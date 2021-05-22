package c.a.a.a.n;

import c.a.a.a.C;
import c.a.a.a.D;
import c.a.a.a.m;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;
import c.a.a.a.w;

public class l implements s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f969a;

    public l() {
        this(false);
    }

    public l(boolean z) {
        this.f969a = z;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        if (rVar instanceof m) {
            if (this.f969a) {
                rVar.removeHeaders("Transfer-Encoding");
                rVar.removeHeaders("Content-Length");
            } else if (rVar.containsHeader("Transfer-Encoding")) {
                throw new C("Transfer-encoding header already present");
            } else if (rVar.containsHeader("Content-Length")) {
                throw new C("Content-Length header already present");
            }
            D protocolVersion = rVar.getRequestLine().getProtocolVersion();
            c.a.a.a.l entity = ((m) rVar).getEntity();
            if (entity == null) {
                rVar.addHeader("Content-Length", "0");
                return;
            }
            if (!entity.isChunked() && entity.getContentLength() >= 0) {
                rVar.addHeader("Content-Length", Long.toString(entity.getContentLength()));
            } else if (!protocolVersion.c(w.e)) {
                rVar.addHeader("Transfer-Encoding", "chunked");
            } else {
                throw new C("Chunked transfer encoding not allowed for " + protocolVersion);
            }
            if (entity.getContentType() != null && !rVar.containsHeader("Content-Type")) {
                rVar.a(entity.getContentType());
            }
            if (entity.getContentEncoding() != null && !rVar.containsHeader("Content-Encoding")) {
                rVar.a(entity.getContentEncoding());
            }
        }
    }
}
