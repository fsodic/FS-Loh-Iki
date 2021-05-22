package c.a.a.a.e.b;

import c.a.a.a.o;
import java.net.InetAddress;

public interface e {

    public enum a {
        PLAIN,
        LAYERED
    }

    public enum b {
        PLAIN,
        TUNNELLED
    }

    int getHopCount();

    o getHopTarget(int i);

    InetAddress getLocalAddress();

    o getProxyHost();

    o getTargetHost();

    boolean isLayered();

    boolean isSecure();

    boolean isTunnelled();
}
