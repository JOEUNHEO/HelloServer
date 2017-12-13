package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/isReady")
public class IsReadyServlet extends HttpServlet {
	//멤버필드
	private int count;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//방문 횟수 증가 시키기
		count++;
		
		//클라이언트에게 출력할 수 있는 객체의 참조값 얻어오기
		PrintWriter pw = response.getWriter();
		pw.println("<!doctype html>");
		pw.println("<head>");
		pw.println("<title>title</title>");
		pw.println("</head>");
		pw.println("<body>");
		//클라이언트에게 문자열 출력하기
		pw.println("<h3>Okay!</h3>");
		pw.println("count:"+count);
		pw.println("</body>");
		pw.println("</html>");
	}
}
