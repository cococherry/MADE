/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.45
 * Generated at: 2017-07-29 04:38:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.*;

public final class 공지사항_0020main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("member.model.vo");
    _jspx_imports_classes = null;
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

	Member m = (Member) session.getAttribute("member");
	String loginout;
	if (m == null) {
		loginout = "<a href='../../loginout.jsp'>&nbsp;Login&nbsp;</a>";
	} else {
		loginout = "&nbsp;<b>"+m.getNickName()+"</b>님 환영합니다!&nbsp;&nbsp;<a href='/made/logout'>&nbsp;Logout&nbsp;</a>";
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" class=\"no-js\" lang=\"ko\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html class=\"no-js\" lang=\"ko\"> <!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<title>공지사항 - MAːDÆ</title>\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"../../images/icon.ico\">\r\n");
      out.write("\t<!-- CSS FILES -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/style.css\" media=\"screen\" data-name=\"skins\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/layout/wide.css\" data-name=\"layout\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/fractionslider.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/style-fraction.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/switcher.css\" media=\"screen\" />\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--Start Header-->\r\n");
      out.write("\t<header id=\"header\" class=\"clearfix\">\r\n");
      out.write("        <div id=\"top-bar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-7 hidden-xs top-info\">\r\n");
      out.write("<!--                        <span><i class=\"fa fa-phone\"></i>Phone: (123) 456-7890</span>\r\n");
      out.write("                        <span><i class=\"fa fa-envelope\"></i>Email: firerain4@naver.com</span>-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-5 top-info\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li style=\"width: auto;\">");
      out.print(loginout);
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t ");
 if(m ==null ) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"../user/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85%ED%8E%98%EC%9D%B4%EC%A7%80.html\">&nbsp;회원가입&nbsp;</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- LOGO bar -->\r\n");
      out.write("       <div id=\"logo-bar\" class=\"clearfix\">\r\n");
      out.write("           <!-- Container -->\r\n");
      out.write("           <div class=\"container\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                   <!-- Logo / Mobile Menu -->\r\n");
      out.write("                   <div class=\"col-xs-12\">\r\n");
      out.write("                       <div id=\"logo\" style=\"width:170px;\">\r\n");
      out.write("                           <h1><a href=\"../../index.jsp\"><img src=\"../../images/logo.png\" alt=\"Made\" /></a></h1>\r\n");
      out.write("                       </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <!-- Container / End -->\r\n");
      out.write("       </div>\r\n");
      out.write("        <!--LOGO bar / End-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation\r\n");
      out.write("================================================== -->\r\n");
      out.write("        <div class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav\">\r\n");
      out.write("                            <li><a href=\"../../index.jsp\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"공지사항 main.jsp\">공지사항</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">DIY 상품</a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"../item/item_designed.html\">Designed</a></li>\r\n");
      out.write("                                    <li><a href=\"../item/item_parts.html\">Parts</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"#\">마이페이지</a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"../mypage/myinfo.html\">My page</a></li>\r\n");
      out.write("                                    <li><a href=\"../mypage/order_page.html\">주문내역</a></li>\r\n");
      out.write("                                    <li><a href=\"../mypage/myinfo.html\">회원정보수정</a></li>\r\n");
      out.write("                                    <li><a href=\"../mypage/myinfo.html\">쪽지함</a></li>\r\n");
      out.write("                                    <li><a href=\"../mypage/myinfo.html\">1:1문의</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"../faq/faq.jsp\">FAQ</a></li>\r\n");
      out.write("                            <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><!--/.row -->\r\n");
      out.write("            </div><!--/.container -->\r\n");
      out.write("        </div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--End Header-->\r\n");
      out.write("\r\n");
      out.write("\t<!--start wrapper-->\r\n");
      out.write("\t<section class=\"wrapper\">\r\n");
      out.write("       <section class=\"page_head\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<h2>공지사항</h2>\r\n");
      out.write("\t\t\t\t\t\t<nav id=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>You are here:</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"../../index.jsp\">Home</a></li>\r\n");
      out.write("                                <li>공지사항</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t<!-- Default panel contents -->\r\n");
      out.write("\t\t<div class=\"panel-heading hide\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<table class=\"board-list table\">\r\n");
      out.write("\t\t\t<input id=\"p_num\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t<tr class=\"header\">\r\n");
      out.write("\t\t\t\t<th width=\"50px\" class=\"text-center\">번호</th>\r\n");
      out.write("\t\t\t\t<th width=\"*\" class=\"text-left\">제목</th>\r\n");
      out.write("\t\t\t\t<th width=\"110px\" class=\"text-center\">작성자</th>\r\n");
      out.write("\t\t\t\t<th width=\"90px\" class=\"text-center\">일자</th>\r\n");
      out.write("\t\t\t\t<th width=\"50px\" class=\"text-center\">조회</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("                    <td class=\"no\">1</td>                    \r\n");
      out.write("\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD.html\">항소이유서</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"author\">유시민</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t1959.7.28\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("                    4\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("                    <td class=\"no\">2</td>                    \r\n");
      out.write("\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD.html\">항소이유서</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"author\">유시민</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t1959.7.28\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("                    4\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("                    <td class=\"no\">3</td>                    \r\n");
      out.write("\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD.html\">항소이유서</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"author\">유시민</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t1959.7.28\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("                    4\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("                    <td class=\"no\">4</td>                    \r\n");
      out.write("\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD.html\">항소이유서</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"author\">유시민</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t1959.7.28\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("                    4\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("                    <td class=\"no\">5</td>                    \r\n");
      out.write("\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD.html\">항소이유서</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"author\">유시민</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"date\">\r\n");
      out.write("\t\t\t\t\t\t1959.7.28\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("                    4\r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<button type=\"button\" class=\"btn btn-default\" onclick=\"top.location.href='%EA%B8%80%EC%93%B0%EA%B8%B0.html'\">글쓰기</button>\r\n");
      out.write("\t<div class=\"board-page text-center\">\r\n");
      out.write("\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t<li class=\"\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><span class=\"glyphicon glyphicon-chevron-left\"></span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a class=\"\">\r\n");
      out.write("                        1\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("                    <a class=\"\">\r\n");
      out.write("                        2\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("                    <a class=\"\">\r\n");
      out.write("                        3\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("                    <a class=\"\">\r\n");
      out.write("                        4\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("                    <a class=\"\">\r\n");
      out.write("                        5\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><span class=\"glyphicon glyphicon-chevron-right\"></span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!--start footer-->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-lg-3\">\r\n");
      out.write("                    <div class=\"widget_title\">\r\n");
      out.write("                        <h4><span>About Us</span></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget_content\">\r\n");
      out.write("                        <p>본 프로젝트는 KH정보교육원 [NCS]웹 개발 응용SW엔지니어 양성과정_2주차 오후반 3조에서 만든 Semi 프로젝트입니다.</p>\r\n");
      out.write("                        <ul class=\"contact-details-alt\">\r\n");
      out.write("                            <li><i class=\"fa fa-map-marker\"></i> <p><strong>Address</strong>: 서울시 강남구 역삼동</p></li>\r\n");
      out.write("                            <li><i class=\"fa fa-user\"></i> <p><strong>Phone</strong>: 010-5688-2293</p></li>\r\n");
      out.write("                            <li><i class=\"fa fa-envelope\"></i> <p><strong>Email</strong>: <a href=\"#\">firerain4@naver.com</a></p></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-lg-3\">\r\n");
      out.write("                    <div class=\"widget_title\">\r\n");
      out.write("                        <h4><span>Recent Posts</span></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget_content\">\r\n");
      out.write("                        <ul class=\"links\">\r\n");
      out.write("                            <li><i class=\"fa fa-caret-right\"></i> <a href=\"#\">Aenean commodo ligula eget dolor<span>November 07, 2014</span></a></li>\r\n");
      out.write("                            <li><i class=\"fa fa-caret-right\"></i> <a href=\"#\">Temporibus autem quibusdam <span>November 05, 2014</span></a></li>\r\n");
      out.write("                            <li><i class=\"fa fa-caret-right\"></i> <a href=\"#\">Debitis aut rerum saepe <span>November 03, 2014</span></a></li>\r\n");
      out.write("                            <li><i class=\"fa fa-caret-right\"></i> <a href=\"#\">Et voluptates repudiandae <span>November 02, 2014</span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-lg-3\">\r\n");
      out.write("                    <div class=\"widget_title\">\r\n");
      out.write("                        <h4><span>Twitter</span></h4>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget_content\">\r\n");
      out.write("                        <ul class=\"tweet_list\">\r\n");
      out.write("                            <li class=\"tweet_content item\">\r\n");
      out.write("                                <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("                                <p class=\"tweet_link\"><a href=\"#\">@jquery_rain </a> Lorem ipsum dolor et, consectetur adipiscing eli</p>\r\n");
      out.write("                                <span class=\"time\">29 September 2014</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"tweet_content item\">\r\n");
      out.write("                                <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("                                <p class=\"tweet_link\"><a href=\"#\">@jquery_rain </a> Lorem ipsum dolor et, consectetur adipiscing eli</p>\r\n");
      out.write("                                <span class=\"time\">29 September 2014</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"tweet_content item\">\r\n");
      out.write("                                <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("                                <p class=\"tweet_link\"><a href=\"#\">@jquery_rain </a> Lorem ipsum dolor et, consectetur adipiscing eli</p>\r\n");
      out.write("                                <span class=\"time\">29 September 2014</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget_content\">\r\n");
      out.write("                        <div class=\"tweet_go\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-lg-3\">\r\n");
      out.write("                    <div class=\"widget_title\">\r\n");
      out.write("                        <h4><span>Flickr Gallery</span></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget_content\">\r\n");
      out.write("                        <div class=\"flickr\">\r\n");
      out.write("                            <ul id=\"flickrFeed\" class=\"flickr-feed\"></ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\t<!--end footer-->\r\n");
      out.write("\t\r\n");
      out.write("\t<section class=\"footer_bottom\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 \">\r\n");
      out.write("                    <p class=\"copyright\">&copy; Copyright 2017 MAːDÆ | Powered by  <a href=\"http://www.jqueryrain.com/\">jQuery Rain</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 \">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer_social\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"footbot_social\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"fb\" href=\"#.\" data-placement=\"top\" data-toggle=\"tooltip\" title=\"Facbook\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"twtr\" href=\"#.\" data-placement=\"top\" data-toggle=\"tooltip\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dribbble\" href=\"#.\" data-placement=\"top\" data-toggle=\"tooltip\" title=\"Dribbble\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"skype\" href=\"#.\" data-placement=\"top\" data-toggle=\"tooltip\" title=\"Skype\"><i class=\"fa fa-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"rss\" href=\"#.\" data-placement=\"top\" data-toggle=\"tooltip\" title=\"RSS\"><i class=\"fa fa-rss\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("    <script src=\"../../js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"../../js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("    <script src=\"../../js/retina-1.1.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.cookie.js\"></script> <!-- jQuery cookie -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/styleswitch.js\"></script> <!-- Style Colors Switcher -->\r\n");
      out.write("    <script src=\"../../js/jquery.fractionslider.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.smartmenus.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.smartmenus.bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.jcarousel.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jflickrfeed.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery.isotope.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/swipe.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../js/jquery-scrolltofixed-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../../js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Style Switcher -->\r\n");
      out.write("    <div class=\"switcher\"></div>\r\n");
      out.write("    <!-- End Style Switcher -->\r\n");
      out.write("</body>\r\n");
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
