package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0124h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class r implements Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0121e[] f947a = new AbstractC0121e[0];

    /* renamed from: b  reason: collision with root package name */
    private final List<AbstractC0121e> f948b = new ArrayList(16);

    public void a(AbstractC0121e eVar) {
        if (eVar != null) {
            this.f948b.add(eVar);
        }
    }

    public void a(AbstractC0121e[] eVarArr) {
        c();
        if (eVarArr != null) {
            Collections.addAll(this.f948b, eVarArr);
        }
    }

    public boolean a(String str) {
        for (int i = 0; i < this.f948b.size(); i++) {
            if (this.f948b.get(i).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public AbstractC0121e b(String str) {
        for (int i = 0; i < this.f948b.size(); i++) {
            AbstractC0121e eVar = this.f948b.get(i);
            if (eVar.getName().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        return null;
    }

    public void b(AbstractC0121e eVar) {
        if (eVar != null) {
            this.f948b.remove(eVar);
        }
    }

    public void c() {
        this.f948b.clear();
    }

    public void c(AbstractC0121e eVar) {
        if (eVar != null) {
            for (int i = 0; i < this.f948b.size(); i++) {
                if (this.f948b.get(i).getName().equalsIgnoreCase(eVar.getName())) {
                    this.f948b.set(i, eVar);
                    return;
                }
            }
            this.f948b.add(eVar);
        }
    }

    public AbstractC0121e[] c(String str) {
        ArrayList arrayList = null;
        for (int i = 0; i < this.f948b.size(); i++) {
            AbstractC0121e eVar = this.f948b.get(i);
            if (eVar.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(eVar);
            }
        }
        return arrayList != null ? (AbstractC0121e[]) arrayList.toArray(new AbstractC0121e[arrayList.size()]) : this.f947a;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public AbstractC0124h d(String str) {
        return new l(this.f948b, str);
    }

    public AbstractC0121e[] d() {
        List<AbstractC0121e> list = this.f948b;
        return (AbstractC0121e[]) list.toArray(new AbstractC0121e[list.size()]);
    }

    public AbstractC0124h e() {
        return new l(this.f948b, null);
    }

    public String toString() {
        return this.f948b.toString();
    }
}
