package com.sample.sample28min.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample28min.model.Stud;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BasicController {
	/* 
	@GetMapping
	public ResponseEntity< Stud > getStuds()
	{
		Stud s = new Stud();
		s.setStudname("ganesha");
		s.setStudregnumber("1");
		return ResponseEntity.status(HttpStatus.OK).body(s);
	}
	*/

	@GetMapping
	public ResponseEntity<Stud> sample()
	{
		return ResponseEntity.status(HttpStatus.OK).body(getSampleStud());
	}
	
	@PostMapping(value = "/getData")
	public ResponseEntity< Stud > getStuds()
	{
		return ResponseEntity.status(HttpStatus.OK).body(getSampleStud());
	}

	@PostMapping("/PostandgetData")
	public ResponseEntity< Stud > getDataWithInput(@RequestBody Stud studdata)
	{
		System.out.println(studdata.getStudname());
		System.out.println(studdata.getStudregnumber());
		return ResponseEntity.status(HttpStatus.OK).body(studdata);
	}
	
	static Stud getSampleStud()
	{

		Stud s = new Stud();
		s.setStudname("ganesha");
		s.setStudregnumber("1");
		return s;
	}
}
