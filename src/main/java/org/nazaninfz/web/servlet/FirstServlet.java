package org.nazaninfz.web.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet {
    private ServletConfig config;

    public void init(ServletConfig config) {
        this.config = config;

        System.out.println("servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");

    }

    public void destroy() {
        System.out.println("servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "Nazanin copyright 2007-1010";
    }

}  