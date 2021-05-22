package a.e.a;

import a.e.a.C0038a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: a.e.a.c  reason: case insensitive filesystem */
public final class C0040c implements Parcelable {
    public static final Parcelable.Creator<C0040c> CREATOR = new C0039b();

    /* renamed from: a  reason: collision with root package name */
    final int[] f106a;

    /* renamed from: b  reason: collision with root package name */
    final int f107b;

    /* renamed from: c  reason: collision with root package name */
    final int f108c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;

    public C0040c(C0038a aVar) {
        int size = aVar.f101b.size();
        this.f106a = new int[(size * 6)];
        if (aVar.i) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0038a.C0003a aVar2 = aVar.f101b.get(i3);
                int[] iArr = this.f106a;
                int i4 = i2 + 1;
                iArr[i2] = aVar2.f103a;
                int i5 = i4 + 1;
                ComponentCallbacksC0045h hVar = aVar2.f104b;
                iArr[i4] = hVar != null ? hVar.g : -1;
                int[] iArr2 = this.f106a;
                int i6 = i5 + 1;
                iArr2[i5] = aVar2.f105c;
                int i7 = i6 + 1;
                iArr2[i6] = aVar2.d;
                int i8 = i7 + 1;
                iArr2[i7] = aVar2.e;
                i2 = i8 + 1;
                iArr2[i8] = aVar2.f;
            }
            this.f107b = aVar.g;
            this.f108c = aVar.h;
            this.d = aVar.k;
            this.e = aVar.m;
            this.f = aVar.n;
            this.g = aVar.o;
            this.h = aVar.p;
            this.i = aVar.q;
            this.j = aVar.r;
            this.k = aVar.s;
            this.l = aVar.t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0040c(Parcel parcel) {
        this.f106a = parcel.createIntArray();
        this.f107b = parcel.readInt();
        this.f108c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public C0038a a(u uVar) {
        C0038a aVar = new C0038a(uVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f106a.length) {
            C0038a.C0003a aVar2 = new C0038a.C0003a();
            int i4 = i2 + 1;
            aVar2.f103a = this.f106a[i2];
            if (u.f138a) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f106a[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.f106a[i4];
            aVar2.f104b = i6 >= 0 ? uVar.k.get(i6) : null;
            int[] iArr = this.f106a;
            int i7 = i5 + 1;
            aVar2.f105c = iArr[i5];
            int i8 = i7 + 1;
            aVar2.d = iArr[i7];
            int i9 = i8 + 1;
            aVar2.e = iArr[i8];
            aVar2.f = iArr[i9];
            aVar.f102c = aVar2.f105c;
            aVar.d = aVar2.d;
            aVar.e = aVar2.e;
            aVar.f = aVar2.f;
            aVar.a(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.g = this.f107b;
        aVar.h = this.f108c;
        aVar.k = this.d;
        aVar.m = this.e;
        aVar.i = true;
        aVar.n = this.f;
        aVar.o = this.g;
        aVar.p = this.h;
        aVar.q = this.i;
        aVar.r = this.j;
        aVar.s = this.k;
        aVar.t = this.l;
        aVar.a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f106a);
        parcel.writeInt(this.f107b);
        parcel.writeInt(this.f108c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
