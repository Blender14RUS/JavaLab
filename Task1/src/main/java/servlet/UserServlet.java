package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(urlPatterns = {"/index"})
public class UserServlet extends HttpServlet {
    List<String> data = new LinkedList<>();
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("--put--");
        String body = inputStreamToString(req.getInputStream());
        body = body.substring(1, body.length()-1);
        if (!data.contains(body)) data.add(body);

        System.out.println(data);
        req.setAttribute("data", data);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("--get--");
        String name = req.getParameter("name");
        System.out.println(name);
        if (name!= null) data.add(name);
        System.out.println(data);
        req.setAttribute("data", data);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--post--");
        String name = req.getParameter("name");
        data.add(name);
        System.out.println(data);
        req.setAttribute("data", data);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--delete--");
        String body = inputStreamToString(req.getInputStream());
        body = body.substring(1, body.length()-1);
        if (data.contains(body)) data.remove(body);
        System.out.println(data);
        req.setAttribute("data", data);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    private static String inputStreamToString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        return scanner.hasNext() ? scanner.useDelimiter("\\A").next() : "";
    }
}