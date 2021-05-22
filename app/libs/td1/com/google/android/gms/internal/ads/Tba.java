package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class Tba extends Pba {
    protected final byte[] e;

    Tba(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final int a(int i, int i2, int i3) {
        int r = r() + i2;
        return Yda.a(i, this.e, r, i3 + r);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final String a(Charset charset) {
        return new String(this.e, r(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iba
    public final void a(Fba fba) {
        fba.a(this.e, r(), size());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Pba
    public final boolean a(Iba iba, int i, int i2) {
        if (i2 <= iba.size()) {
            int i3 = i + i2;
            if (i3 > iba.size()) {
                int size = iba.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(iba instanceof Tba)) {
                return iba.b(i, i3).equals(b(0, i2));
            } else {
                Tba tba = (Tba) iba;
                byte[] bArr = this.e;
                byte[] bArr2 = tba.e;
                int r = r() + i2;
                int r2 = r();
                int r3 = tba.r() + i;
                while (r2 < r) {
                    if (bArr[r2] != bArr2[r3]) {
                        return false;
                    }
                    r2++;
                    r3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final int b(int i, int i2, int i3) {
        return C2230tca.a(i, this.e, r() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final Iba b(int i, int i2) {
        int c2 = Iba.c(i, i2, size());
        return c2 == 0 ? Iba.f2236a : new Lba(this.e, r() + i, c2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Iba) || size() != ((Iba) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof Tba)) {
            return obj.equals(this);
        }
        Tba tba = (Tba) obj;
        int q = q();
        int q2 = tba.q();
        if (q == 0 || q2 == 0 || q == q2) {
            return a(tba, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public byte h(int i) {
        return this.e[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iba
    public byte i(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final boolean l() {
        int r = r();
        return Yda.a(this.e, r, size() + r);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final Uba m() {
        return Uba.a(this.e, r(), size(), true);
    }

    /* access modifiers changed from: protected */
    public int r() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public int size() {
        return this.e.length;
    }
}
