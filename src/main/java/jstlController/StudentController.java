package jstlController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jstlEntity.Student;
@Controller
@RequestMapping(value ="student")
public class StudentController {
	// in use /student_15_10 
	@RequestMapping(value="index", method = RequestMethod.GET) 
	public String index2(ModelMap model) { 
		Student svl = new Student("Pham Minh Tuan", 5.5, "Ung dung phan mem",null,null);
		Student sv2 = new Student("Nguyen Thi Kieu Oanh", 9.5, "Thiet ke trang web", null, null); 
		Student sv3 = new Student("Le Pham Tuan Kiet", 3.5, "Thiet ke trang web", null,null ); 
		List<Student> list = new ArrayList<Student>(); 
		list.add(svl);
		list.add(sv2); 
		list.add(sv3); 
		
		
		Map<String, Student> map = new HashMap<String, Student>();
	
		
		map.put("OanhNTK", sv2); 
		map.put("KietLPT", sv3); 
		model.addAttribute("bean", svl); 
		model.addAttribute("list", list); 
		model.addAttribute("map", map); 
		return "student/index2";


	}
	
}
