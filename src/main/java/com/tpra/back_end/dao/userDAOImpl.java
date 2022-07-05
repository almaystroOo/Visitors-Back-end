package com.tpra.back_end.dao;

import com.tpra.back_end.domain.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class userDAOImpl implements userDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public User getUser(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        User userObj = currentSession.get(User.class, id);
        return userObj;
        //return null;
    }

    @Override
    public User getUser(String username) {
        Session currentSession = entityManager.unwrap(Session.class);
        User userObj = currentSession.get(User.class, username);    // get(id) is the same as get(username)
        return userObj;
    }

    @Override
    public User getUser(String username, String password) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
