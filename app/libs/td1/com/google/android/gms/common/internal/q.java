package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class q {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f1380a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f1381b;

        private a(Object obj) {
            r.a(obj);
            this.f1381b = obj;
            this.f1380a = new ArrayList();
        }

        public final a a(String str, Object obj) {
            List<String> list = this.f1380a;
            r.a((Object) str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f1381b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f1380a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f1380a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
