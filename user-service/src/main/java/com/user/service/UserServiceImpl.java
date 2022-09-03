package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake User List

    List<User> users = List.of(
            new User(1311L, "Durgesh Tiwari", "234644234"),
            new User(1327L, "Ankit Tiwari", "2346676234"),
            new User(1314L, "Ravi Tiwari", "234644234")

    );


    @Override
    public User getUser(Long id) {
        return users.stream().filter(u -> u.getUserId() == id).findAny().orElse(null);
    }
}
