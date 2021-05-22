package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.on  reason: case insensitive filesystem */
public final class C1907on implements AbstractC1213eka {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f5168a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5169b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5170c;
    private final AbstractC1213eka d;
    private final AbstractC2177ska<AbstractC1213eka> e;
    private final AbstractC2113rn f;
    private Uri g;

    public C1907on(Context context, AbstractC1213eka eka, AbstractC2177ska<AbstractC1213eka> ska, AbstractC2113rn rnVar) {
        this.f5170c = context;
        this.d = eka;
        this.e = ska;
        this.f = rnVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0095 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C1557jka r21) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1907on.a(com.google.android.gms.internal.ads.jka):long");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final void close() {
        if (this.f5169b) {
            this.f5169b = false;
            this.g = null;
            InputStream inputStream = this.f5168a;
            if (inputStream != null) {
                k.a(inputStream);
                this.f5168a = null;
            } else {
                this.d.close();
            }
            AbstractC2177ska<AbstractC1213eka> ska = this.e;
            if (ska != null) {
                ska.a(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final Uri getUri() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f5169b) {
            InputStream inputStream = this.f5168a;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.d.read(bArr, i, i2);
            AbstractC2177ska<AbstractC1213eka> ska = this.e;
            if (ska != null) {
                ska.a(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
