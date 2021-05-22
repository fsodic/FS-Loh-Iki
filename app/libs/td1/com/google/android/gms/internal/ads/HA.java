package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

final /* synthetic */ class HA implements AbstractC0268Dc {

    /* renamed from: a  reason: collision with root package name */
    private final FA f2092a;

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager f2093b;

    /* renamed from: c  reason: collision with root package name */
    private final View f2094c;

    HA(FA fa, WindowManager windowManager, View view) {
        this.f2092a = fa;
        this.f2093b = windowManager;
        this.f2094c = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map map) {
        this.f2092a.a(this.f2093b, this.f2094c, (AbstractC1564jo) obj, map);
    }
}
