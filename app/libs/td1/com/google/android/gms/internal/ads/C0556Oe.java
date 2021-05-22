package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Oe  reason: case insensitive filesystem */
public final class C0556Oe {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC1008bl<AbstractC0607Qd> f2759a = new C0530Ne();

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC1008bl<AbstractC0607Qd> f2760b = new C0608Qe();

    /* renamed from: c  reason: collision with root package name */
    private final C1132de f2761c;

    public C0556Oe(Context context, C0823Yl yl, String str) {
        this.f2761c = new C1132de(context, yl, str, f2759a, f2760b);
    }

    public final <I, O> AbstractC0348Ge<I, O> a(String str, AbstractC0374He<I> he, AbstractC0400Ie<O> ie) {
        return new C0582Pe(this.f2761c, str, he, ie);
    }

    public final C0686Te a() {
        return new C0686Te(this.f2761c);
    }
}
