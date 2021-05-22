package c.a.a.a.i;

import c.a.a.a.E;
import c.a.a.a.p.a;
import java.util.Locale;

public class d implements E {

    /* renamed from: a  reason: collision with root package name */
    public static final d f841a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String[][] f842b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        a(200, "OK");
        a(201, "Created");
        a(202, "Accepted");
        a(204, "No Content");
        a(301, "Moved Permanently");
        a(302, "Moved Temporarily");
        a(304, "Not Modified");
        a(400, "Bad Request");
        a(401, "Unauthorized");
        a(403, "Forbidden");
        a(404, "Not Found");
        a(500, "Internal Server Error");
        a(501, "Not Implemented");
        a(502, "Bad Gateway");
        a(503, "Service Unavailable");
        a(100, "Continue");
        a(307, "Temporary Redirect");
        a(405, "Method Not Allowed");
        a(409, "Conflict");
        a(412, "Precondition Failed");
        a(413, "Request Too Long");
        a(414, "Request-URI Too Long");
        a(415, "Unsupported Media Type");
        a(300, "Multiple Choices");
        a(303, "See Other");
        a(305, "Use Proxy");
        a(402, "Payment Required");
        a(406, "Not Acceptable");
        a(407, "Proxy Authentication Required");
        a(408, "Request Timeout");
        a(101, "Switching Protocols");
        a(203, "Non Authoritative Information");
        a(205, "Reset Content");
        a(206, "Partial Content");
        a(504, "Gateway Timeout");
        a(505, "Http Version Not Supported");
        a(410, "Gone");
        a(411, "Length Required");
        a(416, "Requested Range Not Satisfiable");
        a(417, "Expectation Failed");
        a(102, "Processing");
        a(207, "Multi-Status");
        a(422, "Unprocessable Entity");
        a(419, "Insufficient Space On Resource");
        a(420, "Method Failure");
        a(423, "Locked");
        a(507, "Insufficient Storage");
        a(424, "Failed Dependency");
    }

    protected d() {
    }

    private static void a(int i, String str) {
        int i2 = i / 100;
        f842b[i2][i - (i2 * 100)] = str;
    }

    @Override // c.a.a.a.E
    public String getReason(int i, Locale locale) {
        boolean z = i >= 100 && i < 600;
        a.a(z, "Unknown category for status code " + i);
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        String[][] strArr = f842b;
        if (strArr[i2].length > i3) {
            return strArr[i2][i3];
        }
        return null;
    }
}
