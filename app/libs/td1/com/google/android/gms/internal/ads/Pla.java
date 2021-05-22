package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class Pla {

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayOutputStream f2879a = new ByteArrayOutputStream(4096);

    /* renamed from: b  reason: collision with root package name */
    private Base64OutputStream f2880b = new Base64OutputStream(this.f2879a, 10);

    public final void a(byte[] bArr) {
        this.f2880b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f2880b.close();
        } catch (IOException e) {
            C0745Vl.b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f2879a.close();
            str = this.f2879a.toString();
        } catch (IOException e2) {
            C0745Vl.b("HashManager: Unable to convert to Base64.", e2);
            str = BuildConfig.FLAVOR;
        } catch (Throwable th) {
            this.f2879a = null;
            this.f2880b = null;
            throw th;
        }
        this.f2879a = null;
        this.f2880b = null;
        return str;
    }
}
