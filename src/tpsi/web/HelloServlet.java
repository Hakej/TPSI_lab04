package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // Zadanie 1
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        Person person = new Person(firstName, lastName, email);

        request.setAttribute("person", person);

        // Zadanie 2
        List<String> dni = new ArrayList<>();
        dni.add("Poniedziałek");
        dni.add("Wtorek");
        dni.add("Środa");
        dni.add("Czwartek");
        dni.add("Piątek");

        request.setAttribute("dniTygodnia", dni);

        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}