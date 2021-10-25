package com.example.springboot_basic.sequrity;

import com.example.springboot_basic.sequrity.jpa.Account;
import com.example.springboot_basic.sequrity.jpa.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    AccountRepository repository;

    @Autowired
    private PasswordEncoder passwordencoder;

    public Account createAccount(Account account){
        account.setPassword(passwordencoder.encode(account.getPassword())); // 인코딩
        return repository.save(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> byUsername = repository.findByUsername(username);
        Account account = byUsername.orElseThrow(IllegalAccessError::new);
        return new User(account.getUsername(),account.getPassword(), authorities());
    }

    // ROLE_USER 권한을 가진 사람임을 리턴
    private Collection<? extends GrantedAuthority> authorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }


}
