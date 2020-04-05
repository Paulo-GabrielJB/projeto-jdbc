package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Seller obj = new Seller(1, "Paulo", "paulo@gmail.com", sdf.parse("10/08/1999"), 2750.0, new Department(1, "Computer"));
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);

	}

}
