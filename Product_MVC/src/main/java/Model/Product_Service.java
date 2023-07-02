package Model;

import javax.servlet.http.HttpServlet;

public class Product_Service extends HttpServlet {
	static double finalAmt = 0.0;
	static double ogAmt = 0.0;
	
	public Product_Service(double finalAmt, double ogAmt)
	{
		this.finalAmt = finalAmt;
		this.ogAmt = ogAmt;
	}

	public static double getFinalAmt() {
		return finalAmt;
	}

	public static double getOgAmt() {
		return ogAmt;
	}
	public static Product_Service validation(int qty, double price, String type)
	{
		if(type.equals("prime"))
		{
			ogAmt = price*qty;
			finalAmt = ogAmt+ogAmt*0.05;
		}
		else if (type.equals("notprime")) {
			ogAmt = price*qty;
			finalAmt = ogAmt+ogAmt*0.05+40;
			
		}
		
		return new Product_Service(finalAmt, ogAmt);
	}
}
