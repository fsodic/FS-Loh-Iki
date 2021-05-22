package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.j;
import java.io.File;

public final class KU {

    /* renamed from: a  reason: collision with root package name */
    private final File f2400a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2401b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f2402c;
    private final EnumC1274fga d;

    public KU(Context context, EnumC1274fga fga) {
        this.f2402c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        NU.a(dir, false);
        this.f2400a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        NU.a(dir2, true);
        this.f2401b = dir2;
        this.d = fga;
    }

    private final File a() {
        File file = new File(this.f2400a, Integer.toString(this.d.a()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String a(C1480iga iga) {
        return j.a(iga.d().a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C1480iga b(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.TU.f3181a
            r1 = 0
            if (r6 != r0) goto L_0x0010
            android.content.SharedPreferences r6 = r5.f2402c
            java.lang.String r0 = r5.c()
        L_0x000b:
            java.lang.String r6 = r6.getString(r0, r1)
            goto L_0x001c
        L_0x0010:
            int r0 = com.google.android.gms.internal.ads.TU.f3182b
            if (r6 != r0) goto L_0x001b
            android.content.SharedPreferences r6 = r5.f2402c
            java.lang.String r0 = r5.b()
            goto L_0x000b
        L_0x001b:
            r6 = r1
        L_0x001c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0023
            return r1
        L_0x0023:
            byte[] r6 = com.google.android.gms.common.util.j.a(r6)     // Catch:{ Bca -> 0x0059 }
            com.google.android.gms.internal.ads.Iba r6 = com.google.android.gms.internal.ads.Iba.a(r6)     // Catch:{ Bca -> 0x0059 }
            com.google.android.gms.internal.ads.iga r6 = com.google.android.gms.internal.ads.C1480iga.a(r6)     // Catch:{ Bca -> 0x0059 }
            java.lang.String r0 = r6.n()     // Catch:{ Bca -> 0x0059 }
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.a()     // Catch:{ Bca -> 0x0059 }
            java.io.File r2 = com.google.android.gms.internal.ads.NU.a(r0, r2, r3)     // Catch:{ Bca -> 0x0059 }
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.a()     // Catch:{ Bca -> 0x0059 }
            java.io.File r0 = com.google.android.gms.internal.ads.NU.a(r0, r3, r4)     // Catch:{ Bca -> 0x0059 }
            boolean r2 = r2.exists()     // Catch:{ Bca -> 0x0059 }
            if (r2 == 0) goto L_0x0055
            boolean r0 = r0.exists()     // Catch:{ Bca -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            return r6
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.KU.b(int):com.google.android.gms.internal.ads.iga");
    }

    private final String b() {
        int a2 = this.d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(a2);
        return sb.toString();
    }

    private final String c() {
        int a2 = this.d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(a2);
        return sb.toString();
    }

    public final LU a(int i) {
        C1480iga b2 = b(i);
        if (b2 == null) {
            return null;
        }
        String n = b2.n();
        return new LU(b2, NU.a(n, "pcam", a()), NU.a(n, "pcbc", a()), NU.a(n, "pcopt", a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0139, code lost:
        if (r0.commit() != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.C1412hga r9, com.google.android.gms.internal.ads.QU r10) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.KU.a(com.google.android.gms.internal.ads.hga, com.google.android.gms.internal.ads.QU):boolean");
    }
}
