package com.Arvind.MySqlJPA.DAO;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Arvind.MySqlJPA.Model.LoginId;



public interface LoginReposDAO extends CrudRepository<LoginId, Integer>
{

List<LoginId> findByEmailid(String emailid);
List<LoginId> findByLanidGreaterThan(int lanid);

//issue-1
/*
 * @Query("select lanid from loginid where emailid=?1  order by emailid")
 * List<LoginId> findByEmailidSorted(String emailid);
 */

}
