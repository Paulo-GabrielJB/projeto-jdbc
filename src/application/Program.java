package application;

import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		
		Department dep = new Department(1, null);
		
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		
		for(Seller s: sellers)
			System.out.println(s);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		
		sellers = sellerDao.findAll();

		for(Seller s: sellers)
			System.out.println(s);
		
	}

}
