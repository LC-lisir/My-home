package com.example.dao;

import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
//JpaRepository<User, Long>：说明：
//              User：操作的实体类(在实体类上配置了和表的映射关系)
//              Long:表示操作的实体类中对应主键的数据类型（@Id）
public interface UserRepository extends JpaRepository<User, Long> {
        // @query 表示增，删，改，查的注解，nativeQuery参数表示开启原生sql语句语法规则
    @Query(value = "select * from user where name like %?1%", nativeQuery = true)
    Page<User> findByNameLike(String name, Pageable pageRequest);
}
