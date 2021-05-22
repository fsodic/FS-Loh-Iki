package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    boolean f2452a = true;

    /* renamed from: b  reason: collision with root package name */
    private final List<J> f2453b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f2454c = new LinkedHashMap();
    private final Object d = new Object();
    private L e;

    public L(boolean z, String str, String str2) {
        this.f2454c.put("action", str);
        this.f2454c.put("ad_format", str2);
    }

    public final J a(long j) {
        if (!this.f2452a) {
            return null;
        }
        return new J(j, null, null);
    }

    public final String a() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.d) {
            for (J j : this.f2453b) {
                long a2 = j.a();
                String b2 = j.b();
                J c2 = j.c();
                if (c2 != null && a2 > 0) {
                    sb2.append(b2);
                    sb2.append('.');
                    sb2.append(a2 - c2.a());
                    sb2.append(',');
                }
            }
            this.f2453b.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void a(L l) {
        synchronized (this.d) {
            this.e = l;
        }
    }

    public final void a(String str, String str2) {
        A c2;
        if (this.f2452a && !TextUtils.isEmpty(str2) && (c2 = q.g().c()) != null) {
            synchronized (this.d) {
                F a2 = c2.a(str);
                Map<String, String> map = this.f2454c;
                map.put(str, a2.a(map.get(str), str2));
            }
        }
    }

    public final boolean a(J j, long j2, String... strArr) {
        synchronized (this.d) {
            for (String str : strArr) {
                this.f2453b.add(new J(j2, str, j));
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> b() {
        synchronized (this.d) {
            A c2 = q.g().c();
            if (c2 != null) {
                if (this.e != null) {
                    return c2.a(this.f2454c, this.e.b());
                }
            }
            return this.f2454c;
        }
    }
}
