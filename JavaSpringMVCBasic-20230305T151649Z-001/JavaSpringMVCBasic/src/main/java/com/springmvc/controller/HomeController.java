package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController
{
@RequestMapping("/")
public String mvcpage()
{
	System.out.println("Displaying HomePage !!!");
	return "homepage";
}
}
