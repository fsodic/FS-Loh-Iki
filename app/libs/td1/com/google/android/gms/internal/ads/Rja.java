package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class Rja extends Sja {
    private static final int[] f = new int[0];
    private final Xja g;
    private final AtomicReference<Qja> h;

    public Rja() {
        this(null);
    }

    private Rja(Xja xja) {
        this.g = null;
        this.h = new AtomicReference<>(new Qja());
    }

    private static int a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean a(Hga hga, String str) {
        return str != null && TextUtils.equals(str, Jka.b(hga.y));
    }

    private static boolean b(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        if (r10 <= r11) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b2  */
    @Override // com.google.android.gms.internal.ads.Sja
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Yja[] a(com.google.android.gms.internal.ads.Pga[] r37, com.google.android.gms.internal.ads.Lja[] r38, int[][][] r39) {
        /*
        // Method dump skipped, instructions count: 1120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Rja.a(com.google.android.gms.internal.ads.Pga[], com.google.android.gms.internal.ads.Lja[], int[][][]):com.google.android.gms.internal.ads.Yja[]");
    }
}
