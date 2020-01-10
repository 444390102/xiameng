package page;

import web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main.html")
public class MainPage extends BaseServlet {
    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        super.service(request,response);
        request.getRequestDispatcher("/jsp/main.jsp")
                .forward(request,response);
    }
}
