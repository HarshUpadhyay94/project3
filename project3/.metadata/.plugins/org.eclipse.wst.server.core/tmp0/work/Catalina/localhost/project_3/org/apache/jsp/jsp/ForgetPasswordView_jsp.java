/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2022-02-22 10:31:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.controller.ForgetPasswordCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class ForgetPasswordView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1645369042198L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1645167347912L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ForgetPasswordCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>ForgetPassword View</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/* .header {\n");
      out.write("\twidth: 103%;\n");
      out.write("} */\n");
      out.write("i.css {\n");
      out.write("\tborder: 2px solid #8080803b;\n");
      out.write("\tpadding-left: 10px;\n");
      out.write("\t padding-bottom: 11px; \n");
      out.write("\t background-color: #ebebe0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=background-color:#ccccb3>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("\tintegrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".p1 {\r\n");
      out.write("\tpadding-top: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("po {\r\n");
      out.write("\tbackground-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/bg1.png');\r\n");
      out.write("\tbackground-size: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"po\">\r\n");
      out.write("\r\n");
      out.write("\t");

		UserDTO userDto = (UserDTO) session.getAttribute("user");
		boolean userLoggedIn = userDto != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("\t<div class=\"header\" style=\"background-color: #64e8ce;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg\"> <a class=\"navbar-brand\"\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"150px\"\r\n");
      out.write("\t\t\theight=\"50px\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span><i class=\"fas fa-bars\"\r\n");
      out.write("\t\t\t\tstyle=\"color: #fff; font-size: 28px;\"></i>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(ChaldiKudi)</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\t\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" fa fa-file-alt\"></i>Change Password</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-circle\"></i>Add User\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>User List\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-paste\"></i>Marksheet List</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-copy\"></i>Get Marksheet</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>Role List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a \r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">College</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-university\"></i>Add College</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-building\"></i>College List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Course\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Course List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-user-circle\"></i>Add Student\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-users\"></i>Student List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Faculty\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fas fa-users\"></i>Faculty\r\n");
      out.write("\t\t\t\t\t\t\tList</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Time\r\n");
      out.write("\t\t\t\t\t\t\tTable</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-clock\"></i>TimeTable List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-calculator\"></i>Add Subject</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Subject List\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"\r\n");
      out.write("\t\t\t\t\tstyle=\"padding-left: 5px; padding-right: 67px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (userLoggedIn) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-edit\"></i>Change Password\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" target=\"blank\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fas fa-clone\"></i>Java\r\n");
      out.write("\t\t\t\t\t\t\tDoc </a>\r\n");
      out.write("\t\t\t\t\t\t");

							} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-in-alt\">Login</i> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-registered\"></i> User Registration</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\n");
      out.write("\t\t<main>\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.FORGET_PASSWORD_CTL);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row pt-5\">\n");
      out.write("\t\t\t\t<!-- Grid column -->\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"text-center default-text text-primary\">Forget Your Password?</h3>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-center default-text text-info\" style=\"font-size:11px;\"> Submit your Email Address and we will Send You password</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<H4 align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (!ServletUtility.getSuccessMessage(request).equals("")) {
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"alert alert-success alert-dismissible\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</H4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<H4 align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (!ServletUtility.getErrorMessage(request).equals("")) {
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"alert alert-danger alert-dismissible\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</H4>\n");
      out.write("\t\t\t\t\t\t\t<!--Body-->\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      in.co.rays.project_3.dto.UserDTO bean = null;
      bean = (in.co.rays.project_3.dto.UserDTO) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.project_3.dto.UserDTO();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"createdBy\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(bean.getCreatedBy());
      out.write("\"> <input type=\"hidden\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"modifiedBy\" value=\"");
      out.print(bean.getModifiedBy());
      out.write("\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"createdDatetime\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDatetime()));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"modifiedDatetime\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDatetime()));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"md-form\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pl-sm-5\"><b>Email Id</b><span style=\"color:red;\">*</span></span></br>\n");
      out.write("\t\t<div class=\"col-sm-12\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <div class=\"input-group-prepend\">\n");
      out.write("          <div class=\"input-group-text\"><i class=\"fa fa-envelope grey-text\" style=\"font-size: 1rem;\"></i> </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"login\" id=\"defaultForm-pass\" placeholder=\"Enter email\" value=\"");
      out.print(DataUtility.getStringData(bean.getLogin()));
      out.write("\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<font color=\"red\" class=\"pl-sm-5\">");
      out.print(ServletUtility.getErrorMessage("login", request));
      out.write("</font></br>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-success btn-md\" style=\"font-size:16px\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(ForgetPasswordCtl.OP_GO);
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 mb-4\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".footer {\n");
      out.write("   position: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div class=\"footer\" style=background-color:#64e8ce >\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
