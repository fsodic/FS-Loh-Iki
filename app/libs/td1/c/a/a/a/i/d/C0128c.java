package c.a.a.a.i.d;

import c.a.a.a.f.o;
import java.util.Date;

/* renamed from: c.a.a.a.i.d.c  reason: case insensitive filesystem */
public class C0128c extends C0129d implements o {
    private String j;
    private int[] k;
    private boolean l;

    public C0128c(String str, String str2) {
        super(str, str2);
    }

    @Override // java.lang.Object, c.a.a.a.i.d.C0129d
    public Object clone() {
        C0128c cVar = (C0128c) super.clone();
        int[] iArr = this.k;
        if (iArr != null) {
            cVar.k = (int[]) iArr.clone();
        }
        return cVar;
    }

    @Override // c.a.a.a.f.c, c.a.a.a.i.d.C0129d
    public int[] getPorts() {
        return this.k;
    }

    @Override // c.a.a.a.f.c, c.a.a.a.i.d.C0129d
    public boolean isExpired(Date date) {
        return this.l || super.isExpired(date);
    }

    @Override // c.a.a.a.f.o
    public void setCommentURL(String str) {
        this.j = str;
    }

    @Override // c.a.a.a.f.o
    public void setDiscard(boolean z) {
        this.l = z;
    }

    @Override // c.a.a.a.f.o
    public void setPorts(int[] iArr) {
        this.k = iArr;
    }
}
