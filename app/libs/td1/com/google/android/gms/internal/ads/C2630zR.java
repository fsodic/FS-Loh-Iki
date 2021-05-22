package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.zR  reason: case insensitive filesystem */
public final class C2630zR {

    /* renamed from: a  reason: collision with root package name */
    public final List<C1941pR> f6180a;

    /* renamed from: b  reason: collision with root package name */
    public final C2078rR f6181b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C2561yR> f6182c;

    private C2630zR(JsonReader jsonReader) {
        List<C1941pR> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        C2078rR rRVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new C1941pR(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        rRVar = new C2078rR(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = C2041ql.b(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new C2561yR(str, map));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f6182c = arrayList;
        this.f6180a = emptyList;
        this.f6181b = rRVar == null ? new C2078rR(new JsonReader(new StringReader("{}"))) : rRVar;
    }

    public static C2630zR a(Reader reader) {
        try {
            C2630zR zRVar = new C2630zR(new JsonReader(reader));
            k.a(reader);
            return zRVar;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new C2010qR("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            k.a(reader);
            throw th;
        }
    }
}
