package site.tkgup.pojo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ddd")
public class UsreService {
	
	@Autowired
	private UserDao userDao;
	
	public void addNew(){
		System.out.println("userService addNew..");
		userDao.save();
	}
	
}
