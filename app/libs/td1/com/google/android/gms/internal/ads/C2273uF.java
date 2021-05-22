package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uF  reason: case insensitive filesystem */
public final class C2273uF implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5695a;

    private C2273uF(_ea<Context> _ea) {
        this.f5695a = _ea;
    }

    public static C2273uF a(_ea<Context> _ea) {
        return new C2273uF(_ea);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        Xea.a(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5695a.get());
    }
}
