package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sI  reason: case insensitive filesystem */
public final class C2138sI implements AbstractC1932pI<C0525Mz> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1646kz f5495a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f5496b;

    /* renamed from: c  reason: collision with root package name */
    private final C1099dB f5497c;
    private final RR<C1306gC> d;

    public C2138sI(AbstractC1646kz kzVar, VW vw, C1099dB dBVar, RR<C1306gC> rr) {
        this.f5495a = kzVar;
        this.f5496b = vw;
        this.f5497c = dBVar;
        this.d = rr;
    }

    private final SW<C0525Mz> a(BR br, C1941pR pRVar, JSONObject jSONObject) {
        SW<C1306gC> a2 = this.d.a();
        SW<C0707Tz> a3 = this.f5497c.a(br, pRVar, jSONObject);
        return JW.b(a2, a3).a(new CallableC2414wI(this, a3, a2, br, pRVar, jSONObject), this.f5496b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C0525Mz a(SW sw, SW sw2, BR br, C1941pR pRVar, JSONObject jSONObject) {
        C0707Tz tz = (C0707Tz) sw.get();
        C1306gC gCVar = (C1306gC) sw2.get();
        AbstractC0759Vz a2 = this.f5495a.a(new C2054qt(br, pRVar, null), new C1166eA(tz), new C2680zz(jSONObject, gCVar));
        a2.i().a();
        a2.j().a(gCVar);
        a2.k().a(tz.t());
        return a2.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<List<SW<C0525Mz>>> a(BR br, C1941pR pRVar) {
        return JW.a(JW.a(this.d.a(), new C2069rI(this, pRVar), this.f5496b), new C2276uI(this, br, pRVar), this.f5496b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(BR br, C1941pR pRVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return JW.a((Throwable) new C0896aF(YR.f3562c));
        }
        int i = 0;
        if (br.f1610a.f5888a.k <= 1) {
            return JW.a(a(br, pRVar, jSONArray.getJSONObject(0)), C2483xI.f5965a, this.f5496b);
        }
        int length = jSONArray.length();
        this.d.a(Math.min(length, br.f1610a.f5888a.k));
        ArrayList arrayList = new ArrayList(br.f1610a.f5888a.k);
        while (i < br.f1610a.f5888a.k) {
            arrayList.add(i < length ? a(br, pRVar, jSONArray.getJSONObject(i)) : JW.a((Throwable) new C0896aF(YR.f3562c)));
            i++;
        }
        return JW.a((Object) arrayList);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C1306gC gCVar, JSONObject jSONObject) {
        this.d.a(JW.a(gCVar));
        if (jSONObject.optBoolean("success")) {
            return JW.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new C0270De("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C1941pR pRVar, C1306gC gCVar) {
        JSONObject a2 = C2041ql.a("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", pRVar.p.f5611c);
        jSONObject.put("sdk_params", a2);
        return JW.a(gCVar.a("google.afma.nativeAds.preProcessJson", jSONObject), new C2207tI(this, gCVar), this.f5496b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar = pRVar.p;
        return (tRVar == null || tRVar.f5611c == null) ? false : true;
    }
}
