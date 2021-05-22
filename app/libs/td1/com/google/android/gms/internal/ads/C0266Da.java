package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Da  reason: case insensitive filesystem */
public final class C0266Da {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<AbstractC0292Ea> f1778a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f1779b = new AtomicBoolean();

    static AbstractC0292Ea a() {
        return f1778a.get();
    }

    public static void a(AbstractC0292Ea ea) {
        f1778a.set(ea);
    }
}
