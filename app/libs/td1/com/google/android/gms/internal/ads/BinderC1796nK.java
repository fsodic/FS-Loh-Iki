package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.b.j;

/* renamed from: com.google.android.gms.internal.ads.nK  reason: case insensitive filesystem */
public final class BinderC1796nK extends Hoa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5029a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0229Bp f5030b;

    /* renamed from: c  reason: collision with root package name */
    private final IR f5031c = new IR();
    private final C1235fA d = new C1235fA();
    private AbstractC2599yoa e;

    public BinderC1796nK(AbstractC0229Bp bp, Context context, String str) {
        this.f5030b = bp;
        this.f5031c.a(str);
        this.f5029a = context;
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(j jVar) {
        this.f5031c.a(jVar);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC0475Lb lb, C1015boa boa) {
        this.d.a(lb);
        this.f5031c.a(boa);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC0501Mb mb) {
        this.d.a(mb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(C0578Pa pa) {
        this.f5031c.a(pa);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(C1956pd pdVar) {
        this.f5031c.a(pdVar);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2434wb wbVar) {
        this.d.a(wbVar);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2438wd wdVar) {
        this.d.a(wdVar);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2503xb xbVar) {
        this.d.a(xbVar);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(AbstractC2599yoa yoa) {
        this.e = yoa;
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void a(String str, AbstractC0293Eb eb, AbstractC0241Cb cb) {
        this.d.a(str, eb, cb);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final void b(_oa _oa) {
        this.f5031c.a(_oa);
    }

    @Override // com.google.android.gms.internal.ads.Eoa
    public final Doa sb() {
        C1098dA a2 = this.d.a();
        this.f5031c.a(a2.f());
        this.f5031c.b(a2.g());
        IR ir = this.f5031c;
        if (ir.e() == null) {
            ir.a(C1015boa.L());
        }
        return new BinderC2003qK(this.f5029a, this.f5030b, this.f5031c, a2, this.e);
    }
}
