package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class QL implements AbstractC1180eO<OL> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2925a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f2926b;

    /* renamed from: c  reason: collision with root package name */
    private final C1789nD f2927c;

    public QL(String str, VW vw, C1789nD nDVar) {
        this.f2925a = str;
        this.f2926b = vw;
        this.f2927c = nDVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|(1:4)|5|6|(1:8)|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[Catch:{ MR -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.os.Bundle a(com.google.android.gms.internal.ads.SR r3) {
        /*
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.Ag r1 = r3.n()     // Catch:{ MR -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "sdk_version"
            com.google.android.gms.internal.ads.Ag r2 = r3.n()     // Catch:{ MR -> 0x0018 }
            java.lang.String r2 = r2.toString()     // Catch:{ MR -> 0x0018 }
            r0.putString(r1, r2)     // Catch:{ MR -> 0x0018 }
        L_0x0018:
            com.google.android.gms.internal.ads.Ag r1 = r3.m()     // Catch:{ MR -> 0x002b }
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "adapter_version"
            com.google.android.gms.internal.ads.Ag r3 = r3.m()     // Catch:{ MR -> 0x002b }
            java.lang.String r3 = r3.toString()     // Catch:{ MR -> 0x002b }
            r0.putString(r1, r3)     // Catch:{ MR -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QL.a(com.google.android.gms.internal.ads.SR):android.os.Bundle");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<OL> a() {
        if (new BigInteger(this.f2925a).equals(BigInteger.ONE)) {
            if (!C2014qV.b((String) C2392voa.e().a(C2474x.gb))) {
                return this.f2926b.a(new TL(this));
            }
        }
        return JW.a(new OL(new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ OL b() {
        List<String> asList = Arrays.asList(((String) C2392voa.e().a(C2474x.gb)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, a(this.f2927c.a(str, new JSONObject())));
            } catch (MR unused) {
            }
        }
        return new OL(bundle);
    }
}
