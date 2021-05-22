package c.a.a.a.l;

@Deprecated
public abstract class a implements g, h {
    protected a() {
    }

    @Override // c.a.a.a.l.g
    public boolean getBooleanParameter(String str, boolean z) {
        Object parameter = getParameter(str);
        return parameter == null ? z : ((Boolean) parameter).booleanValue();
    }

    @Override // c.a.a.a.l.g
    public int getIntParameter(String str, int i) {
        Object parameter = getParameter(str);
        return parameter == null ? i : ((Integer) parameter).intValue();
    }

    @Override // c.a.a.a.l.g
    public long getLongParameter(String str, long j) {
        Object parameter = getParameter(str);
        return parameter == null ? j : ((Long) parameter).longValue();
    }

    @Override // c.a.a.a.l.g
    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    @Override // c.a.a.a.l.g
    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    @Override // c.a.a.a.l.g
    public g setBooleanParameter(String str, boolean z) {
        setParameter(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // c.a.a.a.l.g
    public g setIntParameter(String str, int i) {
        setParameter(str, Integer.valueOf(i));
        return this;
    }

    @Override // c.a.a.a.l.g
    public g setLongParameter(String str, long j) {
        setParameter(str, Long.valueOf(j));
        return this;
    }
}
