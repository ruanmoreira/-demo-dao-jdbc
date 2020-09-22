package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: seller findById =====");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		
		System.out.println("\n=== TEST 3: insert =======");
		//Department newDepartment = new Department (null, "Music");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New id: " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		System.out.println("if you want to delete more than one");
		int i= sc.nextInt();
		while (i >= id) {
			id++;
			departmentDao.deleteById(id);
			
		}
		System.out.println("Delete completed");
		
		
			
		
		
	}

}
