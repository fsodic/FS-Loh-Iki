package c.a.a.a.i.b;

import c.a.a.a.l.a;

@Deprecated
public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    protected final c.a.a.a.l.g f762a;

    /* renamed from: b  reason: collision with root package name */
    protected final c.a.a.a.l.g f763b;

    /* renamed from: c  reason: collision with root package name */
    protected final c.a.a.a.l.g f764c;
    protected final c.a.a.a.l.g d;

    public g(c.a.a.a.l.g gVar, c.a.a.a.l.g gVar2, c.a.a.a.l.g gVar3, c.a.a.a.l.g gVar4) {
        this.f762a = gVar;
        this.f763b = gVar2;
        this.f764c = gVar3;
        this.d = gVar4;
    }

    @Override // c.a.a.a.l.g
    public Object getParameter(String str) {
        c.a.a.a.l.g gVar;
        c.a.a.a.l.g gVar2;
        c.a.a.a.l.g gVar3;
        c.a.a.a.p.a.a((Object) str, "Parameter name");
        c.a.a.a.l.g gVar4 = this.d;
        Object parameter = gVar4 != null ? gVar4.getParameter(str) : null;
        if (parameter == null && (gVar3 = this.f764c) != null) {
            parameter = gVar3.getParameter(str);
        }
        if (parameter == null && (gVar2 = this.f763b) != null) {
            parameter = gVar2.getParameter(str);
        }
        return (parameter != null || (gVar = this.f762a) == null) ? parameter : gVar.getParameter(str);
    }

    @Override // c.a.a.a.l.g
    public c.a.a.a.l.g setParameter(String str, Object obj) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
