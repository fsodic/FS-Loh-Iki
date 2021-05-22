package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ee  reason: case insensitive filesystem */
public final class C0296Ee implements AbstractC0477Ld, AbstractC0218Be {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0244Ce f1875a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, AbstractC0268Dc<? super AbstractC0244Ce>>> f1876b = new HashSet<>();

    public C0296Ee(AbstractC0244Ce ce) {
        this.f1875a = ce;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0925ae
    public final void a(String str) {
        this.f1875a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0244Ce
    public final void a(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        this.f1875a.a(str, dc);
        this.f1876b.add(new AbstractMap.SimpleEntry<>(str, dc));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld
    public final void a(String str, String str2) {
        C0451Kd.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map map) {
        C0451Kd.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        C0451Kd.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0218Be
    public final void b() {
        Iterator<AbstractMap.SimpleEntry<String, AbstractC0268Dc<? super AbstractC0244Ce>>> it = this.f1876b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, AbstractC0268Dc<? super AbstractC0244Ce>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            C1763mk.f(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f1875a.b(next.getKey(), next.getValue());
        }
        this.f1876b.clear();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0244Ce
    public final void b(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        this.f1875a.b(str, dc);
        this.f1876b.remove(new AbstractMap.SimpleEntry(str, dc));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        C0451Kd.a(this, str, jSONObject);
    }
}
