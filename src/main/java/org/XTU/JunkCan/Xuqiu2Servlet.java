package cn.tedu.web;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.tedu.pojo.StationNbaVO;
import cn.tedu.pojo.Xuqiu2VO;
import cn.tedu.service.Xuqiu2Sevice;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/realtime/xuqiu2")
public class Xuqiu2Servlet extends HttpServlet {
    Xuqiu2Sevice service =new Xuqiu2Sevice();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        String sidstr=req.getParameter("sid");
        //2.类型转换
        //3.调用业务层方法
        Xuqiu2VO vo=service.findXuqiu2(sidstr);
        //4.结果转json
        String result= JSONUtil.toJsonStr(vo);
        //5.通知浏览器返回json格式
        resp.setContentType("application/json;charset=utf-8");
        //6.发送响应数据
        resp.getWriter().write(result);
    }
}
