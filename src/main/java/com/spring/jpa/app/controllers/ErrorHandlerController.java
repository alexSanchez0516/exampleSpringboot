package com.spring.jpa.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler(Exception.class)
	public String ExceptionGlobal(Exception ex, Model model) {
		
		model.addAttribute("error", "Error de runtime");
		model.addAttribute("message", ex.getMessage());
		
		return "error/500";
	}
}
