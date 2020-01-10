package util;

import pojo.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class RoleFilter implements Filter {
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String uri = request.getRequestURI();
        System.out.println("uri:" + uri);
        //login.html
        //loginAction
        if(!uri.contains("login") && uri.contains("html")){
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if(user == null){
                response.sendRedirect("login.html");
                return;
            }
        }
        chain.doFilter(req, resp);

    }
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
