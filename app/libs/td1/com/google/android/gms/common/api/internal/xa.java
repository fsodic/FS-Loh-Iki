package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0140c;
import com.google.android.gms.common.api.internal.C0146f;

public final class xa<A extends AbstractC0140c<? extends i, a.b>> extends M {

    /* renamed from: b  reason: collision with root package name */
    private final A f1308b;

    public xa(int i, A a2) {
        super(i);
        this.f1308b = a2;
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a(Status status) {
        this.f1308b.a(status);
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a(C0146f.a<?> aVar) {
        try {
            this.f1308b.b(aVar.f());
        } catch (RuntimeException e) {
            a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a(C0166q qVar, boolean z) {
        qVar.a(this.f1308b, z);
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f1308b.a(new Status(10, sb.toString()));
    }
}
