package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.rda  reason: case insensitive filesystem */
public final class C2094rda implements _ca {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0993bda f5433a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5434b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f5435c;
    private final int d;

    C2094rda(AbstractC0993bda bda, String str, Object[] objArr) {
        this.f5433a = bda;
        this.f5434b = str;
        this.f5435c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads._ca
    public final int a() {
        return (this.d & 1) == 1 ? AbstractC2092rca.e.i : AbstractC2092rca.e.j;
    }

    @Override // com.google.android.gms.internal.ads._ca
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads._ca
    public final AbstractC0993bda c() {
        return this.f5433a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f5434b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f5435c;
    }
}
