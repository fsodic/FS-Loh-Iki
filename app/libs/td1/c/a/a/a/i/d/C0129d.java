package c.a.a.a.i.d;

import c.a.a.a.f.a;
import c.a.a.a.f.p;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: c.a.a.a.i.d.d  reason: case insensitive filesystem */
public class C0129d implements p, a, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f846a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f847b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private String f848c;
    private String d;
    private String e;
    private Date f;
    private String g;
    private boolean h;
    private int i;

    public C0129d(String str, String str2) {
        c.a.a.a.p.a.a((Object) str, "Name");
        this.f846a = str;
        this.f848c = str2;
    }

    public void a(String str, String str2) {
        this.f847b.put(str, str2);
    }

    @Override // java.lang.Object
    public Object clone() {
        C0129d dVar = (C0129d) super.clone();
        dVar.f847b = new HashMap(this.f847b);
        return dVar;
    }

    @Override // c.a.a.a.f.a
    public boolean containsAttribute(String str) {
        return this.f847b.containsKey(str);
    }

    @Override // c.a.a.a.f.a
    public String getAttribute(String str) {
        return this.f847b.get(str);
    }

    @Override // c.a.a.a.f.c
    public String getDomain() {
        return this.e;
    }

    @Override // c.a.a.a.f.c
    public Date getExpiryDate() {
        return this.f;
    }

    @Override // c.a.a.a.f.c
    public String getName() {
        return this.f846a;
    }

    @Override // c.a.a.a.f.c
    public String getPath() {
        return this.g;
    }

    @Override // c.a.a.a.f.c
    public int[] getPorts() {
        return null;
    }

    @Override // c.a.a.a.f.c
    public String getValue() {
        return this.f848c;
    }

    @Override // c.a.a.a.f.c
    public int getVersion() {
        return this.i;
    }

    @Override // c.a.a.a.f.c
    public boolean isExpired(Date date) {
        c.a.a.a.p.a.a(date, "Date");
        Date date2 = this.f;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    @Override // c.a.a.a.f.c
    public boolean isSecure() {
        return this.h;
    }

    @Override // c.a.a.a.f.p
    public void setComment(String str) {
        this.d = str;
    }

    @Override // c.a.a.a.f.p
    public void setDomain(String str) {
        this.e = str != null ? str.toLowerCase(Locale.ROOT) : null;
    }

    @Override // c.a.a.a.f.p
    public void setExpiryDate(Date date) {
        this.f = date;
    }

    @Override // c.a.a.a.f.p
    public void setPath(String str) {
        this.g = str;
    }

    @Override // c.a.a.a.f.p
    public void setSecure(boolean z) {
        this.h = z;
    }

    @Override // c.a.a.a.f.p
    public void setVersion(int i2) {
        this.i = i2;
    }

    public String toString() {
        return "[version: " + Integer.toString(this.i) + "]" + "[name: " + this.f846a + "]" + "[value: " + this.f848c + "]" + "[domain: " + this.e + "]" + "[path: " + this.g + "]" + "[expiry: " + this.f + "]";
    }
}
