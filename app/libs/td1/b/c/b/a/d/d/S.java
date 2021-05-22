package b.c.b.a.d.d;

import java.io.IOException;

public class S extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0089ra f390a = null;

    public S(String str) {
        super(str);
    }

    static S a() {
        return new S("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static S b() {
        return new S("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static T c() {
        return new T("Protocol message tag had invalid wire type.");
    }
}
