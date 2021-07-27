/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ada.webapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author vatra
 */
@WebServlet(name = "login",urlPatterns = {"/login"})
public class LoginController extends Controller {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String Path = req.getContextPath();
        if (name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            HttpSession session = req.getSession(true);
            session.setAttribute("loggedIn", true);
            resp.sendRedirect(Path + "/admin");
            
        }else{
            resp.sendRedirect(Path + "/login?error");
        }
    }
    
    
   
   
    
}
