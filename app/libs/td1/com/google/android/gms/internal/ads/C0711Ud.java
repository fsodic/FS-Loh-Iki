package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.p;

/* renamed from: com.google.android.gms.internal.ads.Ud  reason: case insensitive filesystem */
final /* synthetic */ class C0711Ud implements p {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0268Dc f3255a;

    C0711Ud(AbstractC0268Dc dc) {
        this.f3255a = dc;
    }

    @Override // com.google.android.gms.common.util.p
    public final boolean apply(Object obj) {
        AbstractC0268Dc dc = (AbstractC0268Dc) obj;
        return (dc instanceof C0994be) && C0994be.a((C0994be) dc).equals(this.f3255a);
    }
}
