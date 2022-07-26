package com.oft.resumePortal2;

import com.oft.resumePortal2.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final USerRepository uSerRepository;

    public MyUserDetailsService(USerRepository uSerRepository) {
        this.uSerRepository = uSerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = uSerRepository.findByUserName(username);

        user.orElseThrow(()->new UsernameNotFoundException("Not found: "+username));

      //  return user.map(p->new MyUserDetails(p)).get();
        return user.map(MyUserDetails::new).get();
    }
}
