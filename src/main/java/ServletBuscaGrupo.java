import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletBuscaGrupo", value = "/busca-disco")
public class ServletBuscaGrupo extends HttpServlet {

    private String write = "Escribe el nombre del autor: ";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println("<html>" + "Formulario Para Buscar Autor" + "<body>");
        out.println("<form method="+ "post" + "action=" + "ServletBuscaAutor>" );
        out.println("<h3>" + write + "<input name="+ "authorName>" + "</h3>");
        out.println("<input type=" + "submit" + "value=" + "BUSCAR>"+ "</form");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
