package b.c.b.a.b.b.b;

import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.d;

public abstract class b extends a implements d {
    @Override // b.c.b.a.b.b.b.a
    public Object a(String str) {
        return null;
    }

    @Override // b.c.b.a.b.b.b.a
    public boolean b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0012a<?, ?> aVar2 : a().values()) {
            if (b(aVar2)) {
                if (!aVar.b(aVar2) || !a(aVar2).equals(aVar.a(aVar2))) {
                    return false;
                }
            } else if (aVar.b(aVar2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (a.C0012a<?, ?> aVar : a().values()) {
            if (b(aVar)) {
                i = (i * 31) + a(aVar).hashCode();
            }
        }
        return i;
    }
}
