package org.cart.api.uss.service;

import lombok.RequiredArgsConstructor;
import org.cart.api.cmm.service.AbstractService;
import org.cart.api.uss.domain.UserVo;
import org.cart.api.uss.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<UserVo> implements UserService{
    private final UserRepository userRepository;

    @Override
    public void save(UserVo user) {
         userRepository.save(user);
    }

    @Override
    public void update(UserVo user){
        //userRepository.update(user);
    }

    @Override
    public void delete(UserVo user) {
        userRepository.delete(user);
    }

    @Override
    public long count() {
        return (long)userRepository.count();
    }

    @Override
    public List<UserVo> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserVo getOne(long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Optional<UserVo> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean existsById(long id) {
        return userRepository.existsById(id);
    }

}
