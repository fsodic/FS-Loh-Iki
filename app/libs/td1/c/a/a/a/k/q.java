package c.a.a.a.k;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.B;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.io.Serializable;

public class q implements AbstractC0120d, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f944a;

    /* renamed from: b  reason: collision with root package name */
    private final d f945b;

    /* renamed from: c  reason: collision with root package name */
    private final int f946c;

    public q(d dVar) {
        a.a((Object) dVar, "Char array buffer");
        int b2 = dVar.b(58);
        if (b2 != -1) {
            String b3 = dVar.b(0, b2);
            if (b3.length() != 0) {
                this.f945b = dVar;
                this.f944a = b3;
                this.f946c = b2 + 1;
                return;
            }
            throw new B("Invalid header: " + dVar.toString());
        }
        throw new B("Invalid header: " + dVar.toString());
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    @Override // c.a.a.a.AbstractC0120d
    public d getBuffer() {
        return this.f945b;
    }

    @Override // c.a.a.a.AbstractC0121e
    public AbstractC0122f[] getElements() {
        w wVar = new w(0, this.f945b.length());
        wVar.a(this.f946c);
        return g.f921b.a(this.f945b, wVar);
    }

    @Override // c.a.a.a.AbstractC0121e
    public String getName() {
        return this.f944a;
    }

    @Override // c.a.a.a.AbstractC0121e
    public String getValue() {
        d dVar = this.f945b;
        return dVar.b(this.f946c, dVar.length());
    }

    @Override // c.a.a.a.AbstractC0120d
    public int getValuePos() {
        return this.f946c;
    }

    public String toString() {
        return this.f945b.toString();
    }
}
