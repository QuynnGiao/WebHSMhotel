package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styleP.css\">\n");
      out.write("\n");
      out.write("    <title>User Profile...!</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"my-5 page\" size=\"A4\">\n");
      out.write("\n");
      out.write("        <h2 style=\"text-align:center\">User Profile </h2>\n");
      out.write("\n");
      out.write("        <div class=\"card\">\n");
      out.write("        <img src=\"img/team/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.eimage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" style=\"height: 535px; width: 500px;  display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("        <div style=\"margin: 45px 0;\">\n");
      out.write("    <div class=\"detailInfo\">\n");
      out.write("<div class=\"row my-2\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">Name:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row my-2\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">SDT:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.sdt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row my-2\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">Email:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<div class=\"row my-2\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">Gender:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row my-2\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">Address:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-lg-4 col-12 boldd\">Birthday:</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-8 col-12 b\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("</div>\n");
      out.write("<p>\n");
      out.write("    <a href=\"dashboard.jsp\"><button>Satisfied</button></a>\n");
      out.write("    \n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
