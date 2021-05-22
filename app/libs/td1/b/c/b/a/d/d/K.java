package b.c.b.a.d.d;

enum K {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean f;

    private K(boolean z) {
        this.f = z;
    }
}
