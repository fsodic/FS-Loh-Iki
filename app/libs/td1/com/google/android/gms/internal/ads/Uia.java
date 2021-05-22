package com.google.android.gms.internal.ads;

public final class Uia extends Exception {
    private Uia(Throwable th) {
        super("Failed to query underlying media codecs", th);
    }
}
