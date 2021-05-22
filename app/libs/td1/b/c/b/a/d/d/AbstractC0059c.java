package b.c.b.a.d.d;

import b.c.b.a.d.d.AbstractC0059c;
import b.c.b.a.d.d.AbstractC0061d;
import java.io.IOException;

/* renamed from: b.c.b.a.d.d.c  reason: case insensitive filesystem */
public abstract class AbstractC0059c<MessageType extends AbstractC0059c<MessageType, BuilderType>, BuilderType extends AbstractC0061d<MessageType, BuilderType>> implements AbstractC0089ra {
    private static boolean zznf = false;
    protected int zzne = 0;

    /* access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // b.c.b.a.d.d.AbstractC0089ra
    public final AbstractC0071i d() {
        try {
            C0087q j = AbstractC0071i.j(e());
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

    public final byte[] g() {
        try {
            byte[] bArr = new byte[e()];
            AbstractC0100x a2 = AbstractC0100x.a(bArr);
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
    public int h() {
        throw new UnsupportedOperationException();
    }
}
