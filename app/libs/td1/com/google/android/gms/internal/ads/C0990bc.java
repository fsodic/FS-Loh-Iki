package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.i;

/* renamed from: com.google.android.gms.internal.ads.bc  reason: case insensitive filesystem */
public final class C0990bc {

    /* renamed from: a  reason: collision with root package name */
    private final i.b f3908a;

    /* renamed from: b  reason: collision with root package name */
    private final i.a f3909b;

    /* renamed from: c  reason: collision with root package name */
    private i f3910c;

    public C0990bc(i.b bVar, i.a aVar) {
        this.f3908a = bVar;
        this.f3909b = aVar;
    }

    /* access modifiers changed from: private */
    public final synchronized i a(AbstractC2158sb sbVar) {
        if (this.f3910c != null) {
            return this.f3910c;
        }
        C2227tb tbVar = new C2227tb(sbVar);
        this.f3910c = tbVar;
        return tbVar;
    }

    public final AbstractC0293Eb a() {
        return new BinderC1128dc(this);
    }

    public final AbstractC0241Cb b() {
        if (this.f3909b == null) {
            return null;
        }
        return new BinderC1196ec(this);
    }
}
