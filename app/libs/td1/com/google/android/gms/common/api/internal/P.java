package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;

public interface P {
    <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t);

    void a(b bVar, a<?> aVar, boolean z);

    boolean a();

    void b();

    void connect();

    void onConnected(Bundle bundle);

    void onConnectionSuspended(int i);
}
