package com.google.android.gms.internal.ads;

import java.io.IOException;

public class Kga extends IOException {
    public Kga(String str) {
        super(str);
    }

    public Kga(String str, Throwable th) {
        super(str, th);
    }
}
