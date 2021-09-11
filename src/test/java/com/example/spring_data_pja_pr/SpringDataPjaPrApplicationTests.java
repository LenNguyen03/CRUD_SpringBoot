package com.example.spring_data_pja_pr;

import com.example.spring_data_pja_pr.entity.Employee;
import com.example.spring_data_pja_pr.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataPjaPrApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;

//    @Test
//    void contextLoads() {
//    }

// ------------------------------CRUD Repo----------------------------------------------

//    @Test
//    public void saveEmployeeRepo(){
//        Employee employee = Employee.builder()
//                .firstName("Nguyễn")
//                .lastName("Lên")
//                .email("nguyenvalentech@gmail.com")
//                .build();
//        employeeRepository.save(employee);
//    }

//    @Test
//    public void findAllEmployeeRepo(){
//        List<Employee> employees =
//                (List<Employee>) employeeRepository.findAll();
//        System.out.println(employees);
//    }

//    @Test
//    public void findByIdRepo(){
//        System.out.println(employeeRepository.findById(Long.valueOf(4)));
//    }

//    @Test
//    public void deleteByIdRepo(){
//        try {
//            employeeRepository.deleteById(Long.valueOf(4));
//            System.out.println("delete successful!");
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void updateByIdByRepo(){
//        Employee employee = employeeRepository.findById(Long.valueOf(5)).get();
//        employee.setEmail("haha@gmail.com");
//        employeeRepository.save(employee);
//    }
// -------------------------------------CRUD JPQL---------------------------------


//    @Test
//    public void findByCustomId(){
//        System.out.println(employeeRepository.findByCustomId(Long.valueOf(5)));
//    }

//    @Test
//    public void findbyFirstName(){
//        System.out.println(employeeRepository.findByFirstName("Nguyễn"));
//    }

//    @Test
//    public void updateById(){
//        employeeRepository.updateById(Long.valueOf(5), "Len");
//    }

//    @Test
//    public void deleteEmployee(){
//        employeeRepository.deleleEmployeeJPQL(Long.valueOf(5));
//    }

//-------------------------------------CRUDNativeQuery------------------------------

//    @Test
//    public void findAllEmployeeNative(){
//        List<Employee> employees = employeeRepository.findAllEmployeesNative();
//        System.out.println(employees);
//    }

//    @Test
//    public void findByIdNative(){
//        try {
//            System.out.println(employeeRepository.findByEmployeeNative(Long.valueOf(10)));
//
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }

//    @Test
//    public void updateEmployeeByNative(){
//       employeeRepository.updateEmployeeNative(Long.valueOf(7), "Tai Smile");
//        System.out.println("update success");
//    }

//    @Test
//    public void addEmployee(){
//        employeeRepository.AddEmployee(Long.valueOf(13),"Nguyễn", "Lên","nguyenvanlentech@gmail.com");
//    }

//    @Test
//    public void deleteEmployeeNative(){
//        employeeRepository.deleleEmployee(Long.valueOf(13));
//    }

}
