package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.b.g;
import b.c.b.a.b.h;
import com.google.android.gms.ads.c.a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Wj  reason: case insensitive filesystem */
final class RunnableC0769Wj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f3448a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1423hm f3449b;

    RunnableC0769Wj(C0691Tj tj, Context context, C1423hm hmVar) {
        this.f3448a = context;
        this.f3449b = hmVar;
    }

    public final void run() {
        try {
            this.f3449b.b(a.a(this.f3448a));
        } catch (g | h | IOException | IllegalStateException e) {
            this.f3449b.a(e);
            C0745Vl.b("Exception while getting advertising Id info", e);
        }
    }
}
