package Controller;

import java.io.IOException;

import javax.management.ValueExp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Product_Service;

@WebServlet("/loginlink")
public class Product_Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int qty = Integer.parseInt(req.getParameter("qty"));
		double price = Double.parseDouble(req.getParameter("price"));
		String type = req.getParameter("type");
		
		Product_Service ps = Product_Service.validation(qty, price, type);
		double finalA = ps.getFinalAmt();
		double ogA = ps.getOgAmt();
		
		if(finalA>0)
		{
			req.setAttribute("finalA", finalA);
			req.setAttribute("ogA", ogA);
			req.setAttribute("type", type);
			RequestDispatcher rd = req.getRequestDispatcher("product.jsp");
			rd.forward(req, resp);
		}
	    else 
	    {
			resp.sendRedirect("index.html");
		}
	}
}
