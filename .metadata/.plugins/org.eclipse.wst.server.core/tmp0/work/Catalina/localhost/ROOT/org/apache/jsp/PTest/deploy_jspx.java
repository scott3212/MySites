/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-07-28 02:44:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PTest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deploy_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("Export and Deploy");
      out.write("</title>");
      out.write("<link href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/res/cc.css", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null) + "\" type=\"text/css\" rel=\"stylesheet\"/>");
      out.write("</head>");
      out.write("<body>");
      out.write("<h2>");
      out.write("How to Export a Project into war file, and deploy it on DB and Server");
      out.write("</h2>");
      out.write("<ul>");
      out.write("<li>");
      out.write("How to export a Velocity Studio Project (metadata) to a war file");
      out.write("</li>");
      out.write("<ul>");
      out.write("<li>");
      out.write("\n");
      out.write("\t\t\tGo to [Velocity Studio directory] -> designer -> env using any terminal (cmd, powershell, etc.)\n");
      out.write("\t\t\t");
      out.write("</li>");
      out.write("<li>");
      out.write("\n");
      out.write("\t\t\tRun the following command:\n");
      out.write("\t\t\t\t");
      out.write("<p class=\"codingArea\">");
      out.write("\n");
      out.write("\t\t\t\t./runPackage.cmd -multiTenancy [app_name]:1:[node]:cwf:[DB_name] -warFile c:\\[exportFolder]\\cwf.war\n");
      out.write("\t\t\t\t");
      out.write("</p>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<li>");
      out.write("How to deploy application to DB");
      out.write("</li>");
      out.write("<ul>");
      out.write("<li>");
      out.write("In Velocity studio, click runtime -> Deploy Application");
      out.write("</li>");
      out.write("</ul>");
      out.write("<li>");
      out.write("How to deploy application on server");
      out.write("</li>");
      out.write("<ul>");
      out.write("<li>");
      out.write("Install JBoss (usually you don't have to do this)");
      out.write("</li>");
      out.write("<li>");
      out.write("Put cwf.war file into [JBossDir]\\standalone\\deployments\\");
      out.write("</li>");
      out.write("<li>");
      out.write("Goto [JBossDir]\\standalone\\configuration\\, modify standalone.xml file:");
      out.write("</li>");
      out.write("<li>");
      out.write("Looking for tag server -> profile -> subsystem [2nd one], modify DB Info");
      out.write("</li>");
      out.write("<li style=\"list-style-type:square\">");
      out.write("This step may not require if the deployment procedure \n");
      out.write("\t\t\t\tcan run properly.");
      out.write("</li>");
      out.write("</ul>");
      out.write("<li>");
      out.write("How to run two JBoss on same server");
      out.write("</li>");
      out.write("<ul>");
      out.write("<li>");
      out.write("Copy the whole JBoss folder, and modify the standalone.xml as described in \n");
      out.write("\t\t\t\tlast step above");
      out.write("</li>");
      out.write("</ul>");
      out.write("<li>");
      out.write("Run EFTF\n");
      out.write("\t\t\t");
      out.write("<p class=\"codingArea\">");
      out.write("\n");
      out.write("\t\t\t\tjava -jar eftf-uber.jar client --jar eftf-testcase.jar --package com.ericsson.eftftests.testsuite\n");
      out.write("\t\t\t");
      out.write("</p>");
      out.write("</li>");
      out.write("</ul>");
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
