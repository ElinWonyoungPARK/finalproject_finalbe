package org.cart.api.cmm.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;


public abstract class AbstractController<T> {
    public abstract ResponseEntity<Long> save(T t);
    public abstract ResponseEntity<Long> update(Long id, T t);
    public abstract ResponseEntity<Long> delete(Long id, T t);
    public abstract ResponseEntity<Long> count();
    public abstract ResponseEntity<List<T>> findAll();
    public abstract ResponseEntity<T> getOne(long id);
    public abstract ResponseEntity<Optional<T>> findById(long id);
    public abstract ResponseEntity<Boolean> existsById(long id);
}
