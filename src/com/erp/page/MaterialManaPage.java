package page;

import com.alibaba.fastjson.JSONObject;
import service.MaterialManaService;
import service.impl.MaterialManaServiceImpl;
import util.Page;
import util.Result;
import web.BaseServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/materialMana.html")
public class MaterialManaPage extends BaseServlet {
    private MaterialManaService materialManaService
            = new MaterialManaServiceImpl();

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        super.service(request,response);
        String action = request.getParameter("action");

        if (action != null && "queryCode".equals(action)){
            queryCode(request,response);
            return;
        } else if (action != null && "queryMaterialByIds".equals(action)){
            queryMaterialByIds(request,response);
            return;
        } else if (action != null && "disableMaterialMana".equals(action)) {
            disableMaterialMana(request,response);
            response.sendRedirect("materialMana.html?currentPage=1&pageCount=20");
            return;
        }

        int area = (int)session.getAttribute("area");
        Page page = new Page();
        String currentPageStr = request.getParameter("currentPage");
        if (currentPageStr != null){
            page.currentPage = Integer.parseInt(currentPageStr);
        }
        String pageCountStr = request.getParameter("pageCount");
        if (pageCountStr != null){
            page.pageCount = Integer.parseInt(pageCountStr);
        }

        //查询下拉框列表
        List<String> cataList = materialManaService.queryAllCata();
        List<String> unitList = materialManaService.queryAllUnit();
        List<String> accountList = materialManaService.queryAllAccount();

        request.setAttribute("cataList",cataList);
        request.setAttribute("unitList",unitList);
        request.setAttribute("accountList",accountList);

        //检索一次数据
        //查询20条数据出来
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("area",area);
        params.put("mm_cata",request.getParameter("mm_cata"));
        params.put("mm_code",request.getParameter("mm_code"));
        params.put("mm_name",request.getParameter("mm_name"));
        params.put("mm_spec",request.getParameter("mm_spec"));
        params.put("mm_supply",request.getParameter("mm_supply"));
        params.put("mm_unit",request.getParameter("mm_unit"));
        params.put("mm_account",request.getParameter("mm_account"));
        params.put("mm_location",request.getParameter("mm_location"));
        List<Map<String,Object>> mlist =
                materialManaService.queryAllMaterialMana(params,page);
        request.setAttribute("mlist",mlist);
        request.setAttribute("page",page);
        request.getRequestDispatcher("/jsp/materialMana.jsp")
                .forward(request,response);
    }

    private void disableMaterialMana(HttpServletRequest request, HttpServletResponse response) {
        String ids = request.getParameter("ids");
        materialManaService.disableMaterialMana(ids);
    }

    private void queryCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        String code = request.getParameter("value");
        List<String> codeList =  materialManaService.queryAllCodeByValue(code);
        Result r = new Result();
        r.setCode(Result.SUCCESS_CODE);
        r.setData(codeList);
        String jsonStr =  JSONObject.toJSONString(r);
        out.print(jsonStr);

    }

    private void queryMaterialByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        String ids = request.getParameter("ids");
        List<Map<String,Object>> mlist =  materialManaService.queryMaterialByIds(ids);
        Result r = new Result();
        r.setCode(Result.SUCCESS_CODE);
        r.setData(mlist);
        String jsonStr =  JSONObject.toJSONString(r);
        out.print(jsonStr);

    }
	
}
