package com.andy.controller;

import com.andy.db.DBControl;
import com.andy.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update")
public class UpdateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (DBControl.check(Integer.parseInt(req.getParameter("id")))) {
            Car car = new Car();
            car.setId(Integer.parseInt(req.getParameter("id")));
            car.setBrand(req.getParameter("brand"));
            car.setColor(req.getParameter("color"));
            car.setModel(req.getParameter("model"));

            DBControl.update(car);
            req.getRequestDispatcher("/views/result.jsp").forward(req, resp);
        } else req.getRequestDispatcher("views/error.jsp").forward(req, resp);
    }
}
