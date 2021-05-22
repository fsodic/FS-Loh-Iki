package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.g.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Av  reason: case insensitive filesystem */
public final class C0209Av extends C0834Yw<a> implements AbstractC1472ic {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1574b = new Bundle();

    public C0209Av(Set<C0523Mx<a>> set) {
        super(set);
    }

    public final synchronized Bundle Q() {
        return new Bundle(this.f1574b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1472ic
    public final synchronized void a(String str, Bundle bundle) {
        this.f1574b.putAll(bundle);
        a(C0313Ev.f1920a);
    }
}
