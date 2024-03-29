package cybersoft.javabackend.java18;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
//		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("text/html");
//		resp.getWriter()
//				.append("<form action=\"\" method=\"post\">\r\n"
//						+ "        <label for=\"yourName\">Tell me your name</label>\r\n"
//						+ "        <input type=\"text\" name=\"name\" id=\"\"yourName>\r\n"
//						+ "        <input type=\"submit\" value=\"Send me!\">\r\n" + "      </form>");
//
//		String name = Optional.ofNullable(req.getParameter("name")).orElse("you"); // declarative programming
//		resp.getWriter().format("Welcome %s to Java 18", name);
		String now = LocalDateTime.now().toString();
		req.setAttribute("now", now);
		req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String name = Optional.ofNullable(req.getParameter("name")).orElse("you"); // declarative programming

		DataStorage.put("name", name);
		resp.sendRedirect(req.getContextPath() + "/home");
		
//		resp.getWriter().format("Welcome %s to Java 18", name);
	}

}
