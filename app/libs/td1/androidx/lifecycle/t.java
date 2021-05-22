package androidx.lifecycle;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final a f232a;

    /* renamed from: b  reason: collision with root package name */
    private final u f233b;

    public interface a {
        <T extends s> T a(Class<T> cls);
    }

    public t(u uVar, a aVar) {
        this.f232a = aVar;
        this.f233b = uVar;
    }

    public <T extends s> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends s> T a(String str, Class<T> cls) {
        T t = (T) this.f233b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f232a.a(cls);
        this.f233b.a(str, t2);
        return t2;
    }
}
