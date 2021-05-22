package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C1357gna;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eH  reason: case insensitive filesystem */
final /* synthetic */ class C1173eH implements AbstractC1461iT {

    /* renamed from: a  reason: collision with root package name */
    private final C1242fH f4189a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4190b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f4191c;
    private final C1219ena d;
    private final C1357gna.c e;

    C1173eH(C1242fH fHVar, boolean z, ArrayList arrayList, C1219ena ena, C1357gna.c cVar) {
        this.f4189a = fHVar;
        this.f4190b = z;
        this.f4191c = arrayList;
        this.d = ena;
        this.e = cVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1461iT
    public final Object apply(Object obj) {
        C1242fH fHVar = this.f4189a;
        boolean z = this.f4190b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] bArr = fHVar.f4279b.a(z, this.f4191c, this.d, this.e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(q.j().a()));
        contentValues.put("serialized_proto_data", bArr);
        sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
        }
        return null;
    }
}
