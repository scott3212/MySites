/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-07-28 02:40:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
      out.write("<head>");
      out.write("<title>");
      out.write("Huizhen Wu's Site");
      out.write("</title>");
      out.write("<link href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/res/cc.css", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null) + "\" type=\"text/css\" rel=\"stylesheet\"/>");
      out.write("</head>");
      out.write("<body>");
      out.write("<h1>");
      out.write("Hello, Visitors! Welcome to my Site!");
      out.write("</h1>");
      out.write("\n");
      out.write("\tThis site is currently under construction, or is for testing purpose. Please come back later!\n");
      out.write("\t");
      out.write("<br/>");
      out.write("<br/>");
      out.write("<h2 style=\"color:red;\">");
      out.write("Concents");
      out.write("</h2>");
      out.write("<h3>");
      out.write("Ericsson");
      out.write("</h3>");
      out.write("<div style=\"margin-left:10px\">");
      out.write("<ul>");
      out.write("<li>");
      out.write("<h4 class=\"inline\">");
      out.write("How to export project as war file in Velocity\n");
      out.write("\t\t\t\t\tStudio, and deploy it on server\n");
      out.write("\t\t\t\t");
      out.write("</h4>");
      out.write("<form class=\"inline\" method=\"POST\" action=\"Deploy\">");
      out.write("<input value=\"See Details\" type=\"submit\"/>");
      out.write("</form>");
      out.write("</li>");
      out.write("<li>");
      out.write("<h4 class=\"inline\">");
      out.write("How to active testportal, to get \n");
      out.write("\t\t\t\t\tgraphic output\n");
      out.write("\t\t\t\t");
      out.write("</h4>");
      out.write("<form class=\"inline\" method=\"POST\" action=\"Testportal\">");
      out.write("<input value=\"See Details\" type=\"submit\"/>");
      out.write("</form>");
      out.write("</li>");
      out.write("<li>");
      out.write("<h4 class=\"inline\">");
      out.write("Node JS ");
      out.write("</h4>");
      out.write("<form class=\"inline\" method=\"POST\" action=\"NodeJS\">");
      out.write("<input value=\"See Details\" type=\"submit\"/>");
      out.write("</form>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<br/>");
      out.write("</div>");
      out.write("<h3>");
      out.write("Build Server with no-ip");
      out.write("</h3>");
      out.write("<div style=\"margin-left:10px\">");
      out.write("<ul>");
      out.write("<li>");
      out.write("<h4 class=\"inline\">");
      out.write("Build a FTP server");
      out.write("</h4>");
      out.write("<form class=\"inline\" method=\"POST\" action=\"BuildingFTP\">");
      out.write("<input value=\"See Details\" type=\"submit\"/>");
      out.write("</form>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</body>");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
