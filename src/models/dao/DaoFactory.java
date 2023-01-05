package models.dao;

import models.dao.impl.DepartmentDaoJDBC;
import models.dao.impl.SellerDaoJDBC;
import models.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}