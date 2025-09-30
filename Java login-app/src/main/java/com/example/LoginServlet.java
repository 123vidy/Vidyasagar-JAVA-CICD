package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // Simple static check for demo. In real apps use DB + hashing.
        if("admin".equals(user) && "password".equals(pass)) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("welcome.jsp");
        } else {
            response.getWriter().println("Invalid username or password!");
        }
    }
}
