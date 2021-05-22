package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mr  reason: case insensitive filesystem */
public final class C1776mr {

    /* renamed from: a  reason: collision with root package name */
    private final String f5001a;

    /* renamed from: b  reason: collision with root package name */
    private final C0686Te f5002b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5003c;
    private C2120rr d;
    private final AbstractC0268Dc<Object> e = new C1707lr(this);
    private final AbstractC0268Dc<Object> f = new C1845nr(this);

    public C1776mr(String str, C0686Te te, Executor executor) {
        this.f5001a = str;
        this.f5002b = te;
        this.f5003c = executor;
    }

    /* access modifiers changed from: private */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f5001a);
    }

    public final void a() {
        this.f5002b.b("/updateActiveView", this.e);
        this.f5002b.b("/untrackActiveViewUnit", this.f);
    }

    public final void a(AbstractC1564jo joVar) {
        joVar.a("/updateActiveView", this.e);
        joVar.a("/untrackActiveViewUnit", this.f);
    }

    public final void a(C2120rr rrVar) {
        this.f5002b.a("/updateActiveView", this.e);
        this.f5002b.a("/untrackActiveViewUnit", this.f);
        this.d = rrVar;
    }

    public final void b(AbstractC1564jo joVar) {
        joVar.b("/updateActiveView", this.e);
        joVar.b("/untrackActiveViewUnit", this.f);
    }
}
