package a.e.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.u;

/* access modifiers changed from: package-private */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    final String f164a;

    /* renamed from: b  reason: collision with root package name */
    final int f165b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f166c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    ComponentCallbacksC0045h l;

    z(ComponentCallbacksC0045h hVar) {
        this.f164a = hVar.getClass().getName();
        this.f165b = hVar.g;
        this.f166c = hVar.o;
        this.d = hVar.z;
        this.e = hVar.A;
        this.f = hVar.B;
        this.g = hVar.E;
        this.h = hVar.D;
        this.i = hVar.i;
        this.j = hVar.C;
    }

    z(Parcel parcel) {
        this.f164a = parcel.readString();
        this.f165b = parcel.readInt();
        boolean z = true;
        this.f166c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readInt() == 0 ? false : z;
        this.k = parcel.readBundle();
    }

    public ComponentCallbacksC0045h a(AbstractC0050m mVar, AbstractC0048k kVar, ComponentCallbacksC0045h hVar, v vVar, u uVar) {
        if (this.l == null) {
            Context c2 = mVar.c();
            Bundle bundle = this.i;
            if (bundle != null) {
                bundle.setClassLoader(c2.getClassLoader());
            }
            this.l = kVar != null ? kVar.a(c2, this.f164a, this.i) : ComponentCallbacksC0045h.a(c2, this.f164a, this.i);
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(c2.getClassLoader());
                this.l.d = this.k;
            }
            this.l.a(this.f165b, hVar);
            ComponentCallbacksC0045h hVar2 = this.l;
            hVar2.o = this.f166c;
            hVar2.q = true;
            hVar2.z = this.d;
            hVar2.A = this.e;
            hVar2.B = this.f;
            hVar2.E = this.g;
            hVar2.D = this.h;
            hVar2.C = this.j;
            hVar2.t = mVar.e;
            if (u.f138a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.l);
            }
        }
        ComponentCallbacksC0045h hVar3 = this.l;
        hVar3.w = vVar;
        hVar3.x = uVar;
        return hVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f164a);
        parcel.writeInt(this.f165b);
        parcel.writeInt(this.f166c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
    }
}
