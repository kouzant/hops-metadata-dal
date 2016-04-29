package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveAllocAsk extends ToRemoveRPC {

    private final String requestId;

    public ToRemoveAllocAsk(int rpcId, String requestId) {
        super(rpcId);
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }
}
