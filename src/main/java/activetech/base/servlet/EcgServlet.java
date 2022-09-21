package activetech.base.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EcgServlet extends HttpServlet {
	
	public EcgServlet(){
		super();
	}
	
	@Override
	public void destroy(){
		super.destroy();
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String result = null;
		try {
			ServletInputStream inputStream = request.getInputStream();
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			byte[] rs = new byte[1024];
			int len = 0;
            byte[] req = null;
            while ((len = inputStream.read(rs)) != -1) {
                outputStream.write(rs, 0, len);
                req = outputStream.toByteArray();
            }
            result = new String(req, "UTF-8");
            System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(result);
	}

	@Override
	public void init() throws ServletException{
	    	
	}
	
}
