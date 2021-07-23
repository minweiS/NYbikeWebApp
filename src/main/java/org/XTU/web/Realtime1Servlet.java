package org.XTU.web;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.XTU.pojo.Realtime1VO;
import org.XTU.pojo.StationNbaVO;
import  org.XTU.service.Realtime1Sevice;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/realtime/realtime1")
public class Realtime1Servlet extends HttpServlet {
    Realtime1Sevice service =new Realtime1Sevice();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        //String sid=req.getParameter("sid");;
        //2.类型转换
        //3.调用业务层方法
        Realtime1VO vo=service.findRealtime1();
        //4.结果转json
        String result= JSONUtil.toJsonStr(vo);
        //5.通知浏览器返回json格式
        resp.setContentType("application/json;charset=utf-8");
        //6.发送响应数据
        resp.getWriter().write(result);
    }
}
