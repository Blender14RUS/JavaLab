package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = {"/index"})
public class HelloServlet extends HttpServlet {

    List<String> data = new LinkedList<>();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        System.out.println("POST");
        String name = req.getParameter("name");
        data.add(name);
        req.setAttribute("data", data);

        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        System.out.println("GET");
        String name = req.getParameter("name");
        data.add(name);
        req.setAttribute("data", data);

        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("PUT");
        String name = req.getParameter("name");
        data.add(name);
        req.setAttribute("data", data);

        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DELETE");
        String name = req.getParameter("name");
        data.remove(name);
        req.setAttribute("data", data);

        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}