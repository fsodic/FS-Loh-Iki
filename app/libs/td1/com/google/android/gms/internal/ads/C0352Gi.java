package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.g.c;

/* renamed from: com.google.android.gms.internal.ads.Gi  reason: case insensitive filesystem */
public final class C0352Gi implements c {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2103ri f2057a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2058b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2059c = new Object();
    private final BinderC0222Bi d = new BinderC0222Bi(null);

    public C0352Gi(Context context, AbstractC2103ri riVar) {
        this.f2057a = riVar == null ? new aqa() : riVar;
        this.f2058b = context.getApplicationContext();
    }
}
