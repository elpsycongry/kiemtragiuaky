package com.example.crud7.service;

import com.example.crud7.model.User;
import com.example.crud7.model.UserDetail.MyUserDetail;
import com.example.crud7.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserDetail(user);
    }

    public void registNewUser(User user){
        userRepository.save(user);
    }
}
