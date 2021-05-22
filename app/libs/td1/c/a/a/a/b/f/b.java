package c.a.a.a.b.f;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

class b extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
    b() {
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
        return new SoftReference<>(new HashMap());
    }
}
