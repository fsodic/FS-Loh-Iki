package c.a.a.a.i.b;

import c.a.a.a.a.c;
import c.a.a.a.b.a;
import c.a.a.a.e.r;
import c.a.a.a.e.s;
import c.a.a.a.h.b;
import c.a.a.a.i.c.k;
import c.a.a.a.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public b f757a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<o, byte[]> f758b;

    /* renamed from: c  reason: collision with root package name */
    private final r f759c;

    public d() {
        this(null);
    }

    public d(r rVar) {
        this.f757a = new b(d.class);
        this.f758b = new ConcurrentHashMap();
        this.f759c = rVar == null ? k.f826a : rVar;
    }

    @Override // c.a.a.a.b.a
    public void a(o oVar) {
        c.a.a.a.p.a.a(oVar, "HTTP host");
        this.f758b.remove(c(oVar));
    }

    @Override // c.a.a.a.b.a
    public void a(o oVar, c cVar) {
        c.a.a.a.p.a.a(oVar, "HTTP host");
        if (cVar != null) {
            if (cVar instanceof Serializable) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(cVar);
                    objectOutputStream.close();
                    this.f758b.put(c(oVar), byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    if (this.f757a.d()) {
                        this.f757a.b("Unexpected I/O error while serializing auth scheme", e);
                    }
                }
            } else if (this.f757a.a()) {
                b bVar = this.f757a;
                bVar.a("Auth scheme " + cVar.getClass() + " is not serializable");
            }
        }
    }

    @Override // c.a.a.a.b.a
    public c b(o oVar) {
        c.a.a.a.p.a.a(oVar, "HTTP host");
        byte[] bArr = this.f758b.get(c(oVar));
        if (bArr != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                c cVar = (c) objectInputStream.readObject();
                objectInputStream.close();
                return cVar;
            } catch (IOException e) {
                if (this.f757a.d()) {
                    this.f757a.b("Unexpected I/O error while de-serializing auth scheme", e);
                }
            } catch (ClassNotFoundException e2) {
                if (this.f757a.d()) {
                    this.f757a.b("Unexpected error while de-serializing auth scheme", e2);
                }
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public o c(o oVar) {
        if (oVar.e() <= 0) {
            try {
                return new o(oVar.d(), this.f759c.a(oVar), oVar.f());
            } catch (s unused) {
            }
        }
        return oVar;
    }

    public String toString() {
        return this.f758b.toString();
    }
}
