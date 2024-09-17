package com.iiht.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.Egg;


@Repository
public interface EggRepository  extends JpaRepository<Egg, Long>{

}
