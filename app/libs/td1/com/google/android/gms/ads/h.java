package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.Hpa;

public final class h extends i {
    public h(Context context) {
        super(context, 0);
        r.a(context, "Context cannot be null");
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void a(e eVar) {
        super.a(eVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ c getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ f getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.i
    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ r getResponseInfo() {
        return super.getResponseInfo();
    }

    public final s getVideoController() {
        Hpa hpa = this.f1071a;
        if (hpa != null) {
            return hpa.j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdListener(c cVar) {
        super.setAdListener(cVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdSize(f fVar) {
        super.setAdSize(fVar);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.google.android.gms.ads.i
    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(o oVar) {
        super.setOnPaidEventListener(oVar);
    }
}
