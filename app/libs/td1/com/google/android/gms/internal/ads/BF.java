package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class BF extends AbstractC2618zF {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f1590b = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: c  reason: collision with root package name */
    private final C1103dF f1591c;
    private final VW d;
    private final GR e;
    private final ScheduledExecutorService f;
    private final _G g;

    BF(C0807Xv xv, GR gr, C1103dF dFVar, VW vw, ScheduledExecutorService scheduledExecutorService, _G _g) {
        super(xv);
        this.e = gr;
        this.f1591c = dFVar;
        this.d = vw;
        this.f = scheduledExecutorService;
        this.g = _g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2618zF
    public final SW<BR> a(C0715Uh uh) {
        SW<BR> a2 = JW.a(this.f1591c.a(uh), new EF(this), this.d);
        if (((Boolean) C2392voa.e().a(C2474x.wd)).booleanValue()) {
            a2 = JW.a(JW.a(a2, (long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS, this.f), TimeoutException.class, DF.f1753a, C0875_l.f);
        }
        JW.a(a2, new GF(this), C0875_l.f);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(InputStream inputStream) {
        return JW.a(new BR(new C2423wR(this.e), C2630zR.a(new InputStreamReader(inputStream))));
    }
}
