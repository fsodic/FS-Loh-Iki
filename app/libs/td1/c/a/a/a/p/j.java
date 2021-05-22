package c.a.a.a.p;

import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f979a;

    /* renamed from: b  reason: collision with root package name */
    private final String f980b;

    /* renamed from: c  reason: collision with root package name */
    private final String f981c;
    private final String d;
    private final String e;

    protected j(String str, String str2, String str3, String str4, String str5) {
        a.a((Object) str, "Package identifier");
        this.f979a = str;
        String str6 = "UNAVAILABLE";
        this.f980b = str2 == null ? str6 : str2;
        this.f981c = str3 == null ? str6 : str3;
        this.d = str4 == null ? str6 : str4;
        this.e = str5 != null ? str5 : str6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c.a.a.a.p.j a(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            java.lang.String r0 = "Package identifier"
            c.a.a.a.p.a.a(r4, r0)
            if (r5 == 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L_0x0010:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0046 }
            r1.<init>()     // Catch:{ IOException -> 0x0046 }
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch:{ IOException -> 0x0046 }
            r1.append(r2)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0046 }
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch:{ IOException -> 0x0046 }
            if (r1 == 0) goto L_0x0046
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x0041 }
            r2.<init>()     // Catch:{ all -> 0x0041 }
            r2.load(r1)     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0047
        L_0x0041:
            r2 = move-exception
            r1.close()
            throw r2
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x004d
            c.a.a.a.p.j r0 = a(r4, r2, r5)
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.p.j.a(java.lang.String, java.lang.ClassLoader):c.a.a.a.p.j");
    }

    protected static j a(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        a.a((Object) str, "Package identifier");
        String str5 = null;
        if (map != null) {
            String str6 = (String) map.get("info.module");
            if (str6 != null && str6.length() < 1) {
                str6 = null;
            }
            String str7 = (String) map.get("info.release");
            if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                str7 = null;
            }
            String str8 = (String) map.get("info.timestamp");
            str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
            str4 = str6;
            str3 = str7;
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new j(str, str4, str3, str2, str5);
    }

    public static String a(String str, String str2, Class<?> cls) {
        j a2 = a(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", str, a2 != null ? a2.a() : "UNAVAILABLE", System.getProperty("java.version"));
    }

    public final String a() {
        return this.f981c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f979a.length() + 20 + this.f980b.length() + this.f981c.length() + this.d.length() + this.e.length());
        sb.append("VersionInfo(");
        sb.append(this.f979a);
        sb.append(':');
        sb.append(this.f980b);
        if (!"UNAVAILABLE".equals(this.f981c)) {
            sb.append(':');
            sb.append(this.f981c);
        }
        if (!"UNAVAILABLE".equals(this.d)) {
            sb.append(':');
            sb.append(this.d);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(this.e)) {
            sb.append('@');
            sb.append(this.e);
        }
        return sb.toString();
    }
}
