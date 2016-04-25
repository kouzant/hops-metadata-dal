package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveHBContainerStatus  extends ToRemoveRPC {

    private final String containerId;

    public ToRemoveHBContainerStatus(int rpcId, String containerId) {
        super(rpcId);
        this.containerId = containerId;
    }

    public String getContainerId() {
        return containerId;
    }
}
