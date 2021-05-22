package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Rj  reason: case insensitive filesystem */
public final class C0639Rj {

    /* renamed from: a  reason: collision with root package name */
    long f3032a;

    /* renamed from: b  reason: collision with root package name */
    final String f3033b;

    /* renamed from: c  reason: collision with root package name */
    final String f3034c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<C2252tna> h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0639Rj(java.lang.String r14, com.google.android.gms.internal.ads.C2244tja r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f5644b
            long r3 = r15.f5645c
            long r5 = r15.d
            long r7 = r15.e
            long r9 = r15.f
            java.util.List<com.google.android.gms.internal.ads.tna> r0 = r15.h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.tna r11 = new com.google.android.gms.internal.ads.tna
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0639Rj.<init>(java.lang.String, com.google.android.gms.internal.ads.tja):void");
    }

    private C0639Rj(String str, String str2, long j, long j2, long j3, long j4, List<C2252tna> list) {
        this.f3033b = str;
        this.f3034c = BuildConfig.FLAVOR.equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static C0639Rj a(C2247tl tlVar) {
        if (C0872_i.a((InputStream) tlVar) == 538247942) {
            return new C0639Rj(C0872_i.a(tlVar), C0872_i.a(tlVar), C0872_i.b((InputStream) tlVar), C0872_i.b((InputStream) tlVar), C0872_i.b((InputStream) tlVar), C0872_i.b((InputStream) tlVar), C0872_i.b(tlVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            C0872_i.a(outputStream, 538247942);
            C0872_i.a(outputStream, this.f3033b);
            C0872_i.a(outputStream, this.f3034c == null ? BuildConfig.FLAVOR : this.f3034c);
            C0872_i.a(outputStream, this.d);
            C0872_i.a(outputStream, this.e);
            C0872_i.a(outputStream, this.f);
            C0872_i.a(outputStream, this.g);
            List<C2252tna> list = this.h;
            if (list != null) {
                C0872_i.a(outputStream, list.size());
                for (C2252tna tna : list) {
                    C0872_i.a(outputStream, tna.a());
                    C0872_i.a(outputStream, tna.b());
                }
            } else {
                C0872_i.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            C0558Og.a("%s", e2.toString());
            return false;
        }
    }
}
