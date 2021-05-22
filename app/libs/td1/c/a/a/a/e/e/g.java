package c.a.a.a.e.e;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

@Deprecated
public class g {
    public static SSLContext a() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, null, null);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new h(e.getMessage(), e);
        } catch (KeyManagementException e2) {
            throw new h(e2.getMessage(), e2);
        }
    }

    public static f b() {
        return new f();
    }
}
