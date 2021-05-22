package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.kla  reason: case insensitive filesystem */
public final class C1628kla {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4801a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<Object, Object> f4802b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Object> f4803c = new ArrayList<>();
    private final Context d;
    private final C0823Yl e;
    private final C1132de f;

    public C1628kla(Context context, C0823Yl yl) {
        this.d = context.getApplicationContext();
        this.e = yl;
        this.f = new C1132de(context.getApplicationContext(), yl, (String) C2392voa.e().a(C2474x.f5943b));
    }
}
