/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ada.webapp.controller.admin;

import com.ada.webapp.controller.Controller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author vatra
 */
@WebServlet(name = "download", urlPatterns = {"/admin/download/*"})
@MultipartConfig()

public class DownloadController extends Controller {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = "C:\\Users\\vatra\\Desktop\\java\\ServletFilterListener\\src\\main\\webapp\\uploads\\";

        resp.setHeader("Content-Type", "image/jpg");
        InputStream is = new FileInputStream(path + "kitten.jpg");
        int i = 0;
        byte[] data = new byte[1024];
        while ((i = is.read(data)) != -1) {
            resp.getOutputStream().write(data, 0, i);
        }
        is.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("ufile"); // file so no getParam getPart for multiple file getParts<collection>
        if (part != null) {
            String path = req.getServletContext().getRealPath("uploads/");
            System.out.println(path);
            InputStream is = part.getInputStream();
            FileOutputStream os = new FileOutputStream(path + "/" + part.getSubmittedFileName());
            int i = 0;
            byte[] data = new byte[1024 * 5];
            while ((i = is.read(data)) != -1) {
                os.write(data, 0, i);
            }
            os.close();
            is.close();
            resp.getWriter().println(part.getSubmittedFileName());

        }

    }

}
