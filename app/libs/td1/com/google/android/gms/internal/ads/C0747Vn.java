package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Vn  reason: case insensitive filesystem */
public final class C0747Vn extends AbstractC0565On {
    private static final Set<String> d = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat e = new DecimalFormat("#,###");
    private File f;
    private boolean g;

    public C0747Vn(AbstractC0798Xm xm) {
        super(xm);
        File cacheDir = this.f2788a.getCacheDir();
        if (cacheDir == null) {
            C0745Vl.d("Context.getCacheDir() returned null");
            return;
        }
        this.f = new File(cacheDir, "admobVideoStreams");
        if (!this.f.isDirectory() && !this.f.mkdirs()) {
            String valueOf = String.valueOf(this.f.getAbsolutePath());
            C0745Vl.d(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f = null;
        } else if (!this.f.setReadable(true, false) || !this.f.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.f.getAbsolutePath());
            C0745Vl.d(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f = null;
        }
    }

    private final File a(File file) {
        return new File(this.f, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:276:0x03fe */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:200:0x04d5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x03bd */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ee, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f0, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f6, code lost:
        if (r1 < 400) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f8, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0208, code lost:
        if (r2.length() == 0) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020a, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0210, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023d, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0242, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0246, code lost:
        if (r7 >= 0) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0248, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0252, code lost:
        if (r1.length() == 0) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0254, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0259, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x025f, code lost:
        com.google.android.gms.internal.ads.C0745Vl.d(r0);
        a(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.C0747Vn.d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0270, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0271, code lost:
        r1 = com.google.android.gms.internal.ads.C0747Vn.e.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.C2392voa.e().a(com.google.android.gms.internal.ads.C2474x.p)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0288, code lost:
        if (r7 <= r3) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028a, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.C0745Vl.d(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c3, code lost:
        if (r1.length() == 0) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c5, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ca, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d0, code lost:
        a(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.C0747Vn.d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02de, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02df, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.C0745Vl.a(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.q.j();
        r17 = r16.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0338, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r6 = new com.google.android.gms.internal.ads.C0199Al(((java.lang.Long) com.google.android.gms.internal.ads.C2392voa.e().a(com.google.android.gms.internal.ads.C2474x.s)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.C2392voa.e().a(com.google.android.gms.internal.ads.C2474x.r)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0352, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0356, code lost:
        if (r20 < 0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0358, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x035a, code lost:
        if (r11 <= r3) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x035c, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x036c, code lost:
        if (r1.length() == 0) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x036e, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0374, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0380, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0381, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0384, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0387, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038a, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038c, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0396, code lost:
        if (r2.write(r1) > 0) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0398, code lost:
        r1.clear();
        r24 = ((r16.a() - r17) > (1000 * r13) ? 1 : ((r16.a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a7, code lost:
        if (r24 > 0) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ad, code lost:
        if (r30.g != false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b3, code lost:
        if (r6.a() == false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03bb, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bf, code lost:
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        com.google.android.gms.internal.ads.C0459Kl.f2428a.post(new com.google.android.gms.internal.ads.RunnableC0539Nn(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e7, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ec, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03fe, code lost:
        r6 = r19;
        r1 = r1;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0412, code lost:
        r27 = r4;
        r24 = r10;
        r15 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0421, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0422, code lost:
        r15 = "downloadTimeout";
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0455, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0456, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0459, code lost:
        r2 = r2.toString();
        r1 = r10;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0460, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0468, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x046b, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0472, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0481, code lost:
        if (com.google.android.gms.internal.ads.C0745Vl.a(3) == false) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0483, code lost:
        r1 = com.google.android.gms.internal.ads.C0747Vn.e.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.C0745Vl.a(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04ba, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04bc, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04bd, code lost:
        r15 = r22;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04bf, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c2, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04cb, code lost:
        if (r0.isFile() == false) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04cd, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ef, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04f7, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fe, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0507, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0511, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051c, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x051d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0520, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0523, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0526, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0529, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052f, code lost:
        com.google.android.gms.ads.internal.q.g().a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x053f, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r31);
        r3.append("\"");
        com.google.android.gms.internal.ads.C0745Vl.c(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0563, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r31);
        r4.append("\"");
        com.google.android.gms.internal.ads.C0745Vl.c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a2, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a7, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.q.o();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.C2392voa.e().a(com.google.android.gms.internal.ads.C2474x.t)).intValue();
        r3 = new java.net.URL(r31);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014c, code lost:
        if (r2 > 20) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014e, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.C0563Ol();
        r6.a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0173, code lost:
        if ((r7 / 100) != 3) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (r4 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0186, code lost:
        if (r3 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        if (r3.equals("http") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0196, code lost:
        if (r3.equals("https") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a4, code lost:
        if (r2.length() == 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a6, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ab, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b4, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b5, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bf, code lost:
        if (r4.length() == 0) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c1, code lost:
        r3 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c6, code lost:
        r3 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cc, code lost:
        com.google.android.gms.internal.ads.C0745Vl.a(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e4, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e9, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04ba A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v7 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v15 java.lang.String), (r22v15 java.lang.String) binds: [B:200:0x04d5, B:201:?, B:163:0x03bd, B:166:0x03dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v3 ??) = (r24v0 ??), (r24v0 ??), (r24v4 ??), (r24v10 ??) binds: [B:200:0x04d5, B:201:?, B:163:0x03bd, B:166:0x03dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v9 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v13 java.io.FileOutputStream), (r27v17 java.io.FileOutputStream) binds: [B:200:0x04d5, B:201:?, B:163:0x03bd, B:166:0x03dd] A[DONT_GENERATE, DONT_INLINE], Splitter:B:166:0x03dd] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05a7  */
    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 1474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0747Vn.a(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void b() {
        this.g = true;
    }
}
