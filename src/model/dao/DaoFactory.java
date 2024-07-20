package model.dao;

import db.Conexao;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

//Vai ser responsável por instanciar os daos
public class DaoFactory {

	public static SellerDao createSellerDao() { //dessa forma não precisamos expor a implementação do sellerDao
		return new SellerDaoJDBC(Conexao.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(Conexao.getConnection());
	}
}
