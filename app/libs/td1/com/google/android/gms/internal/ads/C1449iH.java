package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iH  reason: case insensitive filesystem */
public final /* synthetic */ class C1449iH implements AbstractC1461iT {

    /* renamed from: a  reason: collision with root package name */
    private final C1517jH f4550a;

    C1449iH(C1517jH jHVar) {
        this.f4550a = jHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1461iT
    public final Object apply(Object obj) {
        return this.f4550a.a((SQLiteDatabase) obj);
    }
}
