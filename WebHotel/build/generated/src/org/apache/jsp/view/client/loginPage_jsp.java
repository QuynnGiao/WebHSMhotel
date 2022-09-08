package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>WELCOME LOGIN</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/client/css/styleLogin.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("\n");
      out.write("            <div class=\"form sign-in\">\n");
      out.write("                <form action=\"login\" method=\"post\">\n");
      out.write("                    <h2>Sign In</h2>                \n");
      out.write("                    <label>\n");
      out.write("                        User Name:\n");
      out.write("                        <input name=\"user\" type=\"text\"><br>\n");
      out.write("                        <span class=\"form-mess\"></span>\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        Password:\n");
      out.write("                        <input name=\"pass\" type=\"password\"><br>\n");
      out.write("                        <span class=\"form-mess\"></span>\n");
      out.write("                    </label>\n");
      out.write("                    <button class=\"submit\" name=\"submit\">Sign In</button>\n");
      out.write("                    \n");
      out.write("                    <p class=\"forgot-pass\">Forgot Password ?</p>\n");
      out.write("\n");
      out.write("                    <div class=\"social-media\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a href=\"https://www.facebook.com/\">  <img src=\"https://www.facebook.com/images/fb_icon_325x325.png\"> </a></li>\n");
      out.write("                            <li> <a href=\"https://www.instagram.com//\"> <img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Instagram-Icon.png/800px-Instagram-Icon.png\"> </a></li>\n");
      out.write("                            <li> <a href=\"https://mail.google.com/\"> <img src=\"https://i.pinimg.com/originals/74/65/f3/7465f30319191e2729668875e7a557f2.png\"> </a></li>\n");
      out.write("                            <li> <a href=\"https://www.icloud.com/\"> <img src=\"https://i.pinimg.com/originals/1e/c1/1a/1ec11a869384bc5e59625bac39b6a099.png\"> </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"sub-cont\">\n");
      out.write("                <div class=\"img\">\n");
      out.write("                    <div class=\"img-text m-up\">\n");
      out.write("                        <h2>New here?</h2>\n");
      out.write("                        <p>Sign up and discover great amount of new opportunities!</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"img-text m-in\">\n");
      out.write("                        <h2>One of us?</h2>\n");
      out.write("                        <p>If you already has an account, just sign in. We've missed you!</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"img-btn\">\n");
      out.write("                        <span class=\"m-up\">Sign Up</span>\n");
      out.write("                        <span class=\"m-in\">Sign In</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form sign-up\">\n");
      out.write("                    <form name=\"f1\" action=\"signup\" method=\"post\">\n");
      out.write("                        <h2>Sign Up</h2>\n");
      out.write("                        \n");
      out.write("                        <label>\n");
      out.write("                            <span>User Name:</span>\n");
      out.write("                            <input name=\"user\" type=\"text\" value=\"\" onchange=\"validateN()\" id=\"name\" required > \n");
      out.write("                            <span class=\"form-mess\">Vui lòng điền trường này</span>\n");
      out.write("                        </label>\n");
      out.write("                        <label >\n");
      out.write("                            <span>Email</span>\n");
      out.write("                            <input type=\"email\" name=\"email\" onchange=\"validateE()\" id=\"email\" required>\n");
      out.write("                            <span class=\"form-mess\"></span>\n");
      out.write("                        </label>\n");
      out.write("                        <label >\n");
      out.write("                            <span>Password</span>\n");
      out.write("                            <input type=\"password\" name=\"pass\" onchange=\"validateP1()\" id=\"pass\" required>\n");
      out.write("                            <span class=\"form-mess\"></span>\n");
      out.write("                        </label>\n");
      out.write("                        <label >\n");
      out.write("                            <span>Confirm Password</span>\n");
      out.write("                            <input type=\"password\" name=\"repass\"  id=\"repass\" required>\n");
      out.write("                            <span class=\"form-mess\"></span>\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                        <button name=\"submit\" class=\"submit\" onclick=\"matchPassword()\" >Sign Up Now</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"view/client/js/jsLogin.js\"></script>\n");
      out.write("\n");
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
