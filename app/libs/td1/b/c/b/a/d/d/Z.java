package b.c.b.a.d.d;

public class Z {

    /* renamed from: a  reason: collision with root package name */
    private static final B f401a = B.a();

    /* renamed from: b  reason: collision with root package name */
    private AbstractC0071i f402b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AbstractC0089ra f403c;
    private volatile AbstractC0071i d;

    private final AbstractC0089ra b(AbstractC0089ra raVar) {
        if (this.f403c == null) {
            synchronized (this) {
                if (this.f403c == null) {
                    try {
                        this.f403c = raVar;
                        this.d = AbstractC0071i.f429a;
                    } catch (S unused) {
                        this.f403c = raVar;
                        this.d = AbstractC0071i.f429a;
                    }
                }
            }
        }
        return this.f403c;
    }

    public final AbstractC0071i a() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            this.d = this.f403c == null ? AbstractC0071i.f429a : this.f403c.d();
            return this.d;
        }
    }

    public final AbstractC0089ra a(AbstractC0089ra raVar) {
        AbstractC0089ra raVar2 = this.f403c;
        this.f402b = null;
        this.d = null;
        this.f403c = raVar;
        return raVar2;
    }

    public final int b() {
        if (this.d != null) {
            return this.d.size();
        }
        if (this.f403c != null) {
            return this.f403c.e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z = (Z) obj;
        AbstractC0089ra raVar = this.f403c;
        AbstractC0089ra raVar2 = z.f403c;
        return (raVar == null && raVar2 == null) ? a().equals(z.a()) : (raVar == null || raVar2 == null) ? raVar != null ? raVar.equals(z.b(raVar.c())) : b(raVar2.c()).equals(raVar2) : raVar.equals(raVar2);
    }

    public int hashCode() {
        return 1;
    }
}
