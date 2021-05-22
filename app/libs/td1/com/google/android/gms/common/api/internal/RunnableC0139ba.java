package com.google.android.gms.common.api.internal;

import android.util.Log;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.internal.C0146f;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ba  reason: case insensitive filesystem */
final class RunnableC0139ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f1247a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0146f.c f1248b;

    RunnableC0139ba(C0146f.c cVar, b bVar) {
        this.f1248b = cVar;
        this.f1247a = bVar;
    }

    public final void run() {
        if (this.f1247a.P()) {
            this.f1248b.e = true;
            if (this.f1248b.f1262a.j()) {
                this.f1248b.a();
                return;
            }
            try {
                this.f1248b.f1262a.a(null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C0146f.a) C0146f.this.m.get(this.f1248b.f1263b)).onConnectionFailed(new b(10));
            }
        } else {
            ((C0146f.a) C0146f.this.m.get(this.f1248b.f1263b)).onConnectionFailed(this.f1247a);
        }
    }
}
