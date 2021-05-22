package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.AbstractC0540No;
import com.google.android.gms.internal.ads.AbstractC0748Vo;
import com.google.android.gms.internal.ads.AbstractC0826Yo;
import org.cocos2dx.lib.BuildConfig;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.Jo  reason: case insensitive filesystem */
public final class C0436Jo<WebViewT extends AbstractC0540No & AbstractC0748Vo & AbstractC0826Yo> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0462Ko f2355a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewT f2356b;

    private C0436Jo(WebViewT webviewt, AbstractC0462Ko ko) {
        this.f2355a = ko;
        this.f2356b = webviewt;
    }

    public static C0436Jo<AbstractC1564jo> a(AbstractC1564jo joVar) {
        return new C0436Jo<>(joVar, new C0410Io(joVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f2355a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            C1955pca f = this.f2356b.f();
            if (f == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                AbstractC1740mX a2 = f.a();
                if (a2 == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (this.f2356b.getContext() != null) {
                    return a2.a(this.f2356b.getContext(), str, this.f2356b.getView(), this.f2356b.v());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        C1763mk.f(str2);
        return BuildConfig.FLAVOR;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            C0745Vl.d("URL is empty, ignoring message");
        } else {
            C2452wk.f5921a.post(new RunnableC0488Lo(this, str));
        }
    }
}
