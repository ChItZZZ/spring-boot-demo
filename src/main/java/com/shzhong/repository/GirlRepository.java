package com.shzhong.repository;

import com.shzhong.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by my on 17/4/8.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
//    通过年龄查询 findByAge 名字不能变
    public List<Girl> findByAge(Integer age);
}
