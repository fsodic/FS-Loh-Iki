package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
public final class WG implements GW<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1461iT f3398a;

    WG(TG tg, AbstractC1461iT iTVar) {
        this.f3398a = iTVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f3398a.apply(sQLiteDatabase);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C0745Vl.b(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        C0745Vl.b(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
