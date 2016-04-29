package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/27/16.
 */
public class GarbageCollectorRPC {

    public static enum TYPE {
        HEARTBEAT,
        ALLOCATE
    }

    private final int rpcid;
    private final TYPE type;

    public GarbageCollectorRPC(int rpcid, TYPE type) {
        this.rpcid = rpcid;
        this.type = type;
    }

    public int getRpcid() {
        return rpcid;
    }

    public TYPE getType() {
        return type;
    }
}
