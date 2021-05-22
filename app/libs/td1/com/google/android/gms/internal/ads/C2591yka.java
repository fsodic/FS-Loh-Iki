package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yka  reason: case insensitive filesystem */
public final class C2591yka {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6127a;

    public final synchronized void a() {
        while (!this.f6127a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f6127a) {
            return false;
        }
        this.f6127a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f6127a;
        this.f6127a = false;
        return z;
    }
}
