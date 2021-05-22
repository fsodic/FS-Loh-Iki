package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qC  reason: case insensitive filesystem */
public final class C1995qC<T> implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<T> f5295a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5296b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0268Dc<T> f5297c;
    private final /* synthetic */ C1306gC d;

    private C1995qC(C1306gC gCVar, WeakReference<T> weakReference, String str, AbstractC0268Dc<T> dc) {
        this.d = gCVar;
        this.f5295a = weakReference;
        this.f5296b = str;
        this.f5297c = dc;
    }

    /* synthetic */ C1995qC(C1306gC gCVar, WeakReference weakReference, String str, AbstractC0268Dc dc, C1375hC hCVar) {
        this(gCVar, weakReference, str, dc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        T t = this.f5295a.get();
        if (t == null) {
            this.d.b(this.f5296b, this);
        } else {
            this.f5297c.a(t, map);
        }
    }
}
