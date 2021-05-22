package com.google.android.gms.common.api.internal;

import android.os.Looper;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;

final class A implements AbstractC0176b.c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<C0173y> f1190a;

    /* renamed from: b  reason: collision with root package name */
    private final a<?> f1191b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1192c;

    public A(C0173y yVar, a<?> aVar, boolean z) {
        this.f1190a = new WeakReference<>(yVar);
        this.f1191b = aVar;
        this.f1192c = z;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.c
    public final void a(b bVar) {
        C0173y yVar = this.f1190a.get();
        if (yVar != null) {
            r.b(Looper.myLooper() == yVar.f1309a.n.c(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            yVar.f1310b.lock();
            try {
                if (yVar.a(0)) {
                    if (!bVar.P()) {
                        yVar.b(bVar, this.f1191b, this.f1192c);
                    }
                    if (yVar.c()) {
                        yVar.d();
                    }
                }
            } finally {
                yVar.f1310b.unlock();
            }
        }
    }
}
