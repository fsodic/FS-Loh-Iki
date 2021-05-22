package b.d.a.a;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* access modifiers changed from: package-private */
public class m implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f579a;

    m(n nVar) {
        this.f579a = nVar;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
