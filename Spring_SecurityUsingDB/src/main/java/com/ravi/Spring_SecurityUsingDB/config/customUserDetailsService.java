package com.ravi.Spring_SecurityUsingDB.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ravi.Spring_SecurityUsingDB.entity.userDetails;
import com.ravi.Spring_SecurityUsingDB.repo.repo;

@Component
public class customUserDetailsService implements UserDetailsService{
	
	@Autowired
	private repo repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		userDetails user1 = repo.findByemail(email);
		if(repo==null) {
			throw new UsernameNotFoundException("user not found");
		}else {
			return new customUser(user1); 
		}
	}

}
