package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C1357gna;
import com.google.android.gms.internal.ads.C1770mna;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.jH  reason: case insensitive filesystem */
public final class C1517jH {

    /* renamed from: a  reason: collision with root package name */
    private Dma f4651a;

    /* renamed from: b  reason: collision with root package name */
    private Context f4652b;

    /* renamed from: c  reason: collision with root package name */
    private TG f4653c;
    private C0823Yl d;

    public C1517jH(Context context, C0823Yl yl, Dma dma, TG tg) {
        this.f4652b = context;
        this.d = yl;
        this.f4651a = dma;
        this.f4653c = tg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C1357gna.a> a2 = C1311gH.a(sQLiteDatabase);
        C1357gna.b n = C1357gna.n();
        n.a(this.f4652b.getPackageName());
        n.b(Build.MODEL);
        n.a(C1311gH.a(sQLiteDatabase, 0));
        n.a(a2);
        n.b(C1311gH.a(sQLiteDatabase, 1));
        n.a(q.j().a());
        n.b(C1311gH.b(sQLiteDatabase, 2));
        C1357gna gna = (C1357gna) n.j();
        int size = a2.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            C1357gna.a aVar = a2.get(i);
            i++;
            C1357gna.a aVar2 = aVar;
            if (aVar2.o() == Cna.ENUM_TRUE && aVar2.n() > j) {
                j = aVar2.n();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.f4651a.a(new C1655lH(gna));
        C1770mna.a n2 = C1770mna.n();
        n2.a(this.d.f3588b);
        n2.b(this.d.f3589c);
        n2.c(this.d.d ? 0 : 2);
        this.f4651a.a(new C1586kH((C1770mna) n2.j()));
        this.f4651a.a(Fma.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    public final void a() {
        try {
            this.f4653c.a(new C1449iH(this));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C0745Vl.b(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
