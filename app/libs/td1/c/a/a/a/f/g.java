package c.a.a.a.f;

import java.io.Serializable;
import java.util.Comparator;

public class g implements Serializable, Comparator<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f707a = new g();

    private String a(c cVar) {
        String path = cVar.getPath();
        if (path == null) {
            path = "/";
        }
        if (path.endsWith("/")) {
            return path;
        }
        return path + '/';
    }

    /* renamed from: a */
    public int compare(c cVar, c cVar2) {
        String a2 = a(cVar);
        String a3 = a(cVar2);
        if (a2.equals(a3)) {
            return 0;
        }
        if (a2.startsWith(a3)) {
            return -1;
        }
        return a3.startsWith(a2) ? 1 : 0;
    }
}
