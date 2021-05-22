package c.a.a.a.i.b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class u extends AbstractList<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<URI> f782a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final List<URI> f783b = new ArrayList();

    public void a(URI uri) {
        this.f782a.add(uri);
        this.f783b.add(uri);
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, Object obj) {
        URI uri = (URI) obj;
        this.f783b.add(i, uri);
        this.f782a.add(uri);
    }

    public boolean b(URI uri) {
        return this.f782a.contains(uri);
    }

    public boolean contains(Object obj) {
        return this.f782a.contains(obj);
    }

    /* Return type fixed from 'java.net.URI' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public Object get(int i) {
        return this.f783b.get(i);
    }

    /* Return type fixed from 'java.net.URI' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public Object remove(int i) {
        URI remove = this.f783b.remove(i);
        this.f782a.remove(remove);
        if (this.f783b.size() != this.f782a.size()) {
            this.f782a.addAll(this.f783b);
        }
        return remove;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object set(int i, Object obj) {
        URI uri = (URI) obj;
        URI uri2 = this.f783b.set(i, uri);
        this.f782a.remove(uri2);
        this.f782a.add(uri);
        if (this.f783b.size() != this.f782a.size()) {
            this.f782a.addAll(this.f783b);
        }
        return uri2;
    }

    public int size() {
        return this.f783b.size();
    }
}
