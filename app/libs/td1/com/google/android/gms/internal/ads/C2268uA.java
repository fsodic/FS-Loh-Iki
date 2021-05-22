package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uA  reason: case insensitive filesystem */
public final class C2268uA implements AbstractC0526Na {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ OA f5686a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ViewGroup f5687b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1924pA f5688c;

    C2268uA(C1924pA pAVar, OA oa, ViewGroup viewGroup) {
        this.f5688c = pAVar;
        this.f5686a = oa;
        this.f5687b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0526Na
    public final void a() {
        C1924pA pAVar = this.f5688c;
        if (C1924pA.a(this.f5686a, ViewTreeObserver$OnGlobalLayoutListenerC1786nA.f5016a)) {
            this.f5686a.onClick(this.f5687b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0526Na
    public final void a(MotionEvent motionEvent) {
        this.f5686a.onTouch(null, motionEvent);
    }
}
