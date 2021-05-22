package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class CA implements AbstractC0268Dc {

    /* renamed from: a  reason: collision with root package name */
    private final C2475xA f1669a;

    CA(C2475xA xAVar) {
        this.f1669a = xAVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map map) {
        AbstractC1564jo joVar = (AbstractC1564jo) obj;
        joVar.d().a(new DA(this.f1669a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            joVar.loadData(str, "text/html", "UTF-8");
        } else {
            joVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
