package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class _ha {

    /* renamed from: a  reason: collision with root package name */
    public final int f3738a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3739b;

    public _ha(int i, byte[] bArr) {
        this.f3739b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && _ha.class == obj.getClass()) {
            _ha _ha = (_ha) obj;
            return this.f3738a == _ha.f3738a && Arrays.equals(this.f3739b, _ha.f3739b);
        }
    }

    public final int hashCode() {
        return (this.f3738a * 31) + Arrays.hashCode(this.f3739b);
    }
}
