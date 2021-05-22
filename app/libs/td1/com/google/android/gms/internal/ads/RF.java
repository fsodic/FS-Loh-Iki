package com.google.android.gms.internal.ads;

import android.os.Binder;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;
import java.io.InputStream;

public abstract class RF implements AbstractC0176b.a, AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    protected final C1423hm<InputStream> f2993a = new C1423hm<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Object f2994b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f2995c = false;
    protected boolean d = false;
    protected C0715Uh e;
    protected C0221Bh f;

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f2994b) {
            this.d = true;
            if (this.f.isConnected() || this.f.c()) {
                this.f.a();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public void onConnectionFailed(b bVar) {
        C0745Vl.a("Disconnected from remote ad request service.");
        this.f2993a.a(new C1448iG(YR.f3560a));
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public void onConnectionSuspended(int i) {
        C0745Vl.a("Cannot connect to remote service, fallback to local instance.");
    }
}
