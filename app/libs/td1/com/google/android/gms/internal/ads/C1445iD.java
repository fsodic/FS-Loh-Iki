package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iD  reason: case insensitive filesystem */
public final class C1445iD {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1513jD> f4546a = new HashMap();

    C1445iD() {
    }

    public final synchronized C1513jD a(String str) {
        return this.f4546a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, SR sr) {
        if (!this.f4546a.containsKey(str)) {
            try {
                this.f4546a.put(str, new C1513jD(str, sr.m(), sr.n()));
            } catch (MR unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, AbstractC1755mg mgVar) {
        if (!this.f4546a.containsKey(str)) {
            try {
                this.f4546a.put(str, new C1513jD(str, mgVar.fa(), mgVar.da()));
            } catch (Throwable unused) {
            }
        }
    }
}
