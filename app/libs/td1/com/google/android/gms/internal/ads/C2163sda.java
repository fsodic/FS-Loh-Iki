package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sda  reason: case insensitive filesystem */
public final class C2163sda extends Jba {

    /* renamed from: a  reason: collision with root package name */
    private final C2301uda f5527a = new C2301uda(this.f5529c, null);

    /* renamed from: b  reason: collision with root package name */
    private Nba f5528b = a();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2232tda f5529c;

    C2163sda(C2232tda tda) {
        this.f5529c = tda;
    }

    private final Nba a() {
        if (this.f5527a.hasNext()) {
            return (Nba) ((Pba) this.f5527a.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f5528b != null;
    }

    @Override // com.google.android.gms.internal.ads.Nba
    public final byte nextByte() {
        Nba nba = this.f5528b;
        if (nba != null) {
            byte nextByte = nba.nextByte();
            if (!this.f5528b.hasNext()) {
                this.f5528b = a();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
