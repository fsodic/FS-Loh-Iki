package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.b.a.c.a;
import java.util.Collections;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

public final class Ypa extends AbstractBinderC0948apa {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1611kd f3601a;

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void Ca() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void H() {
        C0745Vl.b("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        C0459Kl.f2428a.post(new _pa(this));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final List<C1130dd> Ma() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final boolean Ua() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final String Va() {
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Wb() {
        AbstractC1611kd kdVar = this.f3601a;
        if (kdVar != null) {
            try {
                kdVar.b(Collections.emptyList());
            } catch (RemoteException e) {
                C0745Vl.c("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(float f) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(a aVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(cqa cqa) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1611kd kdVar) {
        this.f3601a = kdVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1891of ofVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void b(String str, a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void e(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final float gb() {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void j(String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void x(String str) {
    }
}
