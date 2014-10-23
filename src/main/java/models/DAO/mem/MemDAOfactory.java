package models.DAO.mem;

import models.DAO.DAOfactory;
import models.DAO.RoundDAO;
import models.DAO.UserDAO;

public class MemDAOfactory extends DAOfactory{

    private static MemDAOfactory factory=new MemDAOfactory();
    
    private MemDAOfactory(){}
    
    public MemDAOfactory getFactory(){
        return factory;
    }
    
    @Override
    public UserDAO getUserDAO(){
        return new MemUserDAO();
    }

    @Override
    public RoundDAO getRoundDAO(){
        return new MemRoundDAO();
    }
    
}