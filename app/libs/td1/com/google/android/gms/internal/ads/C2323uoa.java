package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.c;

/* renamed from: com.google.android.gms.internal.ads.uoa  reason: case insensitive filesystem */
public class C2323uoa extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5761a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private c f5762b;

    @Override // com.google.android.gms.ads.c
    public void a() {
        synchronized (this.f5761a) {
            if (this.f5762b != null) {
                this.f5762b.a();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void a(int i) {
        synchronized (this.f5761a) {
            if (this.f5762b != null) {
                this.f5762b.a(i);
            }
        }
    }

    public final void a(c cVar) {
        synchronized (this.f5761a) {
            this.f5762b = cVar;
        }
    }

    @Override // com.google.android.gms.ads.c
    public void c() {
        synchronized (this.f5761a) {
            if (this.f5762b != null) {
                this.f5762b.c();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void d() {
        synchronized (this.f5761a) {
            if (this.f5762b != null) {
                this.f5762b.d();
            }
        }
    }

    @Override // com.google.android.gms.ads.c
    public void f() {
        synchronized (this.f5761a) {
            if (this.f5762b != null) {
                this.f5762b.f();
            }
        }
    }
}
