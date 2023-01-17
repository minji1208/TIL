```java
@WebServlet("/list")
public class SubjectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        SubjectService subjectService = SubjectService.getInstance();
        ArrayList<SubjectVO> list = subjectService.subjectList(null);

        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("jdbc/subjectList.jsp");
        dispatcher.forward(request, response);
    }
}
```