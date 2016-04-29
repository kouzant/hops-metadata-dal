package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveResource extends ToRemoveRPC {

    private final String containerId;

    public ToRemoveResource(int rpcId, String containerId) {
        super(rpcId);
        this.containerId = containerId;
    }

    public String getContainerId() {
        return containerId;
    }
}
