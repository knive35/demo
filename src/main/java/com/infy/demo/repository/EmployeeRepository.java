package com.infy.demo.repository;

import com.infy.demo.domain.Employee;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.stereotype.Repository;


/**
 * Spring Data Couchbase repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends N1qlCouchbaseRepository<Employee, String> {

}
