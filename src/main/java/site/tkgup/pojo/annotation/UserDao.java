package site.tkgup.pojo.annotation;

import org.springframework.stereotype.Service;

@Service("usreService")
public class UserDao {
	
	public void save(){
		System.out.println("userDao save..");
	}
	
}
