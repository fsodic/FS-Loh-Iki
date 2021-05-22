package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.b.d.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class PN implements AbstractC1180eO<QN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f2822a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2823b;

    /* renamed from: c  reason: collision with root package name */
    private final C0823Yl f2824c;

    public PN(VW vw, Context context, C0823Yl yl) {
        this.f2822a = vw;
        this.f2823b = context;
        this.f2824c = yl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<QN> a() {
        return this.f2822a.a(new SN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ QN b() {
        boolean a2 = c.a(this.f2823b).a();
        q.c();
        boolean k = C2452wk.k(this.f2823b);
        String str = this.f2824c.f3587a;
        q.e();
        boolean c2 = C0224Bk.c();
        q.c();
        return new QN(a2, k, str, c2, C2452wk.i(this.f2823b), DynamiteModule.b(this.f2823b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f2823b, ModuleDescriptor.MODULE_ID));
    }
}
