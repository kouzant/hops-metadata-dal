package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveBlacklist extends ToRemoveRPC {

    private final String resource;

    public ToRemoveBlacklist(int rpcId, String resource) {
        super(rpcId);
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
