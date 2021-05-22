package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kl  reason: case insensitive filesystem */
public final class C1627kl implements AbstractC0923ad {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4799a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1696ll f4800b;

    C1627kl(C1489il ilVar, String str, C1696ll llVar) {
        this.f4799a = str;
        this.f4800b = llVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923ad
    public final void a(C0713Uf uf) {
        String str = this.f4799a;
        String exc = uf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        C0745Vl.d(sb.toString());
        this.f4800b.a((Object) null);
    }
}
