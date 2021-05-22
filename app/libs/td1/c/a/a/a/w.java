package c.a.a.a;

import java.io.Serializable;

public final class w extends D implements Serializable {
    public static final w d = new w(0, 9);
    public static final w e = new w(1, 0);
    public static final w f = new w(1, 1);

    public w(int i, int i2) {
        super("HTTP", i, i2);
    }

    @Override // c.a.a.a.D
    public D a(int i, int i2) {
        if (i == this.f588b && i2 == this.f589c) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return e;
            }
            if (i2 == 1) {
                return f;
            }
        }
        return (i == 0 && i2 == 9) ? d : new w(i, i2);
    }
}
