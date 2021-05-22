package com.google.android.gms.common.api;

import b.c.b.a.b.d;

public final class n extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final d f1317a;

    public n(d dVar) {
        this.f1317a = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f1317a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
