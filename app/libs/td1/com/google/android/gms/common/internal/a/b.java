package com.google.android.gms.common.internal.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.a.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int a(int i) {
        return i & 65535;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y);
        return createFromParcel;
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + y);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    private static void a(Parcel parcel, int i, int i2) {
        int y = y(parcel, i);
        if (y != i2) {
            String hexString = Integer.toHexString(y);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(y);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }

    public static int b(Parcel parcel) {
        int a2 = a(parcel);
        int y = y(parcel, a2);
        int dataPosition = parcel.dataPosition();
        if (a(a2) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a2));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = y + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static <T> T[] b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y);
        return tArr;
    }

    public static BigDecimal[] b(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + y);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y);
        return new BigInteger(createByteArray);
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArrayList;
    }

    public static BigInteger[] d(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + y);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + y);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y);
        return createByteArray;
    }

    public static double[] h(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + y);
        return createDoubleArray;
    }

    public static float[] i(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + y);
        return createFloatArray;
    }

    public static int[] j(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y);
        return createIntArray;
    }

    public static ArrayList<Integer> k(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + y);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + y);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, y);
        parcel.setDataPosition(dataPosition + y);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + y);
        return parcelArr;
    }

    public static String o(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y);
        return readString;
    }

    public static String[] p(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y);
        return createStringArray;
    }

    public static ArrayList<String> q(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y);
        return createStringArrayList;
    }

    public static void r(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new a(sb.toString(), parcel);
        }
    }

    public static boolean s(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static double t(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float u(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder v(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y);
        return readStrongBinder;
    }

    public static int w(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long x(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static int y(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void z(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i));
    }
}
