package c.a.a.a.f;

import java.io.Serializable;
import java.util.Comparator;
import org.cocos2dx.lib.BuildConfig;

public class e implements Serializable, Comparator<c> {
    /* renamed from: a */
    public int compare(c cVar, c cVar2) {
        int compareTo = cVar.getName().compareTo(cVar2.getName());
        if (compareTo == 0) {
            String domain = cVar.getDomain();
            String str = BuildConfig.FLAVOR;
            if (domain == null) {
                domain = str;
            } else if (domain.indexOf(46) == -1) {
                domain = domain + ".local";
            }
            String domain2 = cVar2.getDomain();
            if (domain2 != null) {
                if (domain2.indexOf(46) == -1) {
                    str = domain2 + ".local";
                } else {
                    str = domain2;
                }
            }
            compareTo = domain.compareToIgnoreCase(str);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String path = cVar.getPath();
        if (path == null) {
            path = "/";
        }
        String path2 = cVar2.getPath();
        if (path2 == null) {
            path2 = "/";
        }
        return path.compareTo(path2);
    }
}
