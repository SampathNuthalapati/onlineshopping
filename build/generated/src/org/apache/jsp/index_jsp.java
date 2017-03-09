package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: Orange;\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: blue;\n");
      out.write("                padding: 15px 0px 15px 0px;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30px;\n");
      out.write("                background-color: Orange;\n");
      out.write("                position: fixed;\n");
      out.write("                bottom: 0px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                background-color: brown;\n");
      out.write("                height: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            nav a{\n");
      out.write("                font-size: 15px;\n");
      out.write("                background-color: wheat;\n");
      out.write("                padding: 5px 45px 5px 45px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='header'>\n");
      out.write("            Flipcart\n");
      out.write("        </div>\n");
      out.write("            <nav>\n");
      out.write("                <a href='#'>Home</a>\n");
      out.write("                <a href='#'>About</a>\n");
      out.write("                <a href='#'>Contact Us</a>\n");
      out.write("                <a href='#'>Feedback</a>\n");
      out.write("            </nav>\n");
      out.write("        \n");
      out.write("        <div class='content'>\n");
      out.write("            <form>\n");
      out.write("                <input type=\"text\" name=\"firstName\" value=\"\" />\n");
      out.write("                <input type=\"text\" name=\"firstName\" value=\"\" />\n");
      out.write("                <input type=\"text\" name=\"firstName\" value=\"\" />\n");
      out.write("                <input type=\"radio\" name=\"Gender\" value=\"Male\" checked=\"checked\" />\n");
      out.write("                <input type=\"radio\" name=\"Gender\" value=\"Female\" />\n");
      out.write("                <input type=\"password\" name=\"password\" value=\"\" />\n");
      out.write("                <input type=\"submit\" value=\"SignUp\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class='footer'>\n");
      out.write("            &copy Copyright to NIIT. All rights received 2017\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
