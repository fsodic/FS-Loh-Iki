package c.a.a.a.i.f;

import c.a.a.a.j.g;
import java.io.IOException;
import java.io.OutputStream;
import org.cocos2dx.lib.BuildConfig;

public class f extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final g f890a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f891b;

    /* renamed from: c  reason: collision with root package name */
    private int f892c;
    private boolean d;
    private boolean e;

    public f(int i, g gVar) {
        this.f892c = 0;
        this.d = false;
        this.e = false;
        this.f891b = new byte[i];
        this.f890a = gVar;
    }

    @Deprecated
    public f(g gVar) {
        this(2048, gVar);
    }

    public void a() {
        if (!this.d) {
            b();
            c();
            this.d = true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        this.f890a.writeLine(Integer.toHexString(this.f892c + i2));
        this.f890a.write(this.f891b, 0, this.f892c);
        this.f890a.write(bArr, i, i2);
        this.f890a.writeLine(BuildConfig.FLAVOR);
        this.f892c = 0;
    }

    /* access modifiers changed from: protected */
    public void b() {
        int i = this.f892c;
        if (i > 0) {
            this.f890a.writeLine(Integer.toHexString(i));
            this.f890a.write(this.f891b, 0, this.f892c);
            this.f890a.writeLine(BuildConfig.FLAVOR);
            this.f892c = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f890a.writeLine("0");
        this.f890a.writeLine(BuildConfig.FLAVOR);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.e) {
            this.e = true;
            a();
            this.f890a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        b();
        this.f890a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.e) {
            byte[] bArr = this.f891b;
            int i2 = this.f892c;
            bArr[i2] = (byte) i;
            this.f892c = i2 + 1;
            if (this.f892c == bArr.length) {
                b();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.e) {
            byte[] bArr2 = this.f891b;
            int length = bArr2.length;
            int i3 = this.f892c;
            if (i2 >= length - i3) {
                a(bArr, i, i2);
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f892c += i2;
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
