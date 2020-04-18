package com.mondini.parkingapi.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.entity.QPark;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLParkRepo")
public class QueryDSLParkRepo {

	private QPark qPark = QPark.park;

	@PersistenceContext
	private EntityManager em;

	public void find(boolean exist) {
		JPAQuery<Park> query = new JPAQuery<Park>(em);
		
		if(exist) {
			
		}
		else {
			
		}
		query.select(qPark).from(qPark).where(qPark.rut.eq(""));
	}
	
	
}
