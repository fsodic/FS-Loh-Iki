package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class JF implements GW<BR> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ IF f2304a;

    JF(IF r1) {
        this.f2304a = r1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(BR br) {
        BR br2 = br;
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue()) {
            this.f2304a.f.a(br2.f1611b.f6181b.e);
            this.f2304a.f.a(br2.f1611b.f6181b.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue()) {
            Matcher matcher = IF.f2200a.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f2304a.f.a(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
