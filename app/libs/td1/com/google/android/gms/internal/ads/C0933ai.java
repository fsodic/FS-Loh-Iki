package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.ai  reason: case insensitive filesystem */
public final class C0933ai {

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, C1071ci> f3831a = new WeakHashMap<>();

    public final Future<C0845Zh> a(Context context) {
        return C0875_l.f3755a.a(new CallableC1140di(this, context));
    }
}
