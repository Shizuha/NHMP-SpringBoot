package ERP.counselingLog.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounselingLogFileDownServlet
 */
@WebServlet("/counselfdown")
public class CounselingLogFileDownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounselingLogFileDownServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//환자 상담일지 파일 다운로드 처리용 컨트롤러
		String savePath = request.getSession().getServletContext().getRealPath("/resources/ERP/cl_upfiles");
		
		String originalFileName = request.getParameter("ofile");
		String renameFileName = request.getParameter("rfile");
		
		File downFile = new File(savePath + "\\" + renameFileName);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(downFile));
		
		ServletOutputStream downOut = response.getOutputStream();
		
		response.setContentType("text/plain; charset=utf-8");
		response.addHeader("Content-Disposition", "attachment; filename=\'"
				+ new String(originalFileName.getBytes("UTF-8"), "ISO-8859-1") + "\'");
		response.setContentLength((int)downFile.length());
		
		int read = -1;
		while((read = bin.read()) != -1) {
			downOut.write(read);
			downOut.flush();
		}
		
		downOut.close();
		bin.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
