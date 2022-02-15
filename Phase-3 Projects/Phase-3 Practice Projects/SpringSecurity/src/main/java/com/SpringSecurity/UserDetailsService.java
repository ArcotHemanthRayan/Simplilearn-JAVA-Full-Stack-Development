package com.SpringSecurity;


@Service
public class MyUserDetailsService implements MyUserDetailsService 
{

	@Autowired
	UsersRepository userRepo;
	
	public User GetUserByName(String name) 
	{
		Optional<User> user = userRepo.findUserByName(name);
		if(!user.isPresent()) throw new RuntimeException();
		return user.get();
	}

	@Override
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException 
	{
		return new UserDetails(GetUserByName(username));
	}

}
