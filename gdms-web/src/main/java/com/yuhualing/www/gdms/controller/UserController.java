package com.yuhualing.www.gdms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by macbook on 17/4/28.
 */
@Controller
//@SessionAttributes("userId")
public class UserController {

    @RequestMapping("/")
    public String router(String u) {
        if("".equals(u) || null == u) {
            return "redirect:/main";
        }
        return u;
    }

    @RequestMapping("/404")
    public String f0f() {
        return "404";
    }

    @RequestMapping(value = "/user/signin", method = RequestMethod.GET)
    public String signIn(HttpServletRequest request) {
        return "signin";
    }

    @RequestMapping(value = "/user/signin", method = RequestMethod.POST)
    public String doSignIn(HttpSession session) {
        session.setAttribute("userId", "abc");
        return "redirect:/main";
    }

    @RequestMapping("/main")
    public String main(HttpSession session) {
        String userId = (String) session.getAttribute("userId");

        if("".equals(userId) || null == userId) {
            return "redirect:/user/signin";
        } else {
            return "main";
        }
    }

    @RequestMapping("/user/signout")
    public String signout(HttpSession session) {
        session.removeAttribute("userId");

        return "redirect:/user/signin";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String query(HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        return userId;
    }

}
