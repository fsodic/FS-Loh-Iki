package c.a.a.a.i.f;

import c.a.a.a.l.g;
import c.a.a.a.p.a;
import java.net.Socket;

@Deprecated
public class o extends d {
    public o(Socket socket, int i, g gVar) {
        a.a(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        a(socket.getOutputStream(), i < 1024 ? 1024 : i, gVar);
    }
}
