package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/vendors/linericon/style.css\">\n");
      out.write("    <!--        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/vendors/owl-carousel/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/vendors/nice-select/css/nice-select.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("    <link href=\"view/client/css/jquery.nice-number.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/css/paythu2.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/css/stylethu3.1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/client/css/responsive.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--================Header Area =================-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!--================Header Area =================-->   \n");
      out.write("\n");
      out.write("    <!--================Breadcrumb Area =================-->\n");
      out.write("    <section class=\"breadcrumb_area\">\n");
      out.write("        <div class=\"overlay bg-parallax\" data-stellar-ratio=\"0.8\" data-stellar-vertical-offset=\"0\" data-background=\"\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-cover text-center\">\n");
      out.write("                <h2 class=\"page-cover-tittle\">Make A Reservation</h2>\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li><a href=\"homeP\">Home</a></li>\n");
      out.write("                    <li class=\"active\">Make A Reservation</li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!--================Breadcrumb Area =================-->\n");
      out.write("    <!--================Book Area =================-->\n");
      out.write("    <section class=\"pay_area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"progress-bar\">\n");
      out.write("                <div class=\"step\">\n");
      out.write("                    <p>Dates & Rooms</p>\n");
      out.write("                <div class=\"bullet\">\n");
      out.write("                    <span>1</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"check fas fa-check\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"step\">\n");
      out.write("                    <p>Extras</p>\n");
      out.write("                <div class=\"bullet\">\n");
      out.write("                    <span>2</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"check fas fa-check\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"step\">\n");
      out.write("                    <p>Voucher</p>\n");
      out.write("                <div class=\"bullet\">\n");
      out.write("                    <span>3</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"check fas fa-check\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"step\">\n");
      out.write("                    <p>Confirmation</p>\n");
      out.write("                    <div class=\"bullet\">\n");
      out.write("                        <span>4</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"check fas fa-check\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8 left-pay\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3 col-md-6 col-lg-4 pay-picRoom\">\n");
      out.write("                            <div class=\"image_payroom\">\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.urlimage1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-9 col-md-6 col-lg-8 pay-infoRoom\">\n");
      out.write("                            <span class=\"text-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.priceRoom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$ / Night</span>\n");
      out.write("                            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                            <span>\n");
      out.write("                                <i class=\"star-rating\"></i>\n");
      out.write("                                <i class=\"star-rating\"></i>\n");
      out.write("                                <i class=\"star-rating\"></i>\n");
      out.write("                                <i class=\"star-rating\"></i>\n");
      out.write("                                <i class=\"star-rating\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>beds <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.bedNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <i class=\"fa fa-bed\"></i></span></li>\n");
      out.write("                                <li>guests <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.peopleNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <i class=\"fa fa-users\"></i></span></li>\n");
      out.write("                                <li>bath <span> <i class=\"fa fa-bath\"></i></span></li>\n");
      out.write("                                <li>wifi <span><i class=\"fa fa-wifi\"></i></span></li>\n");
      out.write("                                <li>tv <span> <i class=\"fa fa-tv\"></i></span></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"description\">\n");
      out.write("                            <h2>Good to know:</h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.describle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("erisque enim ligula\n");
      out.write("                                    venenatis dolor. Maecenas nisl est,\n");
      out.write("                                    ultrices nec <span id=\"dots\">...</span><span id=\"more\">congue eget, auctor vitae massa. Fusce luctus vestibulum augue ut\n");
      out.write("                                    aliquet. Nunc sagittis dictum\n");
      out.write("                                    nisi, sed ullamcorper ipsum dignissim ac. In at libero sed nunc venenatis imperdiet\n");
      out.write("                                    sed ornare turpis. Donec\n");
      out.write("                                    vitae dui eget tellus gravida venenatis. Integer fringilla congue eros non\n");
      out.write("                                    fermentum. Sed dapibus pulvinar nibh\n");
      out.write("                                    tempor porta.</span></p>\n");
      out.write("                            <button onclick=\"readMore()\" id=\"myBtn\">Read more</button>\n");
      out.write("                        </div>\n");
      out.write("                <form action=\"bill\" method=\"post\" class=\"formPay\">\n");
      out.write("                <!-- Infomation -->               \n");
      out.write("                        <div class=\"InfoBooking page-Step page-active slidePage\">\n");
      out.write("                            <h3>Enter your details</h3>\n");
      out.write("                                <div class=\"formBox\">\n");
      out.write("                                    <input hidden name=\"rid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.rid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("\n");
      out.write("                                    <div class=\"rows50\">\n");
      out.write("                                        <div class=\"inputBox\">\n");
      out.write("                                            <span>Arrival Date</span>\n");
      out.write("                                            <input type=\"date\" name=\"datecheckin\"  placeholder=\"Arrival Date\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"inputBox\">\n");
      out.write("                                            <span>Departure Date</span>\n");
      out.write("                                            <input type=\"date\" name=\"datecheckout\"  placeholder=\"Departure Date\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"rows50\">\n");
      out.write("                                        <div class=\"inputBox\">\n");
      out.write("                                            <span>Note</span>\n");
      out.write("                                            <textarea name=\"note\" placeholder=\"Write your message what are your recommendations for the hotel?...\"></textarea>\n");
      out.write("                                        </div>                                       \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"field nextBtn\">\n");
      out.write("                                        <a data-toggle=\"pill\" href=\"#\" class=\"btn btn-next\">Next</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Service-Menu -->\n");
      out.write("                        <div class=\"container Service-Menu page-Step slidePage\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12 text-center\">\n");
      out.write("                                    <div class=\"section-title\"><span>Add to your stay</span></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tabs-icon col-md-10 offset-md-1 text-center\">\n");
      out.write("                                            <div class=\"owl-carousel owl-theme\">\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"Service-Menu-content col-md-12\">\n");
      out.write("                                            <!-- Food -->\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            <div id=\"1-content\" class=\"cont active\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Drink -->\n");
      out.write("                                            <div id=\"2-content\" class=\"cont\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Room Service -->\n");
      out.write("                                            <div id=\"3-content\" class=\"cont\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Other -->\n");
      out.write("                                            <div id=\"4-content\" class=\"cont\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field btns\">\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"prev-1 btn btn-prev\">Previous</a>\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"next-1 btn btn-next\">Next</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- service end -->\n");
      out.write("                        <!-- Voucher -->\n");
      out.write("                        <div class=\"page-Step slidePage\">\n");
      out.write("                            <div class=\"voucher\">\n");
      out.write("                                <h3>Have you got a coupon code? <a onclick=\"showformInputCode()\" id=\"show_voucher\">place a\n");
      out.write("                                        code</a></h3>\n");
      out.write("                                <div id=\"inputcode\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Please input the code\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"field btns\">\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"prev-2 btn btn-prev\">Previous</a>\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"next-2 btn btn-next\">Next</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                                <!-- information bill -->\n");
      out.write("                        <div class=\"page-Step slidePage\">\n");
      out.write("                            <h3>Booking details</h3>\n");
      out.write("                            <div class=\"row infoBill\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>guest</h4>\n");
      out.write("                                        <p>Maciej Kuropaiwa</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>your reservation</h4>\n");
      out.write("                                        <p>3 Night, 1 Apartment</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>room number</h4>\n");
      out.write("                                        <p>101</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>check-in</h4>\n");
      out.write("                                        <p>Sun,22 May 2022 <span>from 14:00</span></p>                                      \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>Phone</h4>\n");
      out.write("                                        <p>+84 83912898391</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>number of people</h4>\n");
      out.write("                                        <p>3 people</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>check-out</h4>\n");
      out.write("                                        <p>Web,25 May 2022 <span>to 12:00</span></p>                                   \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"boxRow\">\n");
      out.write("                                        <h4>Email</h4>\n");
      out.write("                                        <p>Maciej@gmail.com</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field btns\">\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"prev-3 btn btn-prev\">Previous</a>\n");
      out.write("                                <a data-toggle=\"pill\" href=\"#\" class=\"btn Submit\">Confirm</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End left pay -->\n");
      out.write("\n");
      out.write("                <!-- Start right pay -->\n");
      out.write("                <div class=\"col-md-4 right-pay\">\n");
      out.write("                    <h3>Reservation summary</h3>\n");
      out.write("                    <div class=\"infoTime\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6 timetocheck\">\n");
      out.write("                                <span>check-in</span>\n");
      out.write("<!--                                <h4>Sun,22 May 2022</h4>-->\n");
      out.write("                                <p>from 14:00</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 timetocheck time2\">\n");
      out.write("                                <span>check-out</span>\n");
      out.write("<!--                                <h4>Wed,25 May 2022</h4>-->\n");
      out.write("                                <p>to 12:00</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"selected_room\">\n");
      out.write("                            <h4>You selected</h4>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listrPay.roomType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <a href=\"room\">Change your selection</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- -------------------------------------------------------------- -->\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!--================Book Area =================-->\n");
      out.write("         <!--================ Start footer Area  =================-->\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--================ End footer Area  =================-->\n");
      out.write("    \n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"view/client/js/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/popper.js\"></script>\n");
      out.write("    <script src=\"view/client/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"view/client/vendors/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("    <script src=\"view/client/vendors/nice-select/js/jquery.nice-select.js\"></script>\n");
      out.write("    <script src=\"view/client/js/stellar.js\"></script>\n");
      out.write("    <script src=\"view/client/vendors/lightbox/simpleLightbox.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/scrollIt.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/YouTubePopUp.js\"></script>\n");
      out.write("    <script src=\"view/client/js/smooth-scroll.min.js\"></script>\n");
      out.write("    <script src=\"view/client/js/thu7.js\"></script>\n");
      out.write("    <script src=\"view/client/js/paythu2.js\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/95e3053da6.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"view/client/js/jquery.nice-number.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(function(){\n");
      out.write("            $('input[type=\"number\"]').niceNumber();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listST}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("st");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <div id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.stid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"active item\">\n");
          out.write("                                                        <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.stname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                                    </div>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("s1");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <div class=\"col-md-6\">\n");
          out.write("                                                        <div class=\"menu-info\">\n");
          out.write("                                                            <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span></h5>\n");
          out.write("                                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1.describle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("                                                            \n");
          out.write("                                                                <input class=\"checkS\" type=\"checkbox\" name=\"\">                                                                                                                        \n");
          out.write("                                                            </p>\n");
          out.write("                                                            <input class=\"numberS\" type=\"number\" name=\"\" min=\"1\" max=\"20\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("s2");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <div class=\"col-md-6\">\n");
          out.write("                                                            <div class=\"menu-info\">\n");
          out.write("                                                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s2.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s2.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span></h5>\n");
          out.write("                                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s2.describle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                    <input class=\"checkS\" type=\"checkbox\" name=\"\">                                                                      \n");
          out.write("                                                                </p>\n");
          out.write("                                                                <input class=\"numberS\" type=\"number\" name=\"\" min=\"1\" max=\"20\">\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS3}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("s3");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <div class=\"col-md-6\">\n");
          out.write("                                                            <div class=\"menu-info\">\n");
          out.write("                                                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s3.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s3.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span></h5>\n");
          out.write("                                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s3.describle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                    <input class=\"checkS\" type=\"checkbox\" name=\"\">                                                                        \n");
          out.write("                                                                </p>\n");
          out.write("                                                                <input class=\"numberS\" type=\"number\" name=\"\" min=\"1\" max=\"20\">\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS4}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("s4");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <div class=\"col-md-6\">\n");
          out.write("                                                            <div class=\"menu-info\">\n");
          out.write("                                                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s4.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s4.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span></h5>\n");
          out.write("                                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s4.describle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                    <input class=\"checkS\" type=\"checkbox\" name=\"\"> \n");
          out.write("                                                                </p>\n");
          out.write("                                                                <input class=\"numberS\" type=\"number\" name=\"\" min=\"1\" max=\"20\">\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}
