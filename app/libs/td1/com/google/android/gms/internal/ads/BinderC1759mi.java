package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.q;

/* renamed from: com.google.android.gms.internal.ads.mi  reason: case insensitive filesystem */
public final class BinderC1759mi extends AbstractBinderC1828ni {

    /* renamed from: a  reason: collision with root package name */
    private final String f4978a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4979b;

    public BinderC1759mi(String str, int i) {
        this.f4978a = str;
        this.f4979b = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897oi
    public final int A() {
        return this.f4979b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC1759mi)) {
            BinderC1759mi miVar = (BinderC1759mi) obj;
            return q.a(this.f4978a, miVar.f4978a) && q.a(Integer.valueOf(this.f4979b), Integer.valueOf(miVar.f4979b));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1897oi
    public final String getType() {
        return this.f4978a;
    }
}
