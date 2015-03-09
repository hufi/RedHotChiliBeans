package com.team6.project.dao;

import java.util.Collection;

import javax.ejb.Local;

import com.team6.project.entities.Response;
import com.team6.project.entities.User;

/**
 * @author Cristiana Conti
 */
@Local
public interface UserDAO {
    
    public void addUser(User user);
    public void updateUser(User user);
    public User getUserByKey(String userId);
    public Collection<User> getAllUser();
    /*public Response deleteUser(User user);*/

}