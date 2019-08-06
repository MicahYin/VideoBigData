package com.guet.service.impl;

import com.guet.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * @author MicahYin
 * @date 2019/8/3 10:28
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<SimpleGrantedAuthority> authoritys = new ArrayList();
        authoritys.add(new SimpleGrantedAuthority("ROLE_USER"));
        authoritys.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        User user = new User("admin", "{noop}" + "1234",
               true, true, true, true,authoritys);
        return user;
    }
}
