package com.ravibaka.springboot.thymeleaf.crud.domain.repositories;

import com.ravibaka.springboot.thymeleaf.crud.domain.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Ravi Baka
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    List<UserInfo> findAllByActiveOrderByIdDesc(boolean active);

    Optional<UserInfo> findByIdAndActive(Integer id, boolean active);

}
