package c.a.a.a;

import java.io.Closeable;

public interface j extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int i);

    void shutdown();
}
