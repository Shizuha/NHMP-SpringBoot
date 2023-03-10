/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-10-26 08:09:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.ERP.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ERP.Employee.model.vo.Employee;
import java.util.ArrayList;

public final class EmployeeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ERP.Employee.model.vo.Employee");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Employee> empList = (ArrayList<Employee>)request.getAttribute("empList");
	int listCount = (Integer)request.getAttribute("listCount");
	int currentPage = (Integer)request.getAttribute("currentPage");
	int beginPage = (Integer)request.getAttribute("beginPage");
	int endPage= (Integer)request.getAttribute("endPage");
	int maxPage = (Integer)request.getAttribute("maxPage");
	


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<title>NHMP</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon icon -->\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\"\r\n");
      out.write("\thref=\"/NHMP/resources/ERP/images/common/favicon.png\">\r\n");
      out.write("\t\r\n");
      out.write("<!-- Pignose Calender -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/NHMP/resources/ERP/css/plugins/pg-calendar/css/pignose.calendar.min.css?after\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- Chartist -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/NHMP/resources/ERP/css/plugins/chartist/css/chartist.min.css?after\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/NHMP/resources/ERP/css/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css?after\">\r\n");
      out.write("<!-- ?????? CSS ????????? -->\r\n");
      out.write("<link href=\"/NHMP/resources/ERP/css/style.css?after\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/NHMP/resources/ERP/css/employeeListViewCss.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- ????????? ????????? -->\r\n");
      out.write("  <link href=\"/NHMP/resources/ERP/vender/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- ?????????????????? -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/NHMP/resources/ERP/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  \t$(function(){\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t$(\".check-all\").click(function(){\r\n");
      out.write("  \t\t\t$(\".ad\").prop(\"checked\", this.checked);\r\n");
      out.write("  \t\t});\r\n");
      out.write("  \t\t\r\n");
      out.write("          $(\"#usernewpwd\").click(function(){\r\n");
      out.write("        \t if($(\"input[name=empno]\").is(\":checked\") == true){\r\n");
      out.write("        \t\tvar noVal = $(\"input[name=empno]:checked\").val();  \r\n");
      out.write("        \t var url = \"/NHMP/newpwd?empno=\" + noVal;\r\n");
      out.write("             var name = \"popup test\";\r\n");
      out.write("             var option = \"width = 500, height = 500, top = 100, left = 200, location = no\"\r\n");
      out.write("             window.open(url, name, option);\r\n");
      out.write("             return false;\r\n");
      out.write("             \r\n");
      out.write("        \t }else{\r\n");
      out.write("        \t\t alert(\"?????????????????? ????????????. ????????? ??????????????????.\");\r\n");
      out.write("        \t\t return false;\r\n");
      out.write("        \t }\r\n");
      out.write("        \t \r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("           \r\n");
      out.write("  \t});\r\n");
      out.write(" \t\r\n");
      out.write("  \tfunction trueAndFalse() {\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\tvar trueAndFalseDel = confirm( '????????? ?????????????????????????' );\r\n");
      out.write("  \t\t\r\n");
      out.write("        if(trueAndFalseDel != false){\r\n");
      out.write("        \treturn true;\r\n");
      out.write("        }else\r\n");
      out.write("        \treturn false;\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  \t}\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!--*******************\r\n");
      out.write("        Preloader start\r\n");
      out.write("    ********************-->\r\n");
      out.write("\t<div id=\"preloader\">\r\n");
      out.write("\t\t<div class=\"loader\">\r\n");
      out.write("\t\t\t<svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\"\r\n");
      out.write("\t\t\t\t\tstroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("            </svg>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--*******************\r\n");
      out.write("        Preloader end\r\n");
      out.write("    ********************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--**********************************\r\n");
      out.write("        Main wrapper start\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("\t<div id=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Nav header start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t<div class=\"nav-header\">\r\n");
      out.write("\t\t\t<div class=\"brand-logo\">\r\n");
      out.write("\t\t\t\t<a href=\"/NHMP/views/ERP/Employee.jsp\"> <b class=\"logo-abbr\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/NHMP/resources/ERP/images/logo.png\" alt=\"\"> </b> <span\r\n");
      out.write("\t\t\t\t\tclass=\"logo-compact\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/NHMP/resources/ERP/images/logo-compact.png\" alt=\"\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"brand-title\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/NHMP/resources/ERP/images/common/logo-text.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Nav header end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            \t????????? ??????\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"header-content clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"nav-control\">\r\n");
      out.write("\t\t\t\t\t<div class=\"hamburger\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"icons dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-img c-pointer position-relative\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"activity active\"></span> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/NHMP/resources/ERP/images/user/1.png\" height=\"40\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"40\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown-content-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"app-profile.html\"><i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>????????? ??????</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr class=\"my-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/NHMP/ERP/views/Employee/calendar.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-lock\"></i> <span>????????????</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/NHMP/logout\"><i class=\"icon-key\"></i> <span>????????????</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Header end ti-comment-alt\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Sidebar start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t<div class=\"nk-sidebar\">\r\n");
      out.write("\t\t\t<div class=\"nk-nav-scroll\">\r\n");
      out.write("\t\t\t\t<ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"mega-menu mega-menu-sm\"><a class=\"has-arrow\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void()\" aria-expanded=\"false\"> \r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-users\"></i><span class=\"nav-text\">????????????</span> \r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/NHMP/list\">??????????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/NHMP/views/ERP/Employee/InsertEmployee.jsp\">??????????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"layout-two-column.html\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<!--\r\n");
      out.write("                            <li><a href=\"layout-compact-nav.html\">Compact Nav</a></li>\r\n");
      out.write("                            <li><a href=\"layout-vertical.html\">Vertical</a></li>\r\n");
      out.write("                        -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!-- <li class=\"nav-label\">Apps</li> -->\r\n");
      out.write("\t\t\t\t\t<li><a class=\"has-arrow\" href=\"javascript:void()\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"> \r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-id-card\"></i> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"nav-text\">????????????</span> <!--    <i class=\"icon-envelope menu-icon\"></i> <span class=\"nav-text\">????????????</span> -->\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/NHMP/authall\">??????????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<!--\r\n");
      out.write("                            <li><a href=\"email-read.html\">??????????????????</a></li>\r\n");
      out.write("                            <li><a href=\"email-compose.html\">????????????</a></li>\r\n");
      out.write("                            -->\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"has-arrow\" href=\"javascript:void()\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"> <i class=\"fa fa-plus-square\"></i><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nav-text\">?????? ??????</span> <!--   <i class=\"icon-screen-tablet menu-icon\"></i><span class=\"nav-text\">?????? ??????</span> -->\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"app-profile.html\">???????????? ??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"app-calender.html\">?????? ?????? ??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"app-calender.html\">???????????? ??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"app-calender.html\">???????????? ??????</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<!--\r\n");
      out.write("                    <li>\r\n");
      out.write("                            <a  href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                                    <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"fa fa-slideshare\"></i> <span class=\"nav-text\">????????????</span>\r\n");
      out.write("                               <i class=\"icon-graph menu-icon\"></i> <span class=\"nav-text\">?????????</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"chart-flot.html\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"chart-morris.html\">?????????</a></li>\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"chart-chartjs.html\">Chartjs</a></li>\r\n");
      out.write("                            <li><a href=\"chart-chartist.html\">Chartist</a></li>\r\n");
      out.write("                            <li><a href=\"chart-sparkline.html\">Sparkline</a></li>\r\n");
      out.write("                            <li><a href=\"chart-peity.html\">Peity</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--   <li class=\"nav-label\">UI Components</li>  -->\r\n");
      out.write("\t\t\t\t\t<li><a class=\"has-arrow\" href=\"javascript:void()\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"> <i class=\"fa fa-usd\"></i><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nav-text\">?????? ??????</span> <!--    <i class=\"icon-grid menu-icon\"></i><span class=\"nav-text\">?????? ??????</span>  -->\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li><a href=\"/NHMP/deduclise\">??????????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/NHMP/allowlist\">??????????????????</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/NHMP/paylist\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/NHMP/nlist\" aria-expanded=\"false\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-slideshare\"></i> <span class=\"nav-text\">????????????</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void()\" aria-expanded=\"false\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-download\"></i> <span class=\"nav-text\">?????????</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Sidebar end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Content body start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t<div class=\"content-body\" style=\"padding: 40px;\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<div class=\"empname\">\r\n");
      out.write("\t\t\t\t\t<form action=\"/NHMP/esel\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t????????????:&nbsp; <div class=\"icon\"><i class=\"fa fa-search\"></i></div><input type=\"search\" name=\"empname\" id=\"sc\">&nbsp;\r\n");
      out.write("\t\t\t\t\t??????:&nbsp;<select name=\"dept\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>--????????????--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"40\">?????????</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"20\">??????</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"30\">???????????????</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"60\">?????????</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"50\">?????????</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">???????????????</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;<input type=\"submit\" id=\"button1\" value=\"??????\">\r\n");
      out.write("\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t<form action=\"/NHMP/mdel\" method=\"post\" onsubmit=\"return trueAndFalse();\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"page\" value=\"");
      out.print(currentPage );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"bpage\" value=\"");
      out.print(beginPage );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"delbutton\"value=\"??????\">&nbsp;\r\n");
      out.write("\t\t\t<button id=\"usernewpwd\">?????????????????????</button></div><br>\r\n");
      out.write("                <table class=\"table table-bordered\" style=\"margin-top:10px;\"id=\"dataTable\" width=\"100%\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("                  \r\n");
      out.write("                    <tr class=\"mainTr\">\r\n");
      out.write("                      <th><input type=\"checkbox\" class=\"check-all\">&nbsp;????????????</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  ");
for(Employee e : empList){ 
      out.write("\r\n");
      out.write("                  \t\r\n");
      out.write("                    <tr class=\"trlist\">\r\n");
      out.write("                      <td><input type=\"checkbox\" class=\"ad\" name=\"empno\" id=\"empno\" value=\"");
      out.print(e.getEmpNo() );
      out.write("\"></td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getEmpId());
      out.write("</a></td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getEmpName() );
      out.write("</a> </td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getHireDate()  );
      out.write("</a></td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getPhone()  );
      out.write("</a></td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getEmail() );
      out.write("</a></td>\r\n");
      out.write("                      <td><a href=\"/NHMP/minfo?empid=");
      out.print(e.getEmpId() );
      out.write('"');
      out.write('>');
      out.print(e.getAddress() );
      out.write("</a></td>\r\n");
      out.write("                      \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th>&nbsp;</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>?????????</th>\r\n");
      out.write("                      <th>??????</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                </form>\r\n");
      out.write("\t\t\t\t<div id=\"pagebox\" align=\"center\" style=\"margin-right: 30px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=1\"><i id=\"i1\" class=\"fas fa-angle-left\"></i></a>&nbsp;\r\n");
      out.write("\t\t\t\t\t");

						if (beginPage - 10 < 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=1\"><i id=\"i2\"class=\"fas fa-angle-double-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=");
      out.print(beginPage - 10);
      out.write("\">??????</a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t");
 for (int p = beginPage; p <= endPage; p++) {
							if (p == currentPage) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=");
      out.print(p);
      out.write("\"><font color=\"red\"><b>[");
      out.print(p);
      out.write("]\r\n");
      out.write("\t\t\t\t\t\t</b></font></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=");
      out.print(p);
      out.write('"');
      out.write('>');
      out.print(p);
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
}}
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t");

						if ((endPage + 10) > maxPage) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=");
      out.print(maxPage);
      out.write("\"><i id=\"i3\"class=\"fas fa-angle-double-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/NHMP/list?page=");
      out.print(endPage + 10);
      out.write("\"><i id=\"i3\" class=\"fas fa-angle-double-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp; <a href=\"/NHMP/list?page=");
      out.print(maxPage);
      out.write("\"><i id=\"i4\" class=\"fas fa-angle-right\"></i></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Content body end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Footer start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tCopyright &copy; Designed & Developed by <a\r\n");
      out.write("\t\t\t\t\t\thref=\"https://themeforest.net/user/quixlab\">Quixlab</a> 2018\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Footer end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--**********************************\r\n");
      out.write("        Main wrapper end\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t<!--**********************************\r\n");
      out.write("        Scripts\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \t\t<script src=\"/NHMP/resources/ERP/css/plugins/common/common.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/js/custom.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/js/settings.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/js/gleek.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/js/styleSwitcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Chartjs -->\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/chart.js/Chart.bundle.min.js\"></script>\r\n");
      out.write("\t\t<!-- Circle progress -->\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/circle-progress/circle-progress.min.js\"></script>\r\n");
      out.write("\t\t<!-- Datamap -->\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/css/plugins/d3v3/index.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/css/plugins/topojson/topojson.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/datamaps/datamaps.world.min.js\"></script>\r\n");
      out.write("\t\t<!-- Morrisjs -->\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/css/plugins/raphael/raphael.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/css/plugins/morris/morris.min.js\"></script>\r\n");
      out.write("\t\t<!-- Pignose Calender -->\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/css/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/pg-calendar/js/pignose.calendar.min.js\"></script>\r\n");
      out.write("\t\t<!-- ChartistJS -->\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/chartist/js/chartist.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"/NHMP/resources/ERP/css/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"/NHMP/resources/ERP/js/dashboard/dashboard-1.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!-- \t<script src=\"/NHMP/resources/ERP/common/common.min.js\"></script>\r\n");
      out.write("\t<script src=\"/NHMP/resources/ERP/js/custom.min.js\"></script>\r\n");
      out.write("\t<script src=\"/NHMP/resources/ERP/js/settings.js\"></script>\r\n");
      out.write("\t<script src=\"/NHMP/resources/ERP/js/gleek.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
