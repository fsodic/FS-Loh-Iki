package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TR implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f3176a;

    /* renamed from: b  reason: collision with root package name */
    private final ParcelFileDescriptor f3177b;

    TR(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3176a = inputStream;
        this.f3177b = parcelFileDescriptor;
    }

    public final void run() {
        InputStream inputStream = this.f3176a;
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f3177b);
            try {
                k.a(inputStream, autoCloseOutputStream);
                autoCloseOutputStream.close();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C2159sba.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C2159sba.a(th, th2);
        }
    }
}
