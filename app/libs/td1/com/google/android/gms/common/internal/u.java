package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class u<T extends IInterface> extends AbstractC0181g<T> {
    private final a.h<T> G;

    public a.h<T> A() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public T a(IBinder iBinder) {
        return this.G.a(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public void a(int i, T t) {
        this.G.a(i, t);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0181g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public int g() {
        return super.g();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String v() {
        return this.G.l();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String w() {
        return this.G.m();
    }
}
