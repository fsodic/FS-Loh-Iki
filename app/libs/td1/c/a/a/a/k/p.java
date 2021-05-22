package c.a.a.a.k;

import c.a.a.a.AbstractC0124h;
import c.a.a.a.B;
import c.a.a.a.H;
import c.a.a.a.p.a;
import java.util.NoSuchElementException;

public class p implements H {

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC0124h f941a;

    /* renamed from: b  reason: collision with root package name */
    protected String f942b;

    /* renamed from: c  reason: collision with root package name */
    protected String f943c;
    protected int d = a(-1);

    public p(AbstractC0124h hVar) {
        a.a(hVar, "Header iterator");
        this.f941a = hVar;
    }

    /* access modifiers changed from: protected */
    public int a(int i) {
        int i2;
        String a2;
        int i3 = -1;
        if (i >= 0) {
            i2 = c(i);
        } else if (!this.f941a.hasNext()) {
            return -1;
        } else {
            this.f942b = this.f941a.nextHeader().getValue();
            i2 = 0;
        }
        int d2 = d(i2);
        if (d2 < 0) {
            a2 = null;
        } else {
            i3 = b(d2);
            a2 = a(this.f942b, d2, i3);
        }
        this.f943c = a2;
        return i3;
    }

    /* access modifiers changed from: protected */
    public String a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(char c2) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c2) >= 0;
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        a.a(i, "Search position");
        int length = this.f942b.length();
        do {
            i++;
            if (i >= length) {
                break;
            }
        } while (b(this.f942b.charAt(i)));
        return i;
    }

    /* access modifiers changed from: protected */
    public boolean b(char c2) {
        if (Character.isLetterOrDigit(c2)) {
            return true;
        }
        return !Character.isISOControl(c2) && !a(c2);
    }

    /* access modifiers changed from: protected */
    public int c(int i) {
        a.a(i, "Search position");
        int length = this.f942b.length();
        boolean z = false;
        while (!z && i < length) {
            char charAt = this.f942b.charAt(i);
            if (c(charAt)) {
                z = true;
            } else if (d(charAt)) {
                i++;
            } else if (b(charAt)) {
                throw new B("Tokens without separator (pos " + i + "): " + this.f942b);
            } else {
                throw new B("Invalid character after token (pos " + i + "): " + this.f942b);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public boolean c(char c2) {
        return c2 == ',';
    }

    /* access modifiers changed from: protected */
    public int d(int i) {
        a.a(i, "Search position");
        int i2 = i;
        boolean z = false;
        while (!z) {
            String str = this.f942b;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z && i2 < length) {
                char charAt = this.f942b.charAt(i2);
                if (c(charAt) || d(charAt)) {
                    i2++;
                } else if (b(this.f942b.charAt(i2))) {
                    z = true;
                } else {
                    throw new B("Invalid character before token (pos " + i2 + "): " + this.f942b);
                }
            }
            if (!z) {
                if (this.f941a.hasNext()) {
                    this.f942b = this.f941a.nextHeader().getValue();
                    i2 = 0;
                } else {
                    this.f942b = null;
                }
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public boolean d(char c2) {
        return c2 == '\t' || Character.isSpaceChar(c2);
    }

    @Override // c.a.a.a.H
    public boolean hasNext() {
        return this.f943c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextToken();
    }

    @Override // c.a.a.a.H
    public String nextToken() {
        String str = this.f943c;
        if (str != null) {
            this.d = a(this.d);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
