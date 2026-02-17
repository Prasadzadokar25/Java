package pdevelopment.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pdevelopment.model.User;

public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<User> users = new pdevelopment.dao.UserDao().getAllUsers();
            response.getWriter().append("\nUsers: \n");
            for (User user : users) {
                response.getWriter().append(user.getUsername() + " - " + user.getEmail() + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}