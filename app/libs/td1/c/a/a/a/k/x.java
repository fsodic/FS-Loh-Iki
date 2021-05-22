package c.a.a.a.k;

import c.a.a.a.p.d;
import java.util.BitSet;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f952a = new x();

    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public static boolean a(char c2) {
        return c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n';
    }

    public String a(d dVar, w wVar, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0:
        while (true) {
            boolean z = false;
            while (!wVar.a()) {
                char charAt = dVar.charAt(wVar.b());
                if (bitSet != null && bitSet.get(charAt)) {
                    break loop0;
                } else if (a(charAt)) {
                    a(dVar, wVar);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    a(dVar, wVar, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void a(d dVar, w wVar) {
        int b2 = wVar.b();
        int b3 = wVar.b();
        int c2 = wVar.c();
        while (b3 < c2 && a(dVar.charAt(b3))) {
            b2++;
            b3++;
        }
        wVar.a(b2);
    }

    public void a(d dVar, w wVar, StringBuilder sb) {
        if (!wVar.a()) {
            int b2 = wVar.b();
            int b3 = wVar.b();
            int c2 = wVar.c();
            if (dVar.charAt(b2) == '\"') {
                int i = b3 + 1;
                int i2 = b2 + 1;
                boolean z = false;
                while (true) {
                    if (i >= c2) {
                        break;
                    }
                    char charAt = dVar.charAt(i);
                    if (z) {
                        if (!(charAt == '\"' || charAt == '\\')) {
                            sb.append('\\');
                        }
                        sb.append(charAt);
                        z = false;
                    } else if (charAt == '\"') {
                        i2++;
                        break;
                    } else if (charAt == '\\') {
                        z = true;
                    } else if (!(charAt == '\r' || charAt == '\n')) {
                        sb.append(charAt);
                    }
                    i++;
                    i2++;
                }
                wVar.a(i2);
            }
        }
    }

    public void a(d dVar, w wVar, BitSet bitSet, StringBuilder sb) {
        int b2 = wVar.b();
        int c2 = wVar.c();
        for (int b3 = wVar.b(); b3 < c2; b3++) {
            char charAt = dVar.charAt(b3);
            if ((bitSet != null && bitSet.get(charAt)) || a(charAt)) {
                break;
            }
            b2++;
            sb.append(charAt);
        }
        wVar.a(b2);
    }

    public String b(d dVar, w wVar, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0:
        while (true) {
            boolean z = false;
            while (!wVar.a()) {
                char charAt = dVar.charAt(wVar.b());
                if (bitSet != null && bitSet.get(charAt)) {
                    break loop0;
                } else if (a(charAt)) {
                    a(dVar, wVar);
                    z = true;
                } else if (charAt == '\"') {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    a(dVar, wVar, sb);
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    b(dVar, wVar, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void b(d dVar, w wVar, BitSet bitSet, StringBuilder sb) {
        int b2 = wVar.b();
        int c2 = wVar.c();
        for (int b3 = wVar.b(); b3 < c2; b3++) {
            char charAt = dVar.charAt(b3);
            if ((bitSet != null && bitSet.get(charAt)) || a(charAt) || charAt == '\"') {
                break;
            }
            b2++;
            sb.append(charAt);
        }
        wVar.a(b2);
    }
}
