package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.AbstractC2532xpa;
import com.google.android.gms.internal.ads.BinderC1097d;
import com.google.android.gms.internal.ads.C0745Vl;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1160a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private AbstractC2532xpa f1161b;

    /* renamed from: c  reason: collision with root package name */
    private a f1162c;

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public final AbstractC2532xpa a() {
        AbstractC2532xpa xpa;
        synchronized (this.f1160a) {
            xpa = this.f1161b;
        }
        return xpa;
    }

    public final void a(a aVar) {
        r.a(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f1160a) {
            this.f1162c = aVar;
            if (this.f1161b != null) {
                try {
                    this.f1161b.a(new BinderC1097d(aVar));
                } catch (RemoteException e) {
                    C0745Vl.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public final void a(AbstractC2532xpa xpa) {
        synchronized (this.f1160a) {
            this.f1161b = xpa;
            if (this.f1162c != null) {
                a(this.f1162c);
            }
        }
    }
}
