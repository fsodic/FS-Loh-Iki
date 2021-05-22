package b.c.b.a.d.e;

import android.os.Bundle;
import com.google.android.gms.games.g.a;
import com.google.android.gms.games.g.b;
import java.util.ArrayList;

public final class k implements b {
    @Override // com.google.android.gms.games.g.b
    public final ArrayList<a> a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("requests")) {
            return new ArrayList<>();
        }
        ArrayList arrayList = (ArrayList) bundle.get("requests");
        ArrayList<a> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((a) arrayList.get(i));
        }
        return arrayList2;
    }
}
