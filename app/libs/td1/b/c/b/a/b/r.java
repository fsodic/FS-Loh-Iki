package b.c.b.a.b;

import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.J;
import com.google.android.gms.common.internal.K;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public abstract class r extends K {

    /* renamed from: a  reason: collision with root package name */
    private int f312a;

    protected r(byte[] bArr) {
        com.google.android.gms.common.internal.r.a(bArr.length == 25);
        this.f312a = Arrays.hashCode(bArr);
    }

    protected static byte[] E(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] Jb();

    @Override // com.google.android.gms.common.internal.J
    public final int c() {
        return hashCode();
    }

    @Override // com.google.android.gms.common.internal.J
    public final a d() {
        return b.a(Jb());
    }

    public boolean equals(Object obj) {
        a d;
        if (obj != null && (obj instanceof J)) {
            try {
                J j = (J) obj;
                if (j.c() == hashCode() && (d = j.d()) != null) {
                    return Arrays.equals(Jb(), (byte[]) b.Q(d));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f312a;
    }
}
