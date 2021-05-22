package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lia  reason: case insensitive filesystem */
public class C1691lia {
    public static final int A = Jka.d("sidx");
    public static final int Aa = Jka.d("udta");
    public static final int B = Jka.d("moov");
    public static final int Ba = Jka.d("meta");
    public static final int C = Jka.d("mvhd");
    public static final int Ca = Jka.d("ilst");
    public static final int D = Jka.d("trak");
    public static final int Da = Jka.d("mean");
    public static final int E = Jka.d("mdia");
    public static final int Ea = Jka.d("name");
    public static final int F = Jka.d("minf");
    public static final int Fa = Jka.d("data");
    public static final int G = Jka.d("stbl");
    public static final int Ga = Jka.d("emsg");
    public static final int H = Jka.d("avcC");
    public static final int Ha = Jka.d("st3d");
    public static final int I = Jka.d("hvcC");
    public static final int Ia = Jka.d("sv3d");
    public static final int J = Jka.d("esds");
    public static final int Ja = Jka.d("proj");
    public static final int K = Jka.d("moof");
    public static final int Ka = Jka.d("vp08");
    public static final int L = Jka.d("traf");
    public static final int La = Jka.d("vp09");
    public static final int M = Jka.d("mvex");
    public static final int Ma = Jka.d("vpcC");
    public static final int N = Jka.d("mehd");
    public static final int Na = Jka.d("camm");
    public static final int O = Jka.d("tkhd");
    public static final int Oa = Jka.d("alac");
    public static final int P = Jka.d("edts");
    public static final int Q = Jka.d("elst");
    public static final int R = Jka.d("mdhd");
    public static final int S = Jka.d("hdlr");
    public static final int T = Jka.d("stsd");
    public static final int U = Jka.d("pssh");
    public static final int V = Jka.d("sinf");
    public static final int W = Jka.d("schm");
    public static final int X = Jka.d("schi");
    public static final int Y = Jka.d("tenc");
    public static final int Z = Jka.d("encv");

    /* renamed from: a  reason: collision with root package name */
    public static final int f4890a = Jka.d("ftyp");
    public static final int aa = Jka.d("enca");

    /* renamed from: b  reason: collision with root package name */
    public static final int f4891b = Jka.d("avc1");
    public static final int ba = Jka.d("frma");

    /* renamed from: c  reason: collision with root package name */
    public static final int f4892c = Jka.d("avc3");
    public static final int ca = Jka.d("saiz");
    public static final int d = Jka.d("hvc1");
    public static final int da = Jka.d("saio");
    public static final int e = Jka.d("hev1");
    public static final int ea = Jka.d("sbgp");
    public static final int f = Jka.d("s263");
    public static final int fa = Jka.d("sgpd");
    public static final int g = Jka.d("d263");
    public static final int ga = Jka.d("uuid");
    public static final int h = Jka.d("mdat");
    public static final int ha = Jka.d("senc");
    public static final int i = Jka.d("mp4a");
    public static final int ia = Jka.d("pasp");
    public static final int j = Jka.d(".mp3");
    public static final int ja = Jka.d("TTML");
    public static final int k = Jka.d("wave");
    private static final int ka = Jka.d("vmhd");
    public static final int l = Jka.d("lpcm");
    public static final int la = Jka.d("mp4v");
    public static final int m = Jka.d("sowt");
    public static final int ma = Jka.d("stts");
    public static final int n = Jka.d("ac-3");
    public static final int na = Jka.d("stss");
    public static final int o = Jka.d("dac3");
    public static final int oa = Jka.d("ctts");
    public static final int p = Jka.d("ec-3");
    public static final int pa = Jka.d("stsc");
    public static final int q = Jka.d("dec3");
    public static final int qa = Jka.d("stsz");
    public static final int r = Jka.d("dtsc");
    public static final int ra = Jka.d("stz2");
    public static final int s = Jka.d("dtsh");
    public static final int sa = Jka.d("stco");
    public static final int t = Jka.d("dtsl");
    public static final int ta = Jka.d("co64");
    public static final int u = Jka.d("dtse");
    public static final int ua = Jka.d("tx3g");
    public static final int v = Jka.d("ddts");
    public static final int va = Jka.d("wvtt");
    public static final int w = Jka.d("tfdt");
    public static final int wa = Jka.d("stpp");
    public static final int x = Jka.d("tfhd");
    public static final int xa = Jka.d("c608");
    public static final int y = Jka.d("trex");
    public static final int ya = Jka.d("samr");
    public static final int z = Jka.d("trun");
    public static final int za = Jka.d("sawb");
    public final int Pa;

    public C1691lia(int i2) {
        this.Pa = i2;
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.Pa);
    }
}
