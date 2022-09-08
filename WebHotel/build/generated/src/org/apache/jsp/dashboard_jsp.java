package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>HSM Hotel</title>\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"img/favicon/apple-touch-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"img/favicon/favicon-32x32.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"img/favicon/favicon-16x16.png\">\n");
      out.write("        <link rel=\"manifest\" href=\"img/favicon/site.webmanifest\">\n");
      out.write("        <link rel=\"mask-icon\" href=\"img/favicon/safari-pinned-tab.svg\" color=\"#ffffff\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("\n");
      out.write("        <!-- Sweet Alert -->\n");
      out.write("        <link type=\"text/css\" href=\"css/sweetalert2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Notyf -->\n");
      out.write("        <link type=\"text/css\" href=\"css/notyf.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Volt CSS -->\n");
      out.write("        <link type=\"text/css\" href=\"css/volt.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-141734189-6\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("\n");
      out.write("            gtag('config', 'UA-141734189-6');</script><script>(function (w, d, s, l, i) {\n");
      out.write("                    w[l] = w[l] || [];\n");
      out.write("                    w[l].push({\n");
      out.write("                        'gtm.start':\n");
      out.write("                                new Date().getTime(), event: 'gtm.js'\n");
      out.write("                    });\n");
      out.write("                    var f = d.getElementsByTagName(s)[0],\n");
      out.write("                            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : '';\n");
      out.write("                    j.async = true;\n");
      out.write("                    j.src =\n");
      out.write("                            'https://www.googletagmanager.com/gtm.js?id=' + i + dl;\n");
      out.write("                    f.parentNode.insertBefore(j, f);\n");
      out.write("                })(window, document, 'script', 'dataLayer', 'GTM-THQTXJ7');\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <noscript>\n");
      out.write("        <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-THQTXJ7\" height=\"0\" width=\"0\" style=\"display:none;visibility:hidden\">\n");
      out.write("\n");
      out.write("        </iframe>\n");
      out.write("        </noscript>\n");
      out.write("        <nav class=\"navbar navbar-dark navbar-theme-primary px-4 col-12 d-lg-none\">\n");
      out.write("            <a class=\"navbar-brand me-lg-5\" href=\"../index.html\">\n");
      out.write("                <img class=\"navbar-brand-dark\" src=\"img/brand/light.svg\" alt=\"Volt logo\"> \n");
      out.write("                <img class=\"navbar-brand-light\" src=\"img/brand/dark.svg\" alt=\"Volt logo\"></a>\n");
      out.write("            <div class=\"d-flex align-items-center\">\n");
      out.write("                <button class=\"navbar-toggler d-lg-none collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\">\n");
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <nav id=\"sidebarMenu\" class=\"sidebar d-lg-block bg-gray-800 text-white collapse\" data-simplebar>\n");
      out.write("            <div class=\"sidebar-inner px-4 pt-3\">\n");
      out.write("                <div class=\"user-card d-flex d-md-none justify-content-between justify-content-md-center pb-4\">\n");
      out.write("                    <div class=\"d-flex align-items-center\"><div class=\"avatar-lg me-4\">\n");
      out.write("                            <img src=\"img/team/profile-picture-3.jpg\" class=\"card-img-top rounded-circle border-white\" alt=\"Bonnie Green\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-block\">\n");
      out.write("                            <h2 class=\"h5 mb-3\">Hi, Jane</h2>\n");
      out.write("                            <a href=\"../pages/examples/sign-in.html\" class=\"btn btn-secondary btn-sm d-inline-flex align-items-center\">\n");
      out.write("                                <svg class=\"icon icon-xxs me-1\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M17 16l4-4m0 0l-4-4m4 4H7m6 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h4a3 3 0 013 3v1\">\n");
      out.write("\n");
      out.write("                                </path>\n");
      out.write("                                </svg> \n");
      out.write("                                Sign Out\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse-close d-md-none\">\n");
      out.write("                        <a href=\"#sidebarMenu\" data-bs-toggle=\"collapse\" data-bs-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"true\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <svg class=\"icon icon-xs\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                            <path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\">\n");
      out.write("\n");
      out.write("                            </path>\n");
      out.write("                            </svg>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav flex-column pt-3 pt-md-0\">\n");
      out.write("                    <li class=\"nav-item active \">\n");
      out.write("                        <a href=\"dashboard.jsp\" class=\"nav-link\">\n");
      out.write("                            <span class=\"sidebar-icon\">\n");
      out.write("                                <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M2 10a8 8 0 018-8v8h8a8 8 0 11-16 0z\"></path><path d=\"M12 2.252A8.014 8.014 0 0117.748 8H12V2.252z\"></path></svg>\n");
      out.write("                            </span> \n");
      out.write("                            <span class=\"sidebar-text\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item \">\n");
      out.write("                        <a href=\"Bill\" class=\"nav-link\">\n");
      out.write("                            <span class=\"sidebar-icon\">\n");
      out.write("                                <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M4 4a2 2 0 00-2 2v1h16V6a2 2 0 00-2-2H4z\"></path><path fill-rule=\"evenodd\" d=\"M18 9H2v5a2 2 0 002 2h12a2 2 0 002-2V9zM4 13a1 1 0 011-1h1a1 1 0 110 2H5a1 1 0 01-1-1zm5-1a1 1 0 100 2h1a1 1 0 100-2H9z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"sidebar-text\">Transactions</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"useService\" class=\"nav-link d-flex justify-content-between\">\n");
      out.write("                            <span>\n");
      out.write("                                <span class=\"sidebar-icon\">\n");
      out.write("                                    <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M12 1.586l-4 4v12.828l4-4V1.586zM3.707 3.293A1 1 0 002 4v10a1 1 0 00.293.707L6 18.414V5.586L3.707 3.293zM17.707 5.293L14 1.586v12.828l2.293 2.293A1 1 0 0018 16V6a1 1 0 00-.293-.707z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"sidebar-text\">User Service</span>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"BookRoom\" class=\"nav-link d-flex justify-content-between\">\n");
      out.write("                            <span>\n");
      out.write("                                <span class=\"sidebar-icon\">\n");
      out.write("                                    <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M12 1.586l-4 4v12.828l4-4V1.586zM3.707 3.293A1 1 0 002 4v10a1 1 0 00.293.707L6 18.414V5.586L3.707 3.293zM17.707 5.293L14 1.586v12.828l2.293 2.293A1 1 0 0018 16V6a1 1 0 00-.293-.707z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"sidebar-text\">Book Room</span>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main class=\"content\">\n");
      out.write("            <nav class=\"navbar navbar-top navbar-expand navbar-dashboard navbar-dark ps-0 pe-2 pb-0\">\n");
      out.write("                <div class=\"container-fluid px-0\">\n");
      out.write("                    <div class=\"d-flex justify-content-between w-100\" id=\"navbarSupportedContent\">\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <button id=\"sidebar-toggle\" class=\"sidebar-toggle me-3 btn btn-icon-only d-none d-lg-inline-block align-items-center justify-content-center\">\n");
      out.write("                                <svg class=\"toggle-icon\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                                <path fill-rule=\"evenodd\" d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h6a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\" clip-rule=\"evenodd\">\n");
      out.write("\n");
      out.write("                                </path>\n");
      out.write("                                </svg>\n");
      out.write("                            </button>\n");
      out.write("                            <form class=\"navbar-search form-inline\" id=\"navbar-search-main\">\n");
      out.write("                                <div class=\"input-group input-group-merge search-bar\">\n");
      out.write("                                    <span class=\"input-group-text\" id=\"topbar-addon\">\n");
      out.write("                                        <svg class=\"icon icon-xs\" x-description=\"Heroicon name: solid/search\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 20 20\" fill=\"currentColor\" aria-hidden=\"true\">\n");
      out.write("                                        <path fill-rule=\"evenodd\" d=\"M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z\" clip-rule=\"evenodd\">\n");
      out.write("\n");
      out.write("                                        </path>\n");
      out.write("                                        </svg> \n");
      out.write("                                    </span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"topbarInputIconLeft\" placeholder=\"Search\" aria-label=\"Search\" aria-describedby=\"topbar-addon\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"navbar-nav align-items-center\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"py-4\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-gray-800 d-inline-flex align-items-center me-2 dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <svg class=\"icon icon-xs me-2\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M12 6v6m0 0v6m0-6h6m-6 0H6\"></path></svg>\n");
      out.write("                        New Task\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu dashboard-dropdown dropdown-menu-start mt-2 py-1\">\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M8 9a3 3 0 100-6 3 3 0 000 6zM8 11a6 6 0 016 6H2a6 6 0 016-6zM16 7a1 1 0 10-2 0v1h-1a1 1 0 100 2h1v1a1 1 0 102 0v-1h1a1 1 0 100-2h-1V7z\"></path></svg>\n");
      out.write("                            Add User\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M7 3a1 1 0 000 2h6a1 1 0 100-2H7zM4 7a1 1 0 011-1h10a1 1 0 110 2H5a1 1 0 01-1-1zM2 11a2 2 0 012-2h12a2 2 0 012 2v4a2 2 0 01-2 2H4a2 2 0 01-2-2v-4z\"></path></svg>                            \n");
      out.write("                            Add Widget\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M5.5 13a3.5 3.5 0 01-.369-6.98 4 4 0 117.753-1.977A4.5 4.5 0 1113.5 13H11V9.413l1.293 1.293a1 1 0 001.414-1.414l-3-3a1 1 0 00-1.414 0l-3 3a1 1 0 001.414 1.414L9 9.414V13H5.5z\"></path><path d=\"M9 13h2v5a1 1 0 11-2 0v-5z\"></path></svg>                            \n");
      out.write("                            Upload Files\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M2.166 4.999A11.954 11.954 0 0010 1.944 11.954 11.954 0 0017.834 5c.11.65.166 1.32.166 2.001 0 5.225-3.34 9.67-8 11.317C5.34 16.67 2 12.225 2 7c0-.682.057-1.35.166-2.001zm11.541 3.708a1 1 0 00-1.414-1.414L9 10.586 7.707 9.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l4-4z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                            Preview Security\n");
      out.write("                        </a>\n");
      out.write("                        <div role=\"separator\" class=\"dropdown-divider my-1\"></div>\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                            <svg class=\"dropdown-icon text-danger me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M12.395 2.553a1 1 0 00-1.45-.385c-.345.23-.614.558-.822.88-.214.33-.403.713-.57 1.116-.334.804-.614 1.768-.84 2.734a31.365 31.365 0 00-.613 3.58 2.64 2.64 0 01-.945-1.067c-.328-.68-.398-1.534-.398-2.654A1 1 0 005.05 6.05 6.981 6.981 0 003 11a7 7 0 1011.95-4.95c-.592-.591-.98-.985-1.348-1.467-.363-.476-.724-1.063-1.207-2.03zM12.12 15.12A3 3 0 017 13s.879.5 2.5.5c0-1 .5-4 1.25-4.5.5 1 .786 1.293 1.371 1.879A2.99 2.99 0 0113 13a2.99 2.99 0 01-.879 2.121z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                            Upgrade to Pro\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 mb-4\">\n");
      out.write("                    <div class=\"card bg-yellow-100 border-0 shadow\">\n");
      out.write("                        <div class=\"card-header d-sm-flex flex-row align-items-center flex-0\">\n");
      out.write("                            <div class=\"d-block mb-3 mb-sm-0\">\n");
      out.write("                                <div class=\"fs-5 fw-normal mb-2\">Sales Value</div>\n");
      out.write("                                <h2 class=\"fs-3 fw-extrabold\">$10,567</h2>\n");
      out.write("                                <div class=\"small mt-2\"> \n");
      out.write("                                    <span class=\"fw-normal me-2\">Yesterday</span>                              \n");
      out.write("                                    <span class=\"fas fa-angle-up text-success\"></span>                                   \n");
      out.write("                                    <span class=\"text-success fw-bold\">10.57%</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex ms-auto\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-secondary text-dark btn-sm me-2\">Month</a>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-dark btn-sm me-3\">Week</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body p-2\">\n");
      out.write("                            <div class=\"ct-chart-sales-value ct-double-octave ct-series-g\">\n");
      out.write("                                <div class=\"chartist-tooltip\" style=\"top: -47.125px; left: 671px;\"><span\n");
      out.write("                                        class=\"chartist-tooltip-value\">100</span></div>\n");
      out.write("                                <svg xmlns:ct=\"http://gionkunz.github.com/chartist-js/ct\" width=\"100%\" height=\"100%\" class=\"ct-chart-line\"\n");
      out.write("                                    style=\"width: 100%; height: 100%;\">\n");
      out.write("                                <g class=\"ct-grids\">\n");
      out.write("                                <line x1=\"50\" x2=\"50\" y1=\"15\" y2=\"93.19999694824219\" class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"124.63333129882812\" x2=\"124.63333129882812\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"199.26666259765625\" x2=\"199.26666259765625\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"273.8999938964844\" x2=\"273.8999938964844\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"348.5333251953125\" x2=\"348.5333251953125\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"423.1666564941406\" x2=\"423.1666564941406\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                <line x1=\"497.79998779296875\" x2=\"497.79998779296875\" y1=\"15\" y2=\"93.19999694824219\"\n");
      out.write("                                      class=\"ct-grid ct-horizontal\"></line>\n");
      out.write("                                </g>\n");
      out.write("                                <g>\n");
      out.write("                                <g class=\"ct-series ct-series-a\">\n");
      out.write("                                <path\n");
      out.write("                                    d=\"M50,93.2L50,93.2C74.878,90.593,99.756,88.856,124.633,85.38C149.511,81.904,174.389,73.216,199.267,69.74C224.144,66.264,249.022,66.091,273.9,61.92C298.778,57.749,323.656,30.64,348.533,30.64C373.411,30.64,398.289,46.28,423.167,46.28C448.044,46.28,472.922,25.427,497.8,15L497.8,93.2Z\"\n");
      out.write("                                    class=\"ct-area\"></path>\n");
      out.write("                                <path\n");
      out.write("                                    d=\"M50,93.2C74.878,90.593,99.756,88.856,124.633,85.38C149.511,81.904,174.389,73.216,199.267,69.74C224.144,66.264,249.022,66.091,273.9,61.92C298.778,57.749,323.656,30.64,348.533,30.64C373.411,30.64,398.289,46.28,423.167,46.28C448.044,46.28,472.922,25.427,497.8,15\"\n");
      out.write("                                    class=\"ct-line\"></path>\n");
      out.write("                                <line x1=\"50\" y1=\"93.19999694824219\" x2=\"50.01\" y2=\"93.19999694824219\" class=\"ct-point\"\n");
      out.write("                                      ct:value=\"0\"></line>\n");
      out.write("                                <line x1=\"124.63333129882812\" y1=\"85.37999725341797\" x2=\"124.64333129882813\"\n");
      out.write("                                      y2=\"85.37999725341797\" class=\"ct-point\" ct:value=\"10\"></line>\n");
      out.write("                                <line x1=\"199.26666259765625\" y1=\"69.73999786376953\" x2=\"199.27666259765624\"\n");
      out.write("                                      y2=\"69.73999786376953\" class=\"ct-point\" ct:value=\"30\"></line>\n");
      out.write("                                <line x1=\"273.8999938964844\" y1=\"61.91999816894531\" x2=\"273.90999389648437\" y2=\"61.91999816894531\"\n");
      out.write("                                      class=\"ct-point\" ct:value=\"40\"></line>\n");
      out.write("                                <line x1=\"348.5333251953125\" y1=\"30.639999389648438\" x2=\"348.5433251953125\"\n");
      out.write("                                      y2=\"30.639999389648438\" class=\"ct-point\" ct:value=\"80\"></line>\n");
      out.write("                                <line x1=\"423.1666564941406\" y1=\"46.279998779296875\" x2=\"423.1766564941406\"\n");
      out.write("                                      y2=\"46.279998779296875\" class=\"ct-point\" ct:value=\"60\"></line>\n");
      out.write("                                <line x1=\"497.79998779296875\" y1=\"15\" x2=\"497.80998779296874\" y2=\"15\" class=\"ct-point\"\n");
      out.write("                                      ct:value=\"100\"></line>\n");
      out.write("                                </g>\n");
      out.write("                                </g>\n");
      out.write("                                <g class=\"ct-labels\">\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"50\" y=\"98.19999694824219\" width=\"74.63333129882812\"\n");
      out.write("                                               height=\"20\"><span class=\"ct-label ct-horizontal ct-end\" xmlns=\"http://www.w3.org/2000/xmlns/\"\n");
      out.write("                                               style=\"width: 75px; height: 20px;\">Mon</span></foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"124.63333129882812\" y=\"98.19999694824219\"\n");
      out.write("                                               width=\"74.63333129882812\" height=\"20\"><span class=\"ct-label ct-horizontal ct-end\"\n");
      out.write("                                               xmlns=\"http://www.w3.org/2000/xmlns/\" style=\"width: 75px; height: 20px;\">Tue</span>\n");
      out.write("                                </foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"199.26666259765625\" y=\"98.19999694824219\"\n");
      out.write("                                               width=\"74.63333129882812\" height=\"20\"><span class=\"ct-label ct-horizontal ct-end\"\n");
      out.write("                                               xmlns=\"http://www.w3.org/2000/xmlns/\" style=\"width: 75px; height: 20px;\">Wed</span>\n");
      out.write("                                </foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"273.8999938964844\" y=\"98.19999694824219\"\n");
      out.write("                                               width=\"74.63333129882812\" height=\"20\"><span class=\"ct-label ct-horizontal ct-end\"\n");
      out.write("                                               xmlns=\"http://www.w3.org/2000/xmlns/\" style=\"width: 75px; height: 20px;\">Thu</span>\n");
      out.write("                                </foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"348.5333251953125\" y=\"98.19999694824219\"\n");
      out.write("                                               width=\"74.63333129882812\" height=\"20\"><span class=\"ct-label ct-horizontal ct-end\"\n");
      out.write("                                               xmlns=\"http://www.w3.org/2000/xmlns/\" style=\"width: 75px; height: 20px;\">Fri</span>\n");
      out.write("                                </foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"423.1666564941406\" y=\"98.19999694824219\"\n");
      out.write("                                               width=\"74.63333129882812\" height=\"20\"><span class=\"ct-label ct-horizontal ct-end\"\n");
      out.write("                                               xmlns=\"http://www.w3.org/2000/xmlns/\" style=\"width: 75px; height: 20px;\">Sat</span>\n");
      out.write("                                </foreignObject>\n");
      out.write("                                <foreignObject style=\"overflow: visible;\" x=\"497.79998779296875\" y=\"98.19999694824219\" width=\"30\"\n");
      out.write("                                               height=\"20\"><span class=\"ct-label ct-horizontal ct-end\" xmlns=\"http://www.w3.org/2000/xmlns/\"\n");
      out.write("                                               style=\"width: 30px; height: 20px;\">Sun</span></foreignObject>\n");
      out.write("                                </g>\n");
      out.write("                                </svg>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-6 col-xl-4 mb-4\">\n");
      out.write("                    <div class=\"card border-0 shadow\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"row d-block d-xl-flex align-items-center\">\n");
      out.write("                                <div class=\"col-12 col-xl-5 text-xl-center mb-3 mb-xl-0 d-flex align-items-center justify-content-xl-center\">\n");
      out.write("                                    <div class=\"icon-shape icon-shape-primary rounded me-4 me-sm-0\">\n");
      out.write("                                        <svg class=\"icon\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M13 6a3 3 0 11-6 0 3 3 0 016 0zM18 8a2 2 0 11-4 0 2 2 0 014 0zM14 15a4 4 0 00-8 0v3h8v-3zM6 8a2 2 0 11-4 0 2 2 0 014 0zM16 18v-3a5.972 5.972 0 00-.75-2.906A3.005 3.005 0 0119 15v3h-3zM4.75 12.094A5.973 5.973 0 004 15v3H1v-3a3 3 0 013.75-2.906z\"></path></svg>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-sm-none\">\n");
      out.write("                                        <h2 class=\"h5\">Customers</h2>\n");
      out.write("                                        <h3 class=\"fw-extrabold mb-1\">345,678</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-xl-7 px-xl-0\">\n");
      out.write("                                    <div class=\"d-none d-sm-block\">\n");
      out.write("                                        <h2 class=\"h6 text-gray-400 mb-0\">Customers</h2>\n");
      out.write("                                        <h3 class=\"fw-extrabold mb-2\">345k</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"d-flex align-items-center text-gray-500\">\n");
      out.write("                                        Feb 1 - Apr 1,  \n");
      out.write("                                        <svg class=\"icon icon-xxs text-gray-500 ms-2 me-1\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M10 18a8 8 0 100-16 8 8 0 000 16zM4.332 8.027a6.012 6.012 0 011.912-2.706C6.512 5.73 6.974 6 7.5 6A1.5 1.5 0 019 7.5V8a2 2 0 004 0 2 2 0 011.523-1.943A5.977 5.977 0 0116 10c0 .34-.028.675-.083 1H15a2 2 0 00-2 2v2.197A5.973 5.973 0 0110 16v-2a2 2 0 00-2-2 2 2 0 01-2-2 2 2 0 00-1.668-1.973z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                        USA\n");
      out.write("                                    </small> \n");
      out.write("                                    <div class=\"small d-flex mt-1\">                               \n");
      out.write("                                        <div>Since last month <svg class=\"icon icon-xs text-success\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M14.707 12.707a1 1 0 01-1.414 0L10 9.414l-3.293 3.293a1 1 0 01-1.414-1.414l4-4a1 1 0 011.414 0l4 4a1 1 0 010 1.414z\" clip-rule=\"evenodd\"></path></svg><span class=\"text-success fw-bolder\">22%</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-6 col-xl-4 mb-4\">\n");
      out.write("                    <div class=\"card border-0 shadow\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"row d-block d-xl-flex align-items-center\">\n");
      out.write("                                <div class=\"col-12 col-xl-5 text-xl-center mb-3 mb-xl-0 d-flex align-items-center justify-content-xl-center\">\n");
      out.write("                                    <div class=\"icon-shape icon-shape-secondary rounded me-4 me-sm-0\">\n");
      out.write("                                        <svg class=\"icon\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M10 2a4 4 0 00-4 4v1H5a1 1 0 00-.994.89l-1 9A1 1 0 004 18h12a1 1 0 00.994-1.11l-1-9A1 1 0 0015 7h-1V6a4 4 0 00-4-4zm2 5V6a2 2 0 10-4 0v1h4zm-6 3a1 1 0 112 0 1 1 0 01-2 0zm7-1a1 1 0 100 2 1 1 0 000-2z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-sm-none\">\n");
      out.write("                                        <h2 class=\"fw-extrabold h5\">Revenue</h2>\n");
      out.write("                                        <h3 class=\"mb-1\">$43,594</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-xl-7 px-xl-0\">\n");
      out.write("                                    <div class=\"d-none d-sm-block\">\n");
      out.write("                                        <h2 class=\"h6 text-gray-400 mb-0\">Revenue</h2>\n");
      out.write("                                        <h3 class=\"fw-extrabold mb-2\">$43,594</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"d-flex align-items-center text-gray-500\">\n");
      out.write("                                        Feb 1 - Apr 1,  \n");
      out.write("                                        <svg class=\"icon icon-xxs text-gray-500 ms-2 me-1\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M10 18a8 8 0 100-16 8 8 0 000 16zM4.332 8.027a6.012 6.012 0 011.912-2.706C6.512 5.73 6.974 6 7.5 6A1.5 1.5 0 019 7.5V8a2 2 0 004 0 2 2 0 011.523-1.943A5.977 5.977 0 0116 10c0 .34-.028.675-.083 1H15a2 2 0 00-2 2v2.197A5.973 5.973 0 0110 16v-2a2 2 0 00-2-2 2 2 0 01-2-2 2 2 0 00-1.668-1.973z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                        GER\n");
      out.write("                                    </small> \n");
      out.write("                                    <div class=\"small d-flex mt-1\">                               \n");
      out.write("                                        <div>Since last month <svg class=\"icon icon-xs text-danger\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg><span class=\"text-danger fw-bolder\">2%</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-6 col-xl-4 mb-4\">\n");
      out.write("                    <div class=\"card border-0 shadow\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"row d-block d-xl-flex align-items-center\">\n");
      out.write("                                <div class=\"col-12 col-xl-5 text-xl-center mb-3 mb-xl-0 d-flex align-items-center justify-content-xl-center\">\n");
      out.write("                                    <div class=\"icon-shape icon-shape-tertiary rounded me-4 me-sm-0\">\n");
      out.write("                                        <svg class=\"icon\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M3 3a1 1 0 000 2v8a2 2 0 002 2h2.586l-1.293 1.293a1 1 0 101.414 1.414L10 15.414l2.293 2.293a1 1 0 001.414-1.414L12.414 15H15a2 2 0 002-2V5a1 1 0 100-2H3zm11.707 4.707a1 1 0 00-1.414-1.414L10 9.586 8.707 8.293a1 1 0 00-1.414 0l-2 2a1 1 0 101.414 1.414L8 10.414l1.293 1.293a1 1 0 001.414 0l4-4z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-sm-none\">\n");
      out.write("                                        <h2 class=\"fw-extrabold h5\"> Bounce Rate</h2>\n");
      out.write("                                        <h3 class=\"mb-1\">50.88%</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-xl-7 px-xl-0\">\n");
      out.write("                                    <div class=\"d-none d-sm-block\">\n");
      out.write("                                        <h2 class=\"h6 text-gray-400 mb-0\"> Bounce Rate</h2>\n");
      out.write("                                        <h3 class=\"fw-extrabold mb-2\">50.88%</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-gray-500\">\n");
      out.write("                                        Feb 1 - Apr 1\n");
      out.write("                                    </small> \n");
      out.write("                                    <div class=\"small d-flex mt-1\">                               \n");
      out.write("                                        <div>Since last month <svg class=\"icon icon-xs text-success\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M14.707 12.707a1 1 0 01-1.414 0L10 9.414l-3.293 3.293a1 1 0 01-1.414-1.414l4-4a1 1 0 011.414 0l4 4a1 1 0 010 1.414z\" clip-rule=\"evenodd\"></path></svg><span class=\"text-success fw-bolder\">4%</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"theme-settings card bg-gray-800 pt-2 collapse\" id=\"theme-settings\">\n");
      out.write("                <div class=\"card-body bg-gray-800 text-white pt-4\">\n");
      out.write("                    <button type=\"button\" class=\"btn-close theme-settings-close\" aria-label=\"Close\" data-bs-toggle=\"collapse\"\n");
      out.write("                            href=\"#theme-settings\" role=\"button\" aria-expanded=\"false\" aria-controls=\"theme-settings\"></button>\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                        <p class=\"m-0 mb-1 me-4 fs-7\">Open source <span role=\"img\" aria-label=\"gratitude\">💛</span></p>\n");
      out.write("                        <a class=\"github-button\" href=\"https://github.com/themesberg/volt-bootstrap-5-dashboard\"\n");
      out.write("                           data-color-scheme=\"no-preference: dark; light: light; dark: light;\" data-icon=\"octicon-star\"\n");
      out.write("                           data-size=\"large\" data-show-count=\"true\"\n");
      out.write("                           aria-label=\"Star themesberg/volt-bootstrap-5-dashboard on GitHub\">Star</a>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"https://themesberg.com/product/admin-dashboard/volt-bootstrap-5-dashboard\" target=\"_blank\"\n");
      out.write("                       class=\"btn btn-secondary d-inline-flex align-items-center justify-content-center mb-3 w-100\">\n");
      out.write("                        Download \n");
      out.write("                        <svg class=\"icon icon-xs ms-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M2 9.5A3.5 3.5 0 005.5 13H9v2.586l-1.293-1.293a1 1 0 00-1.414 1.414l3 3a1 1 0 001.414 0l3-3a1 1 0 00-1.414-1.414L11 15.586V13h2.5a4.5 4.5 0 10-.616-8.958 4.002 4.002 0 10-7.753 1.977A3.5 3.5 0 002 9.5zm9 3.5H9V8a1 1 0 012 0v5z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                    </a>\n");
      out.write("                    <p class=\"fs-7 text-gray-300 text-center\">Available in the following technologies:</p>\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\n");
      out.write("                        <a class=\"me-3\" href=\"https://themesberg.com/product/admin-dashboard/volt-bootstrap-5-dashboard\"\n");
      out.write("                           target=\"_blank\">\n");
      out.write("                            <img src=\"img/technologies/bootstrap-5-logo.svg\" class=\"image image-xs\">\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"https://demo.themesberg.com/volt-react-dashboard/#/\" target=\"_blank\">\n");
      out.write("                            <img src=\"img/technologies/react-logo.svg\" class=\"image image-xs\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card theme-settings bg-gray-800 theme-settings-expand\" id=\"theme-settings-expand\">\n");
      out.write("                <div class=\"card-body bg-gray-800 text-white rounded-top p-3 py-2\">\n");
      out.write("                    <span class=\"fw-bold d-inline-flex align-items-center h6\">\n");
      out.write("                        <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M11.49 3.17c-.38-1.56-2.6-1.56-2.98 0a1.532 1.532 0 01-2.286.948c-1.372-.836-2.942.734-2.106 2.106.54.886.061 2.042-.947 2.287-1.561.379-1.561 2.6 0 2.978a1.532 1.532 0 01.947 2.287c-.836 1.372.734 2.942 2.106 2.106a1.532 1.532 0 012.287.947c.379 1.561 2.6 1.561 2.978 0a1.533 1.533 0 012.287-.947c1.372.836 2.942-.734 2.106-2.106a1.533 1.533 0 01.947-2.287c1.561-.379 1.561-2.6 0-2.978a1.532 1.532 0 01-.947-2.287c.836-1.372-.734-2.942-2.106-2.106a1.532 1.532 0 01-2.287-.947zM10 13a3 3 0 100-6 3 3 0 000 6z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                        Settings\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer class=\"bg-white rounded shadow p-5 mb-4 mt-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-md-4 col-xl-6 mb-4 mb-md-0\">\n");
      out.write("                        <p class=\"mb-0 text-center text-lg-start\">© 2019-<span class=\"current-year\"></span> <a class=\"text-primary fw-normal\" href=\"https://themesberg.com\" target=\"_blank\">Themesberg</a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-8 col-xl-6 text-center text-lg-start\">\n");
      out.write("                        <!-- List -->\n");
      out.write("                        <ul class=\"list-inline list-group-flush list-group-borderless text-md-end mb-0\">\n");
      out.write("                            <li class=\"list-inline-item px-0 px-sm-2\">\n");
      out.write("                                <a href=\"https://themesberg.com/about\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item px-0 px-sm-2\">\n");
      out.write("                                <a href=\"https://themesberg.com/themes\">Themes</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item px-0 px-sm-2\">\n");
      out.write("                                <a href=\"https://themesberg.com/blog\">Blog</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item px-0 px-sm-2\">\n");
      out.write("                                <a href=\"https://themesberg.com/contact\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <!-- Core -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Vendor JS -->\n");
      out.write("        <script src=\"js/on-screen.umd.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Slider -->\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Smooth scroll -->\n");
      out.write("        <script src=\"js/smooth-scroll.polyfills.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Charts -->\n");
      out.write("        <script src=\"js/chartist.min.js\"></script>\n");
      out.write("        <script src=\"../../vendor/chartist-plugin-tooltips/dist/chartist-plugin-tooltip.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Datepicker -->\n");
      out.write("        <script src=\"js/datepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Sweet Alerts 2 -->\n");
      out.write("        <script src=\"js/sweetalert2.all.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Moment JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.27.0/moment.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Vanilla JS Datepicker -->\n");
      out.write("        <script src=\"js/datepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Notyf -->\n");
      out.write("        <script src=\"js/notyf.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Simplebar -->\n");
      out.write("        <script src=\"js/simplebar.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Github buttons -->\n");
      out.write("        <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Volt JS -->\n");
      out.write("        <script src=\"js/volt.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.role == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <span\n");
        out.write("                                class=\"nav-link  d-flex justify-content-between align-items-center\"\n");
        out.write("                                data-bs-toggle=\"collapse\" data-bs-target=\"#submenu-app\">\n");
        out.write("                                <span>\n");
        out.write("                                    <span class=\"sidebar-icon\">\n");
        out.write("                                        <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M5 4a3 3 0 00-3 3v6a3 3 0 003 3h10a3 3 0 003-3V7a3 3 0 00-3-3H5zm-1 9v-1h5v2H5a1 1 0 01-1-1zm7 1h4a1 1 0 001-1v-1h-5v2zm0-4h5V8h-5v2zM9 8H4v2h5V8z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                    </span> \n");
        out.write("                                    <span class=\"sidebar-text\">Admin</span>\n");
        out.write("                                </span>\n");
        out.write("                                <span class=\"link-arrow\">\n");
        out.write("                                    <svg class=\"icon icon-sm\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                </span>\n");
        out.write("                            </span>\n");
        out.write("                            <div class=\"multi-level collapse\"\n");
        out.write("                                 role=\"list\" id=\"submenu-app\" aria-expanded=\"false\">\n");
        out.write("                                <ul class=\"flex-column nav\">\n");
        out.write("                                    <li class=\"nav-item\">\n");
        out.write("                                        <a class=\"nav-link\" href=\"RoomType\">\n");
        out.write("                                            <span class=\"sidebar-text\">List Room</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"ListServiceT\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">List Service</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"Vouchers\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">Voucher</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"VEm\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">View Employees</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"VUs\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">View Users</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"QLus\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">Manage Users</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                            </div>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.role == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <span\n");
        out.write("                                class=\"nav-link  collapsed  d-flex justify-content-between align-items-center\"\n");
        out.write("                                data-bs-toggle=\"collapse\" data-bs-target=\"#submenu-pages\">\n");
        out.write("                                <span>\n");
        out.write("                                    <span class=\"sidebar-icon\">\n");
        out.write("                                        <svg class=\"icon icon-xs me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M2 5a2 2 0 012-2h8a2 2 0 012 2v10a2 2 0 002 2H4a2 2 0 01-2-2V5zm3 1h6v4H5V6zm6 6H5v2h6v-2z\" clip-rule=\"evenodd\"></path><path d=\"M15 7h1a2 2 0 012 2v5.5a1.5 1.5 0 01-3 0V7z\"></path></svg>\n");
        out.write("                                    </span> \n");
        out.write("                                    <span class=\"sidebar-text\">Employees</span>\n");
        out.write("                                </span>\n");
        out.write("                                <span class=\"link-arrow\">\n");
        out.write("                                    <svg class=\"icon icon-sm\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                </span>\n");
        out.write("                            </span>\n");
        out.write("                            <div class=\"multi-level collapse \" role=\"list\"\n");
        out.write("                                 id=\"submenu-pages\" aria-expanded=\"false\">\n");
        out.write("                                <ul class=\"flex-column nav\">\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"Room\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\">D</span> <span\n");
        out.write("                                                class=\"sidebar-text\">List Room</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item  \">\n");
        out.write("                                        <a class=\"nav-link\" href=\"ListServiceT\">\n");
        out.write("                                            <span class=\"sidebar-text\">List Service</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"Vouchers\">\n");
        out.write("                                            <span class=\"sidebar-text-contracted\"></span> <span\n");
        out.write("                                                class=\"sidebar-text\">Voucher</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                            </div>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item dropdown ms-lg-3\">\n");
        out.write("                                    <a class=\"nav-link dropdown-toggle pt-1 px-0\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
        out.write("                                        <div class=\"media d-flex align-items-center\">\n");
        out.write("                                            <img class=\"avatar rounded-circle\" alt=\"Image placeholder\" src=\"img/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.eimage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                            <div class=\"media-body ms-2 text-dark align-items-center d-none d-lg-block\">\n");
        out.write("                                                <span class=\"mb-0 font-small fw-bold text-gray-900\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </a>\n");
        out.write("                                    <div class=\"dropdown-menu dashboard-dropdown dropdown-menu-end mt-2 py-1\">\n");
        out.write("                                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
        out.write("                                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-6-3a2 2 0 11-4 0 2 2 0 014 0zm-2 4a5 5 0 00-4.546 2.916A5.986 5.986 0 0010 16a5.986 5.986 0 004.546-2.084A5 5 0 0010 11z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                            My Profile\n");
        out.write("                                        </a>\n");
        out.write("                                        <a class=\"dropdown-item d-flex align-items-center\" href=\"UpdateP?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.usid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M11.49 3.17c-.38-1.56-2.6-1.56-2.98 0a1.532 1.532 0 01-2.286.948c-1.372-.836-2.942.734-2.106 2.106.54.886.061 2.042-.947 2.287-1.561.379-1.561 2.6 0 2.978a1.532 1.532 0 01.947 2.287c-.836 1.372.734 2.942 2.106 2.106a1.532 1.532 0 012.287.947c.379 1.561 2.6 1.561 2.978 0a1.533 1.533 0 012.287-.947c1.372.836 2.942-.734 2.106-2.106a1.533 1.533 0 01.947-2.287c1.561-.379 1.561-2.6 0-2.978a1.532 1.532 0 01-.947-2.287c.836-1.372-.734-2.942-2.106-2.106a1.532 1.532 0 01-2.287-.947zM10 13a3 3 0 100-6 3 3 0 000 6z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                            Settings\n");
        out.write("                                        </a>\n");
        out.write("                                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
        out.write("                                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M5 3a2 2 0 00-2 2v10a2 2 0 002 2h10a2 2 0 002-2V5a2 2 0 00-2-2H5zm0 2h10v7h-2l-1 2H8l-1-2H5V5z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                            Messages\n");
        out.write("                                        </a>\n");
        out.write("                                        <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
        out.write("                                            <svg class=\"dropdown-icon text-gray-400 me-2\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-2 0c0 .993-.241 1.929-.668 2.754l-1.524-1.525a3.997 3.997 0 00.078-2.183l1.562-1.562C15.802 8.249 16 9.1 16 10zm-5.165 3.913l1.58 1.58A5.98 5.98 0 0110 16a5.976 5.976 0 01-2.516-.552l1.562-1.562a4.006 4.006 0 001.789.027zm-4.677-2.796a4.002 4.002 0 01-.041-2.08l-.08.08-1.53-1.533A5.98 5.98 0 004 10c0 .954.223 1.856.619 2.657l1.54-1.54zm1.088-6.45A5.974 5.974 0 0110 4c.954 0 1.856.223 2.657.619l-1.54 1.54a4.002 4.002 0 00-2.346.033L7.246 4.668zM12 10a2 2 0 11-4 0 2 2 0 014 0z\" clip-rule=\"evenodd\"></path></svg>\n");
        out.write("                                            Support\n");
        out.write("                                        </a>\n");
        out.write("                                        <div role=\"separator\" class=\"dropdown-divider my-1\"></div>\n");
        out.write("                                        <a class=\"dropdown-item d-flex align-items-center\" href=\"logout\">\n");
        out.write("                                            <svg class=\"dropdown-icon text-danger me-2\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M17 16l4-4m0 0l-4-4m4 4H7m6 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h4a3 3 0 013 3v1\"></path></svg>                \n");
        out.write("                                            Logout\n");
        out.write("                                        </a>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a class=\"nav-link dropdown-toggle pt-1 px-0\" href=\"login\">\n");
        out.write("                                    <img class=\"avatar rounded-circle\" alt=\"Image placeholder\" src=\"img/team/profile-picture-3.jpg\">\n");
        out.write("                                </a>\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
