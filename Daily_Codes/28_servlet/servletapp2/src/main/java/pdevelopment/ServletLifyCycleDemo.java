package pdevelopment;

import java.io.IOException;

import javax.servlet.http.*;

public class ServletLifyCycleDemo extends HttpServlet {

    @Override
    public void init() {
        System.out.println("init() get called");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("service() get called");
        resp.getWriter().println("Servlet life cycle demo");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() get called");
    }
}
