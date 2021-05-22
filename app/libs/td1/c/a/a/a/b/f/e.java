package c.a.a.a.b.f;

import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.p.i;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import org.cocos2dx.lib.BuildConfig;

public class e {
    public static o a(URI uri) {
        int indexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int indexOf2 = host.indexOf(64);
            if (indexOf2 >= 0) {
                int i = indexOf2 + 1;
                host = host.length() > i ? host.substring(i) : null;
            }
            if (host != null && (indexOf = host.indexOf(58)) >= 0) {
                int i2 = indexOf + 1;
                int i3 = i2;
                int i4 = 0;
                while (i3 < host.length() && Character.isDigit(host.charAt(i3))) {
                    i4++;
                    i3++;
                }
                if (i4 > 0) {
                    try {
                        port = Integer.parseInt(host.substring(i2, i4 + i2));
                    } catch (NumberFormatException unused) {
                    }
                }
                host = host.substring(0, indexOf);
            }
        }
        String scheme = uri.getScheme();
        if (i.b(host)) {
            return null;
        }
        try {
            return new o(host, port, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static URI a(URI uri, o oVar, boolean z) {
        int i;
        a.a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        d dVar = new d(uri);
        if (oVar != null) {
            dVar.d(oVar.f());
            dVar.b(oVar.d());
            i = oVar.e();
        } else {
            dVar.d(null);
            dVar.b((String) null);
            i = -1;
        }
        dVar.a(i);
        if (z) {
            dVar.a((String) null);
        }
        if (i.c(dVar.d())) {
            dVar.c("/");
        }
        return dVar.a();
    }

    public static URI a(URI uri, URI uri2) {
        a.a(uri, "Base URI");
        a.a(uri2, "Reference URI");
        String uri3 = uri2.toString();
        if (uri3.startsWith("?")) {
            return b(uri, uri2);
        }
        boolean isEmpty = uri3.isEmpty();
        if (isEmpty) {
            uri2 = URI.create("#");
        }
        URI resolve = uri.resolve(uri2);
        if (isEmpty) {
            String uri4 = resolve.toString();
            resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
        }
        return c(resolve);
    }

    public static URI b(URI uri) {
        a.a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        d dVar = new d(uri);
        if (dVar.f() != null) {
            dVar.e(null);
        }
        if (i.c(dVar.d())) {
            dVar.c("/");
        }
        if (dVar.c() != null) {
            dVar.b(dVar.c().toLowerCase(Locale.ROOT));
        }
        dVar.a((String) null);
        return dVar.a();
    }

    private static URI b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        return URI.create(uri3 + uri2.toString());
    }

    private static URI c(URI uri) {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        a.a(uri.isAbsolute(), "Base URI must be absolute");
        String path = uri.getPath() == null ? BuildConfig.FLAVOR : uri.getPath();
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (String str : split) {
            if (!str.isEmpty() && !".".equals(str)) {
                if (!"..".equals(str)) {
                    stack.push(str);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            sb.append('/');
            sb.append((String) it.next());
        }
        if (path.lastIndexOf(47) == path.length() - 1) {
            sb.append('/');
        }
        try {
            URI uri2 = new URI(uri.getScheme().toLowerCase(Locale.ROOT), uri.getAuthority().toLowerCase(Locale.ROOT), sb.toString(), null, null);
            if (uri.getQuery() == null && uri.getFragment() == null) {
                return uri2;
            }
            StringBuilder sb2 = new StringBuilder(uri2.toASCIIString());
            if (uri.getQuery() != null) {
                sb2.append('?');
                sb2.append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                sb2.append('#');
                sb2.append(uri.getRawFragment());
            }
            return URI.create(sb2.toString());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
