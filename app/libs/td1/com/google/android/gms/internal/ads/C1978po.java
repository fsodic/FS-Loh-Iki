package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.po  reason: case insensitive filesystem */
public final class C1978po implements GW<Map<String, String>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ List f5271a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5272b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1771mo f5273c;

    C1978po(C1771mo moVar, List list, String str) {
        this.f5273c = moVar;
        this.f5271a = list;
        this.f5272b = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Map<String, String> map) {
        this.f5273c.a((C1771mo) map, (Map) this.f5271a, (List) this.f5272b);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
    }
}
