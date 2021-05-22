package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Hga implements Parcelable {
    public static final Parcelable.Creator<Hga> CREATOR = new Gga();
    private int A;

    /* renamed from: a  reason: collision with root package name */
    private final String f2157a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2158b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2159c;
    private final Yia d;
    private final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final Dha i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    private final int o;
    private final byte[] p;
    private final Oka q;
    public final int r;
    public final int s;
    public final int t;
    private final int u;
    private final int v;
    public final long w;
    public final int x;
    public final String y;
    private final int z;

    Hga(Parcel parcel) {
        this.f2157a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.f2159c = parcel.readString();
        this.f2158b = parcel.readInt();
        this.g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (Oka) parcel.readParcelable(Oka.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (Dha) parcel.readParcelable(Dha.class.getClassLoader());
        this.d = (Yia) parcel.readParcelable(Yia.class.getClassLoader());
    }

    private Hga(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, Oka oka, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, Dha dha, Yia yia) {
        this.f2157a = str;
        this.e = str2;
        this.f = str3;
        this.f2159c = str4;
        this.f2158b = i2;
        this.g = i3;
        this.j = i4;
        this.k = i5;
        this.l = f2;
        this.m = i6;
        this.n = f3;
        this.p = bArr;
        this.o = i7;
        this.q = oka;
        this.r = i8;
        this.s = i9;
        this.t = i10;
        this.u = i11;
        this.v = i12;
        this.x = i13;
        this.y = str5;
        this.z = i14;
        this.w = j2;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = dha;
        this.d = yia;
    }

    public static Hga a(String str, String str2, long j2) {
        return new Hga(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Hga a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, Oka oka, Dha dha) {
        return new Hga(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, oka, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dha, null);
    }

    public static Hga a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, Dha dha, int i7, String str4) {
        return new Hga(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, dha, null);
    }

    public static Hga a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, Dha dha, int i6, String str4) {
        return a(str, str2, null, -1, -1, i4, i5, -1, null, dha, 0, str4);
    }

    public static Hga a(String str, String str2, String str3, int i2, int i3, String str4, int i4, Dha dha, long j2, List<byte[]> list) {
        return new Hga(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, dha, null);
    }

    public static Hga a(String str, String str2, String str3, int i2, int i3, String str4, Dha dha) {
        return a(str, str2, null, -1, i3, str4, -1, dha, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Hga a(String str, String str2, String str3, int i2, Dha dha) {
        return new Hga(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dha, null);
    }

    public static Hga a(String str, String str2, String str3, int i2, List<byte[]> list, String str4, Dha dha) {
        return new Hga(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, dha, null);
    }

    @TargetApi(16)
    private static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public final int J() {
        int i2;
        int i3 = this.j;
        if (i3 == -1 || (i2 = this.k) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat K() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f);
        String str = this.y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.g);
        a(mediaFormat, "width", this.j);
        a(mediaFormat, "height", this.k);
        float f2 = this.l;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        a(mediaFormat, "rotation-degrees", this.m);
        a(mediaFormat, "channel-count", this.r);
        a(mediaFormat, "sample-rate", this.s);
        a(mediaFormat, "encoder-delay", this.u);
        a(mediaFormat, "encoder-padding", this.v);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.h.get(i2)));
        }
        Oka oka = this.q;
        if (oka != null) {
            a(mediaFormat, "color-transfer", oka.f2781c);
            a(mediaFormat, "color-standard", oka.f2779a);
            a(mediaFormat, "color-range", oka.f2780b);
            byte[] bArr = oka.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final Hga a(int i2) {
        return new Hga(this.f2157a, this.e, this.f, this.f2159c, this.f2158b, i2, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, this.i, this.d);
    }

    public final Hga a(int i2, int i3) {
        return new Hga(this.f2157a, this.e, this.f, this.f2159c, this.f2158b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, i2, i3, this.x, this.y, this.z, this.w, this.h, this.i, this.d);
    }

    public final Hga a(long j2) {
        return new Hga(this.f2157a, this.e, this.f, this.f2159c, this.f2158b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, j2, this.h, this.i, this.d);
    }

    public final Hga a(Dha dha) {
        return new Hga(this.f2157a, this.e, this.f, this.f2159c, this.f2158b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, dha, this.d);
    }

    public final Hga a(Yia yia) {
        return new Hga(this.f2157a, this.e, this.f, this.f2159c, this.f2158b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, this.i, yia);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Hga.class == obj.getClass()) {
            Hga hga = (Hga) obj;
            if (this.f2158b == hga.f2158b && this.g == hga.g && this.j == hga.j && this.k == hga.k && this.l == hga.l && this.m == hga.m && this.n == hga.n && this.o == hga.o && this.r == hga.r && this.s == hga.s && this.t == hga.t && this.u == hga.u && this.v == hga.v && this.w == hga.w && this.x == hga.x && Jka.a(this.f2157a, hga.f2157a) && Jka.a(this.y, hga.y) && this.z == hga.z && Jka.a(this.e, hga.e) && Jka.a(this.f, hga.f) && Jka.a(this.f2159c, hga.f2159c) && Jka.a(this.i, hga.i) && Jka.a(this.d, hga.d) && Jka.a(this.q, hga.q) && Arrays.equals(this.p, hga.p) && this.h.size() == hga.h.size()) {
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    if (!Arrays.equals(this.h.get(i2), hga.h.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f2157a;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f2159c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f2158b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            String str5 = this.y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.z) * 31;
            Dha dha = this.i;
            int hashCode6 = (hashCode5 + (dha == null ? 0 : dha.hashCode())) * 31;
            Yia yia = this.d;
            if (yia != null) {
                i2 = yia.hashCode();
            }
            this.A = hashCode6 + i2;
        }
        return this.A;
    }

    public final String toString() {
        String str = this.f2157a;
        String str2 = this.e;
        String str3 = this.f;
        int i2 = this.f2158b;
        String str4 = this.y;
        int i3 = this.j;
        int i4 = this.k;
        float f2 = this.l;
        int i5 = this.r;
        int i6 = this.s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2157a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f2159c);
        parcel.writeInt(this.f2158b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p != null ? 1 : 0);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i2);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.h.get(i3));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
