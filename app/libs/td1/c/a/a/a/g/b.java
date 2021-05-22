package c.a.a.a.g;

import c.a.a.a.i.f.i;
import c.a.a.a.p.a;
import java.io.InputStream;
import java.io.OutputStream;

public class b extends a {
    private InputStream d;
    private long e = -1;

    public void a(long j) {
        this.e = j;
    }

    public void a(InputStream inputStream) {
        this.d = inputStream;
    }

    @Override // c.a.a.a.l
    public InputStream getContent() {
        c.a.a.a.p.b.a(this.d != null, "Content has not been provided");
        return this.d;
    }

    @Override // c.a.a.a.l
    public long getContentLength() {
        return this.e;
    }

    @Override // c.a.a.a.l
    public boolean isRepeatable() {
        return false;
    }

    @Override // c.a.a.a.l
    public boolean isStreaming() {
        InputStream inputStream = this.d;
        return (inputStream == null || inputStream == i.f899a) ? false : true;
    }

    @Override // c.a.a.a.l
    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            content.close();
        }
    }
}
