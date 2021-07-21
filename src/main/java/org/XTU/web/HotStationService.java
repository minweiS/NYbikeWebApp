package org.XTU.web;

import cn.hutool.json.JSONUtil;
import org.XTU.pojo.HotStation;
import org.XTU.service.RealtimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/realtime/hots")
public class HotStationService extends HttpServlet {
    RealtimeService service = new RealtimeService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //1. 获取请求参数
//        String stationid = req.getParameter("stationid");
//        String outtime = req.getParameter("outtime");
//        //2.类型转换
//        int hour = Integer.parseInt(outtime);
//        //3.调用业务层方法
//        HotStation hs = service.findHotStation(stationid,hour);
//        //4.结果转json
//        String result = JSONUtil.toJsonStr(hs);
//        //5.通知浏览器返回json格式
//        resp.setContentType("application/json;charset = utf-8");
//        //6.发送响应数据
//        resp.getWriter().write(result);
        //1. 获取请求参数
        String datestr = req.getParameter("date");
        String timestr = req.getParameter("time");
        //2.类型转换
        int time = Integer.parseInt(timestr);
        //3.调用业务层方法
        HotStation hs = service.findHotStation(datestr,time);
        //4.结果转json
        String result = JSONUtil.toJsonStr(hs);
        //5.通知浏览器返回json格式
        resp.setContentType("application/json;charset = utf-8");
        //6.发送响应数据
        resp.getWriter().write(result);

    }
}