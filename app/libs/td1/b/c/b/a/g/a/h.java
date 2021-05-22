package b.c.b.a.g.a;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.b.a;
import b.c.b.a.d.b.c;
import com.google.android.gms.common.internal.AbstractC0186l;

public final class h extends a implements g {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // b.c.b.a.g.a.g
    public final void a(i iVar, e eVar) {
        Parcel Jb = Jb();
        c.a(Jb, iVar);
        c.a(Jb, eVar);
        a(12, Jb);
    }

    @Override // b.c.b.a.g.a.g
    public final void a(AbstractC0186l lVar, int i, boolean z) {
        Parcel Jb = Jb();
        c.a(Jb, lVar);
        Jb.writeInt(i);
        c.a(Jb, z);
        a(9, Jb);
    }

    @Override // b.c.b.a.g.a.g
    public final void k(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        a(7, Jb);
    }
}
