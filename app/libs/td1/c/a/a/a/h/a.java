package c.a.a.a.h;

public class a {

    /* access modifiers changed from: package-private */
    /* renamed from: c.a.a.a.h.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0022a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f719a;

        /* renamed from: b  reason: collision with root package name */
        public int f720b;

        AbstractC0022a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends AbstractC0022a {

        /* renamed from: c  reason: collision with root package name */
        private static final byte[] f721c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        private final byte[] e;
        int f;
        private int g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        private final byte[] k;

        public b(int i2, byte[] bArr) {
            this.f719a = bArr;
            boolean z = true;
            this.h = (i2 & 1) == 0;
            this.i = (i2 & 2) == 0;
            this.j = (i2 & 4) == 0 ? false : z;
            this.k = (i2 & 8) == 0 ? f721c : d;
            this.e = new byte[2];
            this.f = 0;
            this.g = this.i ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x00e9 A[SYNTHETIC] */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 492
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.h.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!bVar.h) {
            int i6 = i2 % 3;
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 += 2;
                } else if (i6 == 2) {
                    i4 += 3;
                }
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (bVar.i && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!bVar.j) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        bVar.f719a = new byte[i4];
        bVar.a(bArr, i, i2, true);
        return bVar.f719a;
    }
}
