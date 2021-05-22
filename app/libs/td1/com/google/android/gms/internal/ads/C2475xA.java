package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xA  reason: case insensitive filesystem */
public final class C2475xA {

    /* renamed from: a  reason: collision with root package name */
    private final MC f5945a;

    /* renamed from: b  reason: collision with root package name */
    private final C1306gC f5946b;

    /* renamed from: c  reason: collision with root package name */
    private final C0335Fr f5947c;
    private final AbstractC0891aA d;

    public C2475xA(MC mc, C1306gC gCVar, C0335Fr fr, AbstractC0891aA aAVar) {
        this.f5945a = mc;
        this.f5946b = gCVar;
        this.f5947c = fr;
        this.d = aAVar;
    }

    public final View a() {
        AbstractC1564jo a2 = this.f5945a.a(C1015boa.L(), false);
        a2.getView().setVisibility(8);
        a2.a("/sendMessageToSdk", new AA(this));
        a2.a("/adMuted", new C2613zA(this));
        this.f5946b.a(new WeakReference(a2), "/loadHtml", new CA(this));
        this.f5946b.a(new WeakReference(a2), "/showOverlay", new BA(this));
        this.f5946b.a(new WeakReference(a2), "/hideOverlay", new EA(this));
        return a2.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        C0745Vl.c("Hiding native ads overlay.");
        joVar.getView().setVisibility(8);
        this.f5947c.f(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f5946b.a("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(AbstractC1564jo joVar, Map map) {
        C0745Vl.c("Showing native ads overlay.");
        joVar.getView().setVisibility(0);
        this.f5947c.f(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(AbstractC1564jo joVar, Map map) {
        this.d.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(AbstractC1564jo joVar, Map map) {
        this.f5946b.a("sendMessageToNativeJs", map);
    }
}
