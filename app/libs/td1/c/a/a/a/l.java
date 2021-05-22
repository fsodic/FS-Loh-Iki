package c.a.a.a;

import java.io.InputStream;
import java.io.OutputStream;

public interface l {
    @Deprecated
    void consumeContent();

    InputStream getContent();

    AbstractC0121e getContentEncoding();

    long getContentLength();

    AbstractC0121e getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(OutputStream outputStream);
}
