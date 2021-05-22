package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zF  reason: case insensitive filesystem */
public abstract class AbstractC2618zF implements AbstractC2221tW<C0715Uh, BR> {

    /* renamed from: a  reason: collision with root package name */
    private final C0807Xv f6164a;

    public AbstractC2618zF(C0807Xv xv) {
        this.f6164a = xv;
    }

    /* access modifiers changed from: protected */
    public abstract SW<BR> a(C0715Uh uh);

    /* Return type fixed from 'com.google.android.gms.internal.ads.SW' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final /* synthetic */ SW<BR> b(C0715Uh uh) {
        C0715Uh uh2 = uh;
        this.f6164a.a(uh2);
        SW<BR> a2 = a(uh2);
        JW.a(a2, new CF(this), C0875_l.f);
        return a2;
    }
}
