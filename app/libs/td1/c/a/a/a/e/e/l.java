package c.a.a.a.e.e;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;

@Deprecated
public interface l extends HostnameVerifier {
    void verify(String str, SSLSocket sSLSocket);

    void verify(String str, String[] strArr, String[] strArr2);
}
