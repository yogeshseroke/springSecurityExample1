package springSecurityExample1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springSecurityExample1.model.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("abc", "abc", "abc@gmail.com"));
		list.add(new User("xyz", "abcxyz", "xyz@gmail.com"));
	}
	
	//get all users 
	public List<User> getAllUsers(){
		return this.list;
	}
	
	//get single user
	public User getUser(String userName) {
		return this.list.stream().filter((user) -> user.getUserName().equals(userName)).findAny().orElse(null);
	}
	
	//add single user
	public User addUser(User userName) {
		this.list.add(userName);
		return userName;
	}
}
