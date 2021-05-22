package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.n  reason: case insensitive filesystem */
public final class C0081n extends C0090s {
    private final int f;
    private final int g;

    C0081n(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC0071i.b(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    @Override // b.c.b.a.d.d.AbstractC0071i, b.c.b.a.d.d.C0090s
    public final byte h(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.e[this.f + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0071i, b.c.b.a.d.d.C0090s
    public final byte i(int i) {
        return this.e[this.f + i];
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.d.C0090s
    public final int l() {
        return this.f;
    }

    @Override // b.c.b.a.d.d.AbstractC0071i, b.c.b.a.d.d.C0090s
    public final int size() {
        return this.g;
    }
}
