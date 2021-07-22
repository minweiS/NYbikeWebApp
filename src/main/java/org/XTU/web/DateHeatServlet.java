package org.XTU.web;


import cn.hutool.json.JSONUtil;
import org.XTU.pojo.StationHeat;
import org.XTU.service.DateHeatService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/data/HeatMap")
public class DateHeatServlet extends HttpServlet {
    DateHeatService service = new DateHeatService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //1、获取请求参数
        String datestr = req.getParameter("date");
        String timestr = req.getParameter("time");
        //2、类型转换
        int time = Integer.parseInt(timestr);
        //3、调用业务层方法
        List<StationHeat> stationsheat = service.getStationsHeat(datestr,time);
//        HotStation hs = service.findHotStation(datestr,time);
        //4、结果转json
        String result = JSONUtil.toJsonStr(stationsheat);
        //5、通知浏览器返回json格式
        resp.setContentType("application/json;charset = utf-8");
        //6、发送响应数据
        resp.getWriter().write(result);
    }
}
