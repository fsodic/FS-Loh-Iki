package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import org.cocos2dx.lib.BuildConfig;

class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f236a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f237b;

    /* renamed from: c  reason: collision with root package name */
    private final int f238c;
    private final int d;
    private final String e;
    private int f;
    private int g;

    c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR);
    }

    c(Parcel parcel, int i, int i2, String str) {
        this.f236a = new SparseIntArray();
        this.f = -1;
        this.g = 0;
        this.f237b = parcel;
        this.f238c = i;
        this.d = i2;
        this.g = this.f238c;
        this.e = str;
    }

    private int d(int i) {
        int readInt;
        do {
            int i2 = this.g;
            if (i2 >= this.d) {
                return -1;
            }
            this.f237b.setDataPosition(i2);
            int readInt2 = this.f237b.readInt();
            readInt = this.f237b.readInt();
            this.g += readInt2;
        } while (readInt != i);
        return this.f237b.dataPosition();
    }

    @Override // androidx.versionedparcelable.b
    public void a() {
        int i = this.f;
        if (i >= 0) {
            int i2 = this.f236a.get(i);
            int dataPosition = this.f237b.dataPosition();
            this.f237b.setDataPosition(i2);
            this.f237b.writeInt(dataPosition - i2);
            this.f237b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.b
    public void a(Parcelable parcelable) {
        this.f237b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.b
    public void a(String str) {
        this.f237b.writeString(str);
    }

    @Override // androidx.versionedparcelable.b
    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f237b.writeInt(bArr.length);
            this.f237b.writeByteArray(bArr);
            return;
        }
        this.f237b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.b
    public boolean a(int i) {
        int d2 = d(i);
        if (d2 == -1) {
            return false;
        }
        this.f237b.setDataPosition(d2);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.b
    public b b() {
        Parcel parcel = this.f237b;
        int dataPosition = parcel.dataPosition();
        int i = this.g;
        if (i == this.f238c) {
            i = this.d;
        }
        return new c(parcel, dataPosition, i, this.e + "  ");
    }

    @Override // androidx.versionedparcelable.b
    public void b(int i) {
        a();
        this.f = i;
        this.f236a.put(i, this.f237b.dataPosition());
        c(0);
        c(i);
    }

    @Override // androidx.versionedparcelable.b
    public void c(int i) {
        this.f237b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.b
    public byte[] d() {
        int readInt = this.f237b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f237b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.b
    public int e() {
        return this.f237b.readInt();
    }

    @Override // androidx.versionedparcelable.b
    public <T extends Parcelable> T f() {
        return (T) this.f237b.readParcelable(c.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.b
    public String g() {
        return this.f237b.readString();
    }
}
