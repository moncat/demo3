package com.moncat.demo3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {



	@RequestMapping(value="/", method= {RequestMethod.GET})
    public String index() {
		  return "https success"+System.currentTimeMillis();
	}


}