package com.google.android.gms.internal.ads;

import java.util.Map;

final class OV<K, V> extends EV<K, V> {
    private static final EV<Object, Object> e = new OV(null, new Object[0], 0);
    private final transient Object f;
    private final transient Object[] g;
    private final transient int h;

    private OV(Object obj, Object[] objArr, int i) {
        this.f = obj;
        this.g = objArr;
        this.h = i;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x00df */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.ads.OV<K, V> a(int r10, java.lang.Object[] r11) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OV.a(int, java.lang.Object[]):com.google.android.gms.internal.ads.OV");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.EV
    public final HV<Map.Entry<K, V>> a() {
        return new NV(this, this.g, 0, this.h);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.EV
    public final HV<K> b() {
        return new PV(this, new SV(this.g, 0, this.h));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.EV
    public final AbstractC2634zV<V> c() {
        return new SV(this.g, 1, this.h);
    }

    @Override // com.google.android.gms.internal.ads.EV, java.util.Map
    public final V get(Object obj) {
        Object obj2 = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = C2427wV.a(obj.hashCode());
                while (true) {
                    int i2 = a2 & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    a2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = C2427wV.a(obj.hashCode());
                while (true) {
                    int i4 = a3 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    a3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = C2427wV.a(obj.hashCode());
                while (true) {
                    int i6 = a4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    a4 = i6 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.h;
    }
}
