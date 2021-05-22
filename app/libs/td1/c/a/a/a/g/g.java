package c.a.a.a.g;

import c.a.a.a.n.d;
import c.a.a.a.p.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class g extends a implements Cloneable {
    protected final byte[] d;

    public g(String str, e eVar) {
        a.a((Object) str, "Source string");
        Charset a2 = eVar != null ? eVar.a() : null;
        this.d = str.getBytes(a2 == null ? d.f963a : a2);
        if (eVar != null) {
            a(eVar.toString());
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    @Override // c.a.a.a.l
    public InputStream getContent() {
        return new ByteArrayInputStream(this.d);
    }

    @Override // c.a.a.a.l
    public long getContentLength() {
        return (long) this.d.length;
    }

    @Override // c.a.a.a.l
    public boolean isRepeatable() {
        return true;
    }

    @Override // c.a.a.a.l
    public boolean isStreaming() {
        return false;
    }

    @Override // c.a.a.a.l
    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        outputStream.write(this.d);
        outputStream.flush();
    }
}
