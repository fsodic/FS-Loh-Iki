package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.pn  reason: case insensitive filesystem */
final class C1976pn extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f5266a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1769mn f5267b;

    C1976pn(C1769mn mnVar) {
        this.f5267b = mnVar;
    }

    private final Socket a(Socket socket) {
        if (C1769mn.a(this.f5267b) > 0) {
            socket.setReceiveBufferSize(C1769mn.a(this.f5267b));
        }
        C1769mn.a(this.f5267b, socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f5266a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f5266a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f5266a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f5266a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f5266a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f5266a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f5266a.getSupportedCipherSuites();
    }
}
