package c.a.a.a.p;

import java.io.Serializable;
import java.nio.CharBuffer;

public final class d implements CharSequence, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private char[] f977a;

    /* renamed from: b  reason: collision with root package name */
    private int f978b;

    public d(int i) {
        a.a(i, "Buffer capacity");
        this.f977a = new char[i];
    }

    private void c(int i) {
        char[] cArr = new char[Math.max(this.f977a.length << 1, i)];
        System.arraycopy(this.f977a, 0, cArr, 0, this.f978b);
        this.f977a = cArr;
    }

    public int a(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.f978b;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f977a[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public String a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i);
        } else if (i2 > this.f978b) {
            throw new IndexOutOfBoundsException("endIndex: " + i2 + " > length: " + this.f978b);
        } else if (i <= i2) {
            return new String(this.f977a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException("beginIndex: " + i + " > endIndex: " + i2);
        }
    }

    public void a(int i) {
        if (i > 0) {
            int length = this.f977a.length;
            int i2 = this.f978b;
            if (i > length - i2) {
                c(i2 + i);
            }
        }
    }

    public void a(c cVar, int i, int i2) {
        if (cVar != null) {
            a(cVar.a(), i, i2);
        }
    }

    public void a(d dVar, int i, int i2) {
        if (dVar != null) {
            a(dVar.f977a, i, i2);
        }
    }

    public void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f978b + length;
        if (i > this.f977a.length) {
            c(i);
        }
        str.getChars(0, length, this.f977a, this.f978b);
        this.f978b = i;
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
            } else if (i2 != 0) {
                int i4 = this.f978b;
                int i5 = i2 + i4;
                if (i5 > this.f977a.length) {
                    c(i5);
                }
                while (i4 < i5) {
                    this.f977a[i4] = (char) (bArr[i] & 255);
                    i++;
                    i4++;
                }
                this.f978b = i5;
            }
        }
    }

    public void a(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + cArr.length);
            } else if (i2 != 0) {
                int i4 = this.f978b + i2;
                if (i4 > this.f977a.length) {
                    c(i4);
                }
                System.arraycopy(cArr, i, this.f977a, this.f978b, i2);
                this.f978b = i4;
            }
        }
    }

    public char[] a() {
        return this.f977a;
    }

    public void append(char c2) {
        int i = this.f978b + 1;
        if (i > this.f977a.length) {
            c(i);
        }
        this.f977a[this.f978b] = c2;
        this.f978b = i;
    }

    public int b(int i) {
        return a(i, 0, this.f978b);
    }

    public String b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i);
        } else if (i2 > this.f978b) {
            throw new IndexOutOfBoundsException("endIndex: " + i2 + " > length: " + this.f978b);
        } else if (i <= i2) {
            while (i < i2 && c.a.a.a.n.d.a(this.f977a[i])) {
                i++;
            }
            while (i2 > i && c.a.a.a.n.d.a(this.f977a[i2 - 1])) {
                i2--;
            }
            return new String(this.f977a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException("beginIndex: " + i + " > endIndex: " + i2);
        }
    }

    public boolean b() {
        return this.f978b == 0;
    }

    public char charAt(int i) {
        return this.f977a[i];
    }

    public void clear() {
        this.f978b = 0;
    }

    public int length() {
        return this.f978b;
    }

    public CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i);
        } else if (i2 > this.f978b) {
            throw new IndexOutOfBoundsException("endIndex: " + i2 + " > length: " + this.f978b);
        } else if (i <= i2) {
            return CharBuffer.wrap(this.f977a, i, i2);
        } else {
            throw new IndexOutOfBoundsException("beginIndex: " + i + " > endIndex: " + i2);
        }
    }

    public String toString() {
        return new String(this.f977a, 0, this.f978b);
    }
}
