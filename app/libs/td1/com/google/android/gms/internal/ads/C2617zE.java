package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zE  reason: case insensitive filesystem */
public final class C2617zE {

    /* renamed from: a  reason: collision with root package name */
    private List<Map<String, String>> f6161a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6162b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6163c = false;
    private String d;
    private C2272uE e;

    public C2617zE(String str, C2272uE uEVar) {
        this.d = str;
        this.e = uEVar;
    }

    private final Map<String, String> c() {
        Map<String, String> a2 = this.e.a();
        a2.put("tms", Long.toString(q.j().b(), 10));
        a2.put("tid", this.d);
        return a2;
    }

    public final synchronized void a() {
        if (((Boolean) C2392voa.e().a(C2474x.qb)).booleanValue()) {
            if (!this.f6162b) {
                Map<String, String> c2 = c();
                c2.put("action", "init_started");
                this.f6161a.add(c2);
                this.f6162b = true;
            }
        }
    }

    public final synchronized void a(String str) {
        if (((Boolean) C2392voa.e().a(C2474x.qb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_started");
            c2.put("ancn", str);
            this.f6161a.add(c2);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) C2392voa.e().a(C2474x.qb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            c2.put("rqe", str2);
            this.f6161a.add(c2);
        }
    }

    public final synchronized void b() {
        if (((Boolean) C2392voa.e().a(C2474x.qb)).booleanValue()) {
            if (!this.f6163c) {
                Map<String, String> c2 = c();
                c2.put("action", "init_finished");
                this.f6161a.add(c2);
                for (Map<String, String> map : this.f6161a) {
                    this.e.a(map);
                }
                this.f6163c = true;
            }
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) C2392voa.e().a(C2474x.qb)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            this.f6161a.add(c2);
        }
    }
}
