package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/client/css/myprofilecss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container bootstrap snippet\">\n");
      out.write("            <header class=\"header\">\n");
      out.write("                <a href=\"homeP\"><i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i> Home</a>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form class=\"form\" action=\"myprofile\" method=\"POST\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <!--left col-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <div class=\"box_img\">\n");
      out.write("                                <img width=\"200px\" height=\"200px\" src=\"view/client/image/PicCustomer/anh3.jpeg\" id=\"myImg\" class=\"avatar img-circle img-thumbnail\" alt=\"avatar\">\n");
      out.write("                                <div class=\"round\">\n");
      out.write("                                    <input type=\"file\" name=\"imageC\" id=\"image-input\" accept=\"image/*\">\n");
      out.write("                                    <i class=\"fa fa-camera\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"username\">\n");
      out.write("                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"position\">\n");
      out.write("                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"mediasocial\">\n");
      out.write("                                <li> <a href=\"https://www.facebook.com/\">  <img src=\"https://bom.so/bo4U4VE\"> </a></li>\n");
      out.write("                                <li> <a href=\"https://www.instagram.com//\"> <img src=\"https://bom.so/Y7CsoF\"> </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--/col-3-->\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane active\" id=\"home\">\n");
      out.write("                                <hr>                           \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"first_name\">\n");
      out.write("                                            <h4>Full Name</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input  name=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"full_name\" id=\"full_name\"\n");
      out.write("                                               placeholder=\"Full Name\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"cccd\">\n");
      out.write("                                            <h4>CCCD</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.cccd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"cccd\" id=\"cccd\"\n");
      out.write("                                               placeholder=\"Citizen identity card\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"birthofday\">\n");
      out.write("                                            <h4>Birth of Day</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.birthofday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"birthofday\" id=\"birthofday\"\n");
      out.write("                                               placeholder=\"Birth of Day\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"address\">\n");
      out.write("                                            <h4>Address</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.caddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\" id=\"address\"\n");
      out.write("                                               placeholder=\"Address\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"phone\">\n");
      out.write("                                            <h4>Phone Number</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.sdt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\" id=\"phone\"\n");
      out.write("                                               placeholder=\"Phone Number\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"email\">\n");
      out.write("                                            <h4>Email</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAcc.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\" id=\"email\"\n");
      out.write("                                               placeholder=\"you@email.com\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"gender\">\n");
      out.write("                                            <h4>Gender</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"gender\" placeholder=\"Gender\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"username\">\n");
      out.write("                                            <h4>UserName</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input hidden=\"\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.usid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAcc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" id=\"username\"\n");
      out.write("                                               placeholder=\"UserName\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"country\">\n");
      out.write("                                            <h4>Country</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"country\" id=\"country\"\n");
      out.write("                                               placeholder=\"Country\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\">\n");
      out.write("                                        <label for=\"password\">\n");
      out.write("                                            <h4>Password</h4>\n");
      out.write("                                        </label>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAcc.passwork}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"password\" id=\"password\" placeholder=\"password\">\n");
      out.write("                                        <span><i class=\"fa fa-eye\" id=\"eye\" onclick=\"toggle()\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <button class=\"btn btn-lg btn-success\" type=\"submit\"><i class=\"glyphicon glyphicon-ok-sign\"></i> Save</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"view/client/js/myprofilejs.js\"></script>\n");
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
