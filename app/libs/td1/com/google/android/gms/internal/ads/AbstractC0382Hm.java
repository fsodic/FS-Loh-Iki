package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Hm  reason: case insensitive filesystem */
public abstract class AbstractC0382Hm extends TextureView implements AbstractC0943an {

    /* renamed from: a  reason: collision with root package name */
    protected final C0642Rm f2171a = new C0642Rm();

    /* renamed from: b  reason: collision with root package name */
    protected final C1012bn f2172b;

    public AbstractC0382Hm(Context context) {
        super(context);
        this.f2172b = new C1012bn(context, this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0943an
    public abstract void a();

    public abstract void a(float f, float f2);

    public abstract void a(AbstractC0304Em em);

    public void a(String str, String[] strArr) {
        setVideoPath(str);
    }

    public abstract void b();

    public abstract void b(int i);

    public abstract void c();

    public void c(int i) {
    }

    public abstract void d();

    public void d(int i) {
    }

    public abstract String e();

    public void e(int i) {
    }

    public void f(int i) {
    }

    public void g(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
