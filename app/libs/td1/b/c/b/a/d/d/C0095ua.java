package b.c.b.a.d.d;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.ua  reason: case insensitive filesystem */
public final class C0095ua {
    static String a(AbstractC0089ra raVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(raVar, sb, 0);
        return sb.toString();
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0203, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0214, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(b.c.b.a.d.d.AbstractC0089ra r18, java.lang.StringBuilder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 671
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0095ua.a(b.c.b.a.d.d.ra, java.lang.StringBuilder, int):void");
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(Ta.a(AbstractC0071i.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC0071i) {
                sb.append(": \"");
                sb.append(Ta.a((AbstractC0071i) obj));
                sb.append('\"');
            } else if (obj instanceof M) {
                sb.append(" {");
                a((M) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                a(sb, i4, "key", entry2.getKey());
                a(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }
}
