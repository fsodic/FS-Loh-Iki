package c.a.a.a.i.c;

import c.a.a.a.C0119c;
import c.a.a.a.j.b;
import c.a.a.a.j.e;
import c.a.a.a.j.f;
import c.a.a.a.p.d;

@Deprecated
public class n implements f, b {

    /* renamed from: a  reason: collision with root package name */
    private final f f829a;

    /* renamed from: b  reason: collision with root package name */
    private final b f830b;

    /* renamed from: c  reason: collision with root package name */
    private final s f831c;
    private final String d;

    public n(f fVar, s sVar, String str) {
        this.f829a = fVar;
        this.f830b = fVar instanceof b ? (b) fVar : null;
        this.f831c = sVar;
        this.d = str == null ? C0119c.f646b.name() : str;
    }

    @Override // c.a.a.a.j.f
    public int a(d dVar) {
        int a2 = this.f829a.a(dVar);
        if (this.f831c.a() && a2 >= 0) {
            String str = new String(dVar.a(), dVar.length() - a2, a2);
            this.f831c.a((str + "\r\n").getBytes(this.d));
        }
        return a2;
    }

    @Override // c.a.a.a.j.b
    public boolean a() {
        b bVar = this.f830b;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    @Override // c.a.a.a.j.f
    public e getMetrics() {
        return this.f829a.getMetrics();
    }

    @Override // c.a.a.a.j.f
    public boolean isDataAvailable(int i) {
        return this.f829a.isDataAvailable(i);
    }

    @Override // c.a.a.a.j.f
    public int read() {
        int read = this.f829a.read();
        if (this.f831c.a() && read != -1) {
            this.f831c.a(read);
        }
        return read;
    }

    @Override // c.a.a.a.j.f
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f829a.read(bArr, i, i2);
        if (this.f831c.a() && read > 0) {
            this.f831c.a(bArr, i, read);
        }
        return read;
    }
}
