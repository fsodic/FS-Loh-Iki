package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sd  reason: case insensitive filesystem */
public final class C0659Sd implements AbstractC0477Ld, AbstractC0607Qd {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f3102a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3103b;

    public C0659Sd(Context context, C0823Yl yl, C1955pca pca, a aVar) {
        this.f3103b = context;
        q.d();
        this.f3102a = C2115ro.a(context, C1153dp.b(), BuildConfig.FLAVOR, false, false, pca, yl, null, null, null, Dma.a(), null, false);
        this.f3102a.getView().setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        C2392voa.a();
        if (C0459Kl.b()) {
            runnable.run();
        } else {
            C2452wk.f5921a.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final AbstractC0218Be a() {
        return new C0296Ee(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void a(AbstractC0685Td td) {
        AbstractC0774Wo d = this.f3102a.d();
        td.getClass();
        d.a(C0815Yd.a(td));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0925ae
    public final void a(String str) {
        a(new RunnableC0737Vd(this, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0244Ce
    public final void a(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        this.f3102a.a(str, new C0994be(this, dc));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld
    public final void a(String str, String str2) {
        C0451Kd.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map map) {
        C0451Kd.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        C0451Kd.b(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f3102a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0244Ce
    public final void b(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        this.f3102a.a(str, new C0711Ud(dc));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        C0451Kd.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void c(String str) {
        a(new RunnableC0789Xd(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void d(String str) {
        a(new RunnableC0867_d(this, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void destroy() {
        this.f3102a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void e(String str) {
        a(new RunnableC0841Zd(this, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final boolean isDestroyed() {
        return this.f3102a.isDestroyed();
    }
}
