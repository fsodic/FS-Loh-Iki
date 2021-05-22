package b.d.a.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.n.e;
import c.a.a.a.r;
import c.a.a.a.s;

/* access modifiers changed from: package-private */
public class a implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f561a;

    a(d dVar) {
        this.f561a = dVar;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        if (!rVar.containsHeader("Accept-Encoding")) {
            rVar.addHeader("Accept-Encoding", "gzip");
        }
        for (String str : this.f561a.e.keySet()) {
            if (rVar.containsHeader(str)) {
                AbstractC0121e firstHeader = rVar.getFirstHeader(str);
                d.f564a.d("AsyncHttpClient", String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", str, this.f561a.e.get(str), firstHeader.getName(), firstHeader.getValue()));
                rVar.b(firstHeader);
            }
            rVar.addHeader(str, (String) this.f561a.e.get(str));
        }
    }
}
