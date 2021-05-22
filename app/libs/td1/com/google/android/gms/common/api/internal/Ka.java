package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C0146f;
import com.google.android.gms.common.internal.C0177c;

public final class Ka<O extends a.d> extends e<O> {
    private final a.f j;
    private final Ea k;
    private final C0177c l;
    private final a.AbstractC0025a<? extends b.c.b.a.g.e, b.c.b.a.g.a> m;

    public Ka(Context context, a<O> aVar, Looper looper, a.f fVar, Ea ea, C0177c cVar, a.AbstractC0025a<? extends b.c.b.a.g.e, b.c.b.a.g.a> aVar2) {
        super(context, aVar, looper);
        this.j = fVar;
        this.k = ea;
        this.l = cVar;
        this.m = aVar2;
        this.i.a(this);
    }

    @Override // com.google.android.gms.common.api.e
    public final a.f a(Looper looper, C0146f.a<O> aVar) {
        this.k.a(aVar);
        return this.j;
    }

    @Override // com.google.android.gms.common.api.e
    public final BinderC0159la a(Context context, Handler handler) {
        return new BinderC0159la(context, handler, this.l, this.m);
    }

    public final a.f f() {
        return this.j;
    }
}
