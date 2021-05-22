package c.a.a.a.p;

import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f975a;

    /* renamed from: b  reason: collision with root package name */
    private int f976b;

    public c(int i) {
        a.a(i, "Buffer capacity");
        this.f975a = new byte[i];
    }

    private void c(int i) {
        byte[] bArr = new byte[Math.max(this.f975a.length << 1, i)];
        System.arraycopy(this.f975a, 0, bArr, 0, this.f976b);
        this.f975a = bArr;
    }

    public void a(int i) {
        int i2 = this.f976b + 1;
        if (i2 > this.f975a.length) {
            c(i2);
        }
        this.f975a[this.f976b] = (byte) i;
        this.f976b = i2;
    }

    public void a(d dVar, int i, int i2) {
        if (dVar != null) {
            a(dVar.a(), i, i2);
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
            } else if (i2 != 0) {
                int i4 = this.f976b + i2;
                if (i4 > this.f975a.length) {
                    c(i4);
                }
                System.arraycopy(bArr, i, this.f975a, this.f976b, i2);
                this.f976b = i4;
            }
        }
    }

    public void a(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + cArr.length);
            } else if (i2 != 0) {
                int i4 = this.f976b;
                int i5 = i2 + i4;
                if (i5 > this.f975a.length) {
                    c(i5);
                }
                while (i4 < i5) {
                    this.f975a[i4] = (byte) cArr[i];
                    i++;
                    i4++;
                }
                this.f976b = i5;
            }
        }
    }

    public byte[] a() {
        return this.f975a;
    }

    public int b() {
        return this.f975a.length;
    }

    public int b(int i) {
        return this.f975a[i];
    }

    public void c() {
        this.f976b = 0;
    }

    public boolean d() {
        return this.f976b == 0;
    }

    public boolean e() {
        return this.f976b == this.f975a.length;
    }

    public int f() {
        return this.f976b;
    }

    public byte[] g() {
        int i = this.f976b;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.f975a, 0, bArr, 0, i);
        }
        return bArr;
    }
}
