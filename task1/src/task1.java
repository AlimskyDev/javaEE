import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

@WebServlet(name = "task1", value = "/task1")
public class task1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("Alim1", "Raisov1", "it", 500000));
        users.add(new User("Alim2", "Raisov2", "it", 600000));
        users.add(new User("Alim3", "Raisov3", "it", 700000));
        users.add(new User("Alim4", "Raisov4", "it", 800000));
        users.add(new User("Alim5", "Raisov5", "it", 900000));

        out.print("<table cellpadding='10px'>");
        out.print("<tr>");
            out.print("<th>");
            out.print("Name");
            out.print("</th>");
            out.print("<th>");
            out.print("Surname");
            out.print("</th>");
            out.print("<th>");
            out.print("Department");
            out.print("</th>");
            out.print("<th>");
            out.print("Salary");
            out.print("</th>");
        out.print("</tr>");

        for (User user: users) {
            out.print("<tr>");
            out.print("<td>"+user.getName()+"</td>");
            out.print("<td>"+user.getSurname()+"</td>");
            out.print("<td>"+user.getDepartment()+"</td>");
            out.print("<td>"+user.getSalary()+"</td>");
            out.print("</tr>");
        }

        out.print("</table>");
    }
}
