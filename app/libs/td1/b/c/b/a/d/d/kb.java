package b.c.b.a.d.d;

public enum kb {
    DOUBLE(pb.DOUBLE, 1),
    FLOAT(pb.FLOAT, 5),
    INT64(pb.LONG, 0),
    UINT64(pb.LONG, 0),
    INT32(pb.INT, 0),
    FIXED64(pb.LONG, 1),
    FIXED32(pb.INT, 5),
    BOOL(pb.BOOLEAN, 0),
    STRING(pb.STRING, 2) {
    },
    GROUP(pb.MESSAGE, 3) {
    },
    MESSAGE(pb.MESSAGE, 2) {
    },
    BYTES(pb.BYTE_STRING, 2) {
    },
    UINT32(pb.INT, 0),
    ENUM(pb.ENUM, 0),
    SFIXED32(pb.INT, 5),
    SFIXED64(pb.LONG, 1),
    SINT32(pb.INT, 0),
    SINT64(pb.LONG, 0);
    
    private final pb t;
    private final int u;

    private kb(pb pbVar, int i) {
        this.t = pbVar;
        this.u = i;
    }

    /* synthetic */ kb(pb pbVar, int i, jb jbVar) {
        this(pbVar, i);
    }

    public final pb a() {
        return this.t;
    }
}
