package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface Yga {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f3578a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void a(ByteBuffer byteBuffer);

    boolean a(int i, int i2, int i3);

    int b();

    boolean c();

    void d();

    int e();

    void flush();

    boolean q();

    void reset();
}
