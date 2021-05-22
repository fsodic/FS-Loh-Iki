package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
public final class Ta {
    static String a(AbstractC0071i iVar) {
        String str;
        Ua ua = new Ua(iVar);
        StringBuilder sb = new StringBuilder(ua.size());
        for (int i = 0; i < ua.size(); i++) {
            int e = ua.e(i);
            if (e == 34) {
                str = "\\\"";
            } else if (e == 39) {
                str = "\\'";
            } else if (e != 92) {
                switch (e) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e < 32 || e > 126) {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            e = (e & 7) + 48;
                        }
                        sb.append((char) e);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
