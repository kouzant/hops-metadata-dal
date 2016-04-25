package io.hops.metadata.yarn.entity.appmasterrpc;

/**
 * Created by antonis on 4/25/16.
 */
public class ToRemoveHBKeepAliveApp extends ToRemoveRPC {

    private final String appId;

    public ToRemoveHBKeepAliveApp(int rpcId, String appId) {
        super(rpcId);
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }
}
