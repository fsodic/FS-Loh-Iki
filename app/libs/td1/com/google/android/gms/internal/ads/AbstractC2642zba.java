package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2573yba;
import com.google.android.gms.internal.ads.AbstractC2642zba;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zba  reason: case insensitive filesystem */
public abstract class AbstractC2642zba<MessageType extends AbstractC2642zba<MessageType, BuilderType>, BuilderType extends AbstractC2573yba<MessageType, BuilderType>> implements AbstractC0993bda {
    protected int zzhzi = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        C2230tca.a(iterable);
        if (iterable instanceof Mca) {
            List<?> h = ((Mca) iterable).h();
            Mca mca = (Mca) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(mca.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = mca.size() - 1; size2 >= size; size2--) {
                        mca.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof Iba) {
                    mca.a((Iba) obj);
                } else {
                    mca.add((String) obj);
                }
            }
        } else if (iterable instanceof AbstractC1681lda) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final Iba d() {
        try {
            Qba j = Iba.j(e());
            a(j.b());
            return j.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final byte[] f() {
        try {
            byte[] bArr = new byte[e()];
            AbstractC0991bca a2 = AbstractC0991bca.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }
}
