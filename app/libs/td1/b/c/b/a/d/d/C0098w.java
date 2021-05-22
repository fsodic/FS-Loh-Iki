package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.w  reason: case insensitive filesystem */
public final class C0098w extends AbstractC0094u {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private C0098w(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = Integer.MAX_VALUE;
        this.d = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = this.h;
        this.e = z;
    }

    public final int a() {
        return this.h - this.i;
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            int a2 = i2 + a();
            int i3 = this.j;
            if (a2 <= i3) {
                this.j = a2;
                this.f += this.g;
                int i4 = this.f;
                int i5 = i4 - this.i;
                int i6 = this.j;
                if (i5 > i6) {
                    this.g = i5 - i6;
                    this.f = i4 - this.g;
                } else {
                    this.g = 0;
                }
                return i3;
            }
            throw S.a();
        }
        throw S.b();
    }
}
