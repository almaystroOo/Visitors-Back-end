package com.tpra.back_end.services;

import com.tpra.back_end.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    User getUser(Long id);
    User getUser(String username);
    User getUser(String username, String password);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
