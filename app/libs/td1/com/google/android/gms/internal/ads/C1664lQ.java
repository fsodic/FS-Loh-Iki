package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lQ  reason: case insensitive filesystem */
public final class C1664lQ implements AbstractC1187eV<C1448iG, C1802nQ> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1526jQ f4852a;

    C1664lQ(C1526jQ jQVar) {
        this.f4852a = jQVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final /* synthetic */ C1802nQ apply(C1448iG iGVar) {
        C0745Vl.b(BuildConfig.FLAVOR, iGVar);
        C1763mk.f("Failed to get a cache key, reverting to legacy flow.");
        C1526jQ jQVar = this.f4852a;
        jQVar.e = new C1802nQ(null, jQVar.b(), null);
        return this.f4852a.e;
    }
}
