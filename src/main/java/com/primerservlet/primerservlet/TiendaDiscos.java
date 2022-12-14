package com.primerservlet.primerservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "tiendaDiscos", value = "/tienda-discos")
public class TiendaDiscos extends HttpServlet {
    private String list;
    private String search;
    private String buy;

    public void init() {
        list = "Lista grupos de catalago.";
        search = "Busca discos por grupo.";
        buy = "Compra un disco.";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>" + "Discos Poppy" + "<body>");
        out.println("<h3>" + list + "</h3>");
        out.println("<h3>" + search + "</h3>");
        out.println("<h3>" + buy + "</h3>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}