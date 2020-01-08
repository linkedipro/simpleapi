package com.mx.sip.simpleapi.controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class SimpleController {
	
	private static final Log log = LogFactory.getLog(SimpleController.class);
	
 	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/simple", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity getResponse(HttpServletRequest request, HttpServletResponse response) {
 		Map<Object, Object> model = new HashMap<>();
 		
		model.put("username", "Packo");
		model.put("token", "fklkasd24532");
		model.put("success", true);
		model.put("code", 200);
		log.info("ejecutando controller");
		return ok(model);
	}
}
