package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yq  reason: case insensitive filesystem */
public final class C0828Yq implements AbstractC2221tW<BR, BR> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, AbstractC0950ar> f3602a;

    public C0828Yq(Map<String, AbstractC0950ar> map) {
        this.f3602a = map;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.SW' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final /* synthetic */ SW<BR> b(BR br) {
        BR br2 = br;
        for (C2561yR yRVar : br2.f1611b.f6182c) {
            if (this.f3602a.containsKey(yRVar.f6083a)) {
                this.f3602a.get(yRVar.f6083a).a(yRVar.f6084b);
            }
        }
        return JW.a(br2);
    }
}
