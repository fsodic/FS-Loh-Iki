package c.a.a.a;

import c.a.a.a.p.a;
import c.a.a.a.p.h;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

public final class o implements Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f972a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f973b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f974c;
    protected final String d;
    protected final InetAddress e;

    public o(String str, int i) {
        this(str, i, (String) null);
    }

    public o(String str, int i, String str2) {
        a.a((CharSequence) str, "Host name");
        this.f972a = str;
        this.f973b = str.toLowerCase(Locale.ROOT);
        this.d = str2 != null ? str2.toLowerCase(Locale.ROOT) : "http";
        this.f974c = i;
        this.e = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(InetAddress inetAddress, int i, String str) {
        this(inetAddress, inetAddress.getHostName(), i, str);
        a.a(inetAddress, "Inet address");
    }

    public o(InetAddress inetAddress, String str, int i, String str2) {
        a.a(inetAddress, "Inet address");
        this.e = inetAddress;
        a.a((Object) str, "Hostname");
        this.f972a = str;
        this.f973b = this.f972a.toLowerCase(Locale.ROOT);
        this.d = str2 != null ? str2.toLowerCase(Locale.ROOT) : "http";
        this.f974c = i;
    }

    public InetAddress c() {
        return this.e;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public String d() {
        return this.f972a;
    }

    public int e() {
        return this.f974c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f973b.equals(oVar.f973b) && this.f974c == oVar.f974c && this.d.equals(oVar.d)) {
            InetAddress inetAddress = this.e;
            if (inetAddress == null) {
                if (oVar.e == null) {
                    return true;
                }
            } else if (inetAddress.equals(oVar.e)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        if (this.f974c == -1) {
            return this.f972a;
        }
        StringBuilder sb = new StringBuilder(this.f972a.length() + 6);
        sb.append(this.f972a);
        sb.append(":");
        sb.append(Integer.toString(this.f974c));
        return sb.toString();
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append("://");
        sb.append(this.f972a);
        if (this.f974c != -1) {
            sb.append(':');
            sb.append(Integer.toString(this.f974c));
        }
        return sb.toString();
    }

    public int hashCode() {
        int a2 = h.a(h.a(h.a(17, this.f973b), this.f974c), this.d);
        InetAddress inetAddress = this.e;
        return inetAddress != null ? h.a(a2, inetAddress) : a2;
    }

    public String toString() {
        return h();
    }
}
