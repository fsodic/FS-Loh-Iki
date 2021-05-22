package c.a.a.a.e.e;

import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

@Deprecated
public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f687a;

    /* renamed from: b  reason: collision with root package name */
    private Set<KeyManager> f688b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private Set<TrustManager> f689c = new LinkedHashSet();
    private SecureRandom d;

    /* access modifiers changed from: package-private */
    public static class a implements X509TrustManager {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f690a;

        /* renamed from: b  reason: collision with root package name */
        private final k f691b;

        a(X509TrustManager x509TrustManager, k kVar) {
            this.f690a = x509TrustManager;
            this.f691b = kVar;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f690a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (!this.f691b.a(x509CertificateArr, str)) {
                this.f690a.checkServerTrusted(x509CertificateArr, str);
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.f690a.getAcceptedIssuers();
        }
    }

    public f a(KeyStore keyStore) {
        a(keyStore, null);
        return this;
    }

    public f a(KeyStore keyStore, k kVar) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            if (kVar != null) {
                for (int i = 0; i < trustManagers.length; i++) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i] = new a((X509TrustManager) trustManager, kVar);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.f689c.add(trustManager2);
            }
        }
        return this;
    }

    public SSLContext a() {
        KeyManager[] keyManagerArr;
        String str = this.f687a;
        if (str == null) {
            str = "TLS";
        }
        SSLContext instance = SSLContext.getInstance(str);
        TrustManager[] trustManagerArr = null;
        if (!this.f688b.isEmpty()) {
            Set<KeyManager> set = this.f688b;
            keyManagerArr = (KeyManager[]) set.toArray(new KeyManager[set.size()]);
        } else {
            keyManagerArr = null;
        }
        if (!this.f689c.isEmpty()) {
            Set<TrustManager> set2 = this.f689c;
            trustManagerArr = (TrustManager[]) set2.toArray(new TrustManager[set2.size()]);
        }
        instance.init(keyManagerArr, trustManagerArr, this.d);
        return instance;
    }
}
