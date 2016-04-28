package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

/**
 * Created by antonis on 4/27/16.
 */
public interface GarbageCollectorRPCDataAccess<T> extends EntityDataAccess {
    void add(T rpcid) throws StorageException;
    void addAll(Collection<T> rpcids) throws StorageException;
    void removeAll(Collection<T> rpcids) throws StorageException;
    List<T> getSubset(int limit) throws StorageException;
}
