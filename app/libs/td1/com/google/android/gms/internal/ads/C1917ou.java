package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ou  reason: case insensitive filesystem */
public final class C1917ou implements AbstractC1436hv, AbstractC0261Cv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5188a;

    /* renamed from: b  reason: collision with root package name */
    private final C1941pR f5189b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1138dh f5190c;

    public C1917ou(Context context, C1941pR pRVar, AbstractC1138dh dhVar) {
        this.f5188a = context;
        this.f5189b = pRVar;
        this.f5190c = dhVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        C1000bh bhVar = this.f5189b.V;
        if (bhVar != null && bhVar.f3922a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f5189b.V.f3923b.isEmpty()) {
                arrayList.add(this.f5189b.V.f3923b);
            }
            this.f5190c.a(this.f5188a, arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void b(Context context) {
        this.f5190c.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void c(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void d(Context context) {
    }
}
