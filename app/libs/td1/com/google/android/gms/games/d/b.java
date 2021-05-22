package com.google.android.gms.games.d;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1442a = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: b  reason: collision with root package name */
    private String f1443b;

    /* renamed from: c  reason: collision with root package name */
    private String f1444c;
    private int d;
    private SparseArray<a> e = new SparseArray<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f1445a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1446b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1447c;
        public final boolean d;

        public a(long j, String str, String str2, boolean z) {
            this.f1445a = j;
            this.f1446b = str;
            this.f1447c = str2;
            this.d = z;
        }

        public final String toString() {
            q.a a2 = q.a(this);
            a2.a("RawScore", Long.valueOf(this.f1445a));
            a2.a("FormattedScore", this.f1446b);
            a2.a("ScoreTag", this.f1447c);
            a2.a("NewBest", Boolean.valueOf(this.d));
            return a2.toString();
        }
    }

    public b(DataHolder dataHolder) {
        this.d = dataHolder.M();
        int count = dataHolder.getCount();
        r.a(count == 3);
        for (int i = 0; i < count; i++) {
            int a2 = dataHolder.a(i);
            if (i == 0) {
                this.f1443b = dataHolder.d("leaderboardId", i, a2);
                this.f1444c = dataHolder.d("playerId", i, a2);
            }
            if (dataHolder.a("hasResult", i, a2)) {
                this.e.put(dataHolder.b("timeSpan", i, a2), new a(dataHolder.c("rawScore", i, a2), dataHolder.d("formattedScore", i, a2), dataHolder.d("scoreTag", i, a2), dataHolder.a("newBest", i, a2)));
            }
        }
    }

    public final String toString() {
        q.a a2 = q.a(this);
        a2.a("PlayerId", this.f1444c);
        a2.a("StatusCode", Integer.valueOf(this.d));
        for (int i = 0; i < 3; i++) {
            a aVar = this.e.get(i);
            a2.a("TimesSpan", b.c.b.a.d.e.r.a(i));
            a2.a("Result", aVar == null ? "null" : aVar.toString());
        }
        return a2.toString();
    }
}
