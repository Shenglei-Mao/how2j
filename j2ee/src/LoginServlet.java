//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//public class LoginServlet extends HttpServlet {
//  
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    	request.setCharacterEncoding("GBK");
//  
//        String name = request.getParameter("name");
//        String password = request.getParameter("password");
//  
//        String html = null;
//  
//        if ("admin".equals(name) && "123".equals(password))
//            html = "<div style='color:green'>�ɹ�</div>";
//        else
//            html = "<div style='color:red'>ʧ��</div>";
//        
//        response.setContentType("text/html; charset=GBK");
//  
//        PrintWriter pw = response.getWriter();
//        pw.println(html);
//        
//        System.out.println(name);
//        System.out.println(password);
//  
//    }
//  
//}


//import java.io.IOException;
// 
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
// 
//public class LoginServlet extends HttpServlet {
// 
//    private static final long serialVersionUID = 1L;
// 
//    protected void service(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
// 
//        String name = request.getParameter("name");
//        String password = request.getParameter("password");
// 
//        if ("admin".equals(name) && "123".equals(password)) {
//            request.getRequestDispatcher("success.html").forward(request, response);
//        }else {
//        	response.sendRedirect("fail.html");
//        }
// 
//    }
// 
//}


import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class LoginServlet extends HttpServlet {
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
 
        System.out.println("�������������ʱ������URL������Э�� ������ �˿�(�����): " + request.getRequestURL());
        System.out.println("����������������Դ�����֣�ȥ����Э���������: " + request.getRequestURI());
        System.out.println("�������еĲ�������: " + request.getQueryString());
        System.out.println("����������ڵĿͻ�����IP��ַ: " + request.getRemoteAddr());
        System.out.println("����������ڵĿͻ�����������: " + request.getRemoteHost());
        System.out.println("����������ڵĿͻ���ʹ�õ�����˿�: " + request.getRemotePort());
        System.out.println("��������IP��ַ: " + request.getLocalAddr());
        System.out.println("��������������: " + request.getLocalName());
        System.out.println("�õ��ͻ�������ʽ: " + request.getMethod());
 
        String html = null;
 
        if ("admin".equals(name) && "123".equals(password))
            html = "<div style='color:green'>��¼�ɹ�</div>";
        else
            html = "<div style='color:red'>��¼ʧ��</div>";
 
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println(html);
 
    }
 
}