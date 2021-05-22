package c.a.a.a.k;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.AbstractC0123g;
import c.a.a.a.AbstractC0124h;
import c.a.a.a.p.a;
import java.util.NoSuchElementException;

public class d implements AbstractC0123g {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0124h f912a;

    /* renamed from: b  reason: collision with root package name */
    private final t f913b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0122f f914c;
    private c.a.a.a.p.d d;
    private w e;

    public d(AbstractC0124h hVar) {
        this(hVar, g.f921b);
    }

    public d(AbstractC0124h hVar, t tVar) {
        this.f914c = null;
        this.d = null;
        this.e = null;
        a.a(hVar, "Header iterator");
        this.f912a = hVar;
        a.a(tVar, "Parser");
        this.f913b = tVar;
    }

    private void a() {
        this.e = null;
        this.d = null;
        while (this.f912a.hasNext()) {
            AbstractC0121e nextHeader = this.f912a.nextHeader();
            if (nextHeader instanceof AbstractC0120d) {
                AbstractC0120d dVar = (AbstractC0120d) nextHeader;
                this.d = dVar.getBuffer();
                this.e = new w(0, this.d.length());
                this.e.a(dVar.getValuePos());
                return;
            }
            String value = nextHeader.getValue();
            if (value != null) {
                this.d = new c.a.a.a.p.d(value.length());
                this.d.a(value);
                this.e = new w(0, this.d.length());
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r3 = this;
        L_0x0000:
            c.a.a.a.h r0 = r3.f912a
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x000e
            c.a.a.a.k.w r0 = r3.e
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            c.a.a.a.k.w r0 = r3.e
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x001b
        L_0x0018:
            r3.a()
        L_0x001b:
            c.a.a.a.k.w r0 = r3.e
            if (r0 == 0) goto L_0x0000
        L_0x001f:
            c.a.a.a.k.w r0 = r3.e
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0044
            c.a.a.a.k.t r0 = r3.f913b
            c.a.a.a.p.d r1 = r3.d
            c.a.a.a.k.w r2 = r3.e
            c.a.a.a.f r0 = r0.b(r1, r2)
            java.lang.String r1 = r0.getName()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L_0x001f
        L_0x0041:
            r3.f914c = r0
            return
        L_0x0044:
            c.a.a.a.k.w r0 = r3.e
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r3.e = r0
            r3.d = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.k.d.b():void");
    }

    @Override // c.a.a.a.AbstractC0123g
    public boolean hasNext() {
        if (this.f914c == null) {
            b();
        }
        return this.f914c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextElement();
    }

    @Override // c.a.a.a.AbstractC0123g
    public AbstractC0122f nextElement() {
        if (this.f914c == null) {
            b();
        }
        AbstractC0122f fVar = this.f914c;
        if (fVar != null) {
            this.f914c = null;
            return fVar;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
