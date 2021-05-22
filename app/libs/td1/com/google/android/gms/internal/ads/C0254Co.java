package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Co  reason: case insensitive filesystem */
final class C0254Co implements AbstractC0268Dc<AbstractC1564jo> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC0202Ao f1732a;

    C0254Co(ViewTreeObserver$OnGlobalLayoutListenerC0202Ao ao) {
        this.f1732a = ao;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f1732a) {
                        if (ViewTreeObserver$OnGlobalLayoutListenerC0202Ao.a(this.f1732a) != parseInt) {
                            ViewTreeObserver$OnGlobalLayoutListenerC0202Ao.a(this.f1732a, parseInt);
                            this.f1732a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C0745Vl.c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
