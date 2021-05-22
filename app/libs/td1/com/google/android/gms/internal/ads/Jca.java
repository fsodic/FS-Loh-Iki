package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Jca extends Cba<String> implements Mca, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Jca f2327b;

    /* renamed from: c  reason: collision with root package name */
    private static final Mca f2328c = f2327b;
    private final List<Object> d;

    static {
        Jca jca = new Jca();
        f2327b = jca;
        jca.c();
    }

    public Jca() {
        this(10);
    }

    public Jca(int i) {
        this(new ArrayList(i));
    }

    private Jca(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof Iba ? ((Iba) obj).k() : C2230tca.c((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final void a(Iba iba) {
        a();
        this.d.add(iba);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ boolean add(String str) {
        return super.add(str);
    }

    @Override // java.util.List, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof Mca) {
            collection = ((Mca) collection).h();
        }
        boolean addAll = this.d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.Cca
    public final /* synthetic */ Cca b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.d);
            return new Jca(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final void clear() {
        a();
        this.d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Cba, com.google.android.gms.internal.ads.Cca
    public final /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final Object g(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Iba) {
            Iba iba = (Iba) obj;
            String k = iba.k();
            if (iba.l()) {
                this.d.set(i, k);
            }
            return k;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = C2230tca.c(bArr);
        if (C2230tca.b(bArr)) {
            this.d.set(i, c2);
        }
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final List<?> h() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.Mca
    public final Mca i() {
        return d() ? new Uda(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.d.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return a(this.d.set(i, (String) obj));
    }

    public final int size() {
        return this.d.size();
    }
}
