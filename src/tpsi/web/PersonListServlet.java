package tpsi.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PersonListServlet", urlPatterns = "/personList")
public class PersonListServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michal", "Uszak", "michal.uszak@mail.com"));
        people.add(new Person("Jezus", "Chrystus", "jezus.chrystus@niebo.eu"));
        people.add(new Person("Jan", "Kowalski", "jan.kowalski@wp.pl"));

        request.setAttribute("people", people);

        request.getRequestDispatcher("personList.jsp").forward(request, response);
    }
}
