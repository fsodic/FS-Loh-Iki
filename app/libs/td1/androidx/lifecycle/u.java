package androidx.lifecycle;

import java.util.HashMap;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, s> f234a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final s a(String str) {
        return this.f234a.get(str);
    }

    public final void a() {
        for (s sVar : this.f234a.values()) {
            sVar.a();
        }
        this.f234a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, s sVar) {
        s put = this.f234a.put(str, sVar);
        if (put != null) {
            put.a();
        }
    }
}
