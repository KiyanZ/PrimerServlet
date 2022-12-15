import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Disco;
import modelo.GestorConsultas;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletListaGrupos.do", value = "/lista-grupos")
public class ServletListaGruposdo extends HttpServlet {
    GestorConsultas gestor = new GestorConsultas();
    String[] authorList = gestor.listaAutores();
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3>" + "Discos Poppy" + "</h3>");
        for (int i = 0; i < authorList.length;i++){
            out.println("<li>" + authorList[i] + "</li>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}
