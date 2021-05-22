package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.vma  reason: case insensitive filesystem */
public final class C2388vma {

    /* renamed from: a  reason: collision with root package name */
    private C1975pma f5836a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5837b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5838c;
    private final Object d = new Object();

    C2388vma(Context context) {
        this.f5838c = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.d) {
            if (this.f5836a != null) {
                this.f5836a.a();
                this.f5836a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future<InputStream> a(C1906oma oma) {
        C2595yma yma = new C2595yma(this);
        C2526xma xma = new C2526xma(this, oma, yma);
        Bma bma = new Bma(this, yma);
        synchronized (this.d) {
            this.f5836a = new C1975pma(this.f5838c, q.q().b(), xma, bma);
            this.f5836a.l();
        }
        return yma;
    }
}
