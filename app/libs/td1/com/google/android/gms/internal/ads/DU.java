package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class DU extends a {
    public static final Parcelable.Creator<DU> CREATOR = new GU();

    /* renamed from: a  reason: collision with root package name */
    private final int f1770a;

    /* renamed from: b  reason: collision with root package name */
    private C1511jB f1771b = null;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f1772c;

    DU(int i, byte[] bArr) {
        this.f1770a = i;
        this.f1772c = bArr;
        M();
    }

    private final void M() {
        if (this.f1771b == null && this.f1772c != null) {
            return;
        }
        if (this.f1771b != null && this.f1772c == null) {
            return;
        }
        if (this.f1771b != null && this.f1772c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f1771b == null && this.f1772c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final C1511jB L() {
        if (!(this.f1771b != null)) {
            try {
                this.f1771b = C1511jB.a(this.f1772c, C1197eca.b());
                this.f1772c = null;
            } catch (Bca e) {
                throw new IllegalStateException(e);
            }
        }
        M();
        return this.f1771b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1770a);
        byte[] bArr = this.f1772c;
        if (bArr == null) {
            bArr = this.f1771b.f();
        }
        c.a(parcel, 2, bArr, false);
        c.a(parcel, a2);
    }
}
