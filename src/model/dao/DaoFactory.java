package model.dao;

import model.dao.impl.SellerDaoJDBC;

//Vai ser responsável por instanciar os daos
public class DaoFactory {

	public static SellerDao createSellerDao() { //dessa forma não precisamos expor a implementação do sellerDao
		return new SellerDaoJDBC();
	}
}
