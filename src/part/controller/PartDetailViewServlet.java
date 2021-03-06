package part.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.ReviewService;
import member.model.vo.ItemReview;
import part.model.service.PartService;
import part.model.vo.Part;

/**
 * Servlet implementation class PartDetailViewServlet
 */
@WebServlet("/pDetail")
public class PartDetailViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartDetailViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("type/html; charset=UTF-8");
		String pId = request.getParameter("id");
		String mid = request.getParameter("mid");
		PartService pservice = new PartService();
		pservice.addReadCount(pId);
		ArrayList<ItemReview> rvwlist = new ReviewService().selectPartReview(pId);
		int likechk = pservice.likechk(pId, mid);
		
		Part p = pservice.partSelect(pId);
		RequestDispatcher view = null;
		if(p != null){
			view = request.getRequestDispatcher("views/item/partDetailView.jsp");
			request.setAttribute("part", p);
			request.setAttribute("like", likechk);
			request.setAttribute("review",rvwlist);
			//request.setAttribute("page", Integer.parseInt(request.getParameter("page")));
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("404-page.jsp");
			request.setAttribute("message","부품 상세보기 페이지 오류!!<br> 관리자에게 문의하세요!");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
