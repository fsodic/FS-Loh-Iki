package a.f.a;

import androidx.lifecycle.h;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & v> a a(T t) {
        return new b(t, t.b());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
