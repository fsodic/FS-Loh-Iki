package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.i;

/* renamed from: com.google.android.gms.common.api.internal.ca  reason: case insensitive filesystem */
public final class C0141ca<O extends a.d> extends C0169u {

    /* renamed from: c  reason: collision with root package name */
    private final e<O> f1249c;

    public C0141ca(e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f1249c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        this.f1249c.a(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(pa paVar) {
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper c() {
        return this.f1249c.d();
    }
}
