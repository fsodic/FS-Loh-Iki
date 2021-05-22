package c.a.a.a.i.c;

import c.a.a.a.C0119c;
import c.a.a.a.j.e;
import c.a.a.a.j.g;
import c.a.a.a.p.d;

@Deprecated
public class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f832a;

    /* renamed from: b  reason: collision with root package name */
    private final s f833b;

    /* renamed from: c  reason: collision with root package name */
    private final String f834c;

    public o(g gVar, s sVar, String str) {
        this.f832a = gVar;
        this.f833b = sVar;
        this.f834c = str == null ? C0119c.f646b.name() : str;
    }

    @Override // c.a.a.a.j.g
    public void a(d dVar) {
        this.f832a.a(dVar);
        if (this.f833b.a()) {
            String str = new String(dVar.a(), 0, dVar.length());
            this.f833b.b((str + "\r\n").getBytes(this.f834c));
        }
    }

    @Override // c.a.a.a.j.g
    public void flush() {
        this.f832a.flush();
    }

    @Override // c.a.a.a.j.g
    public e getMetrics() {
        return this.f832a.getMetrics();
    }

    @Override // c.a.a.a.j.g
    public void write(int i) {
        this.f832a.write(i);
        if (this.f833b.a()) {
            this.f833b.b(i);
        }
    }

    @Override // c.a.a.a.j.g
    public void write(byte[] bArr, int i, int i2) {
        this.f832a.write(bArr, i, i2);
        if (this.f833b.a()) {
            this.f833b.b(bArr, i, i2);
        }
    }

    @Override // c.a.a.a.j.g
    public void writeLine(String str) {
        this.f832a.writeLine(str);
        if (this.f833b.a()) {
            this.f833b.b((str + "\r\n").getBytes(this.f834c));
        }
    }
}
