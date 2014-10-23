package models.DAO.mem;

import java.util.List;

import models.DAO.UserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User,Integer> implements UserDAO{

    @Override
    public void create(User entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User read(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(User entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteByID(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Integer> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer findAll(int index, int size) {
        // TODO Auto-generated method stub
        return null;
    }

}
