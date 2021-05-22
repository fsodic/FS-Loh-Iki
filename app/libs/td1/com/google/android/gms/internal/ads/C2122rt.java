package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rt  reason: case insensitive filesystem */
public final class C2122rt implements Sea<BR> {

    /* renamed from: a  reason: collision with root package name */
    private final C2054qt f5469a;

    private C2122rt(C2054qt qtVar) {
        this.f5469a = qtVar;
    }

    public static C2122rt a(C2054qt qtVar) {
        return new C2122rt(qtVar);
    }

    public static BR b(C2054qt qtVar) {
        BR a2 = qtVar.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f5469a);
    }
}
