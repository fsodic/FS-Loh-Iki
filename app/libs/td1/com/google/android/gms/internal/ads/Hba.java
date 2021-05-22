package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class Hba extends Jba {

    /* renamed from: a  reason: collision with root package name */
    private int f2145a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f2146b = this.f2147c.size();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Iba f2147c;

    Hba(Iba iba) {
        this.f2147c = iba;
    }

    public final boolean hasNext() {
        return this.f2145a < this.f2146b;
    }

    @Override // com.google.android.gms.internal.ads.Nba
    public final byte nextByte() {
        int i = this.f2145a;
        if (i < this.f2146b) {
            this.f2145a = i + 1;
            return this.f2147c.i(i);
        }
        throw new NoSuchElementException();
    }
}
