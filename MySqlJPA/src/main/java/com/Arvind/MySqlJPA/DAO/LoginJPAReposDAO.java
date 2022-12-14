package com.Arvind.MySqlJPA.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arvind.MySqlJPA.Model.LoginId;



public interface LoginJPAReposDAO extends JpaRepository<LoginId, Integer>  //JpaRepository = JPA feature+CrudRepository
{
	
}
