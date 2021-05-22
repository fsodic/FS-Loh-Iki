package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cha  reason: case insensitive filesystem */
final class RunnableC1070cha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f4014a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f4015b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f4016c;
    private final /* synthetic */ Zga d;

    RunnableC1070cha(Zga zga, int i, long j, long j2) {
        this.d = zga;
        this.f4014a = i;
        this.f4015b = j;
        this.f4016c = j2;
    }

    public final void run() {
        Zga.a(this.d).a(this.f4014a, this.f4015b, this.f4016c);
    }
}
