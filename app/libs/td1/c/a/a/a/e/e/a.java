package c.a.a.a.e.e;

import c.a.a.a.h.b;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
public abstract class a implements l {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f680a = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};

    /* renamed from: b  reason: collision with root package name */
    public b f681b = new b(getClass());

    static {
        Arrays.sort(f680a);
    }

    public static int a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    private static boolean a(String str, String str2, boolean z) {
        boolean z2;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        String[] split = lowerCase2.split("\\.");
        if (!(split.length >= 3 && split[0].endsWith("*") && (!z || a(split)))) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = split[0];
        if (str3.length() > 1) {
            String substring = str3.substring(0, str3.length() - 1);
            z2 = lowerCase.startsWith(substring) && lowerCase.substring(substring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            z2 = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (z2) {
            return !z || a(lowerCase) == a(lowerCase2);
        }
        return false;
    }

    private static boolean a(String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && Arrays.binarySearch(f680a, strArr[1]) >= 0) ? false : true;
    }

    public final void a(String str, X509Certificate x509Certificate) {
        List<String> a2 = d.a(x509Certificate, (c.a.a.a.e.f.a.a(str) || c.a.a.a.e.f.a.b(str)) ? 7 : 2);
        String a3 = new e(x509Certificate.getSubjectX500Principal()).a("cn");
        String[] strArr = null;
        String[] strArr2 = a3 != null ? new String[]{a3} : null;
        if (a2 != null && !a2.isEmpty()) {
            strArr = (String[]) a2.toArray(new String[a2.size()]);
        }
        verify(str, strArr2, strArr);
    }

    public final void a(String str, String[] strArr, String[] strArr2, boolean z) {
        List<String> list = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            list = Arrays.asList(strArr2);
        }
        String a2 = c.a.a.a.e.f.a.b(str) ? d.a(str.toLowerCase(Locale.ROOT)) : str;
        if (list != null) {
            for (String str3 : list) {
                if (c.a.a.a.e.f.a.b(str3)) {
                    str3 = d.a(str3);
                }
                if (a(a2, str3, z)) {
                    return;
                }
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match any " + "of the subject alternative names: " + list);
        } else if (str2 != null) {
            if (!a(a2, c.a.a.a.e.f.a.b(str2) ? d.a(str2) : str2, z)) {
                throw new SSLException("Certificate for <" + str + "> doesn't match " + "common name of the certificate subject: " + str2);
            }
        } else {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain " + "a common name and does not have alternative names");
        }
    }

    @Override // c.a.a.a.e.e.l
    public final void verify(String str, SSLSocket sSLSocket) {
        c.a.a.a.p.a.a((Object) str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        a(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.f681b.a()) {
                this.f681b.a(e.getMessage(), e);
            }
            return false;
        }
    }
}
