package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class YJ implements RJ<C1990py> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3548a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0524My f3549b;

    public YJ(Context context, AbstractC0524My my) {
        this.f3548a = context;
        this.f3549b = my;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.RJ
    public final /* synthetic */ C1990py a(BR br, C1941pR pRVar, View view, ZJ zj) {
        AbstractC2127ry a2 = this.f3549b.a(new C2054qt(br, pRVar, null), new _J(this, C0901aK.f3795a));
        zj.a(new C1039cK(this, a2));
        return a2.i();
    }
}
