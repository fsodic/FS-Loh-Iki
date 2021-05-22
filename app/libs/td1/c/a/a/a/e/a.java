package c.a.a.a.e;

import c.a.a.a.g.f;
import c.a.a.a.l;
import c.a.a.a.p.g;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

@Deprecated
public class a extends f implements i, l {

    /* renamed from: b  reason: collision with root package name */
    protected o f653b;

    /* renamed from: c  reason: collision with root package name */
    protected final boolean f654c;

    public a(l lVar, o oVar, boolean z) {
        super(lVar);
        c.a.a.a.p.a.a(oVar, "Connection");
        this.f653b = oVar;
        this.f654c = z;
    }

    private void b() {
        o oVar = this.f653b;
        if (oVar != null) {
            try {
                if (this.f654c) {
                    g.a(this.f718a);
                    this.f653b.markReusable();
                } else {
                    oVar.unmarkReusable();
                }
            } finally {
                a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        o oVar = this.f653b;
        if (oVar != null) {
            try {
                oVar.releaseConnection();
            } finally {
                this.f653b = null;
            }
        }
    }

    @Override // c.a.a.a.e.i
    public void abortConnection() {
        o oVar = this.f653b;
        if (oVar != null) {
            try {
                oVar.abortConnection();
            } finally {
                this.f653b = null;
            }
        }
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    @Deprecated
    public void consumeContent() {
        b();
    }

    /* JADX INFO: finally extract failed */
    @Override // c.a.a.a.e.l
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (this.f653b != null) {
                if (this.f654c) {
                    inputStream.close();
                    this.f653b.markReusable();
                } else {
                    this.f653b.unmarkReusable();
                }
            }
            a();
            return false;
        } catch (Throwable th) {
            a();
            throw th;
        }
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public InputStream getContent() {
        return new k(this.f718a.getContent(), this);
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public boolean isRepeatable() {
        return false;
    }

    @Override // c.a.a.a.e.l
    public boolean streamAbort(InputStream inputStream) {
        o oVar = this.f653b;
        if (oVar == null) {
            return false;
        }
        oVar.abortConnection();
        return false;
    }

    /* JADX INFO: finally extract failed */
    @Override // c.a.a.a.e.l
    public boolean streamClosed(InputStream inputStream) {
        try {
            if (this.f653b != null) {
                if (this.f654c) {
                    boolean isOpen = this.f653b.isOpen();
                    try {
                        inputStream.close();
                        this.f653b.markReusable();
                    } catch (SocketException e) {
                        if (isOpen) {
                            throw e;
                        }
                    }
                } else {
                    this.f653b.unmarkReusable();
                }
            }
            a();
            return false;
        } catch (Throwable th) {
            a();
            throw th;
        }
    }

    @Override // c.a.a.a.g.f, c.a.a.a.l
    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        b();
    }
}
