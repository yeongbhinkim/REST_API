package com.example9.demo.persistence;

import com.example9.demo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
  List<TodoEntity> findByUserId(String userId);

  // ?1은 메서드의 매개변수의 순서 위치다.
//  @Query("select * from Todo t where t.userId = ?1 ")
//  List<TodoEntity> findByUserId(String userId);
}
