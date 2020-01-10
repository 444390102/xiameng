package web;

import com.alibaba.fastjson.JSONObject;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;
import util.Result;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginAction")
public class LoginAction extends web.BaseServlet {

    private UserService userService = new UserServiceImpl();


    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        super.service(request,response);
        User user = new User();
        user.setAcc(request.getParameter("acc"));
        user.setPwd(request.getParameter("pwd"));
        User findUser = userService.queryUserByUser(user);
        Result r = new Result();
        if (findUser == null){
            r.setCode(Result.LOGIN_ERROR);
            r.setMsg("用户名或密码错误");
        } else {
            r.setCode(Result.SUCCESS_CODE);
            r.setData(findUser);
            //存储session（操作cookie）
            session.setAttribute("user",findUser);
            session.setAttribute("area",findUser.getArea());
        }
        String jsonStr =  JSONObject.toJSONString(r);
        out.print(jsonStr);
    }
}
