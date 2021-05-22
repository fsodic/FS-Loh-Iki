package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eG  reason: case insensitive filesystem */
public final class C1172eG implements AbstractC1241fG {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, _ea<AbstractC1241fG>> f4186a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f4187b;

    /* renamed from: c  reason: collision with root package name */
    private final C0807Xv f4188c;

    public C1172eG(Map<String, _ea<AbstractC1241fG>> map, VW vw, C0807Xv xv) {
        this.f4186a = map;
        this.f4187b = vw;
        this.f4188c = xv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1241fG
    public final SW<BR> a(C0715Uh uh) {
        this.f4188c.a(uh);
        SW<BR> a2 = JW.a((Throwable) new C0896aF(YR.f3562c));
        for (String str : ((String) C2392voa.e().a(C2474x.ef)).split(",")) {
            _ea<AbstractC1241fG> _ea = this.f4186a.get(str.trim());
            if (_ea != null) {
                a2 = JW.a(a2, C0896aF.class, new C1104dG(_ea, uh), this.f4187b);
            }
        }
        JW.a(a2, new C1310gG(this), C0875_l.f);
        return a2;
    }
}
