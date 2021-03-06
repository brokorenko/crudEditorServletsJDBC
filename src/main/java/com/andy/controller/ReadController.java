package com.andy.controller;

import com.andy.db.DBControl;
import com.andy.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/read")
public class ReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/read.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(DBControl.check(Integer.parseInt(req.getParameter("id")))){
            Car car = DBControl.read(Integer.parseInt(req.getParameter("id")));
            req.setAttribute("x", car.getBrand());
            req.getRequestDispatcher("/views/result.jsp").forward(req, resp);
        } else req.getRequestDispatcher("views/error.jsp").forward(req, resp);
    }
}

