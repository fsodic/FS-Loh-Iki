package c.a.a.a.f;

import java.util.Date;

public interface c {
    String getDomain();

    Date getExpiryDate();

    String getName();

    String getPath();

    int[] getPorts();

    String getValue();

    int getVersion();

    boolean isExpired(Date date);

    boolean isSecure();
}
