package a.d.b;

import android.util.Log;
import java.io.Writer;

public class b extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f49a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f50b = new StringBuilder(128);

    public b(String str) {
        this.f49a = str;
    }

    private void a() {
        if (this.f50b.length() > 0) {
            Log.d(this.f49a, this.f50b.toString());
            StringBuilder sb = this.f50b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f50b.append(c2);
            }
        }
    }
}
