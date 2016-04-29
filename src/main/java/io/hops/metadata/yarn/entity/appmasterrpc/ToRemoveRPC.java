package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveRPC {

    private final int rpcId;

    public ToRemoveRPC(int rpcId) {
        this.rpcId = rpcId;
    }

    public int getRpcId() {
        return rpcId;
    }
}
