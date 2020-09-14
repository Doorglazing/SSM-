package com.lz.proxy;

import com.lz.dao.IEmpDao;
import com.lz.dao.impl.IEmpDaoImpl;

public class IEmpProxy implements IEmpDao {

    @Override
    public String empFindAll() {
        IEmpDao dao = new IEmpDaoImpl();
        return dao.empFindAll().toUpperCase();
    }

}
