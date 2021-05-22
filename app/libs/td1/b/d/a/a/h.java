package b.d.a.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class h extends f {
    protected final File i;
    protected final boolean j;
    protected final boolean k;
    protected File l;

    public h(File file, boolean z) {
        this(file, z, false);
    }

    public h(File file, boolean z, boolean z2) {
        this(file, z, z2, false);
    }

    public h(File file, boolean z, boolean z2, boolean z3) {
        super(z3);
        u.a(file != null, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
        if (!file.isDirectory() && !file.getParentFile().isDirectory()) {
            u.a(file.getParentFile().mkdirs(), "Cannot create parent directories for requested File location");
        }
        if (file.isDirectory() && !file.mkdirs()) {
            d.f564a.d("FileAsyncHttpRH", "Cannot create directories for requested Directory location, might not be a problem");
        }
        this.i = file;
        this.j = z;
        this.k = z2;
    }

    public abstract void a(int i2, AbstractC0121e[] eVarArr, File file);

    public abstract void a(int i2, AbstractC0121e[] eVarArr, Throwable th, File file);

    @Override // b.d.a.a.f
    public final void a(int i2, AbstractC0121e[] eVarArr, byte[] bArr) {
        a(i2, eVarArr, k());
    }

    /* access modifiers changed from: protected */
    @Override // b.d.a.a.f
    public byte[] a(l lVar) {
        if (lVar == null) {
            return null;
        }
        InputStream content = lVar.getContent();
        long contentLength = lVar.getContentLength();
        FileOutputStream fileOutputStream = new FileOutputStream(k(), this.j);
        if (content == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[4096];
            int i2 = 0;
            while (true) {
                int read = content.read(bArr);
                if (read != -1 && !Thread.currentThread().isInterrupted()) {
                    i2 += read;
                    fileOutputStream.write(bArr, 0, read);
                    b((long) i2, contentLength);
                }
            }
            return null;
        } finally {
            d.a(content);
            fileOutputStream.flush();
            d.a(fileOutputStream);
        }
    }

    @Override // b.d.a.a.f
    public final void b(int i2, AbstractC0121e[] eVarArr, byte[] bArr, Throwable th) {
        a(i2, eVarArr, th, k());
    }

    /* access modifiers changed from: protected */
    public File j() {
        u.a(this.i != null, "Target file is null, fatal!");
        return this.i;
    }

    public File k() {
        if (this.l == null) {
            this.l = j().isDirectory() ? l() : j();
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public File l() {
        StringBuilder sb;
        u.a(j().isDirectory(), "Target file is not a directory, cannot proceed");
        u.a(f() != null, "RequestURI is null, cannot proceed");
        String uri = f().toString();
        String substring = uri.substring(uri.lastIndexOf(47) + 1, uri.length());
        File file = new File(j(), substring);
        if (!file.exists() || !this.k) {
            return file;
        }
        if (!substring.contains(".")) {
            sb = new StringBuilder();
            sb.append(substring);
            sb.append(" (%d)");
        } else {
            sb = new StringBuilder();
            sb.append(substring.substring(0, substring.lastIndexOf(46)));
            sb.append(" (%d)");
            sb.append(substring.substring(substring.lastIndexOf(46), substring.length()));
        }
        String sb2 = sb.toString();
        int i2 = 0;
        while (true) {
            File file2 = new File(j(), String.format(sb2, Integer.valueOf(i2)));
            if (!file2.exists()) {
                return file2;
            }
            i2++;
        }
    }
}
