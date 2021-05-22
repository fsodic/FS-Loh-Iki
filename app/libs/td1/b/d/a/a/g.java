package b.d.a.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.G;
import c.a.a.a.b.l;
import c.a.a.a.t;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class g extends f {
    private String[] i = {"application/octet-stream", "image/jpeg", "image/png", "image/gif"};

    public g(String[] strArr) {
        if (strArr != null) {
            this.i = strArr;
        } else {
            d.f564a.b("BinaryHttpRH", "Constructor passed allowedContentTypes was null !");
        }
    }

    @Override // b.d.a.a.s, b.d.a.a.f
    public final void a(t tVar) {
        G statusLine = tVar.getStatusLine();
        AbstractC0121e[] headers = tVar.getHeaders("Content-Type");
        if (headers.length != 1) {
            a(statusLine.getStatusCode(), tVar.getAllHeaders(), null, new l(statusLine.getStatusCode(), "None, or more than one, Content-Type Header found!"));
            return;
        }
        AbstractC0121e eVar = headers[0];
        String[] j = j();
        boolean z = false;
        for (String str : j) {
            try {
                if (Pattern.matches(str, eVar.getValue())) {
                    z = true;
                }
            } catch (PatternSyntaxException e) {
                d.f564a.b("BinaryHttpRH", "Given pattern is not valid: " + str, e);
            }
        }
        if (!z) {
            a(statusLine.getStatusCode(), tVar.getAllHeaders(), null, new l(statusLine.getStatusCode(), "Content-Type (" + eVar.getValue() + ") not allowed!"));
            return;
        }
        super.a(tVar);
    }

    public String[] j() {
        return this.i;
    }
}
