package com.google.android.gms.internal.ads;

final class Qga extends Sga {
    Qga() {
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int a(Object obj) {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final Tga a(int i, Tga tga, boolean z, long j) {
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final Uga a(int i, Uga uga, boolean z) {
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int c() {
        return 0;
    }
}
