import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

/**
 * @author junxchen
 * @date 2020-05-07
 */
public class HelloWorldServlet extends javax.servlet.http.HttpServlet {

  private String message;

  @Override
  public void init() throws ServletException {
    message = "HelloWorld...,First Servlet";
  }

  @Override
  protected void doPost(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response) throws IOException {
    doGet(request, response);
  }

  @Override
  protected void doGet(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response) throws IOException {
    ServletConfig servletConfig = getServletConfig();
    String data = servletConfig.getInitParameter("data");

    // 设置:响应内容类型
    response.setContentType("text/html");

    // 输出文本
    PrintWriter out = response.getWriter();
    out.write("<h1> " + message + ";" + data + " </h1>");
  }
}
