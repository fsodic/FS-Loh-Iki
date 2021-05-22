package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.st  reason: case insensitive filesystem */
public final class C2191st implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C2054qt f5563a;

    private C2191st(C2054qt qtVar) {
        this.f5563a = qtVar;
    }

    public static C2191st a(C2054qt qtVar) {
        return new C2191st(qtVar);
    }

    public static String b(C2054qt qtVar) {
        String c2 = qtVar.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f5563a);
    }
}
