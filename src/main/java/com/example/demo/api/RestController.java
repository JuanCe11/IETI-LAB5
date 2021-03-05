package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;

import com.example.demo.services.UserServices;

@RestController
@RequestMapping(value = "/todo")
public class APIController {
	@Autowired
	UserServices userServices;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		try {
			return new ResponseEntity<>(userServices.getAll(), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			Logger.getLogger(APIController.class.getName()).log(Level.SEVERE, null, e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}