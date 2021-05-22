package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.np  reason: case insensitive filesystem */
final class C1842np implements AbstractC0268Dc<AbstractC1564jo> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC1704lp f5080a;

    C1842np(ViewTreeObserver$OnGlobalLayoutListenerC1704lp lpVar) {
        this.f5080a = lpVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f5080a) {
                        if (this.f5080a.E != parseInt) {
                            this.f5080a.E = parseInt;
                            this.f5080a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C0745Vl.c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
