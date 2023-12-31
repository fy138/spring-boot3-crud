package com.example.demo.dao;

import com.example.demo.dao.entries.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface tuserDAO extends JpaRepository<TUser, Long> {

    @Query(value = "select * from t_user where id=?1", nativeQuery = true)
    TUser getUserid(@Param("id") Long id);

    @Query(value = "select * from t_user", nativeQuery = true)
    List<TUser> findAll();
}
