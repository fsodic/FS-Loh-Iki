package b.c.b.a.c;

import android.os.IBinder;
import b.c.b.a.c.a;
import java.lang.reflect.Field;

public final class b<T> extends a.AbstractBinderC0013a {

    /* renamed from: a  reason: collision with root package name */
    private final T f317a;

    private b(T t) {
        this.f317a = t;
    }

    public static <T> T Q(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f317a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    public static <T> a a(T t) {
        return new b(t);
    }
}
