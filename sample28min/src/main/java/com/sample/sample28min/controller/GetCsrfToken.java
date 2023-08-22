package com.sample.sample28min.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class GetCsrfToken {

	/**
	 * Following will retrieve _csrf attribute 
	 * @param req
	 * @return
	 */
	@GetMapping(path="getcsrf")
	public CsrfToken getcsrftokenfromreq(HttpServletRequest req)
	{
		return (CsrfToken) req.getAttribute("_csrf");
	}
}
