package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department =  new Department(4, null);
        /*
        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");

        List<Seller> list = sellerDao.findByDepartment(department);
        System.out.println(list);

        System.out.println("\n=== TEST 3: seller findAll =====");
        List<Seller> list2 = sellerDao.findAll();
        System.out.println(list2);

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller seller2 = new Seller(null, "Gabril Lira", "gabrieldeio@gmail.com", new Date(), 3500.00, department);
        System.out.println(seller2);
        sellerDao.insert(seller2);
        System.out.println("Inserted! New id = " + seller2.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        Seller seller3 = sellerDao.findById(8);
        seller3.setName("Gabriel Deió");
        sellerDao.update(seller3);
        System.out.println("Update completed");
        */
        System.out.println("\n=== TEST 6: seller delete =====");
        sellerDao.deleteById(8);
        System.out.println("Seller deleted!");
    }
}