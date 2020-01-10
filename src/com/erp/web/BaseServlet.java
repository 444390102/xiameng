package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseServlet extends HttpServlet {

    protected HttpSession session;
    protected PrintWriter out;
    protected String url;
    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       response.setContentType("text/html;charset=UTF-8");
       this.session = request.getSession();
       this.out = response.getWriter();
       this.url = request.getRequestURI();
    }


}
