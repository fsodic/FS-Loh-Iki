package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr  reason: case insensitive filesystem */
final class C1638kr implements GW<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4815a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1432hr f4816b;

    C1638kr(C1432hr hrVar, String str) {
        this.f4816b = hrVar;
        this.f4815a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(String str) {
        this.f4816b.f.a(this.f4816b.d, this.f4816b.e, false, this.f4815a, str, this.f4816b.e.d);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f4816b.f.a(this.f4816b.d, this.f4816b.e, false, this.f4815a, null, this.f4816b.e.d);
    }
}
