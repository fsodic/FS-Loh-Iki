package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class Kla {

    /* renamed from: a  reason: collision with root package name */
    private static MessageDigest f2431a;

    /* renamed from: b  reason: collision with root package name */
    protected Object f2432b = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        synchronized (this.f2432b) {
            if (f2431a != null) {
                return f2431a;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f2431a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f2431a;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);
}
