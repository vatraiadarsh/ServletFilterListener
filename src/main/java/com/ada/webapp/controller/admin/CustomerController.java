/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ada.webapp.controller.admin;

import com.ada.webapp.controller.Controller;
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
@WebServlet(name = "customers", urlPatterns = {"/admin/customers/*"})
public class CustomerController extends Controller{
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("loggedIn") == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
        }
        resp.getWriter().println("Secured - Customers");
    }
 
}
