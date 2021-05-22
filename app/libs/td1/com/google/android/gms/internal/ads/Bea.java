package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Bea implements AbstractC0208Au, Closeable, Iterator<AbstractC0856Zs> {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0856Zs f1628a = new Aea("eof ");

    /* renamed from: b  reason: collision with root package name */
    private static Jea f1629b = Jea.a(Bea.class);

    /* renamed from: c  reason: collision with root package name */
    protected AbstractC2604ys f1630c;
    protected Dea d;
    private AbstractC0856Zs e = null;
    long f = 0;
    long g = 0;
    long h = 0;
    private List<AbstractC0856Zs> i = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final AbstractC0856Zs next() {
        AbstractC0856Zs a2;
        AbstractC0856Zs zs = this.e;
        if (zs == null || zs == f1628a) {
            Dea dea = this.d;
            if (dea == null || this.f >= this.h) {
                this.e = f1628a;
                throw new NoSuchElementException();
            }
            try {
                synchronized (dea) {
                    this.d.a(this.f);
                    a2 = this.f1630c.a(this.d, this);
                    this.f = this.d.position();
                }
                return a2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.e = null;
            return zs;
        }
    }

    public final List<AbstractC0856Zs> a() {
        return (this.d == null || this.e == f1628a) ? this.i : new Hea(this.i, this);
    }

    public void a(Dea dea, long j, AbstractC2604ys ysVar) {
        this.d = dea;
        long position = dea.position();
        this.g = position;
        this.f = position;
        dea.a(dea.position() + j);
        this.h = dea.position();
        this.f1630c = ysVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public boolean hasNext() {
        AbstractC0856Zs zs = this.e;
        if (zs == f1628a) {
            return false;
        }
        if (zs != null) {
            return true;
        }
        try {
            this.e = (AbstractC0856Zs) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.e = f1628a;
            return false;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(this.i.get(i2).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
