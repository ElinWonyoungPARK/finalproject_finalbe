package org.cart.api.uss.repository;

import java.util.List;
import java.util.Optional;

import org.cart.api.uss.domain.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;


interface UserCustomRepository{

}
public interface UserRepository extends JpaRepository<UserVo, Long>, UserCustomRepository {
    public Optional<UserVo> findByEmail(String email);
    public Optional<UserVo> findByUseridOrEmail(String userid, String email);
    public Optional<UserVo> findByUserid(String userid);
    public Boolean existsByUserid(String userid);
    public Boolean existsByEmail(String email);
    // public void update(UserVo user);

}
