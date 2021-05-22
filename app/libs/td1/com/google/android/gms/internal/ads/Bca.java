package com.google.android.gms.internal.ads;

import java.io.IOException;

public class Bca extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0993bda f1622a = null;

    public Bca(String str) {
        super(str);
    }

    static Bca a() {
        return new Bca("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static Bca b() {
        return new Bca("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Bca c() {
        return new Bca("CodedInputStream encountered a malformed varint.");
    }

    static Bca d() {
        return new Bca("Protocol message contained an invalid tag (zero).");
    }

    static Bca e() {
        return new Bca("Protocol message end-group tag did not match expected tag.");
    }

    static Eca f() {
        return new Eca("Protocol message tag had invalid wire type.");
    }

    static Bca g() {
        return new Bca("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static Bca h() {
        return new Bca("Failed to parse the message.");
    }

    static Bca i() {
        return new Bca("Protocol message had invalid UTF-8.");
    }

    public final Bca a(AbstractC0993bda bda) {
        this.f1622a = bda;
        return this;
    }
}
