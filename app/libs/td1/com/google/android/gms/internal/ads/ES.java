package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class ES implements BS {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1864a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ES(com.google.android.gms.internal.ads.Zna r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.internal.ads.C1496ioa r7) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ES.<init>(com.google.android.gms.internal.ads.Zna, java.lang.String, int, java.lang.String, com.google.android.gms.internal.ads.ioa):void");
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final boolean equals(Object obj) {
        if (!(obj instanceof ES)) {
            return false;
        }
        return Arrays.equals(this.f1864a, ((ES) obj).f1864a);
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final int hashCode() {
        return Arrays.hashCode(this.f1864a);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.f1864a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
