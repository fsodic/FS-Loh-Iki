package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.cE  reason: case insensitive filesystem */
public final class C1033cE implements AbstractC0624Qu, AbstractC1229ev, AbstractC0548Nw {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3970a;

    /* renamed from: b  reason: collision with root package name */
    private final OR f3971b;

    /* renamed from: c  reason: collision with root package name */
    private final C1859oE f3972c;
    private final BR d;
    private final C1941pR e;
    private Boolean f;
    private final boolean g = ((Boolean) C2392voa.e().a(C2474x.He)).booleanValue();

    public C1033cE(Context context, OR or, C1859oE oEVar, BR br, C1941pR pRVar) {
        this.f3970a = context;
        this.f3971b = or;
        this.f3972c = oEVar;
        this.d = br;
        this.e = pRVar;
    }

    private final C1790nE a(String str) {
        C1790nE a2 = this.f3972c.a();
        a2.a(this.d.f1611b.f6181b);
        a2.a(this.e);
        a2.a("action", str);
        if (!this.e.q.isEmpty()) {
            a2.a("ancn", this.e.q.get(0));
        }
        return a2;
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                q.g().a(e2, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final boolean d() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    AbstractC1441i<String> iVar = C2474x.lb;
                    q.c();
                    this.f = Boolean.valueOf(a((String) C2392voa.e().a(iVar), C2452wk.o(this.f3970a)));
                }
            }
        }
        return this.f.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void P() {
        if (this.g) {
            C1790nE a2 = a("ifts");
            a2.a("reason", "blocked");
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0548Nw
    public final void a() {
        if (d()) {
            a("adapter_impression").a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void a(Sna sna) {
        if (this.g) {
            C1790nE a2 = a("ifts");
            a2.a("reason", "adapter");
            int i = sna.f3128a;
            if (i >= 0) {
                a2.a("arec", String.valueOf(i));
            }
            String a3 = this.f3971b.a(sna.f3129b);
            if (a3 != null) {
                a2.a("areec", a3);
            }
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0624Qu
    public final void a(C0810Xy xy) {
        if (this.g) {
            C1790nE a2 = a("ifts");
            a2.a("reason", "exception");
            if (!TextUtils.isEmpty(xy.getMessage())) {
                a2.a("msg", xy.getMessage());
            }
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final void b() {
        if (d()) {
            a("impression").a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0548Nw
    public final void c() {
        if (d()) {
            a("adapter_shown").a();
        }
    }
}
