package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class Dha implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<Dha> CREATOR = new Fha();

    /* renamed from: a  reason: collision with root package name */
    private final a[] f1797a;

    /* renamed from: b  reason: collision with root package name */
    private int f1798b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1799c;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Hha();

        /* renamed from: a  reason: collision with root package name */
        private int f1800a;

        /* renamed from: b  reason: collision with root package name */
        private final UUID f1801b;

        /* renamed from: c  reason: collision with root package name */
        private final String f1802c;
        private final byte[] d;
        public final boolean e;

        a(Parcel parcel) {
            this.f1801b = new UUID(parcel.readLong(), parcel.readLong());
            this.f1802c = parcel.readString();
            this.d = parcel.createByteArray();
            this.e = parcel.readByte() != 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        private a(UUID uuid, String str, byte[] bArr, boolean z) {
            C2453wka.a(uuid);
            this.f1801b = uuid;
            C2453wka.a((Object) str);
            this.f1802c = str;
            C2453wka.a(bArr);
            this.d = bArr;
            this.e = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return this.f1802c.equals(aVar.f1802c) && Jka.a(this.f1801b, aVar.f1801b) && Arrays.equals(this.d, aVar.d);
        }

        public final int hashCode() {
            if (this.f1800a == 0) {
                this.f1800a = (((this.f1801b.hashCode() * 31) + this.f1802c.hashCode()) * 31) + Arrays.hashCode(this.d);
            }
            return this.f1800a;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f1801b.getMostSignificantBits());
            parcel.writeLong(this.f1801b.getLeastSignificantBits());
            parcel.writeString(this.f1802c);
            parcel.writeByteArray(this.d);
            parcel.writeByte(this.e ? (byte) 1 : 0);
        }
    }

    Dha(Parcel parcel) {
        this.f1797a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f1799c = this.f1797a.length;
    }

    public Dha(List<a> list) {
        this(false, (a[]) list.toArray(new a[list.size()]));
    }

    private Dha(boolean z, a... aVarArr) {
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        for (int i = 1; i < aVarArr.length; i++) {
            if (aVarArr[i - 1].f1801b.equals(aVarArr[i].f1801b)) {
                String valueOf = String.valueOf(aVarArr[i].f1801b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f1797a = aVarArr;
        this.f1799c = aVarArr.length;
    }

    public Dha(a... aVarArr) {
        this(true, aVarArr);
    }

    public final a a(int i) {
        return this.f1797a[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        return C2238tga.f5634b.equals(aVar3.f1801b) ? C2238tga.f5634b.equals(aVar4.f1801b) ? 0 : 1 : aVar3.f1801b.compareTo(aVar4.f1801b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dha.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1797a, ((Dha) obj).f1797a);
    }

    public final int hashCode() {
        if (this.f1798b == 0) {
            this.f1798b = Arrays.hashCode(this.f1797a);
        }
        return this.f1798b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1797a, 0);
    }
}
