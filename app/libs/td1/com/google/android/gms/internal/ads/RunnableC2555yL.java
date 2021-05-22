package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.yL  reason: case insensitive filesystem */
public final class RunnableC2555yL implements Runnable {
    private RunnableC2555yL() {
    }

    public final void run() {
        try {
            MessageDigest unused = C2485xK.f5968b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            C2485xK.e.countDown();
            throw th;
        }
        C2485xK.e.countDown();
    }
}
