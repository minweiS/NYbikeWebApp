package org.XTU.web;

import cn.hutool.json.JSONUtil;
import org.XTU.pojo.StationNbaVO;
import org.XTU.pojo.TopTen;
import org.XTU.service.RealtimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/realtime/tt")
public class TopTenService extends HttpServlet {
    RealtimeService service = new RealtimeService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取请求参数
        String weekstr = req.getParameter("week");
        String hourStr = req.getParameter("hour");
        //2.类型转换
        int week = Integer.parseInt(weekstr);
        int hour = Integer.parseInt(hourStr);
        //3.调用业务层方法
        TopTen tt = service.findTopten(week,hour);
        //4.结果转json
        String result = JSONUtil.toJsonStr(tt);
        //5.通知浏览器返回json格式
        resp.setContentType("application/json;charset = utf-8");
        //6.发送响应数据
        resp.getWriter().write(result);
    }
}