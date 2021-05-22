package b.c.a;

public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String f;

    private a(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
