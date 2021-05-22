package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Te  reason: case insensitive filesystem */
public final class C0686Te {

    /* renamed from: a  reason: collision with root package name */
    private C1132de f3192a;

    /* renamed from: b  reason: collision with root package name */
    private SW<AbstractC0244Ce> f3193b;

    C0686Te(C1132de deVar) {
        this.f3192a = deVar;
    }

    private final void a() {
        if (this.f3193b == null) {
            C1423hm hmVar = new C1423hm();
            this.f3193b = hmVar;
            this.f3192a.b((C1955pca) null).a(new C0764We(hmVar), new C0738Ve(hmVar));
        }
    }

    public final <I, O> C0927af<I, O> a(String str, AbstractC0374He<I> he, AbstractC0400Ie<O> ie) {
        a();
        return new C0927af<>(this.f3193b, str, he, ie);
    }

    public final void a(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        a();
        this.f3193b = JW.a(this.f3193b, new C0842Ze(str, dc), C0875_l.f);
    }

    public final void b(String str, AbstractC0268Dc<? super AbstractC0244Ce> dc) {
        this.f3193b = JW.a(this.f3193b, new C0816Ye(str, dc), C0875_l.f);
    }
}
