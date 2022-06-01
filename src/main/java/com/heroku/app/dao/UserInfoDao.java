package com.heroku.app.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.heroku.app.dto.UserInfoDto;

@Repository
public class UserInfoDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<UserInfoDto> getUserInfo() {
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserInfoDto> criteriaQuery = builder.createQuery(UserInfoDto.class);
		Root<UserInfoDto> root = criteriaQuery.from(UserInfoDto.class);
		
		criteriaQuery.select(root);
		TypedQuery<UserInfoDto> query = entityManager.createQuery(criteriaQuery);
		
		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
