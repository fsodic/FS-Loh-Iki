package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class IF implements AbstractC1241fG {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f2200a = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b  reason: collision with root package name */
    private final C1103dF f2201b;

    /* renamed from: c  reason: collision with root package name */
    private final VW f2202c;
    private final GR d;
    private final ScheduledExecutorService e;
    private final _G f;

    IF(GR gr, C1103dF dFVar, VW vw, ScheduledExecutorService scheduledExecutorService, _G _g) {
        this.d = gr;
        this.f2201b = dFVar;
        this.f2202c = vw;
        this.e = scheduledExecutorService;
        this.f = _g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1241fG
    public final SW<BR> a(C0715Uh uh) {
        SW<BR> a2 = JW.a(this.f2201b.a(uh), new HF(this), this.f2202c);
        if (((Boolean) C2392voa.e().a(C2474x.wd)).booleanValue()) {
            a2 = JW.a(JW.a(a2, (long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS, this.e), TimeoutException.class, KF.f2381a, C0875_l.f);
        }
        JW.a(a2, new JF(this), C0875_l.f);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(InputStream inputStream) {
        return JW.a(new BR(new C2423wR(this.d), C2630zR.a(new InputStreamReader(inputStream))));
    }
}
