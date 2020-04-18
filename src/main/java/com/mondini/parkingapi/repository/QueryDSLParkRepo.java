package com.mondini.parkingapi.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mondini.parkingapi.entity.Park;
import com.mondini.parkingapi.entity.QPark;
import com.mondini.parkingapi.model.PersonModel;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLParkRepo")
public class QueryDSLParkRepo {

	private QPark qPark = QPark.park;

	@PersistenceContext
	private EntityManager em;

	public Park find(PersonModel personModel) {
		JPAQuery<Park> query = new JPAQuery<Park>(em);
		BooleanBuilder predicateBuilder = new BooleanBuilder(qPark.rut.isNotNull());

		if (!personModel.getRut().isEmpty()) {
			Predicate right = qPark.rut.contains("-");
			predicateBuilder.and(right);
		} else {
			//solve 2nd solution
		}
		return query.select(qPark).from(qPark).where(predicateBuilder).fetchOne();
	}

}
