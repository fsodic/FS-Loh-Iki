package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wS  reason: case insensitive filesystem */
public final class C2424wS {

    /* renamed from: a  reason: collision with root package name */
    private final C2355vS f5889a = new C2355vS();

    /* renamed from: b  reason: collision with root package name */
    private int f5890b;

    /* renamed from: c  reason: collision with root package name */
    private int f5891c;
    private int d;
    private int e;
    private int f;

    C2424wS() {
    }

    public final void a() {
        this.d++;
    }

    public final void b() {
        this.e++;
    }

    public final void c() {
        this.f5890b++;
        this.f5889a.f5807a = true;
    }

    public final void d() {
        this.f5891c++;
        this.f5889a.f5808b = true;
    }

    public final void e() {
        this.f++;
    }

    public final C2355vS f() {
        C2355vS vSVar = (C2355vS) this.f5889a.clone();
        C2355vS vSVar2 = this.f5889a;
        vSVar2.f5807a = false;
        vSVar2.f5808b = false;
        return vSVar;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.f5890b + "\n\tPools removed: " + this.f5891c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }
}
