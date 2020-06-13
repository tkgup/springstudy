package site.tkgup.pojo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
	
	@Autowired
	private UsreService usreService;
	
	public void execute(){
		System.out.println("execute begin..");
		usreService.addNew();
	}
	
}
