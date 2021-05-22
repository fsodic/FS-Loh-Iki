package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.aS  reason: case insensitive filesystem */
public final class C0909aS implements AbstractC1212ek, AbstractC0650Ru {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<C0821Yj> f3811a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f3812b;

    /* renamed from: c  reason: collision with root package name */
    private final C1556jk f3813c;

    public C0909aS(Context context, C1556jk jkVar) {
        this.f3812b = context;
        this.f3813c = jkVar;
    }

    public final Bundle a() {
        return this.f3813c.a(this.f3812b, this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1212ek
    public final synchronized void a(HashSet<C0821Yj> hashSet) {
        this.f3811a.clear();
        this.f3811a.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final synchronized void c(int i) {
        if (i != 3) {
            this.f3813c.a(this.f3811a);
        }
    }
}
