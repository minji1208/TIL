package com.jdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subject.SubjectVO;

/**
 * Servlet implementation class SubjectInsert
 */
@WebServlet("/insert")
public class SubjectInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SubjectVO vo = new SubjectVO();
		vo.setS_name(request.getParameter("s_num"));
		vo.setS_name(request.getParameter("s_name"));
		
		SubjectService subjectService = SubjectService.getInstance();
		boolean result = subjectService.subjectInsert(vo);
		
		if(result) {
			response.sendRedirect("/scriptTag/list");
		} else {
			request.setAttribute("message", "게시글 등록 실패");
			RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
