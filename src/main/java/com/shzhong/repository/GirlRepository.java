package com.shzhong.repository;

import com.shzhong.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * Created by my on 17/4/8.
 */

//@RepositoryDefinition(domainClass = Girl.class,idClass = Integer.class)
public interface GirlRepository extends JpaRepository<Girl,Integer>{
//    通过年龄查询 findByAge 名字不能变
    public List<Girl> findByAge(Integer age);


    @Query(value = "select o from Girl o where o.age = ?1")
    public List<Girl> queryByAge(Integer age);
}
