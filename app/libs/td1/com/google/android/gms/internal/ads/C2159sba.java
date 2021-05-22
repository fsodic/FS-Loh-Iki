package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* renamed from: com.google.android.gms.internal.ads.sba  reason: case insensitive filesystem */
public final class C2159sba {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC2022qba f5523a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f5524b;

    /* renamed from: com.google.android.gms.internal.ads.sba$a */
    static final class a extends AbstractC2022qba {
        a() {
        }

        @Override // com.google.android.gms.internal.ads.AbstractC2022qba
        public final void a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC2022qba
        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2159sba.<clinit>():void");
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        f5523a.a(th, printWriter);
    }

    public static void a(Throwable th, Throwable th2) {
        f5523a.a(th, th2);
    }
}
