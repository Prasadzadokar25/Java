package pdevelopment;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        // Read inputs
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        String op = req.getParameter("operation");

        int result = 0;

        switch (op) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                if (b != 0) {
                    result = a / b;
                } else {
                    res.getWriter().println("Division by zero not allowed");
                    return;
                }
                break;
        }

        res.setContentType("text/html");
        res.getWriter().println("<h2>Result = " + result + "</h2>");
        res.getWriter().println("<a href='calculator.html'>Go Back</a>");
    }
}
