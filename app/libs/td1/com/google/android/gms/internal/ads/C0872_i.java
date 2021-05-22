package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads._i  reason: case insensitive filesystem */
public final class C0872_i implements Sha {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C0639Rj> f3740a;

    /* renamed from: b  reason: collision with root package name */
    private long f3741b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0666Sk f3742c;
    private final int d;

    public C0872_i(AbstractC0666Sk sk) {
        this(sk, 5242880);
    }

    private C0872_i(AbstractC0666Sk sk, int i) {
        this.f3740a = new LinkedHashMap(16, 0.75f, true);
        this.f3741b = 0;
        this.f3742c = sk;
        this.d = 5242880;
    }

    public C0872_i(File file, int i) {
        this.f3740a = new LinkedHashMap(16, 0.75f, true);
        this.f3741b = 0;
        this.f3742c = new C2107rk(this, file);
        this.d = 20971520;
    }

    static int a(InputStream inputStream) {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(C2247tl tlVar) {
        return new String(a(tlVar, b((InputStream) tlVar)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void a(String str, C0639Rj rj) {
        if (!this.f3740a.containsKey(str)) {
            this.f3741b += rj.f3032a;
        } else {
            this.f3741b += rj.f3032a - this.f3740a.get(str).f3032a;
        }
        this.f3740a.put(str, rj);
    }

    private static byte[] a(C2247tl tlVar, long j) {
        long a2 = tlVar.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(tlVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    static long b(InputStream inputStream) {
        return (((long) c(inputStream)) & 255) | 0 | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    static List<C2252tna> b(C2247tl tlVar) {
        int a2 = a((InputStream) tlVar);
        if (a2 >= 0) {
            List<C2252tna> emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < a2; i++) {
                emptyList.add(new C2252tna(a(tlVar).intern(), a(tlVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    private final synchronized void b(String str) {
        boolean delete = e(str).delete();
        c(str);
        if (!delete) {
            C0558Og.a("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    private static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void c(String str) {
        C0639Rj remove = this.f3740a.remove(str);
        if (remove != null) {
            this.f3741b -= remove.f3032a;
        }
    }

    private static String d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File e(String str) {
        return new File(this.f3742c.e(), d(str));
    }

    @Override // com.google.android.gms.internal.ads.Sha
    public final synchronized void H() {
        File e = this.f3742c.e();
        if (!e.exists()) {
            if (!e.mkdirs()) {
                C0558Og.b("Unable to create cache dir %s", e.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = e.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    C2247tl tlVar = new C2247tl(new BufferedInputStream(a(file)), length);
                    try {
                        C0639Rj a2 = C0639Rj.a(tlVar);
                        a2.f3032a = length;
                        a(a2.f3033b, a2);
                    } finally {
                        tlVar.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Sha
    public final synchronized C2244tja a(String str) {
        C0639Rj rj = this.f3740a.get(str);
        if (rj == null) {
            return null;
        }
        File e = e(str);
        try {
            C2247tl tlVar = new C2247tl(new BufferedInputStream(a(e)), e.length());
            try {
                C0639Rj a2 = C0639Rj.a(tlVar);
                if (!TextUtils.equals(str, a2.f3033b)) {
                    C0558Og.a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a2.f3033b);
                    c(str);
                    return null;
                }
                byte[] a3 = a(tlVar, tlVar.a());
                C2244tja tja = new C2244tja();
                tja.f5643a = a3;
                tja.f5644b = rj.f3034c;
                tja.f5645c = rj.d;
                tja.d = rj.e;
                tja.e = rj.f;
                tja.f = rj.g;
                List<C2252tna> list = rj.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C2252tna tna : list) {
                    treeMap.put(tna.a(), tna.b());
                }
                tja.g = treeMap;
                tja.h = Collections.unmodifiableList(rj.h);
                tlVar.close();
                return tja;
            } finally {
                tlVar.close();
            }
        } catch (IOException e2) {
            C0558Og.a("%s: %s", e.getAbsolutePath(), e2.toString());
            b(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Sha
    public final synchronized void a(String str, C2244tja tja) {
        long j;
        if (this.f3741b + ((long) tja.f5643a.length) > ((long) this.d)) {
            if (((float) tja.f5643a.length) > ((float) this.d) * 0.9f) {
                return;
            }
        }
        File e = e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
            C0639Rj rj = new C0639Rj(str, tja);
            if (rj.a(bufferedOutputStream)) {
                bufferedOutputStream.write(tja.f5643a);
                bufferedOutputStream.close();
                rj.f3032a = e.length();
                a(str, rj);
                if (this.f3741b >= ((long) this.d)) {
                    if (C0558Og.f2767b) {
                        C0558Og.c("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.f3741b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, C0639Rj>> it = this.f3740a.entrySet().iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j = j2;
                            break;
                        }
                        C0639Rj value = it.next().getValue();
                        if (e(value.f3033b).delete()) {
                            j = j2;
                            this.f3741b -= value.f3032a;
                        } else {
                            j = j2;
                            C0558Og.a("Could not delete cache entry for key=%s, filename=%s", value.f3033b, d(value.f3033b));
                        }
                        it.remove();
                        i++;
                        if (((float) this.f3741b) < ((float) this.d) * 0.9f) {
                            break;
                        }
                        j2 = j;
                    }
                    if (C0558Og.f2767b) {
                        C0558Og.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f3741b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
                return;
            }
            bufferedOutputStream.close();
            C0558Og.a("Failed to write header for %s", e.getAbsolutePath());
            throw new IOException();
        } catch (IOException unused) {
            if (!e.delete()) {
                C0558Og.a("Could not clean up file %s", e.getAbsolutePath());
            }
        }
    }
}
