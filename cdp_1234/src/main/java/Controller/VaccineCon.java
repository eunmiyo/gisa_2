package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.VaccineDAO;

@WebServlet("/")
public class VaccineCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public VaccineCon() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPro(request, response);
	}
	
	protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String context = request.getContextPath();
		String command = request.getServletPath();
		String site = null;
		
		VaccineDAO vac = new VaccineDAO();
		
		switch(command) {
		case "/home" :
			site = "index.jsp";
			break;
		case "/vac" :
			site = "vac.jsp";
			break;
		case "/vaccine" :
			int result = vac.vaccine(request, response);
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			if(result == 1) {
				out.print("<script>");
				out.print("alert('접종예약정보가 등록 되었습니다!'); location.href='"+ context + "';");;
				out.print("</script>");
			} else {
				out.print("<script>");
				out.print("alert('등록실패!'); location.href='"+ context + "';");;
				out.print("</script>");
			}
			break;
		case "/list" :
			break;
		case "/person" :
			break;
		}
		getServletContext().getRequestDispatcher("/" + site).forward(request, response);
	}
	
	
}
