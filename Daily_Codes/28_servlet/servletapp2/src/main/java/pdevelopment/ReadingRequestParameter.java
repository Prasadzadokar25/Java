package pdevelopment;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadingRequestParameter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = 0;
        if (ageStr != null && !ageStr.isEmpty()) {
            try {
                age = Integer.parseInt(ageStr);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        response.getWriter().println("Name: " + name);
        response.getWriter().println("Age: " + age);

    }

}
