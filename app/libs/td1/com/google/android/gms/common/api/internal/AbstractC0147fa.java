package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.fa  reason: case insensitive filesystem */
public interface AbstractC0147fa {
    <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t);

    void a();

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void b();

    void connect();

    boolean isConnected();
}
