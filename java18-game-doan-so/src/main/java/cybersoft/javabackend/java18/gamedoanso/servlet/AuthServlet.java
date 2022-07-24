package cybersoft.javabackend.java18.gamedoanso.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.javabackend.java18.gamedoanso.Utils.JspUltis;
import cybersoft.javabackend.java18.gamedoanso.Utils.UrlUtils;

@WebServlet(name = "authServlet", urlPatterns = {
		UrlUtils.DANG_KY,
		UrlUtils.DANG_NHAP
})
public class AuthServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (req.getServletPath()) {
		case UrlUtils.DANG_KY:
			req.getRequestDispatcher(JspUltis.DANG_KY);
			break;
		case UrlUtils.DANG_NHAP:
			req.getRequestDispatcher(JspUltis.DANG_NHAP);
			break;
		default:
			break;
		}
	}

}