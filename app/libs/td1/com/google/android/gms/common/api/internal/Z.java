package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C0146f;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
public final class Z implements AbstractC0176b.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0146f.a f1242a;

    Z(C0146f.a aVar) {
        this.f1242a = aVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.e
    public final void V() {
        C0146f.this.q.post(new RunnableC0137aa(this));
    }
}
