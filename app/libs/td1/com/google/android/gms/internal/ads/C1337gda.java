package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gda  reason: case insensitive filesystem */
public final class C1337gda {
    static String a(AbstractC0993bda bda, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(bda, sb, 0);
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

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0214, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x01f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.ads.AbstractC0993bda r13, java.lang.StringBuilder r14, int r15) {
        /*
        // Method dump skipped, instructions count: 676
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1337gda.a(com.google.android.gms.internal.ads.bda, java.lang.StringBuilder, int):void");
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
                sb.append(Kda.a(Iba.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof Iba) {
                sb.append(": \"");
                sb.append(Kda.a((Iba) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC2092rca) {
                sb.append(" {");
                a((AbstractC2092rca) obj, sb, i + 2);
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
