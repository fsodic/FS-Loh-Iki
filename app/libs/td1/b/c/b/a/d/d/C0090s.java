package b.c.b.a.d.d;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.s  reason: case insensitive filesystem */
public class C0090s extends r {
    protected final byte[] e;

    C0090s(byte[] bArr) {
        if (bArr != null) {
            this.e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.d.AbstractC0071i
    public final int a(int i, int i2, int i3) {
        return O.a(i, this.e, l(), i3);
    }

    @Override // b.c.b.a.d.d.AbstractC0071i
    public final AbstractC0071i a(int i, int i2) {
        int b2 = AbstractC0071i.b(0, i2, size());
        return b2 == 0 ? AbstractC0071i.f429a : new C0081n(this.e, l(), b2);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.d.AbstractC0071i
    public final String a(Charset charset) {
        return new String(this.e, l(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0071i
    public final void a(AbstractC0069h hVar) {
        hVar.a(this.e, l(), size());
    }

    /* access modifiers changed from: package-private */
    public final boolean a(AbstractC0071i iVar, int i, int i2) {
        if (i2 > iVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > iVar.size()) {
            int size2 = iVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(iVar instanceof C0090s)) {
            return iVar.a(0, i2).equals(a(0, i2));
        } else {
            C0090s sVar = (C0090s) iVar;
            byte[] bArr = this.e;
            byte[] bArr2 = sVar.e;
            int l = l() + i2;
            int l2 = l();
            int l3 = sVar.l();
            while (l2 < l) {
                if (bArr[l2] != bArr2[l3]) {
                    return false;
                }
                l2++;
                l3++;
            }
            return true;
        }
    }

    @Override // b.c.b.a.d.d.AbstractC0071i
    public final boolean b() {
        int l = l();
        return eb.a(this.e, l, size() + l);
    }

    @Override // b.c.b.a.d.d.AbstractC0071i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0071i) || size() != ((AbstractC0071i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0090s)) {
            return obj.equals(this);
        }
        C0090s sVar = (C0090s) obj;
        int k = k();
        int k2 = sVar.k();
        if (k == 0 || k2 == 0 || k == k2) {
            return a(sVar, 0, size());
        }
        return false;
    }

    @Override // b.c.b.a.d.d.AbstractC0071i
    public byte h(int i) {
        return this.e[i];
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0071i
    public byte i(int i) {
        return this.e[i];
    }

    /* access modifiers changed from: protected */
    public int l() {
        return 0;
    }

    @Override // b.c.b.a.d.d.AbstractC0071i
    public int size() {
        return this.e.length;
    }
}
