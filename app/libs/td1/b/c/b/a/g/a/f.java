package b.c.b.a.g.a;

import android.os.Parcel;
import b.c.b.a.d.b.b;
import b.c.b.a.d.b.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class f extends b implements e {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.b.b
    public boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            a((b.c.b.a.b.b) c.a(parcel, b.c.b.a.b.b.CREATOR), (b) c.a(parcel, b.CREATOR));
        } else if (i == 4) {
            a((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            b((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            a((Status) c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            a((k) c.a(parcel, k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
