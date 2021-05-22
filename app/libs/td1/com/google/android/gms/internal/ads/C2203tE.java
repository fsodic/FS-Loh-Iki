package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tE  reason: case insensitive filesystem */
public final class C2203tE implements IT {

    /* renamed from: a  reason: collision with root package name */
    private final Map<EnumC2563yT, Long> f5584a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C1721mE f5585b;

    /* renamed from: c  reason: collision with root package name */
    private final d f5586c;
    private final Map<EnumC2563yT, C2134sE> d = new HashMap();

    public C2203tE(C1721mE mEVar, Set<C2134sE> set, d dVar) {
        this.f5585b = mEVar;
        for (C2134sE sEVar : set) {
            this.d.put(C2134sE.a(sEVar), sEVar);
        }
        this.f5586c = dVar;
    }

    private final void a(EnumC2563yT yTVar, boolean z) {
        EnumC2563yT b2 = C2134sE.b(this.d.get(yTVar));
        String str = z ? "s." : "f.";
        if (this.f5584a.containsKey(b2)) {
            long b3 = this.f5586c.b() - this.f5584a.get(b2).longValue();
            Map<String, String> a2 = this.f5585b.a();
            String valueOf = String.valueOf(C2134sE.c(this.d.get(yTVar)));
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(b3));
            a2.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str, Throwable th) {
        if (this.f5584a.containsKey(yTVar)) {
            long b2 = this.f5586c.b() - this.f5584a.get(yTVar).longValue();
            Map<String, String> a2 = this.f5585b.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.d.containsKey(yTVar)) {
            a(yTVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void b(EnumC2563yT yTVar, String str) {
        this.f5584a.put(yTVar, Long.valueOf(this.f5586c.b()));
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void c(EnumC2563yT yTVar, String str) {
        if (this.f5584a.containsKey(yTVar)) {
            long b2 = this.f5586c.b() - this.f5584a.get(yTVar).longValue();
            Map<String, String> a2 = this.f5585b.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.d.containsKey(yTVar)) {
            a(yTVar, true);
        }
    }
}
