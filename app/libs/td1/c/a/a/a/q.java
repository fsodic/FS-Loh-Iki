package c.a.a.a;

import c.a.a.a.l.g;

public interface q {
    void a(AbstractC0121e eVar);

    @Deprecated
    void a(g gVar);

    void a(AbstractC0121e[] eVarArr);

    void addHeader(String str, String str2);

    void b(AbstractC0121e eVar);

    boolean containsHeader(String str);

    AbstractC0121e[] getAllHeaders();

    AbstractC0121e getFirstHeader(String str);

    AbstractC0121e[] getHeaders(String str);

    @Deprecated
    g getParams();

    D getProtocolVersion();

    AbstractC0124h headerIterator();

    AbstractC0124h headerIterator(String str);

    void removeHeaders(String str);

    void setHeader(String str, String str2);
}
