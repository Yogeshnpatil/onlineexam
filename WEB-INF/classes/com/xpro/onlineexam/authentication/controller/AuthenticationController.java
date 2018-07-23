/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpro.onlineexam.authentication.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Yogi
 */
@Controller
@RequestMapping(value = "login.htm")
public class AuthenticationController
{
    static final Logger logger = Logger.getLogger(AuthenticationController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String showLoginPage()
    {
        logger.info("Hello");
        return "login";
    }
    @RequestMapping(params = "action=authenicate", method = RequestMethod.POST)
    public String authenticate()
    {
        return "index";
    }
}
