package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

final /* synthetic */ class LA implements AbstractC0268Dc {

    /* renamed from: a  reason: collision with root package name */
    private final FA f2455a;

    /* renamed from: b  reason: collision with root package name */
    private final View f2456b;

    /* renamed from: c  reason: collision with root package name */
    private final WindowManager f2457c;
    private final C1941pR d;

    LA(FA fa, View view, WindowManager windowManager, C1941pR pRVar) {
        this.f2455a = fa;
        this.f2456b = view;
        this.f2457c = windowManager;
        this.d = pRVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map map) {
        this.f2455a.a(this.f2456b, this.f2457c, this.d, (AbstractC1564jo) obj, map);
    }
}
