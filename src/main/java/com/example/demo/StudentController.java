package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
	@Value("${Value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homePage() {
		return "Welcome to Student list";
	}
	@GetMapping("/list")
	public List<student>getList(){
		List<student>detailsList=new ArrayList<>();
		detailsList.add(new student(1,"aaa",22));
		detailsList.add(new student(2,"bbb",65));
		detailsList.add(new student(3,"ccc",02));
		return detailsList;
	}

}
