package com.iiht.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.Bread;


@Repository
public interface BreadRepository extends JpaRepository<Bread, Long>{

}
