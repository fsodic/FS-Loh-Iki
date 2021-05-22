package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eN  reason: case insensitive filesystem */
public final class C1179eN implements AbstractC1180eO<AbstractC1248fN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f4206a;

    /* renamed from: b  reason: collision with root package name */
    private final GR f4207b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageInfo f4208c;
    private final AbstractC1901ok d;

    public C1179eN(VW vw, GR gr, PackageInfo packageInfo, AbstractC1901ok okVar) {
        this.f4206a = vw;
        this.f4207b = gr;
        this.f4208c = packageInfo;
        this.d = okVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC1248fN> a() {
        return this.f4206a.a(new CallableC1386hN(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r9 == 3) goto L_0x011a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1179eN.a(java.util.ArrayList, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1248fN b() {
        ArrayList<String> arrayList = this.f4207b.g;
        return arrayList == null ? C1317gN.f4384a : arrayList.isEmpty() ? C1523jN.f4665a : new C1455iN(this, arrayList);
    }
}
