package com.mondini.parkingapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mondini.parkingapi.entity.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Serializable> {

}
