package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.qj  reason: case insensitive filesystem */
public final class C2037qj implements AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5341a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5342b;

    /* renamed from: c  reason: collision with root package name */
    private String f5343c;
    private boolean d;

    public C2037qj(Context context, String str) {
        this.f5341a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5343c = str;
        this.d = false;
        this.f5342b = new Object();
    }

    public final String a() {
        return this.f5343c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        f(ola.m);
    }

    public final void f(boolean z) {
        if (q.A().a(this.f5341a)) {
            synchronized (this.f5342b) {
                if (this.d != z) {
                    this.d = z;
                    if (!TextUtils.isEmpty(this.f5343c)) {
                        if (this.d) {
                            q.A().a(this.f5341a, this.f5343c);
                        } else {
                            q.A().b(this.f5341a, this.f5343c);
                        }
                    }
                }
            }
        }
    }
}
