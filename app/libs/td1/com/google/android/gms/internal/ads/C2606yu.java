package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yu  reason: case insensitive filesystem */
public final class C2606yu implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f6145a;

    private C2606yu(C2537xu xuVar) {
        this.f6145a = xuVar;
    }

    public static C2606yu a(C2537xu xuVar) {
        return new C2606yu(xuVar);
    }

    public static String b(C2537xu xuVar) {
        return xuVar.e();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return this.f6145a.e();
    }
}
