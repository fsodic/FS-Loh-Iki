package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;

final class Ja implements AbstractC0149ga {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ga f1220a;

    private Ja(Ga ga) {
        this.f1220a = ga;
    }

    /* synthetic */ Ja(Ga ga, Ha ha) {
        this(ga);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(int i, boolean z) {
        Ga.a(this.f1220a).lock();
        try {
            if (Ga.c(this.f1220a)) {
                Ga.a(this.f1220a, false);
                Ga.a(this.f1220a, i, z);
            } else {
                Ga.a(this.f1220a, true);
                Ga.f(this.f1220a).onConnectionSuspended(i);
            }
        } finally {
            Ga.a(this.f1220a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(Bundle bundle) {
        Ga.a(this.f1220a).lock();
        try {
            Ga.b(this.f1220a, b.f260a);
            Ga.b(this.f1220a);
        } finally {
            Ga.a(this.f1220a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(b bVar) {
        Ga.a(this.f1220a).lock();
        try {
            Ga.b(this.f1220a, bVar);
            Ga.b(this.f1220a);
        } finally {
            Ga.a(this.f1220a).unlock();
        }
    }
}
