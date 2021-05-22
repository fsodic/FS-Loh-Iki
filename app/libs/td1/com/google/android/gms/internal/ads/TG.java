package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class TG {

    /* renamed from: a  reason: collision with root package name */
    private final RG f3156a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f3157b;

    public TG(RG rg, VW vw) {
        this.f3156a = rg;
        this.f3157b = vw;
    }

    public final void a(AbstractC1461iT<SQLiteDatabase, Void> iTVar) {
        VW vw = this.f3157b;
        RG rg = this.f3156a;
        rg.getClass();
        JW.a(vw.a(SG.a(rg)), new WG(this, iTVar), this.f3157b);
    }
}
