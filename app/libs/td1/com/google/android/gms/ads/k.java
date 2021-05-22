package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.g.a;
import com.google.android.gms.ads.g.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.Jpa;
import com.google.android.gms.internal.ads.Ona;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Jpa f1126a;

    public k(Context context) {
        this.f1126a = new Jpa(context);
        r.a(context, "Context cannot be null");
    }

    public final Bundle a() {
        return this.f1126a.a();
    }

    public final void a(c cVar) {
        this.f1126a.a(cVar);
        if (cVar != null && (cVar instanceof Ona)) {
            this.f1126a.a((Ona) cVar);
        } else if (cVar == null) {
            this.f1126a.a((Ona) null);
        }
    }

    public final void a(e eVar) {
        this.f1126a.a(eVar.a());
    }

    public final void a(a aVar) {
        this.f1126a.a(aVar);
    }

    public final void a(d dVar) {
        this.f1126a.a(dVar);
    }

    public final void a(String str) {
        this.f1126a.a(str);
    }

    public final void a(boolean z) {
        this.f1126a.a(z);
    }

    public final void b(boolean z) {
        this.f1126a.b(true);
    }

    public final boolean b() {
        return this.f1126a.b();
    }

    public final void c() {
        this.f1126a.c();
    }
}
