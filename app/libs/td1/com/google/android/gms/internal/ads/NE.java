package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.internal.q;
import java.util.Collections;
import java.util.List;

public final class NE implements a, AbstractC0520Mu, AbstractC0650Ru, AbstractC1229ev, AbstractC1436hv, AbstractC0261Cv, AbstractC1093cw, IT, Ona {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f2638a;

    /* renamed from: b  reason: collision with root package name */
    private final BE f2639b;

    /* renamed from: c  reason: collision with root package name */
    private long f2640c;

    public NE(BE be, AbstractC0229Bp bp) {
        this.f2639b = be;
        this.f2638a = Collections.singletonList(bp);
    }

    private final void a(Class<?> cls, String str, Object... objArr) {
        BE be = this.f2639b;
        List<Object> list = this.f2638a;
        String valueOf = String.valueOf(cls.getSimpleName());
        be.a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        long b2 = q.j().b() - this.f2640c;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b2);
        C1763mk.f(sb.toString());
        a(AbstractC0261Cv.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(BR br) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(C0715Uh uh) {
        this.f2640c = q.j().b();
        a(AbstractC1093cw.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
        a(AbstractC0520Mu.class, "onRewarded", oiVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str) {
        a(AbstractC2632zT.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str, Throwable th) {
        a(AbstractC2632zT.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.ads.a.a
    public final void a(String str, String str2) {
        a(a.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final void b() {
        a(AbstractC1229ev.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void b(Context context) {
        a(AbstractC1436hv.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void b(EnumC2563yT yTVar, String str) {
        a(AbstractC2632zT.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        a(AbstractC0650Ru.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void c(Context context) {
        a(AbstractC1436hv.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void c(EnumC2563yT yTVar, String str) {
        a(AbstractC2632zT.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final void d(Context context) {
        a(AbstractC1436hv.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final void e() {
        a(Ona.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void f() {
        a(AbstractC0520Mu.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void g() {
        a(AbstractC0520Mu.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void h() {
        a(AbstractC0520Mu.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void i() {
        a(AbstractC0520Mu.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void j() {
        a(AbstractC0520Mu.class, "onAdClosed", new Object[0]);
    }
}
