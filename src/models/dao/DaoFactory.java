package models.dao;

import models.dao.impl.SellerDaoJDBC;
import models.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

}