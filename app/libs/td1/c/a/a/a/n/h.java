package c.a.a.a.n;

import c.a.a.a.AbstractC0125i;
import c.a.a.a.C;
import c.a.a.a.D;
import c.a.a.a.m;
import c.a.a.a.n;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.t;
import c.a.a.a.w;
import java.io.IOException;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f966a;

    public h() {
        this(3000);
    }

    public h(int i) {
        a.b(i, "Wait for continue time");
        this.f966a = i;
    }

    private static void a(AbstractC0125i iVar) {
        try {
            iVar.close();
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public t a(r rVar, AbstractC0125i iVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(iVar, "Client connection");
        a.a(eVar, "HTTP context");
        t tVar = null;
        int i = 0;
        while (true) {
            if (tVar != null && i >= 200) {
                return tVar;
            }
            tVar = iVar.receiveResponseHeader();
            if (a(rVar, tVar)) {
                iVar.a(tVar);
            }
            i = tVar.getStatusLine().getStatusCode();
        }
    }

    public void a(r rVar, g gVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(gVar, "HTTP processor");
        a.a(eVar, "HTTP context");
        eVar.setAttribute("http.request", rVar);
        gVar.a(rVar, eVar);
    }

    public void a(t tVar, g gVar, e eVar) {
        a.a(tVar, "HTTP response");
        a.a(gVar, "HTTP processor");
        a.a(eVar, "HTTP context");
        eVar.setAttribute("http.response", tVar);
        gVar.a(tVar, eVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(r rVar, t tVar) {
        int statusCode;
        return ("HEAD".equalsIgnoreCase(rVar.getRequestLine().getMethod()) || (statusCode = tVar.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    /* access modifiers changed from: protected */
    public t b(r rVar, AbstractC0125i iVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(iVar, "Client connection");
        a.a(eVar, "HTTP context");
        eVar.setAttribute("http.connection", iVar);
        eVar.setAttribute("http.request_sent", Boolean.FALSE);
        iVar.a(rVar);
        t tVar = null;
        if (rVar instanceof m) {
            boolean z = true;
            D protocolVersion = rVar.getRequestLine().getProtocolVersion();
            m mVar = (m) rVar;
            if (mVar.expectContinue() && !protocolVersion.c(w.e)) {
                iVar.flush();
                if (iVar.isResponseAvailable(this.f966a)) {
                    t receiveResponseHeader = iVar.receiveResponseHeader();
                    if (a(rVar, receiveResponseHeader)) {
                        iVar.a(receiveResponseHeader);
                    }
                    int statusCode = receiveResponseHeader.getStatusLine().getStatusCode();
                    if (statusCode >= 200) {
                        z = false;
                        tVar = receiveResponseHeader;
                    } else if (statusCode != 100) {
                        throw new C("Unexpected response: " + receiveResponseHeader.getStatusLine());
                    }
                }
            }
            if (z) {
                iVar.a(mVar);
            }
        }
        iVar.flush();
        eVar.setAttribute("http.request_sent", Boolean.TRUE);
        return tVar;
    }

    public t c(r rVar, AbstractC0125i iVar, e eVar) {
        a.a(rVar, "HTTP request");
        a.a(iVar, "Client connection");
        a.a(eVar, "HTTP context");
        try {
            t b2 = b(rVar, iVar, eVar);
            return b2 == null ? a(rVar, iVar, eVar) : b2;
        } catch (IOException e) {
            a(iVar);
            throw e;
        } catch (n e2) {
            a(iVar);
            throw e2;
        } catch (RuntimeException e3) {
            a(iVar);
            throw e3;
        }
    }
}
