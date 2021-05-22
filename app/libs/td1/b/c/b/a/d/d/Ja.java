package b.c.b.a.d.d;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class Ja extends Ia<FieldDescriptorType, Object> {
    Ja(int i) {
        super(i, null);
    }

    @Override // b.c.b.a.d.d.Ia
    public final void b() {
        if (!a()) {
            for (int i = 0; i < c(); i++) {
                Map.Entry b2 = b(i);
                if (((H) b2.getKey()).R()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((H) entry.getKey()).R()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
