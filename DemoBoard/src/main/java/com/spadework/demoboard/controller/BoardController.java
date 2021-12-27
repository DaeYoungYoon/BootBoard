package com.spadework.demoboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/list")
	public String getBoardList() {
		return "list";
	}
}
