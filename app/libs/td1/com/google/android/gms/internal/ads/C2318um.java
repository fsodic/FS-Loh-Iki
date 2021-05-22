package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.um  reason: case insensitive filesystem */
public final class C2318um {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            C0558Og.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static C2244tja a(C1912opa opa) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = opa.f5179c;
        String str = map.get("Date");
        long a2 = str != null ? a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a3 = str3 != null ? a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a4 = str4 != null ? a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                C2244tja tja = new C2244tja();
                tja.f5643a = opa.f5178b;
                tja.f5644b = str5;
                tja.f = j4;
                tja.e = j3;
                tja.f5645c = a2;
                tja.d = a4;
                tja.g = map;
                tja.h = opa.d;
                return tja;
            }
        } else if (a2 <= 0 || a3 < a2) {
            j4 = 0;
        } else {
            j3 = (a3 - a2) + currentTimeMillis;
            j4 = j3;
            C2244tja tja2 = new C2244tja();
            tja2.f5643a = opa.f5178b;
            tja2.f5644b = str5;
            tja2.f = j4;
            tja2.e = j3;
            tja2.f5645c = a2;
            tja2.d = a4;
            tja2.g = map;
            tja2.h = opa.d;
            return tja2;
        }
        j3 = j4;
        C2244tja tja22 = new C2244tja();
        tja22.f5643a = opa.f5178b;
        tja22.f5644b = str5;
        tja22.f = j4;
        tja22.e = j3;
        tja22.f5645c = a2;
        tja22.d = a4;
        tja22.g = map;
        tja22.h = opa.d;
        return tja22;
    }

    static String a(long j) {
        return a().format(new Date(j));
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
