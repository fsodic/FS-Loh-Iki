package c.a.a.a.e.e;

import javax.security.auth.x500.X500Principal;
import org.cocos2dx.lib.BuildConfig;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f684a;

    /* renamed from: b  reason: collision with root package name */
    private final int f685b = this.f684a.length();

    /* renamed from: c  reason: collision with root package name */
    private int f686c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public e(X500Principal x500Principal) {
        this.f684a = x500Principal.getName("RFC2253");
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f685b) {
            char c2 = this.g[i];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f684a);
            } else {
                i2 = c2 - '7';
            }
            char c3 = this.g[i4];
            if (c3 >= '0' && c3 <= '9') {
                i3 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i3 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f684a);
            } else {
                i3 = c3 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f684a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r1 = r8.g;
        r2 = r8.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.e.e.e.a():java.lang.String");
    }

    private char b() {
        this.f686c++;
        int i = this.f686c;
        if (i != this.f685b) {
            char c2 = this.g[i];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return c();
                        }
                }
            }
            return this.g[this.f686c];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
    }

    private char c() {
        int i;
        int i2;
        int a2 = a(this.f686c);
        this.f686c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f686c++;
            int i4 = this.f686c;
            if (i4 == this.f685b || this.g[i4] != '\\') {
                return '?';
            }
            this.f686c = i4 + 1;
            int a3 = a(this.f686c);
            this.f686c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    private String d() {
        int i = this.f686c;
        if (i + 4 < this.f685b) {
            this.d = i;
            while (true) {
                this.f686c = i + 1;
                int i2 = this.f686c;
                if (i2 == this.f685b) {
                    break;
                }
                char[] cArr = this.g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.e = i2;
                    do {
                        this.f686c = i2 + 1;
                        i2 = this.f686c;
                        if (i2 >= this.f685b) {
                            break;
                        }
                    } while (this.g[i2] == ' ');
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    i = this.f686c;
                }
            }
            this.e = this.f686c;
            int i3 = this.e;
            int i4 = this.d;
            int i5 = i3 - i4;
            if (i5 < 5 || (i5 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
            }
            byte[] bArr = new byte[(i5 / 2)];
            int i6 = i4 + 1;
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) a(i6);
                i6 += 2;
            }
            return new String(this.g, this.d, i5);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
    }

    private String e() {
        char[] cArr;
        while (true) {
            int i = this.f686c;
            if (i >= this.f685b || this.g[i] != ' ') {
                int i2 = this.f686c;
            } else {
                this.f686c = i + 1;
            }
        }
        int i22 = this.f686c;
        if (i22 == this.f685b) {
            return null;
        }
        this.d = i22;
        do {
            this.f686c = i22 + 1;
            i22 = this.f686c;
            if (i22 >= this.f685b) {
                break;
            }
            cArr = this.g;
            if (cArr[i22] == '=') {
                break;
            }
        } while (cArr[i22] != ' ');
        int i3 = this.f686c;
        if (i3 < this.f685b) {
            this.e = i3;
            if (this.g[i3] == ' ') {
                while (true) {
                    int i4 = this.f686c;
                    if (i4 >= this.f685b) {
                        break;
                    }
                    char[] cArr2 = this.g;
                    if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                        break;
                    }
                    this.f686c = i4 + 1;
                }
                char[] cArr3 = this.g;
                int i5 = this.f686c;
                if (cArr3[i5] != '=' || i5 == this.f685b) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
                }
            }
            int i6 = this.f686c;
            do {
                this.f686c = i6 + 1;
                i6 = this.f686c;
                if (i6 >= this.f685b) {
                    break;
                }
            } while (this.g[i6] == ' ');
            int i7 = this.e;
            int i8 = this.d;
            if (i7 - i8 > 4) {
                char[] cArr4 = this.g;
                if (cArr4[i8 + 3] == '.' && (cArr4[i8] == 'O' || cArr4[i8] == 'o')) {
                    char[] cArr5 = this.g;
                    int i9 = this.d;
                    if (cArr5[i9 + 1] == 'I' || cArr5[i9 + 1] == 'i') {
                        char[] cArr6 = this.g;
                        int i10 = this.d;
                        if (cArr6[i10 + 2] == 'D' || cArr6[i10 + 2] == 'd') {
                            this.d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.g;
            int i11 = this.d;
            return new String(cArr7, i11, this.e - i11);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
    }

    private String f() {
        this.f686c++;
        this.d = this.f686c;
        int i = this.d;
        while (true) {
            this.e = i;
            int i2 = this.f686c;
            if (i2 != this.f685b) {
                char[] cArr = this.g;
                if (cArr[i2] == '\"') {
                    do {
                        this.f686c = i2 + 1;
                        i2 = this.f686c;
                        if (i2 >= this.f685b) {
                            break;
                        }
                    } while (this.g[i2] == ' ');
                    char[] cArr2 = this.g;
                    int i3 = this.d;
                    return new String(cArr2, i3, this.e - i3);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.e] = b();
                } else {
                    cArr[this.e] = cArr[i2];
                }
                this.f686c++;
                i = this.e + 1;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f684a);
            }
        }
    }

    public String a(String str) {
        this.f686c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f684a.toCharArray();
        String e2 = e();
        if (e2 == null) {
            return null;
        }
        do {
            int i = this.f686c;
            if (i == this.f685b) {
                return null;
            }
            char c2 = this.g[i];
            String a2 = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? BuildConfig.FLAVOR : a() : d() : f();
            if (str.equalsIgnoreCase(e2)) {
                return a2;
            }
            int i2 = this.f686c;
            if (i2 >= this.f685b) {
                return null;
            }
            char[] cArr = this.g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f686c++;
                e2 = e();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f684a);
            }
        } while (e2 != null);
        throw new IllegalStateException("Malformed DN: " + this.f684a);
    }
}
