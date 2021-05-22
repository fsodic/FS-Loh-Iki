package c.a.a.a.p;

import c.a.a.a.l;
import java.io.InputStream;

public final class g {
    public static void a(l lVar) {
        InputStream content;
        if (lVar != null && lVar.isStreaming() && (content = lVar.getContent()) != null) {
            content.close();
        }
    }

    public static byte[] b(l lVar) {
        a.a(lVar, "Entity");
        InputStream content = lVar.getContent();
        if (content == null) {
            return null;
        }
        try {
            a.a(lVar.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) lVar.getContentLength();
            if (contentLength < 0) {
                contentLength = 4096;
            }
            c cVar = new c(contentLength);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return cVar.g();
                }
                cVar.a(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }
}
