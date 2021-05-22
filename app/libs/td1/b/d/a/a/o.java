package b.d.a.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.G;
import c.a.a.a.b.c.l;
import c.a.a.a.t;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class o extends h {
    private long m;
    private boolean n;

    public void a(l lVar) {
        if (this.i.exists() && this.i.canWrite()) {
            this.m = this.i.length();
        }
        if (this.m > 0) {
            this.n = true;
            lVar.setHeader("Range", "bytes=" + this.m + "-");
        }
    }

    @Override // b.d.a.a.s, b.d.a.a.f
    public void a(t tVar) {
        if (!Thread.currentThread().isInterrupted()) {
            G statusLine = tVar.getStatusLine();
            if (statusLine.getStatusCode() == 416) {
                if (!Thread.currentThread().isInterrupted()) {
                    b(statusLine.getStatusCode(), tVar.getAllHeaders(), null);
                }
            } else if (statusLine.getStatusCode() >= 300) {
                if (!Thread.currentThread().isInterrupted()) {
                    a(statusLine.getStatusCode(), tVar.getAllHeaders(), (byte[]) null, new c.a.a.a.b.l(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
                }
            } else if (!Thread.currentThread().isInterrupted()) {
                AbstractC0121e firstHeader = tVar.getFirstHeader("Content-Range");
                if (firstHeader == null) {
                    this.n = false;
                    this.m = 0;
                } else {
                    k kVar = d.f564a;
                    kVar.c("RangeFileAsyncHttpRH", "Content-Range: " + firstHeader.getValue());
                }
                b(statusLine.getStatusCode(), tVar.getAllHeaders(), a(tVar.getEntity()));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // b.d.a.a.f, b.d.a.a.h
    public byte[] a(c.a.a.a.l lVar) {
        int read;
        if (lVar == null) {
            return null;
        }
        InputStream content = lVar.getContent();
        long contentLength = lVar.getContentLength() + this.m;
        FileOutputStream fileOutputStream = new FileOutputStream(k(), this.n);
        if (content == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (this.m < contentLength && (read = content.read(bArr)) != -1 && !Thread.currentThread().isInterrupted()) {
                this.m += (long) read;
                fileOutputStream.write(bArr, 0, read);
                b(this.m, contentLength);
            }
            return null;
        } finally {
            content.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }
}
