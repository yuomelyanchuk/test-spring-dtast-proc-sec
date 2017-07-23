package com.gmail.yuomelyanchuk.testspringdtastprocsec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserInfoService userInfoServices;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UserInfo member = userInfoServices.memberByBarcode(login);
        if (member == null)
            throw new UsernameNotFoundException(login + " not found");

        System.out.println(member.getPassword().trim());

        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(UserRole.USER.toString()));


        return new User(""+member.getMemberId(), member.getPassword().trim(), roles);
    }
}