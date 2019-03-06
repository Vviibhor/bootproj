package com.cassdb.repo;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;

import com.cassdb.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{

	 List<User> findByAgeGreaterThan(int age);

}
