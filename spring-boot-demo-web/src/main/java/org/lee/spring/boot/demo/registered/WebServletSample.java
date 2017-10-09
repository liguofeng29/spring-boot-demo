package org.lee.spring.boot.demo.registered;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="RegisteredServlet2", urlPatterns={"/servlet2"})
public class WebServletSample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("@WebServletで登録されたServletです。");
        writer.println("@ServletComponentScanで検索され、登録されます。");
        writer.println("@WebFilter,@WebListenerも同じく使えます。");
        writer.flush();
    }
}
