package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.nma  reason: case insensitive filesystem */
public final class C1837nma extends a {
    public static final Parcelable.Creator<C1837nma> CREATOR = new C1768mma();

    /* renamed from: a  reason: collision with root package name */
    private ParcelFileDescriptor f5071a;

    public C1837nma() {
        this(null);
    }

    public C1837nma(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5071a = parcelFileDescriptor;
    }

    private final synchronized ParcelFileDescriptor N() {
        return this.f5071a;
    }

    public final synchronized boolean L() {
        return this.f5071a != null;
    }

    public final synchronized InputStream M() {
        if (this.f5071a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f5071a);
        this.f5071a = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) N(), i, false);
        c.a(parcel, a2);
    }
}
