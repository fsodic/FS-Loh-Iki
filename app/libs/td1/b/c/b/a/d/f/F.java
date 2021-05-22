package b.c.b.a.d.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class F extends C0106a implements D {
    F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // b.c.b.a.d.f.D
    public final void a(int i, String str, a aVar, a aVar2, a aVar3) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        Jb.writeString(str);
        q.a(Jb, aVar);
        q.a(Jb, aVar2);
        q.a(Jb, aVar3);
        a(33, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(Bundle bundle, long j) {
        Parcel Jb = Jb();
        q.a(Jb, bundle);
        Jb.writeLong(j);
        a(8, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(Bundle bundle, E e, long j) {
        Parcel Jb = Jb();
        q.a(Jb, bundle);
        q.a(Jb, e);
        Jb.writeLong(j);
        a(32, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(a aVar, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeLong(j);
        a(30, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(a aVar, Bundle bundle, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        q.a(Jb, bundle);
        Jb.writeLong(j);
        a(27, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(a aVar, E e, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        q.a(Jb, e);
        Jb.writeLong(j);
        a(31, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(a aVar, H h, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        q.a(Jb, h);
        Jb.writeLong(j);
        a(1, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(a aVar, String str, String str2, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeString(str);
        Jb.writeString(str2);
        Jb.writeLong(j);
        a(15, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(E e) {
        Parcel Jb = Jb();
        q.a(Jb, e);
        a(21, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, long j) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeLong(j);
        a(23, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, E e) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        q.a(Jb, e);
        a(6, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, String str2, Bundle bundle) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        q.a(Jb, bundle);
        a(9, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        q.a(Jb, bundle);
        q.a(Jb, z);
        q.a(Jb, z2);
        Jb.writeLong(j);
        a(2, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, String str2, a aVar, boolean z, long j) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        q.a(Jb, aVar);
        q.a(Jb, z);
        Jb.writeLong(j);
        a(4, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, String str2, E e) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        q.a(Jb, e);
        a(10, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void a(String str, String str2, boolean z, E e) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        q.a(Jb, z);
        q.a(Jb, e);
        a(5, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void b(a aVar, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeLong(j);
        a(26, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void b(E e) {
        Parcel Jb = Jb();
        q.a(Jb, e);
        a(22, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void b(String str, long j) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeLong(j);
        a(24, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void c(a aVar, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeLong(j);
        a(28, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void c(E e) {
        Parcel Jb = Jb();
        q.a(Jb, e);
        a(19, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void d(a aVar, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeLong(j);
        a(25, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void d(E e) {
        Parcel Jb = Jb();
        q.a(Jb, e);
        a(16, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void e(a aVar, long j) {
        Parcel Jb = Jb();
        q.a(Jb, aVar);
        Jb.writeLong(j);
        a(29, Jb);
    }

    @Override // b.c.b.a.d.f.D
    public final void e(E e) {
        Parcel Jb = Jb();
        q.a(Jb, e);
        a(17, Jb);
    }
}
