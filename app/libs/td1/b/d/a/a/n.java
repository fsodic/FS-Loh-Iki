package b.d.a.a;

import c.a.a.a.e.e.i;
import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class n extends i {
    final SSLContext i = SSLContext.getInstance("TLS");

    public n(KeyStore keyStore) {
        super(keyStore);
        m mVar = new m(this);
        this.i.init(null, new TrustManager[]{mVar}, null);
    }

    public static i b() {
        try {
            n nVar = new n(c());
            nVar.a(i.f692a);
            return nVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return i.a();
        }
    }

    public static KeyStore c() {
        Throwable th;
        KeyStore keyStore = null;
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                instance.load(null, null);
                return instance;
            } catch (Throwable th2) {
                th = th2;
                keyStore = instance;
                th.printStackTrace();
                return keyStore;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return keyStore;
        }
    }

    @Override // c.a.a.a.e.c.l, c.a.a.a.e.e.i
    public Socket createSocket() {
        return this.i.getSocketFactory().createSocket();
    }

    @Override // c.a.a.a.e.e.i, c.a.a.a.e.c.c
    public Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return this.i.getSocketFactory().createSocket(socket, str, i2, z);
    }
}
