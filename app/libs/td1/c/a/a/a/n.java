package c.a.a.a;

public class n extends Exception {
    public n() {
    }

    public n(String str) {
        super(str);
    }

    public n(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
