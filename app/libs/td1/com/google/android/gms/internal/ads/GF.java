package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class GF implements GW<BR> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BF f2014a;

    GF(BF bf) {
        this.f2014a = bf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(BR br) {
        BR br2 = br;
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue()) {
            BF.a(this.f2014a).a(br2.f1611b.f6181b.e);
            BF.a(this.f2014a).a(br2.f1611b.f6181b.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue()) {
            Matcher matcher = BF.a().matcher(th.getMessage());
            if (matcher.matches()) {
                BF.a(this.f2014a).a(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
