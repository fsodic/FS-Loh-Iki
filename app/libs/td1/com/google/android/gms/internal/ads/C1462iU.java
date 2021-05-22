package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iU  reason: case insensitive filesystem */
public final class C1462iU implements AbstractC0176b.a, AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private final CU f4569a;

    /* renamed from: b  reason: collision with root package name */
    private final C2288uU f4570b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4571c = new Object();
    private boolean d = false;
    private boolean e = false;

    C1462iU(Context context, Looper looper, C2288uU uUVar) {
        this.f4570b = uUVar;
        this.f4569a = new CU(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f4571c) {
            if (this.f4569a.isConnected() || this.f4569a.c()) {
                this.f4569a.a();
            }
            Binder.flushPendingCommands();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.f4571c) {
            if (!this.d) {
                this.d = true;
                this.f4569a.l();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f4571c) {
            if (!this.e) {
                this.e = true;
                try {
                    this.f4569a.z().a(new AU(this.f4570b.f()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
    }
}
