package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oR  reason: case insensitive filesystem */
public final class C1872oR {

    /* renamed from: a  reason: collision with root package name */
    public final int f5123a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5124b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5125c;

    public C1872oR(int i, int i2, boolean z) {
        this.f5123a = i;
        this.f5124b = i2;
        this.f5125c = z;
    }

    static List<C1872oR> a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new C1872oR(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
