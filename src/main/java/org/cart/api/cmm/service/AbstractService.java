package org.cart.api.cmm.service;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService <T> {
    public abstract void save(T t);
    public abstract void delete(T t);
    public abstract long count();
    public abstract List<T> findAll();
    public abstract T getOne(long id);
    public abstract Optional<T> findById(long id);
    public abstract boolean existsById(long id);
}
