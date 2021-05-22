package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0146f;
import com.google.android.gms.common.util.o;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    private final int f1227a;

    public M(int i) {
        this.f1227a = i;
    }

    /* access modifiers changed from: private */
    public static Status b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (o.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(Status status);

    public abstract void a(C0146f.a<?> aVar);

    public abstract void a(C0166q qVar, boolean z);

    public abstract void a(RuntimeException runtimeException);
}
