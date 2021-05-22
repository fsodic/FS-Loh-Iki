package c.a.a.a.i.c;

import c.a.a.a.h.b;
import c.a.a.a.p.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.cocos2dx.lib.BuildConfig;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public b f839a;

    /* renamed from: b  reason: collision with root package name */
    private final String f840b;

    public s(b bVar) {
        this(bVar, BuildConfig.FLAVOR);
    }

    public s(b bVar, String str) {
        this.f839a = bVar;
        this.f840b = str;
    }

    private void a(String str, InputStream inputStream) {
        String str2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            if (read == 13) {
                str2 = "[\\r]";
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                b bVar = this.f839a;
                bVar.a(this.f840b + " " + sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                str2 = "]";
            } else {
                sb.append((char) read);
            }
            sb.append(str2);
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            b bVar2 = this.f839a;
            bVar2.a(this.f840b + " " + sb.toString());
        }
    }

    public void a(int i) {
        a(new byte[]{(byte) i});
    }

    public void a(byte[] bArr) {
        a.a(bArr, "Input");
        a("<< ", new ByteArrayInputStream(bArr));
    }

    public void a(byte[] bArr, int i, int i2) {
        a.a(bArr, "Input");
        a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public boolean a() {
        return this.f839a.a();
    }

    public void b(int i) {
        b(new byte[]{(byte) i});
    }

    public void b(byte[] bArr) {
        a.a(bArr, "Output");
        a(">> ", new ByteArrayInputStream(bArr));
    }

    public void b(byte[] bArr, int i, int i2) {
        a.a(bArr, "Output");
        a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }
}
