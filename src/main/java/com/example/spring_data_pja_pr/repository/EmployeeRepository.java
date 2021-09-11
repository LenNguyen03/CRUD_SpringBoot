package com.example.spring_data_pja_pr.repository;

import com.example.spring_data_pja_pr.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {





    public List<Employee> findByFirstName(String firstName);
    public List<Employee> findByLastName(String lastName);




//--------------------CRUD JPQL--------------------------------------------------
    @Query("select e from Employee e where e.id = ?1")
    public Employee findByCustomId(Long id);

    @Transactional
    @Modifying
    @Query("update Employee e set e.firstName = ?2 where e.id = ?1 ")
    public void updateById(Long id, String firstName);

    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.id = ?1")
    public void deleleEmployeeJPQL(Long id);


    //-----------------------CRUD Native---------------------------------------------------------
    @Query(value = "select * from tbl_employee", nativeQuery = true)
    public List<Employee> findAllEmployeesNative();

    @Query(value = "select * from tbl_employee where id = ?1"
    ,nativeQuery = true)
    public Employee findByEmployeeNative(Long id);

    @Transactional
    @Modifying
    @Query(value = "update tbl_employee e set e.last_name = ?2 where e.id = ?1", nativeQuery = true)
    public void  updateEmployeeNative(Long id, String lastName);



    @Modifying
    @Query(value = "insert into tbl_employee (id,first_name, last_name, email) VALUES (?1,?2,?3,?4)", nativeQuery = true)
    @Transactional
     public void AddEmployee(Long id,String firstName, String lastName, String email);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM tbl_employee WHERE id = ?1", nativeQuery = true)
    public void deleleEmployee(Long id);



}
