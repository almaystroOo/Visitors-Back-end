package com.tpra.back_end.dao;

import com.tpra.back_end.domain.User;

public interface userDAO {

        public User getUser(Long id);
        public User getUser(String username);
        public User getUser(String username, String password);
        public User createUser(User user);
        public User updateUser(User user);
        public void deleteUser(Long id);

}
