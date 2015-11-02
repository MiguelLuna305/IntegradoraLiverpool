package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/CSS/base.css");
    _jspx_dependants.add("/CSS/skeleton.css");
    _jspx_dependants.add("/CSS/screen.css");
    _jspx_dependants.add("/CSS/prettyPhoto.css");
    _jspx_dependants.add("/Admin/css/style.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_url_value_nobody.release();
    _jspx_tagPool_s_submit_value_id_nobody.release();
    _jspx_tagPool_s_form_action.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Basic Page Needs ================================================== \r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Liverpool</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"Place to put your description text\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Specific Metas ================================================== \r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("/*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : 10-oct-2015, 20:00:36\n");
      out.write("    Author     : Sandy\n");
      out.write("*/\n");
      out.write("\n");
      out.write("/*\n");
      out.write("* Skeleton V1.1\n");
      out.write("* Copyright 2011, Dave Gamache\n");
      out.write("* www.getskeleton.com\n");
      out.write("* Free to use under the MIT license.\n");
      out.write("* http://www.opensource.org/licenses/mit-license.php\n");
      out.write("* 8/17/2011\n");
      out.write("*/\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Table of Content\n");
      out.write("==================================================\n");
      out.write("\t#Reset & Basics\n");
      out.write("\t#Basic Styles\n");
      out.write("\t#Site Styles\n");
      out.write("\t#Typography\n");
      out.write("\t#Links\n");
      out.write("\t#Lists\n");
      out.write("\t#Images\n");
      out.write("\t#Buttons\n");
      out.write("\t#Tabs\n");
      out.write("\t#Forms\n");
      out.write("\t#Misc */\n");
      out.write("\n");
      out.write("\n");
      out.write("/* #Reset & Basics (Inspired by E. Meyers)\n");
      out.write("================================================== */\n");
      out.write("html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tborder: 0;\n");
      out.write("\tfont-size: 100%;\n");
      out.write("\tfont: inherit;\n");
      out.write("\tvertical-align: baseline;\n");
      out.write("}\n");
      out.write("article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tline-height: 1;\n");
      out.write("/*overflow-x: hidden;*/}\n");
      out.write("ol, ul {\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("blockquote, q {\n");
      out.write("\tquotes: none;\n");
      out.write("}\n");
      out.write("blockquote:before, blockquote:after, q:before, q:after {\n");
      out.write("\tcontent: '';\n");
      out.write("\tcontent: none;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\tborder-spacing: 0;\n");
      out.write("}\n");
      out.write("/* #Basic Styles\n");
      out.write("================================================== */\n");
      out.write("body {\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\n");
      out.write("\tline-height: 20px;\n");
      out.write("\tcolor: #FF00BF;\n");
      out.write("\t-webkit-font-smoothing: antialiased; /* Fix for webkit rendering */\n");
      out.write("\t-webkit-text-size-adjust: 100%;\n");
      out.write("\toverflow-x: hidden;\n");
      out.write("}\n");
      out.write("html {\n");
      out.write("\tbackground:#fff;\n");
      out.write("/*overflow-x: hidden;*/ }\n");
      out.write("/* #Typography\n");
      out.write("================================================== */\n");
      out.write("h1, h2, h3, h4, h5, h6 {\n");
      out.write("\tcolor: #261b0d;\n");
      out.write("\tfont-family:'Oswald', serif;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("}\n");
      out.write("h1 a, h2 a, h3 a, h4 a, h5 a, h6 a {\n");
      out.write("\tfont-weight: inherit;\n");
      out.write("\tcolor: #f07272;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("\tfont-size: 48px;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("\tfont-size: 30px;\n");
      out.write("\tmargin-bottom:10px;\n");
      out.write("}\n");
      out.write("h3 {\n");
      out.write("\tfont-size: 22px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("h4 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\ttext-transform:capitalize;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write("h5 {\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write("h6 {\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".subheader {\n");
      out.write("\tcolor: #FF00BF;\n");
      out.write("}\n");
      out.write("p {\n");
      out.write("\tcolor: #2d2010;\n");
      out.write("\tline-height:1.5em;\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tmargin: 0 0 15px 0;\n");
      out.write("\ttext-shadow: 1px 1px 0 #fff;\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("p.last {\n");
      out.write("\tmargin-bottom:0;\n");
      out.write("}\n");
      out.write("p img {\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("img.left {\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\tmargin-right: 20px;\n");
      out.write("}\n");
      out.write("img.right {\n");
      out.write("\tfloat: right;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("}\n");
      out.write("em {\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write("strong {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("small {\n");
      out.write("\tfont-size: 80%;\n");
      out.write("}\n");
      out.write("/*\tBlockquotes  */\n");
      out.write("blockquote, blockquote p {\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tline-height: 24px;\n");
      out.write("\tcolor: #cdcdcd;\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write("blockquote {\n");
      out.write("\tmargin: 0 0 0px;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tborder-right: 1px solid #796172;\n");
      out.write("}\n");
      out.write("blockquote cite {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: #cdcdcd;\n");
      out.write("}\n");
      out.write("blockquote cite:before {\n");
      out.write("\tcontent: \"\\2014 \\0020\";\n");
      out.write("}\n");
      out.write("blockquote cite a, blockquote cite a:visited, blockquote cite a:visited {\n");
      out.write("\tcolor: #cdcdcd;\n");
      out.write("}\n");
      out.write("hr {\n");
      out.write("\tborder: solid #ddd;\n");
      out.write("\tborder-width: 1px 0 0;\n");
      out.write("\tclear: both;\n");
      out.write("\tmargin: 10px 0 30px;\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("/* Text Selection */\n");
      out.write("\n");
      out.write("::selection {\n");
      out.write("background: #f9efe3;\n");
      out.write("color: #261b0d; /* Safari */\n");
      out.write("}\n");
      out.write("::-moz-selection {\n");
      out.write("background: #f9efe3;\n");
      out.write("color: #261b0d; /* Firefox */\n");
      out.write("}\n");
      out.write("/* #Links\n");
      out.write("================================================== */\n");
      out.write("a, a:visited {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\toutline: 0;\n");
      out.write("}\n");
      out.write("p a, p a:visited {\n");
      out.write("\tline-height: inherit;\n");
      out.write("}\n");
      out.write("/* #Images\n");
      out.write("================================================== */\n");
      out.write("img.scale-with-grid {\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\theight: auto;\n");
      out.write("}\n");
      out.write("/* #Forms\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("/* General Forms */\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("}\n");
      out.write("fieldset {\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write("label, legend {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\n");
      out.write("input[type=\"checkbox\"] {\n");
      out.write("\tdisplay: inline;\n");
      out.write("}\n");
      out.write("label span, legend span {\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tcolor: #444;\n");
      out.write("}\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"email\"], textarea, select {\n");
      out.write("\tpadding: 10px 10px;\n");
      out.write("\toutline: none;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tfont: 12px \"HelveticaNeue\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("\tcolor: #261b0d;\n");
      out.write("\tmargin: 0;\n");
      out.write("\twidth: 198px;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tbackground: #eee;\n");
      out.write("}\n");
      out.write("select {\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("input[type=\"text\"]:focus, input[type=\"password\"]:focus, input[type=\"email\"]:focus, textarea:focus {\n");
      out.write("\tborder: 1px solid #bbb;\n");
      out.write("\tcolor: #555;\n");
      out.write("}\n");
      out.write("textarea {\n");
      out.write("\tmin-height: 100px;\n");
      out.write("}\n");
      out.write("select {\n");
      out.write("\twidth: 220px;\n");
      out.write("}\n");
      out.write("/* Header Responsive Menu Form Style */\n");
      out.write("\t\n");
      out.write(".header form {\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write("#header select {\n");
      out.write("\t-webkit-appearance: none;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder:1px solid #22180b;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tbackground:#483319 url(../images/navselect.gif) no-repeat right center;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("#header option {\n");
      out.write("\toutline: none;\n");
      out.write("\tborder: 0;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tpadding-left: 15px;\n");
      out.write("}\n");
      out.write("/* #Misc\n");
      out.write("================================================== */\n");
      out.write(".remove-bottom {\n");
      out.write("\tmargin-bottom: 0 !important;\n");
      out.write("}\n");
      out.write(".half-bottom {\n");
      out.write("\tmargin-bottom: 10px !important;\n");
      out.write("}\n");
      out.write(".add-bottom {\n");
      out.write("\tmargin-bottom: 20px !important;\n");
      out.write("}\n");
      out.write(".left {\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write(".right {\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("/*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : 10-oct-2015, 20:06:20\n");
      out.write("    Author     : Sandy\n");
      out.write("*/\n");
      out.write("\n");
      out.write("/*\n");
      out.write("* Skeleton V1.1\n");
      out.write("* Copyright 2011, Dave Gamache\n");
      out.write("* www.getskeleton.com\n");
      out.write("* Free to use under the MIT license.\n");
      out.write("* http://www.opensource.org/licenses/mit-license.php\n");
      out.write("* 8/17/2011\n");
      out.write("*/\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Table of Contents\n");
      out.write("==================================================\n");
      out.write("    #Base 960 Grid\n");
      out.write("    #Tablet (Portrait)\n");
      out.write("    #Mobile (Portrait)\n");
      out.write("    #Mobile (Landscape)\n");
      out.write("    #Clearing */\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* #Base 960 Grid\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("\tposition: relative;\n");
      out.write("\twidth: 960px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write(".column, .columns {\n");
      out.write("\tfloat: left;\n");
      out.write("\tdisplay: inline;\n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\tmargin-right: 20px;\n");
      out.write("}\n");
      out.write(".row {\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write("/* Nested Column Classes */\n");
      out.write("    .column.alpha, .columns.alpha {\n");
      out.write("\tmargin-left: 0;\n");
      out.write("}\n");
      out.write(".column.omega, .columns.omega {\n");
      out.write("\tmargin-right: 0;\n");
      out.write("}\n");
      out.write("/* Base Grid */\n");
      out.write("    .container .one.column {\n");
      out.write("\twidth: 20px;\n");
      out.write("}\n");
      out.write(".container .two.columns {\n");
      out.write("\twidth: 80px;\n");
      out.write("}\n");
      out.write(".container .three.columns {\n");
      out.write("\twidth: 140px;\n");
      out.write("}\n");
      out.write(".container .four.columns {\n");
      out.write("\twidth: 200px;\n");
      out.write("}\n");
      out.write(".container .five.columns {\n");
      out.write("\twidth: 260px;\n");
      out.write("}\n");
      out.write(".container .six.columns {\n");
      out.write("\twidth: 320px;\n");
      out.write("}\n");
      out.write(".container .seven.columns {\n");
      out.write("\twidth: 380px;\n");
      out.write("}\n");
      out.write(".container .eight.columns {\n");
      out.write("\twidth: 440px;\n");
      out.write("}\n");
      out.write(".container .nine.columns {\n");
      out.write("\twidth: 500px;\n");
      out.write("}\n");
      out.write(".container .ten.columns {\n");
      out.write("\twidth: 560px;\n");
      out.write("}\n");
      out.write(".container .eleven.columns {\n");
      out.write("\twidth: 620px;\n");
      out.write("}\n");
      out.write(".container .twelve.columns {\n");
      out.write("\twidth: 680px;\n");
      out.write("}\n");
      out.write(".container .thirteen.columns {\n");
      out.write("\twidth: 740px;\n");
      out.write("}\n");
      out.write(".container .fourteen.columns {\n");
      out.write("\twidth: 800px;\n");
      out.write("}\n");
      out.write(".container .fifteen.columns {\n");
      out.write("\twidth: 860px;\n");
      out.write("}\n");
      out.write(".container .sixteen.columns {\n");
      out.write("\twidth: 920px;\n");
      out.write("}\n");
      out.write(".container .one-third.column {\n");
      out.write("\twidth: 280px;\n");
      out.write("}\n");
      out.write(".container .two-thirds.column {\n");
      out.write("\twidth: 600px;\n");
      out.write("}\n");
      out.write("/* Offsets */\n");
      out.write("    .container .offset-by-one {\n");
      out.write("\tpadding-left: 40px;\n");
      out.write("}\n");
      out.write(".container .offset-by-two {\n");
      out.write("\tpadding-left: 100px;\n");
      out.write("}\n");
      out.write(".container .offset-by-three {\n");
      out.write("\tpadding-left: 160px;\n");
      out.write("}\n");
      out.write(".container .offset-by-four {\n");
      out.write("\tpadding-left: 220px;\n");
      out.write("}\n");
      out.write(".container .offset-by-five {\n");
      out.write("\tpadding-left: 280px;\n");
      out.write("}\n");
      out.write(".container .offset-by-six {\n");
      out.write("\tpadding-left: 340px;\n");
      out.write("}\n");
      out.write(".container .offset-by-seven {\n");
      out.write("\tpadding-left: 400px;\n");
      out.write("}\n");
      out.write(".container .offset-by-eight {\n");
      out.write("\tpadding-left: 460px;\n");
      out.write("}\n");
      out.write(".container .offset-by-nine {\n");
      out.write("\tpadding-left: 520px;\n");
      out.write("}\n");
      out.write(".container .offset-by-ten {\n");
      out.write("\tpadding-left: 580px;\n");
      out.write("}\n");
      out.write(".container .offset-by-eleven {\n");
      out.write("\tpadding-left: 640px;\n");
      out.write("}\n");
      out.write(".container .offset-by-twelve {\n");
      out.write("\tpadding-left: 700px;\n");
      out.write("}\n");
      out.write(".container .offset-by-thirteen {\n");
      out.write("\tpadding-left: 760px;\n");
      out.write("}\n");
      out.write(".container .offset-by-fourteen {\n");
      out.write("\tpadding-left: 820px;\n");
      out.write("}\n");
      out.write(".container .offset-by-fifteen {\n");
      out.write("\tpadding-left: 880px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* #Tablet (Portrait)\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("    /* Note: Design for a width of 768px */\n");
      out.write("\n");
      out.write("    @media only screen and (min-width: 768px) and (max-width: 959px) {\n");
      out.write(" .container {\n");
      out.write("width: 768px;\n");
      out.write("}\n");
      out.write(" .container .column, .container .columns {\n");
      out.write("margin-left: 10px;\n");
      out.write("margin-right: 10px;\n");
      out.write("}\n");
      out.write(" .column.alpha, .columns.alpha {\n");
      out.write("margin-left: 0;\n");
      out.write("margin-right: 10px;\n");
      out.write("}\n");
      out.write(" .column.omega, .columns.omega {\n");
      out.write("margin-right: 0;\n");
      out.write("margin-left: 10px;\n");
      out.write("}\n");
      out.write(" .container .one.column {\n");
      out.write("width: 28px;\n");
      out.write("}\n");
      out.write(" .container .two.columns {\n");
      out.write("width: 76px;\n");
      out.write("}\n");
      out.write(" .container .three.columns {\n");
      out.write("width: 124px;\n");
      out.write("}\n");
      out.write(" .container .four.columns {\n");
      out.write("width: 172px;\n");
      out.write("}\n");
      out.write(" .container .five.columns {\n");
      out.write("width: 220px;\n");
      out.write("}\n");
      out.write(" .container .six.columns {\n");
      out.write("width: 268px;\n");
      out.write("}\n");
      out.write(" .container .seven.columns {\n");
      out.write("width: 316px;\n");
      out.write("}\n");
      out.write(" .container .eight.columns {\n");
      out.write("width: 364px;\n");
      out.write("}\n");
      out.write(" .container .nine.columns {\n");
      out.write("width: 412px;\n");
      out.write("}\n");
      out.write(" .container .ten.columns {\n");
      out.write("width: 460px;\n");
      out.write("}\n");
      out.write(" .container .eleven.columns {\n");
      out.write("width: 508px;\n");
      out.write("}\n");
      out.write(" .container .twelve.columns {\n");
      out.write("width: 556px;\n");
      out.write("}\n");
      out.write(" .container .thirteen.columns {\n");
      out.write("width: 604px;\n");
      out.write("}\n");
      out.write(" .container .fourteen.columns {\n");
      out.write("width: 652px;\n");
      out.write("}\n");
      out.write(" .container .fifteen.columns {\n");
      out.write("width: 700px;\n");
      out.write("}\n");
      out.write(" .container .sixteen.columns {\n");
      out.write("width: 748px;\n");
      out.write("}\n");
      out.write(" .container .one-third.column {\n");
      out.write("width: 236px;\n");
      out.write("}\n");
      out.write(" .container .two-thirds.column {\n");
      out.write("width: 492px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        /* Offsets */\n");
      out.write("        .container .offset-by-one {\n");
      out.write("padding-left: 48px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-two {\n");
      out.write("padding-left: 96px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-three {\n");
      out.write("padding-left: 144px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-four {\n");
      out.write("padding-left: 192px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-five {\n");
      out.write("padding-left: 240px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-six {\n");
      out.write("padding-left: 288px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-seven {\n");
      out.write("padding-left: 336px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-eight {\n");
      out.write("padding-left: 348px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-nine {\n");
      out.write("padding-left: 432px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-ten {\n");
      out.write("padding-left: 480px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-eleven {\n");
      out.write("padding-left: 528px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-twelve {\n");
      out.write("padding-left: 576px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-thirteen {\n");
      out.write("padding-left: 624px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-fourteen {\n");
      out.write("padding-left: 672px;\n");
      out.write("}\n");
      out.write(" .container .offset-by-fifteen {\n");
      out.write("padding-left: 720px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*  #Mobile (Portrait)\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("    /* Note: Design for a width of 320px */\n");
      out.write("\n");
      out.write("    @media only screen and (max-width: 767px) {\n");
      out.write(" .container {\n");
      out.write("width: 300px;\n");
      out.write("}\n");
      out.write(" .column, .columns {\n");
      out.write("float: left;\n");
      out.write("display: inline;\n");
      out.write("margin-left: 10px;\n");
      out.write("margin-right: 10px;\n");
      out.write("}\n");
      out.write(" .row {\n");
      out.write("margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\t/* Nested Column Classes */\n");
      out.write("\t\t.column.alpha, .columns.alpha {\n");
      out.write("margin: 0;\n");
      out.write("}\n");
      out.write(" .column.omega, .columns.omega {\n");
      out.write("margin: 0;\n");
      out.write("}\n");
      out.write(" .container .one-third.column {\n");
      out.write("margin: 10px 0;\n");
      out.write("}\n");
      out.write(" .container .one.column, .container .two.columns, .container .three.columns, .container .four.columns, .container .five.columns, .container .six.columns, .container .seven.columns, .container .eight.columns, .container .nine.columns, .container .ten.columns, .container .eleven.columns, .container .twelve.columns, .container .thirteen.columns, .container .fourteen.columns, .container .fifteen.columns, .container .sixteen.columns {\n");
      out.write("width: 280px;\n");
      out.write("}\n");
      out.write(" .container .one-third.column, .container .two-thirds.column {\n");
      out.write("width: 280px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        /* Offsets */\n");
      out.write("        .container .offset-by-one, .container .offset-by-two, .container .offset-by-three, .container .offset-by-four, .container .offset-by-five, .container .offset-by-six, .container .offset-by-seven, .container .offset-by-eight, .container .offset-by-nine, .container .offset-by-ten, .container .offset-by-eleven, .container .offset-by-twelve, .container .offset-by-thirteen, .container .offset-by-fourteen, .container .offset-by-fifteen {\n");
      out.write("padding-left: 0;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* #Mobile (Landscape)\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("    /* Note: Design for a width of 480px */\n");
      out.write("\n");
      out.write("    @media only screen and (min-width: 480px) and (max-width: 767px) {\n");
      out.write(" .container {\n");
      out.write("width: 420px;\n");
      out.write("}\n");
      out.write(" .column, .columns {\n");
      out.write("float: left;\n");
      out.write("display: inline;\n");
      out.write("margin-left: 10px;\n");
      out.write("margin-right: 10px;\n");
      out.write("}\n");
      out.write(" .row {\n");
      out.write("margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\t/* Nested Column Classes */\n");
      out.write("\t\t.column.alpha, .columns.alpha {\n");
      out.write("margin: 0;\n");
      out.write("}\n");
      out.write(" .column.omega, .columns.omega {\n");
      out.write("margin: 0;\n");
      out.write("}\n");
      out.write(" .container .one-third.column {\n");
      out.write("margin: 10px 0;\n");
      out.write("}\n");
      out.write(" .container .one.column, .container .two.columns, .container .three.columns, .container .four.columns, .container .five.columns, .container .six.columns, .container .seven.columns, .container .eight.columns, .container .nine.columns, .container .ten.columns, .container .eleven.columns, .container .twelve.columns, .container .thirteen.columns, .container .fourteen.columns, .container .fifteen.columns, .container .sixteen.columns {\n");
      out.write("width: 400px;\n");
      out.write("}\n");
      out.write(" .container .one-third.column, .container .two-thirds.column {\n");
      out.write("width: 400px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("/* #Clearing\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("    /* Self Clearing Goodness */\n");
      out.write("    .container:after {\n");
      out.write("\tcontent: \"\\0020\";\n");
      out.write("\tdisplay: block;\n");
      out.write("\theeight: 0;\n");
      out.write("\tclear: both;\n");
      out.write("\tvisibility: hidden;\n");
      out.write("}\n");
      out.write("/* Use clearfix class on parent to clear nested columns,\n");
      out.write("    or wrap each row of columns in a <div class=\"row\"> */\n");
      out.write("    .clearfix:before, .clearfix:after, .row:before, .row:after {\n");
      out.write("\tcontent: '\\0020';\n");
      out.write("\tdisplay: block;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tvisibility: hidden;\n");
      out.write("\twidth: 0;\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write(".row:after, .clearfix:after {\n");
      out.write("\tclear: both;\n");
      out.write("}\n");
      out.write(".row, .clearfix {\n");
      out.write("\tzoom: 1;\n");
      out.write("}\n");
      out.write("/* You can also use a <br class=\"clear\" /> to clear columns */\n");
      out.write("    .clear {\n");
      out.write("\tclear: both;\n");
      out.write("\tdisplay: block;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tvisibility: hidden;\n");
      out.write("\twidth: 0;\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    ");
      out.write("/*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : 10-oct-2015, 20:05:29\n");
      out.write("    Author     : Sandy\n");
      out.write("*/\n");
      out.write("\n");
      out.write("/* Main Container */\n");
      out.write("img, embed, object, video {\n");
      out.write("\tmax-width: 100%\n");
      out.write("}\n");
      out.write("/* Deviders */\n");
      out.write("hr.separator {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin: 40px 0;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -moz-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -ms-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -o-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tborder: 0;\n");
      out.write("}\n");
      out.write("hr.separator1 {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin: 10px 0;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -moz-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -ms-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -o-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tborder: 0;\n");
      out.write("}\n");
      out.write("hr.separator2 {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin: 30px 0 0 0;\n");
      out.write("\tbackground-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -moz-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -ms-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tbackground-image: -o-linear-gradient(left, rgba(0, 0, 0, 0), rgba(0, 0, 0, .1), rgba(0, 0, 0, 0));\n");
      out.write("\tborder: 0;\n");
      out.write("}\n");
      out.write("div.blankSeparator {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin:20px 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("div.blankSeparator1 {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin:25px 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("div.blankSeparator2 {\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin:10px 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write(".tip-twitter {\n");
      out.write("\tz-index:1000;\n");
      out.write("\ttext-align:left;\n");
      out.write("\tborder-radius:4px;\n");
      out.write("\t-moz-border-radius:4px;\n");
      out.write("\t-webkit-border-radius:4px;\n");
      out.write("\tpadding:8px 8px;\n");
      out.write("\tmax-width:200px;\n");
      out.write("\tcolor:#261b0d;\n");
      out.write("\tbackground-color: #f07272;\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write(".tip-twitter .tip-inner {\n");
      out.write("\tfont:12px/16px Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("/****************************** HOME - Content Part - Logo&Menu ******************************/\n");
      out.write("/* Header - Logo & Menu */\n");
      out.write("#header {\n");
      out.write("\tbackground:#D20584 url(../images/rausch.png) repeat;\n");
      out.write("\tmargin-top:0px;\n");
      out.write("\tborder-bottom:1px solid #1d1b18;\n");
      out.write("}\n");
      out.write(".logo {\n");
      out.write("\t\n");
      out.write("    padding-left: -100px;\n");
      out.write("\tpadding-top:10px;\n");
      out.write("}\n");
      out.write(".mainmenu {\n");
      out.write("\tfloat:right;\n");
      out.write("}\n");
      out.write("ul.sf-menu {\n");
      out.write("\tmargin-top:0px;\n");
      out.write("}\n");
      out.write("/*** ESSENTIAL STYLES ***/\n");
      out.write(".sf-menu, .sf-menu * {\n");
      out.write("\tmargin:\t\t\t0;\n");
      out.write("\tpadding:\t\t0;\n");
      out.write("\tlist-style:\t\tnone;\n");
      out.write("}\n");
      out.write(".sf-menu {\n");
      out.write("\tline-height:\t1.0;\n");
      out.write("}\n");
      out.write(".sf-menu ul {\n");
      out.write("\tposition:\t\tabsolute;\n");
      out.write("\ttop:\t\t\t-999em;\n");
      out.write("\twidth:\t\t\t10em; /* left offset of submenus need to match (see below) */\n");
      out.write("}\n");
      out.write(".sf-menu ul li {\n");
      out.write("\twidth:\t\t\t100%;\n");
      out.write("}\n");
      out.write(".sf-menu li:hover {\n");
      out.write("\tvisibility:\t\tinherit; /* fixes IE7 'sticky bug' */\n");
      out.write("}\n");
      out.write(".sf-menu li {\n");
      out.write("\tfloat:\t\t\tleft;\n");
      out.write("\tposition:\t\trelative;\n");
      out.write("}\n");
      out.write(".sf-menu a {\n");
      out.write("\tdisplay:\t\tblock;\n");
      out.write("\tposition:\t\trelative;\n");
      out.write("}\n");
      out.write(".sf-menu li:hover ul, .sf-menu li.sfHover ul {\n");
      out.write("\tleft:\t\t\t0;\n");
      out.write("\ttop:\t\t\t2.5em; /* match top ul list item height */\n");
      out.write("\tz-index:\t\t99;\n");
      out.write("}\n");
      out.write("ul.sf-menu li:hover li ul, ul.sf-menu li.sfHover li ul {\n");
      out.write("\ttop:\t\t\t-999em;\n");
      out.write("}\n");
      out.write("ul.sf-menu li li:hover ul, ul.sf-menu li li.sfHover ul {\n");
      out.write("\tleft:\t\t\t10em; /* match ul width */\n");
      out.write("\ttop:\t\t\t0;\n");
      out.write("}\n");
      out.write("ul.sf-menu li li:hover li ul, ul.sf-menu li li.sfHover li ul {\n");
      out.write("\ttop:\t\t\t-999em;\n");
      out.write("}\n");
      out.write("ul.sf-menu li li li:hover ul, ul.sf-menu li li li.sfHover ul {\n");
      out.write("\tleft:\t\t\t10em; /* match ul width */\n");
      out.write("\ttop:\t\t\t0;\n");
      out.write("}\n");
      out.write(".sf-menu li a {\n");
      out.write("\tfont-family:'Oswald', serif;\n");
      out.write("\tfont-size:15px;\n");
      out.write("\tpadding:45px 15px 45px 15px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("\tcolor: #fbe6cb;\n");
      out.write("\t-webkit-transition: all 0.5s ease;\n");
      out.write("\t-moz-transition: all 0.5s ease-in-out;\n");
      out.write("\t-o-transition: all 0.5s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.5s ease-in-out;\n");
      out.write("\ttransition: all 0.5s ease-in-out;\n");
      out.write("}\n");
      out.write(".sf-menu li a:hover { /* visited pseudo selector so IE6 applies text colour*/\n");
      out.write("\tcolor:#fff;\n");
      out.write("}\n");
      out.write("li a#visited {\n");
      out.write("\tborder-bottom:3px solid #e8ded1;\n");
      out.write("\tcolor:#fff;\n");
      out.write("}\n");
      out.write("/*** submenu ***/\n");
      out.write(".sf-menu li ul {\n");
      out.write("\tbackground:#261b0d url(../images/rausch.png) repeat;\n");
      out.write("\tborder-top:3px solid #e8ded1;\n");
      out.write("\tmargin-top:75px;\n");
      out.write("}\n");
      out.write(".sf-menu li ul li a {\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tpadding:15px 0 15px 0;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tcolor: #e8ded1;\n");
      out.write("\tborder: 0;\n");
      out.write("\tpadding:15px;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\ttext-transform:lowercase;\n");
      out.write("\t-webkit-transition: all 0.3s ease;\n");
      out.write("\t-moz-transition: all 0.3s ease-in-out;\n");
      out.write("\t-o-transition: all 0.3s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.3s ease-in-out;\n");
      out.write("\ttransition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".sf-menu li ul li a:hover {\n");
      out.write("\tpadding-left: 18px;\n");
      out.write("}\n");
      out.write("/* apply hovers to modern browsers */\n");
      out.write("a:focus > .sf-sub-indicator, a:hover > .sf-sub-indicator, a:active > .sf-sub-indicator, li:hover > a > .sf-sub-indicator, li.sfHover > a > .sf-sub-indicator {\n");
      out.write("\tbackground-position: -10px -100px; /* arrow hovers for modern browsers*/\n");
      out.write("}\n");
      out.write("/* point right for anchors in subs */\n");
      out.write(".sf-menu ul .sf-sub-indicator {\n");
      out.write("\tbackground-position:-10px 0;\n");
      out.write("}\n");
      out.write(".sf-menu ul a > .sf-sub-indicator {\n");
      out.write("\tbackground-position:  0 0;\n");
      out.write("}\n");
      out.write("/* apply hovers to modern browsers */\n");
      out.write(".sf-menu ul a:focus > .sf-sub-indicator, .sf-menu ul a:hover > .sf-sub-indicator, .sf-menu ul a:active > .sf-sub-indicator, .sf-menu ul li:hover > a > .sf-sub-indicator, .sf-menu ul li.sfHover > a > .sf-sub-indicator {\n");
      out.write("\tbackground-position: -10px 0; /* arrow hovers for modern browsers*/\n");
      out.write("}\n");
      out.write("/****************************** FlexSlider ******************************/\n");
      out.write(".slider h1 {\n");
      out.write("\tcolor:#fff;\n");
      out.write("}\n");
      out.write("/*\n");
      out.write(" * jQuery FlexSlider v1.8\n");
      out.write(" * http://www.woothemes.com/flexslider/\n");
      out.write(" *\n");
      out.write(" * Copyright 2012 WooThemes\n");
      out.write(" * Free to use under the MIT license.\n");
      out.write(" * http://www.opensource.org/licenses/mit-license.php\n");
      out.write(" */\n");
      out.write("\n");
      out.write("/* Browser Resets */\n");
      out.write(".flex-container a, .flexslider a, .flex-container a:active, .flexslider a:active, .flex-container a:focus, .flexslider a:focus {\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write(".slides, .flex-control-nav, .flex-direction-nav {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("/* FlexSlider Necessary Styles\n");
      out.write("*********************************/\n");
      out.write(".flexslider {\n");
      out.write("\tpadding: 0 0 10px 0;\n");
      out.write("\tbackground:#dbcab6 url(../images/bg/caption1.png) repeat;\n");
      out.write("\tborder-top:1px solid #e8ded1;\n");
      out.write("}\n");
      out.write(".flexslider .slides > li {\n");
      out.write("\tdisplay: none;\n");
      out.write("\t-webkit-backface-visibility: hidden;\n");
      out.write("} /* Hide the slides before the JS is loaded. Avoids image jumping */\n");
      out.write(".flexslider .slides img {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write(".flex-pauseplay span {\n");
      out.write("\ttext-transform: capitalize;\n");
      out.write("}\n");
      out.write("/* Clearfix for the .slides element */\n");
      out.write(".slides:after {\n");
      out.write("\tcontent: \".\";\n");
      out.write("\tdisplay: block;\n");
      out.write("\tclear: both;\n");
      out.write("\tvisibility: hidden;\n");
      out.write("\tline-height: 0;\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write("html[xmlns] .slides {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("* html .slides {\n");
      out.write("\theight: 1%;\n");
      out.write("}\n");
      out.write("/* No JavaScript Fallback */\n");
      out.write("/* If you are not using another script, such as Modernizr, make sure you\n");
      out.write(" * include js that eliminates this class on page load */\n");
      out.write(".no-js .slides > li:first-child {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("/* FlexSlider Default Theme\n");
      out.write("*********************************/\n");
      out.write(".flexslider {\n");
      out.write("\tposition: relative;\n");
      out.write("\tzoom: 1;\n");
      out.write("}\n");
      out.write(".flexslider .slides {\n");
      out.write("\tzoom: 1;\n");
      out.write("}\n");
      out.write(".flexslider .slides > li {\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("/* Suggested container for \"Slide\" animation setups. Can replace this with your own, if you wish */\n");
      out.write(".flex-container {\n");
      out.write("\tzoom: 1;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("/* Caption style */\n");
      out.write("/* IE rgba() hack */\n");
      out.write(".caption {\n");
      out.write("\tzoom: 1;\n");
      out.write("\twidth: 20%;\n");
      out.write("\tpadding: 2%;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 25%;\n");
      out.write("\tbottom: 20%;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tcolor:#2d2010;\n");
      out.write("\tbackground: rgba(234, 214, 189, 0.9);\n");
      out.write("\t-webkit-border-radius: 10px;\n");
      out.write("\t-moz-border-radius: 10px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("}\n");
      out.write(".caption h2 {\n");
      out.write("\tcolor:#2d2010;\n");
      out.write("\ttext-shadow: 1px 1px 0 #fff;\n");
      out.write("\tfont-size: 48px;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\tline-height:50px;\n");
      out.write("}\n");
      out.write(".caption p {\n");
      out.write("\tcolor:#533c1e;\n");
      out.write("\tfont-size:16px;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tmargin-top:30px;\n");
      out.write("\ttext-shadow:none;\n");
      out.write("}\n");
      out.write(".caption a.button {\n");
      out.write("\tbackground:#f07272 url(../images/rausch.png) repeat;\n");
      out.write("\tborder:1px solid #da6767;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tcolor:#ead6bd;\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tline-height:40px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\t-webkit-border-radius: 5px;\n");
      out.write("\t-moz-border-radius: 5px;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\t-webkit-transition: all 0.5s ease;\n");
      out.write("\t-moz-transition: all 0.5s ease-in-out;\n");
      out.write("\t-o-transition: all 0.5s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.5s ease-in-out;\n");
      out.write("\ttransition: all 0.5s ease-in-out;\n");
      out.write("}\n");
      out.write(".caption a.button:hover {\n");
      out.write("\tbackground:#da6767 url(../images/rausch.png) repeat;\n");
      out.write("\tborder:1px solid #f07272;\n");
      out.write("}\n");
      out.write("/* Direction Nav */\n");
      out.write(".flex-direction-nav {\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write(".flex-direction-nav a {\n");
      out.write("\twidth:52px;\n");
      out.write("\theight: 52px;\n");
      out.write("\tmargin: -15px 0 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tbackground:  url(../images/flexslider/bg_direction_nav.png) no-repeat;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\ttext-indent: -999em;\n");
      out.write("}\n");
      out.write(".flex-direction-nav .flex-next {\n");
      out.write("\tbackground-position: -52px 0;\n");
      out.write("\tright: 0px;\n");
      out.write("}\n");
      out.write(".flex-direction-nav .flex-prev {\n");
      out.write("\tleft: 0px;\n");
      out.write("}\n");
      out.write(".flex-direction-nav .flex-disabled {\n");
      out.write("\topacity: .3;\n");
      out.write("\tfilter:alpha(opacity=30);\n");
      out.write("\tcursor: default;\n");
      out.write("}\n");
      out.write("/* Control Nav */\n");
      out.write(".flex-control-nav {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tbottom: -30px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".flex-control-nav li {\n");
      out.write("\tmargin: 0 0 0 5px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tzoom: 1;\n");
      out.write("*display: inline;\n");
      out.write("}\n");
      out.write(".flex-control-nav li:first-child {\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write(".flex-control-nav a {\n");
      out.write("\twidth: 13px;\n");
      out.write("\theight: 13px;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\ttext-indent: -999em;\n");
      out.write("}\n");
      out.write(".flex-control-nav a:hover {\n");
      out.write("\tbackground-position: 0 -13px;\n");
      out.write("}\n");
      out.write(".flex-control-nav a.flex-active {\n");
      out.write("\tbackground-position: 0 -26px;\n");
      out.write("\tcursor: default;\n");
      out.write("}\n");
      out.write("/*************************************** SHADOW STYLES ****************************************/\n");
      out.write(".shadow {\n");
      out.write("\tposition: relative;\n");
      out.write("\t-moz-box-shadow: 0 14px 10px -10px rgba(0, 0, 0, 0.4);\n");
      out.write("\t-webkit-box-shadow: 0 14px 10px -10px rgba(0, 0, 0, 0.4);\n");
      out.write("\tbox-shadow: 0 14px 10px -10px rgba(0, 0, 0, 0.4);\n");
      out.write("}\n");
      out.write(".shadow:before, .shadow:after {\n");
      out.write("\tcontent: '';\n");
      out.write("\tposition: absolute;\n");
      out.write("\tz-index: -1;\n");
      out.write("\tbottom: 15px;\n");
      out.write("\t-moz-box-shadow: 0px 15px 12px rgba(0, 0, 0, 0.6);\n");
      out.write("\t-webkit-box-shadow: 0px 15px 12px rgba(0, 0, 0, 0.6);\n");
      out.write("\tbox-shadow: 0px 15px 12px rgba(0, 0, 0, 0.6);\n");
      out.write("}\n");
      out.write(".shadow:before {\n");
      out.write("\tright: 10px;\n");
      out.write("\t-moz-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-webkit-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-o-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-ms-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\ttransform: rotate(4deg) skewX(4deg);\n");
      out.write("}\n");
      out.write("/*************************************** SHADOW STYLES ****************************************/\n");
      out.write(".shadow1 {\n");
      out.write("\tposition: relative;\n");
      out.write("\t-moz-box-shadow: 0 11px 11px -9px rgba(0, 0, 0, 0.2);\n");
      out.write("\t-webkit-box-shadow: 0 11px 11px -9px rgba(0, 0, 0, 0.2);\n");
      out.write("\tbox-shadow: 0 11px 11px -9px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write(".shadow1:before, .shadow1:after {\n");
      out.write("\tcontent: '';\n");
      out.write("\tposition: absolute;\n");
      out.write("\tz-index: -1;\n");
      out.write("\tbottom: 15px;\n");
      out.write("\t-moz-box-shadow: 0px 15px 12px rgba(0, 0, 0, 0.2);\n");
      out.write("\t-webkit-box-shadow: 0px 15px 12px rgba(0, 0, 0, 0.2);\n");
      out.write("\tbox-shadow: 0px 15px 12px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write(".shadow1:before {\n");
      out.write("\tright: 10px;\n");
      out.write("\t-moz-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-webkit-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-o-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\t-ms-transform: rotate(4deg) skewX(4deg);\n");
      out.write("\ttransform: rotate(4deg) skewX(4deg);\n");
      out.write("}\n");
      out.write("/****************************** Infobox & Heading & Socialize Boxes ******************************/\n");
      out.write(".infobox {\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("}\n");
      out.write(".info {\n");
      out.write("\ttext-align:center;\n");
      out.write("\tpadding-top:70px;\n");
      out.write("}\n");
      out.write("p.infop {\n");
      out.write("\tfont-size:16px;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tmargin-top:40px;\n");
      out.write("\tmargin-bottom:0;\n");
      out.write("}\n");
      out.write("span.pink {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("}\n");
      out.write(".headingblock {\n");
      out.write("\tmargin-bottom:40px;\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("}\n");
      out.write(".heading {\n");
      out.write("\ttext-align:center;\n");
      out.write("\tpadding:20px 0 0 0;\n");
      out.write("}\n");
      out.write(".socialsblock {\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("}\n");
      out.write(".socialize {\n");
      out.write("\ttext-align:center;\n");
      out.write("\tpadding:20px 0;\n");
      out.write("}\n");
      out.write("/****************************** Latest Photos ******************************/\n");
      out.write(".latest figure {\n");
      out.write("\tmargin-bottom:30px;\n");
      out.write("}\n");
      out.write(".latest figure .thumb {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write(".latest figure .thumb img {\n");
      out.write("\tborder-bottom:1px dashed #c7b3a9;\n");
      out.write("}\n");
      out.write(".latest figure {\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\tborder-top:4px solid #f0dec8;\n");
      out.write("\t-webkit-border-bottom-right-radius: 5px;\n");
      out.write("\t-webkit-border-bottom-left-radius: 5px;\n");
      out.write("\t-moz-border-radius-bottomright: 5px;\n");
      out.write("\t-moz-border-radius-bottomleft: 5px;\n");
      out.write("\tborder-bottom-right-radius: 5px;\n");
      out.write("\tborder-bottom-left-radius: 5px;\n");
      out.write("}\n");
      out.write(".latest figure figcaption {\n");
      out.write("\tmargin: 0 20px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding:0 0 10px 0;\n");
      out.write("}\n");
      out.write(".latest figure figcaption .heading {\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("/****************************** News & FAQ ******************************/\n");
      out.write(".video-holder {\n");
      out.write("\tfloat:left;\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".video-container {\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding-bottom: 50%;\n");
      out.write("\theight: 0;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tmargin-bottom:5px;\n");
      out.write("\tborder:3px solid #f9efe3;\n");
      out.write("}\n");
      out.write(".video-container iframe, .video-container object, .video-container embed {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("/* ACCORDION -------------------------------------------------*/\n");
      out.write(".accordion-trigger {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("\tbackground:url(../images/toggle.png) no-repeat right 5px;\n");
      out.write("\t-webkit-transition: all 0.3s ease;\n");
      out.write("\t-moz-transition: all 0.3s ease-in-out;\n");
      out.write("\t-o-transition: all 0.3s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.3s ease-in-out;\n");
      out.write("\ttransition: all 0.3s ease-in-out;\n");
      out.write("\tcursor:pointer;\n");
      out.write("}\n");
      out.write(".accordion-trigger h3 {\n");
      out.write("\ttext-transform:none;\n");
      out.write("\tfont-size:18px;\n");
      out.write("\tfont-family:Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write(".accordion-trigger.active {\n");
      out.write("\tbackground:url(../images/toggle.png) no-repeat right -80px;\n");
      out.write("}\n");
      out.write(".accordion-trigger:hover {\n");
      out.write("\tbackground:url(../images/toggle.png) no-repeat right 5px;\n");
      out.write("}\n");
      out.write(".accordion-trigger.active:hover {\n");
      out.write("\tbackground:url(../images/toggle.png) no-repeat right -80px;\n");
      out.write("}\n");
      out.write(".accordion-container {\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("\tpadding:0px 0px 20px 0;\n");
      out.write("}\n");
      out.write(".accordion-container p {\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write(".accordion-container a.buttonhome {\n");
      out.write("\tmargin-top:-10px;\n");
      out.write("\tmargin-bottom:10px;\n");
      out.write("}\n");
      out.write("p.quote {\n");
      out.write("\tfont-size:12px;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write(".latest h3 {\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("}\n");
      out.write("/****************************** Footer ******************************/\n");
      out.write(".footer {\n");
      out.write("\tbackground:#261b0d url(../images/rausch.png) repeat;\n");
      out.write("\tpadding:20px 0px;\n");
      out.write("}\n");
      out.write(".footer p {\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("\ttext-shadow:none;\n");
      out.write("\tfont-size:12px;\n");
      out.write("}\n");
      out.write(".footer h3 {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("\tfont-size:16px;\n");
      out.write("}\n");
      out.write("#tweets ul {\n");
      out.write("\tmargin-top:10px;\n");
      out.write("}\n");
      out.write("#tweets li {\n");
      out.write("\tline-height: 1.5em;\n");
      out.write("\tcolor:#efefef;\n");
      out.write("\tfont-family:  Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("#tweets li a {\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("}\n");
      out.write("#tweets p.meta {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("\tmargin-top:10px;\n");
      out.write("}\n");
      out.write("#tweets li.tweet_content_0 {\n");
      out.write("\tborder-top:0px none;\n");
      out.write("}\n");
      out.write("#tweets li:last-child {\n");
      out.write("\tborder-bottom:0px none;\n");
      out.write("}\n");
      out.write("#tweets .hash {\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("}\n");
      out.write("#tweets .reply {\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("}\n");
      out.write(".footer ul li {\n");
      out.write("\tpadding:2px 0;\n");
      out.write("}\n");
      out.write(".footer ul li:last-child {\n");
      out.write("\tborder-bottom:none;\n");
      out.write("}\n");
      out.write("ul.socials li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding:5px;\n");
      out.write("\tbackground:#261b0d url(../images/rausch.png) repeat;\n");
      out.write("\tborder: 1px solid rgba(0, 0, 0, 0.3) inset;\n");
      out.write("\t-webkit-border-radius: 5px;\n");
      out.write("\t-moz-border-radius: 5px;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\t-moz-box-shadow: 0 0 18px rgba(0, 0, 0, 0.3) inset;\n");
      out.write("\t-webkit-box-shadow: 0 0 18px rgba(0, 0, 0, 0.3) inset;\n");
      out.write("\tbox-shadow: 0 0 18px rgba(0, 0, 0, 0.3) inset;\n");
      out.write("}\n");
      out.write(".footer ul li a {\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("\t-webkit-transition: all 0.3s ease;\n");
      out.write("\t-moz-transition: all 0.3s ease-in-out;\n");
      out.write("\t-o-transition: all 0.3s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.3s ease-in-out;\n");
      out.write("\ttransition: all 0.3s ease-in-out;\n");
      out.write("\tcursor:pointer;\n");
      out.write("}\n");
      out.write(".footer ul li a:hover {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("\tpadding-left:5px;\n");
      out.write("}\n");
      out.write("/****************************** Copyright ******************************/\n");
      out.write("#copyright {\n");
      out.write("\tbackground:#1b1309;\n");
      out.write("\tborder-top:1px solid #000;\n");
      out.write("}\n");
      out.write("p.copyright {\n");
      out.write("\tfont-size:11px;\n");
      out.write("\tcolor:#f9efe3;\n");
      out.write("\ttext-align:center;\n");
      out.write("\ttext-shadow:none;\n");
      out.write("\tpadding-top:10px;\n");
      out.write("}\n");
      out.write("p.copyright a {\n");
      out.write("\tcolor:#f07272;\n");
      out.write("}\n");
      out.write("ul.socials {\n");
      out.write("\tmargin-top:10px;\n");
      out.write("}\n");
      out.write("ul.socials li {\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("}\n");
      out.write("/****************************** Breadcrumbs ******************************/\n");
      out.write(".breadcrumbs {\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("\tpadding:20px 0 0 0;\n");
      out.write("\tmargin-bottom:40px;\n");
      out.write("}\n");
      out.write(".breadcrumbs h3, .breadcrumbs p {\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write("/****************************** ABOUT - Content Part ******************************/\n");
      out.write("#about {\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.4);\n");
      out.write("\tpadding:20px 0 10px 0;\n");
      out.write("\tborder-bottom:1px solid #fff;\n");
      out.write("}\n");
      out.write("#about p.quote {\n");
      out.write("\tbackground:none;\n");
      out.write("\tborder-top:1px dotted #dcdcdc;\n");
      out.write("\tborder-bottom:1px dotted #dcdcdc;\n");
      out.write("\tpadding:5px 0 5px 0;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tfont-size:11px;\n");
      out.write("}\n");
      out.write(".aboutoneright img {\n");
      out.write("\tborder-bottom:5px solid rgba(255, 255, 255, 0.9);\n");
      out.write("}\n");
      out.write(".testimonials {\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("\tpadding:20px 0 0 0;\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write(".testimonials h3 {\n");
      out.write("\tmargin-bottom:0;\n");
      out.write("}\n");
      out.write("p.testimonials {\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write(".testimonials h5 {\n");
      out.write("\ttext-transform:capitalize;\n");
      out.write("\tfont-size:14px;\n");
      out.write("}\n");
      out.write("img.testimonialsimage {\n");
      out.write("\t-webkit-border-radius: 50em;\n");
      out.write("\t-moz-border-radius: 50em;\n");
      out.write("\tborder-radius: 50em;\n");
      out.write("}\n");
      out.write(".team a {\n");
      out.write("\tcolor:#8f897c;\n");
      out.write("}\n");
      out.write(".team img {\n");
      out.write("\topacity: 1;\n");
      out.write("\t-webkit-transition: opacity;\n");
      out.write("\t-webkit-transition-timing-function: ease-out;\n");
      out.write("\t-webkit-transition-duration: 500ms;\n");
      out.write("\tcursor:pointer;\n");
      out.write("}\n");
      out.write(".team img:hover {\n");
      out.write("\topacity: .5;\n");
      out.write("\t-webkit-transition: opacity;\n");
      out.write("\t-webkit-transition-timing-function: ease-out;\n");
      out.write("\t-webkit-transition-duration: 500ms;\n");
      out.write("}\n");
      out.write(".teaminfo {\n");
      out.write("\tpadding:10px 5px 5px 5px;\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\tborder-top:4px solid #f0dec8;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tmargin-top:5px;\n");
      out.write("\t-webkit-border-bottom-right-radius: 5px;\n");
      out.write("\t-webkit-border-bottom-left-radius: 5px;\n");
      out.write("\t-moz-border-radius-bottomright: 5px;\n");
      out.write("\t-moz-border-radius-bottomleft: 5px;\n");
      out.write("\tborder-bottom-right-radius: 5px;\n");
      out.write("\tborder-bottom-left-radius: 5px;\n");
      out.write("}\n");
      out.write("/****************************** Portfolio ******************************/\n");
      out.write(".view-first img {\n");
      out.write("\t-webkit-transition: all 0.2s linear;\n");
      out.write("\t-moz-transition: all 0.2s linear;\n");
      out.write("\t-o-transition: all 0.2s linear;\n");
      out.write("\t-ms-transition: all 0.2s linear;\n");
      out.write("\ttransition: all 0.2s linear;\n");
      out.write("}\n");
      out.write(".view-first .mask {\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\tbackground:rgba(240, 222, 200, 0.8) url(../images/bg/caption.png) repeat;\n");
      out.write("\t-webkit-transition: all 0.4s ease-in-out;\n");
      out.write("\t-moz-transition: all 0.4s ease-in-out;\n");
      out.write("\t-o-transition: all 0.4s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.4s ease-in-out;\n");
      out.write("\ttransition: all 0.4s ease-in-out;\n");
      out.write("}\n");
      out.write(".view-first h2 {\n");
      out.write("\t-webkit-transform: translateY(-100px);\n");
      out.write("\t-moz-transform: translateY(-100px);\n");
      out.write("\t-o-transform: translateY(-100px);\n");
      out.write("\t-ms-transform: translateY(-100px);\n");
      out.write("\ttransform: translateY(-100px);\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\t-webkit-transition: all 0.2s ease-in-out;\n");
      out.write("\t-moz-transition: all 0.2s ease-in-out;\n");
      out.write("\t-o-transition: all 0.2s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.2s ease-in-out;\n");
      out.write("\ttransition: all 0.2s ease-in-out;\n");
      out.write("}\n");
      out.write(".view-first p {\n");
      out.write("\t-webkit-transform: translateY(100px);\n");
      out.write("\t-moz-transform: translateY(100px);\n");
      out.write("\t-o-transform: translateY(100px);\n");
      out.write("\t-ms-transform: translateY(100px);\n");
      out.write("\ttransform: translateY(100px);\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\t-webkit-transition: all 0.2s linear;\n");
      out.write("\t-moz-transition: all 0.2s linear;\n");
      out.write("\t-o-transition: all 0.2s linear;\n");
      out.write("\t-ms-transition: all 0.2s linear;\n");
      out.write("\ttransition: all 0.2s linear;\n");
      out.write("}\n");
      out.write(".view-first:hover img {\n");
      out.write("\t-webkit-transform: scale(1.1, 1.1);\n");
      out.write("\t-moz-transform: scale(1.1, 1.1);\n");
      out.write("\t-o-transform: scale(1.1, 1.1);\n");
      out.write("\t-ms-transform: scale(1.1, 1.1);\n");
      out.write("\ttransform: scale(1.1, 1.1);\n");
      out.write("}\n");
      out.write(".view-first a.info {\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\t-webkit-transition: all 0.2s ease-in-out;\n");
      out.write("\t-moz-transition: all 0.2s ease-in-out;\n");
      out.write("\t-o-transition: all 0.2s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.2s ease-in-out;\n");
      out.write("\ttransition: all 0.2s ease-in-out;\n");
      out.write("}\n");
      out.write(".view-first:hover .mask {\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=100)\";\n");
      out.write("\tfilter: alpha(opacity=100);\n");
      out.write("\topacity: 1;\n");
      out.write("}\n");
      out.write(".view-first:hover h2, .view-first:hover p, .view-first:hover a.info {\n");
      out.write("\t-ms-filter: \"progid: DXImageTransform.Microsoft.Alpha(Opacity=100)\";\n");
      out.write("\tfilter: alpha(opacity=100);\n");
      out.write("\topacity: 1;\n");
      out.write("\t-webkit-transform: translateY(0px);\n");
      out.write("\t-moz-transform: translateY(0px);\n");
      out.write("\t-o-transform: translateY(0px);\n");
      out.write("\t-ms-transform: translateY(0px);\n");
      out.write("\ttransform: translateY(0px);\n");
      out.write("}\n");
      out.write(".view-first:hover p {\n");
      out.write("\t-webkit-transition-delay: 0.1s;\n");
      out.write("\t-moz-transition-delay: 0.1s;\n");
      out.write("\t-o-transition-delay: 0.1s;\n");
      out.write("\t-ms-transition-delay: 0.1s;\n");
      out.write("\ttransition-delay: 0.1s;\n");
      out.write("}\n");
      out.write(".view-first:hover a.info {\n");
      out.write("\t-webkit-transition-delay: 0.2s;\n");
      out.write("\t-moz-transition-delay: 0.2s;\n");
      out.write("\t-o-transition-delay: 0.2s;\n");
      out.write("\t-ms-transition-delay: 0.2s;\n");
      out.write("\ttransition-delay: 0.2s;\n");
      out.write("}\n");
      out.write(".view {\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tfloat: left;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tposition: relative;\n");
      out.write("\ttext-align: center;\n");
      out.write("\t-webkit-box-shadow: 1px 1px 2px #e6e6e6;\n");
      out.write("\t-moz-box-shadow: 1px 1px 2px #e6e6e6;\n");
      out.write("\tbox-shadow: 1px 1px 2px #e6e6e6;\n");
      out.write("\tcursor: default;\n");
      out.write("\tbackground: #fff;\n");
      out.write("}\n");
      out.write(".view .mask, .view .content {\n");
      out.write("\tposition: absolute;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".view img {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write(".mask h2 {\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tline-height:50px;\n");
      out.write("\tbackground:#dbcab6 url(../images/bg/caption2.png) repeat;\n");
      out.write("}\n");
      out.write(".view h2 a {\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("}\n");
      out.write("/****************************** Portfolio Project ******************************/\n");
      out.write(".ia-container {\n");
      out.write("\tmargin: 20px auto;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tbox-shadow: 1px 1px 4px rgba(0, 0, 0, 0.08);\n");
      out.write("\tborder: 7px solid #f9efe3;\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("}\n");
      out.write(".ia-container figure {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 50px; /* width of visible piece */\n");
      out.write("\twidth: 335px;\n");
      out.write("\tbox-shadow: 0 0 0 1px rgba(255, 255, 255, 0.6);\n");
      out.write("\t-webkit-transition: all 0.3s ease-in-out;\n");
      out.write("\t-moz-transition: all 0.3s ease-in-out;\n");
      out.write("\t-o-transition: all 0.3s ease-in-out;\n");
      out.write("\t-ms-transition: all 0.3s ease-in-out;\n");
      out.write("\ttransition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".ia-container > figure {\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: 0 !important;\n");
      out.write("}\n");
      out.write(".ia-container img {\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write(".ia-container input {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 50px; /* just cover visible part */\n");
      out.write("\theight: 100%;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\t-ms-filter:\"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\tz-index: 100;\n");
      out.write("\t-webkit-appearance: none;\n");
      out.write("\t-moz-appearance: none;\n");
      out.write("\tappearance: none;\n");
      out.write("}\n");
      out.write(".ia-container input:checked {\n");
      out.write("\twidth: 5px;\n");
      out.write("\tleft: auto;\n");
      out.write("\tright: 0px;\n");
      out.write("}\n");
      out.write(".ia-container input:checked ~ figure {\n");
      out.write(" -webkit-transition: all 0.7s ease-in-out;\n");
      out.write(" -moz-transition: all 0.7s ease-in-out;\n");
      out.write(" -o-transition: all 0.7s ease-in-out;\n");
      out.write(" -ms-transition: all 0.7s ease-in-out;\n");
      out.write(" transition: all 0.7s ease-in-out;\n");
      out.write(" left: 335px;\n");
      out.write("}\n");
      out.write(".ia-container figcaption {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("\tbackground: rgba(240, 222, 200, 0.3);\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0px;\n");
      out.write("\t-webkit-transition: all 0.2s linear;\n");
      out.write("\t-moz-transition: all 0.2s linear;\n");
      out.write("\t-o-transition: all 0.2s linear;\n");
      out.write("\t-ms-transition: all 0.2s linear;\n");
      out.write("\ttransition: all 0.2s linear;\n");
      out.write("}\n");
      out.write(".ia-container figcaption span {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 40%;\n");
      out.write("\tmargin-top: -30px;\n");
      out.write("\tright: 20px;\n");
      out.write("\tleft: 20px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground: rgba(240, 222, 200, 0.3);\n");
      out.write("\tline-height: 20px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\t-ms-filter:\"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)\";\n");
      out.write("\tfilter: alpha(opacity=0);\n");
      out.write("\topacity: 0;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tletter-spacing: 4px;\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-shadow: 1px 1px 1px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write(".ia-container input:checked + figcaption, .ia-container input:checked:hover + figcaption {\n");
      out.write("\tbackground: rgba(240, 222, 200, 0);\n");
      out.write("}\n");
      out.write(".ia-container input:checked + figcaption span {\n");
      out.write("\t-webkit-transition: all 0.4s ease-in-out 0.5s;\n");
      out.write("\t-moz-transition: all 0.4s ease-in-out 0.5s;\n");
      out.write("\t-o-transition: all 0.4s ease-in-out 0.5s;\n");
      out.write("\t-ms-transition: all 0.4s ease-in-out 0.5s;\n");
      out.write("\ttransition: all 0.4s ease-in-out 0.5s;\n");
      out.write("\t-ms-filter:\"progid:DXImageTransform.Microsoft.Alpha(Opacity=99)\";\n");
      out.write("\tfilter: alpha(opacity=99);\n");
      out.write("\topacity: 1;\n");
      out.write("\ttop: 50%;\n");
      out.write("}\n");
      out.write(".ia-container #ia-selector-last:checked + figcaption span {\n");
      out.write("\t-webkit-transition-delay: 0.3s;\n");
      out.write("\t-moz-transition-delay: 0.3s;\n");
      out.write("\t-o-transition-delay: 0.3s;\n");
      out.write("\t-ms-transition-delay: 0.3s;\n");
      out.write("\ttransition-delay: 0.3s;\n");
      out.write("}\n");
      out.write(".ia-container input:hover + figcaption {\n");
      out.write("\tbackground: rgba(240, 222, 200, 0.6);\n");
      out.write("}\n");
      out.write(" .ia-container input:checked ~ figure input {\n");
      out.write(" z-index: 1;\n");
      out.write("}\n");
      out.write(" @media screen and (max-width: 720px) {\n");
      out.write(" .ia-container figure {\n");
      out.write(" left: 40px;\n");
      out.write(" width: 260px;\n");
      out.write("}\n");
      out.write(" .ia-container input {\n");
      out.write(" width: 40px;\n");
      out.write("}\n");
      out.write(" .ia-container input:checked ~ figure {\n");
      out.write(" left: 260px;\n");
      out.write("}\n");
      out.write(" .ia-container figcaption span {\n");
      out.write(" font-size: 16px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write(" @media screen and (max-width: 520px) {\n");
      out.write(" .ia-container figure {\n");
      out.write(" left: 20px;\n");
      out.write(" width: 180px;\n");
      out.write("}\n");
      out.write(" .ia-container input {\n");
      out.write(" width: 20px;\n");
      out.write("}\n");
      out.write(" .ia-container input:checked ~ figure {\n");
      out.write(" left: 180px;\n");
      out.write("}\n");
      out.write(" .ia-container figcaption span {\n");
      out.write(" font-size: 12px;\n");
      out.write(" letter-spacing: 2px;\n");
      out.write(" padding: 10px;\n");
      out.write(" margin-top: -20px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write(".gallery h4 {\n");
      out.write("\tfont-style:italic;\n");
      out.write("\tfont-size:13px;\n");
      out.write("}\n");
      out.write("p.gallery {\n");
      out.write("\tmargin-top:25px;\n");
      out.write("}\n");
      out.write("/****************************** BLOG - Blog Page ******************************/\n");
      out.write(".post {\n");
      out.write("\tmargin-bottom:40px;\n");
      out.write("}\n");
      out.write(".post a {\n");
      out.write("\tfont-size:12px;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("}\n");
      out.write(".post img {\n");
      out.write("\tmargin-bottom:15px;\n");
      out.write("}\n");
      out.write(".entry-date {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tmargin-top:-100px;\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\twidth:70px;\n");
      out.write("\theight:70px;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tline-height:70px;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tborder-radius:35px;\n");
      out.write("\t-moz-border-radius: 35px;\n");
      out.write("\t-webkit-border-radius: 35px;\n");
      out.write("\tbox-shadow: 2px 2px 0 0 rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("/****************************** Blog - Sidebar ******************************/\n");
      out.write("aside {\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\tpadding:0 20px 20px 20px;\n");
      out.write("}\n");
      out.write("h4.sidebarheader {\n");
      out.write("\tmargin-top:20px;\n");
      out.write("\tmargin-bottom:15px;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("}\n");
      out.write(".recentnews {\n");
      out.write("\tmargin-bottom:30px;\n");
      out.write("}\n");
      out.write("/* #Tabs (activate in tabs.js)\n");
      out.write("================================================== */\n");
      out.write("ul.tabs {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin: 0 0 4px 0;\n");
      out.write("}\n");
      out.write("ul.tabs li {\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: 18px;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin:0 5px 0 0;\n");
      out.write("}\n");
      out.write("ul.tabs li a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\twidth: auto;\n");
      out.write("\tpadding:5px;\n");
      out.write("\tmargin:0;\n");
      out.write("\tcolor: #543d1f;\n");
      out.write("\tbackground:url(../images/bg/lightpaperfibers.png) repeat;\n");
      out.write("\t-webkit-border-top-left-radius: 5px;\n");
      out.write("\t-webkit-border-top-right-radius: 5px;\n");
      out.write("\t-moz-border-radius-topleft: 5px;\n");
      out.write("\t-moz-border-radius-topright: 5px;\n");
      out.write("\tborder-top-left-radius: 5px;\n");
      out.write("\tborder-top-right-radius: 5px;\n");
      out.write("}\n");
      out.write("ul.tabs li a.active {\n");
      out.write("\tbackground:#543d1f;\n");
      out.write("\tposition: relative;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("ul.tabs li:first-child a.active {\n");
      out.write("\tmargin-left: 0;\n");
      out.write("}\n");
      out.write("ul.tabs-content {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tbackground:#e2d3c1 url(../images/rausch.png) repeat;\n");
      out.write("\tpadding:20px 10px 5px 10px;\n");
      out.write("\t-webkit-border-bottom-right-radius: 5px;\n");
      out.write("\t-webkit-border-bottom-left-radius: 5px;\n");
      out.write("\t-moz-border-radius-bottomright: 5px;\n");
      out.write("\t-moz-border-radius-bottomleft: 5px;\n");
      out.write("\tborder-bottom-right-radius: 5px;\n");
      out.write("\tborder-bottom-left-radius: 5px;\n");
      out.write("}\n");
      out.write("ul.tabs-content > li {\n");
      out.write("\tdisplay:none;\n");
      out.write("}\n");
      out.write("ul.tabs-content > li.active {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("ul.tabs:before, ul.tabs:after {\n");
      out.write("\tcontent: '\\0020';\n");
      out.write("\tdisplay: block;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tvisibility: hidden;\n");
      out.write("\twidth: 0;\n");
      out.write("\theight: 0;\n");
      out.write("}\n");
      out.write("ul.tabs:after {\n");
      out.write("\tclear: both;\n");
      out.write("}\n");
      out.write("ul.tabs {\n");
      out.write("\tzoom: 1;\n");
      out.write("}\n");
      out.write(".latestphotos {\n");
      out.write("\tmargin-bottom:10px;\n");
      out.write("}\n");
      out.write("ul.categories li {\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("}\n");
      out.write("ul.categories li a {\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tbackground:#e2d3c1 url(../images/rausch.png) repeat;\n");
      out.write("\tpadding:5px;\n");
      out.write("\tcolor:#543d1f;\n");
      out.write("}\n");
      out.write("/******************************* FEATURES / Resume  *******************************/\n");
      out.write(".resume .one_third {\n");
      out.write("\tborder-top:5px solid #f9efe3;\n");
      out.write("}\n");
      out.write(".resume .two_third {\n");
      out.write("\tbackground:#fff;\n");
      out.write("}\n");
      out.write(".resume .two_third p {\n");
      out.write("\tpadding:10px;\n");
      out.write("}\n");
      out.write(".resume .two_third h4 {\n");
      out.write("\tpadding:10px;\n");
      out.write("}\n");
      out.write(".resume .two_third ul {\n");
      out.write("\tpadding:10px;\n");
      out.write("\tmargin-top:-20px;\n");
      out.write("}\n");
      out.write(".resume .two_third ul li {\n");
      out.write("\tcolor:#726072;\n");
      out.write("}\n");
      out.write(".resume img {\n");
      out.write("\tmargin-bottom:-30px;\n");
      out.write("}\n");
      out.write("/******************************* CONTACT FORM  *******************************/\n");
      out.write("form#contact_form input[type=\"text\"] {\n");
      out.write("\tborder: 1px solid #e2d3c1;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\theight: 30px;\n");
      out.write("\tpadding: 0 10px;\n");
      out.write("\twidth: 250px;\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("}\n");
      out.write("form#contact_form input#email {\n");
      out.write("\tborder: 1px solid #e2d3c1;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\theight: 30px;\n");
      out.write("\tpadding: 0 10px;\n");
      out.write("\twidth: 250px;\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("}\n");
      out.write("form#contact_form textarea {\n");
      out.write("\tborder: 1px solid #e2d3c1;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\twidth: 500px;\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("}\n");
      out.write("form#contact_form label {\n");
      out.write("\tmargin-right: 20px;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write("form#contact_form input[type=\"text\"]:focus, form#contact_form input[type=\"text\"]:hover, form#contact_form textarea:focus, form#contact_form textarea:hover, form#contact_form input[type=\"text\"]:focus, form#contact_form input[type=\"text\"]:hover, form#contact_form textarea:focus, form#contact_form textarea:hover {\n");
      out.write("\tbackground-color:#fff3e4;\n");
      out.write("}\n");
      out.write("form#contact_form input[type=\"submit\"] {\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\tborder:none;\n");
      out.write("\tpadding:5px;\n");
      out.write("\tfont-size:11px;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("\tmargin-bottom:10px;\n");
      out.write("}\n");
      out.write(".map-container {\n");
      out.write("\tmargin-top:-40px;\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding-bottom:20%;\n");
      out.write("\tmargin-bottom:40px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write(".map-container iframe, .map-container object, .map-container embed {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".contact .first {\n");
      out.write("\tbackground:#f9efe3 url(../images/rausch.png) repeat;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tmargin-bottom:40px;\n");
      out.write("}\n");
      out.write(".contact ul li {\n");
      out.write("\tfont-size:14px;\n");
      out.write("}\n");
      out.write("/****************************** Shortcodes ******************************/\n");
      out.write("/* Content Shortcodes */\n");
      out.write(".one_half {\n");
      out.write("\twidth: 48%;\n");
      out.write("}\n");
      out.write(".one_third {\n");
      out.write("\twidth: 30.66%;\n");
      out.write("}\n");
      out.write(".two_third {\n");
      out.write("\twidth: 65.33%;\n");
      out.write("}\n");
      out.write(".one_fourth {\n");
      out.write("\twidth: 22%;\n");
      out.write("}\n");
      out.write(".one_fifth {\n");
      out.write("\twidth: 16.8%;\n");
      out.write("}\n");
      out.write(".one_sixth {\n");
      out.write("\twidth: 15%;\n");
      out.write("}\n");
      out.write(".one_half, .one_third, .two_third, .one_fourth, .one_fifth {\n");
      out.write("\tmargin-right: 4%;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write(".one_sixth {\n");
      out.write("\tmargin-right: 2%;\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write(".lastcolumn {\n");
      out.write("\tmargin-right: 0!important;\n");
      out.write("\tclear: right;\n");
      out.write("}\n");
      out.write("/* #Page Styles\n");
      out.write("================================================== */\n");
      out.write(".content {\n");
      out.write("\tpadding-top: 20px;\n");
      out.write("}\n");
      out.write(".content.right {\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* #Media Queries\n");
      out.write("================================================== */\n");
      out.write("\n");
      out.write("\t/* Smaller than standard 960 (devices and browsers) */\n");
      out.write("\t@media only screen and (max-width: 1300px) {\n");
      out.write(".caption {\n");
      out.write("  width:30%;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 1100px) {\n");
      out.write(".caption {\n");
      out.write("  display:none;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t/* Tablet Portrait size to standard 960 (devices and browsers) */\n");
      out.write("\t@media only screen and (min-width: 768px) and (max-width: 959px) {\n");
      out.write(".caption {\n");
      out.write("\tdisplay:none;\n");
      out.write("}\n");
      out.write("form#contact_form textarea {\n");
      out.write(" width: 350px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t/* All Mobile Sizes (devices and browser) */\n");
      out.write("@media only screen and (max-width: 767px) {\n");
      out.write(".mainmenu select {\n");
      out.write(" position:absolute;\n");
      out.write(" top:0;\n");
      out.write(" right:0;\n");
      out.write(" margin-top:40px;\n");
      out.write("}\n");
      out.write(".mainmenu {\n");
      out.write(" height:10px;\n");
      out.write("}\n");
      out.write(".one_half, .one_third, .two_third, .one_fourth, .one_fifth, .one_sixth {\n");
      out.write("width: 100%;\n");
      out.write("}\n");
      out.write(".caption {\n");
      out.write(" display:none;\n");
      out.write("}\n");
      out.write(".info h1 {\n");
      out.write(" line-height:40px;\n");
      out.write(" font-size:36px;\n");
      out.write("}\n");
      out.write("form#contact_form textarea {\n");
      out.write(" width: 300px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t/* Mobile Landscape Size to Tablet Portrait (devices and browsers) */\n");
      out.write("\t@media only screen and (min-width: 480px) and (max-width: 767px) {\n");
      out.write(".mainmenu select {\n");
      out.write(" position:absolute;\n");
      out.write(" top:0;\n");
      out.write(" right:0;\n");
      out.write(" margin-top:40px;\n");
      out.write("}\n");
      out.write(".mainmenu {\n");
      out.write(" height:10px;\n");
      out.write("}\n");
      out.write(" ul.tabs {\n");
      out.write(" margin-top:20px;\n");
      out.write("}\n");
      out.write(".caption {\n");
      out.write(" display:none;\n");
      out.write("}\n");
      out.write(".info h1 {\n");
      out.write(" line-height:40px;\n");
      out.write(" font-size:36px;\n");
      out.write("}\n");
      out.write("form#contact_form textarea {\n");
      out.write(" width: 300px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t/* Mobile Portrait Size to Mobile Landscape Size (devices and browsers) */\n");
      out.write("\t@media only screen and (max-width: 479px) {\n");
      out.write(".mainmenu select {\n");
      out.write(" position:absolute;\n");
      out.write(" top:0;\n");
      out.write(" right:0;\n");
      out.write(" margin-top:40px;\n");
      out.write(" width:40%;\n");
      out.write("}\n");
      out.write(".mainmenu {\n");
      out.write(" height:10px;\n");
      out.write("}\n");
      out.write(".caption {\n");
      out.write(" display:none;\n");
      out.write("}\n");
      out.write("ul.tabs {\n");
      out.write(" margin-top:20px;\n");
      out.write("}\n");
      out.write("ul.tabs li {\n");
      out.write(" padding: 0 5px 0 0px;\n");
      out.write("}\n");
      out.write(" .mainmenu {\n");
      out.write("float: left;\n");
      out.write("width: 100%;\n");
      out.write("margin-top:-200px;\n");
      out.write("}\n");
      out.write(".info h1 {\n");
      out.write(" line-height:40px;\n");
      out.write(" font-size:36px;\n");
      out.write("}\n");
      out.write("form#contact_form textarea {\n");
      out.write(" width: 200px;\n");
      out.write("}\n");
      out.write("form#contact_form input[type=\"text\"] {\n");
      out.write(" width: 150px;\n");
      out.write("}\n");
      out.write("form#contact_form input#email {\n");
      out.write(" width: 150px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("/* Responsive Menu\n");
      out.write("================================================== */\n");
      out.write("\t\n");
      out.write("#mainmenu {\n");
      out.write("\tvisibility: visible;\n");
      out.write("}\n");
      out.write("#responsive-menu {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write(" @media only screen and (max-width: 767px) {\n");
      out.write(" #mainmenu {\n");
      out.write("visibility: hidden;\n");
      out.write("height: 0;\n");
      out.write("}\n");
      out.write(" #responsive-menu {\n");
      out.write("display: inline-block;\n");
      out.write("width: 100%;\n");
      out.write("margin-top: 13px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("/*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : 10-oct-2015, 20:01:56\n");
      out.write("    Author     : Sandy\n");
      out.write("*/\n");
      out.write("\n");
      out.write("div.pp_default .pp_top,div.pp_default .pp_top .pp_middle,div.pp_default .pp_top .pp_left,div.pp_default .pp_top .pp_right,div.pp_default .pp_bottom,div.pp_default .pp_bottom .pp_left,div.pp_default .pp_bottom .pp_middle,div.pp_default .pp_bottom .pp_right{height:13px}div.pp_default .pp_top .pp_left{background:url(../images/prettyPhoto/default/sprite.png) -78px -93px no-repeat}div.pp_default .pp_top .pp_middle{background:url(../images/prettyPhoto/default/sprite_x.png) top left repeat-x}div.pp_default .pp_top .pp_right{background:url(../images/prettyPhoto/default/sprite.png) -112px -93px no-repeat}div.pp_default .pp_content .ppt{color:#f8f8f8}div.pp_default .pp_content_container .pp_left{background:url(../images/prettyPhoto/default/sprite_y.png) -7px 0 repeat-y;padding-left:13px}div.pp_default .pp_content_container .pp_right{background:url(../images/prettyPhoto/default/sprite_y.png) top right repeat-y;padding-right:13px}div.pp_default .pp_next:hover{background:url(../images/prettyPhoto/default/sprite_next.png) center right no-repeat;cursor:pointer}div.pp_default .pp_previous:hover{background:url(../images/prettyPhoto/default/sprite_prev.png) center left no-repeat;cursor:pointer}div.pp_default .pp_expand{background:url(../images/prettyPhoto/default/sprite.png) 0 -29px no-repeat;cursor:pointer;width:28px;height:28px}div.pp_default .pp_expand:hover{background:url(../images/prettyPhoto/default/sprite.png) 0 -56px no-repeat;cursor:pointer}div.pp_default .pp_contract{background:url(../images/prettyPhoto/default/sprite.png) 0 -84px no-repeat;cursor:pointer;width:28px;height:28px}div.pp_default .pp_contract:hover{background:url(../images/prettyPhoto/default/sprite.png) 0 -113px no-repeat;cursor:pointer}div.pp_default .pp_close{width:30px;height:30px;background:url(../images/prettyPhoto/default/sprite.png) 2px 1px no-repeat;cursor:pointer}div.pp_default .pp_gallery ul li a{background:url(../images/prettyPhoto/default/default_thumb.png) center center #f8f8f8;border:1px solid #aaa}div.pp_default .pp_gallery a.pp_arrow_previous,div.pp_default .pp_gallery a.pp_arrow_next{position:static;left:auto}div.pp_default .pp_nav .pp_play,div.pp_default .pp_nav .pp_pause{background:url(../images/prettyPhoto/default/sprite.png) -51px 1px no-repeat;height:30px;width:30px}div.pp_default .pp_nav .pp_pause{background-position:-51px -29px}div.pp_default a.pp_arrow_previous,div.pp_default a.pp_arrow_next{background:url(../images/prettyPhoto/default/sprite.png) -31px -3px no-repeat;height:20px;width:20px;margin:4px 0 0}div.pp_default a.pp_arrow_next{left:52px;background-position:-82px -3px}div.pp_default .pp_content_container .pp_details{margin-top:5px}div.pp_default .pp_nav{clear:none;height:30px;width:105px;position:relative}div.pp_default .pp_nav .currentTextHolder{font-family:Georgia;font-style:italic;font-color:#999;font-size:11px;left:75px;line-height:25px;position:absolute;top:2px;margin:0;padding:0 0 0 10px}div.pp_default .pp_close:hover,div.pp_default .pp_nav .pp_play:hover,div.pp_default .pp_nav .pp_pause:hover,div.pp_default .pp_arrow_next:hover,div.pp_default .pp_arrow_previous:hover{opacity:0.7}div.pp_default .pp_description{font-size:11px;font-weight:700;line-height:14px;margin:5px 50px 5px 0}div.pp_default .pp_bottom .pp_left{background:url(../images/prettyPhoto/default/sprite.png) -78px -127px no-repeat}div.pp_default .pp_bottom .pp_middle{background:url(../images/prettyPhoto/default/sprite_x.png) bottom left repeat-x}div.pp_default .pp_bottom .pp_right{background:url(../images/prettyPhoto/default/sprite.png) -112px -127px no-repeat}div.pp_default .pp_loaderIcon{background:url(../images/prettyPhoto/default/loader.gif) center center no-repeat}div.light_rounded .pp_top .pp_left{background:url(../images/prettyPhoto/light_rounded/sprite.png) -88px -53px no-repeat}div.light_rounded .pp_top .pp_right{background:url(../images/prettyPhoto/light_rounded/sprite.png) -110px -53px no-repeat}div.light_rounded .pp_next:hover{background:url(../images/prettyPhoto/light_rounded/btnNext.png) center right no-repeat;cursor:pointer}div.light_rounded .pp_previous:hover{background:url(../images/prettyPhoto/light_rounded/btnPrevious.png) center left no-repeat;cursor:pointer}div.light_rounded .pp_expand{background:url(../images/prettyPhoto/light_rounded/sprite.png) -31px -26px no-repeat;cursor:pointer}div.light_rounded .pp_expand:hover{background:url(../images/prettyPhoto/light_rounded/sprite.png) -31px -47px no-repeat;cursor:pointer}div.light_rounded .pp_contract{background:url(../images/prettyPhoto/light_rounded/sprite.png) 0 -26px no-repeat;cursor:pointer}div.light_rounded .pp_contract:hover{background:url(../images/prettyPhoto/light_rounded/sprite.png) 0 -47px no-repeat;cursor:pointer}div.light_rounded .pp_close{width:75px;height:22px;background:url(../images/prettyPhoto/light_rounded/sprite.png) -1px -1px no-repeat;cursor:pointer}div.light_rounded .pp_nav .pp_play{background:url(../images/prettyPhoto/light_rounded/sprite.png) -1px -100px no-repeat;height:15px;width:14px}div.light_rounded .pp_nav .pp_pause{background:url(../images/prettyPhoto/light_rounded/sprite.png) -24px -100px no-repeat;height:15px;width:14px}div.light_rounded .pp_arrow_previous{background:url(../images/prettyPhoto/light_rounded/sprite.png) 0 -71px no-repeat}div.light_rounded .pp_arrow_next{background:url(../images/prettyPhoto/light_rounded/sprite.png) -22px -71px no-repeat}div.light_rounded .pp_bottom .pp_left{background:url(../images/prettyPhoto/light_rounded/sprite.png) -88px -80px no-repeat}div.light_rounded .pp_bottom .pp_right{background:url(../images/prettyPhoto/light_rounded/sprite.png) -110px -80px no-repeat}div.dark_rounded .pp_top .pp_left{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -88px -53px no-repeat}div.dark_rounded .pp_top .pp_right{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -110px -53px no-repeat}div.dark_rounded .pp_content_container .pp_left{background:url(../images/prettyPhoto/dark_rounded/contentPattern.png) top left repeat-y}div.dark_rounded .pp_content_container .pp_right{background:url(../images/prettyPhoto/dark_rounded/contentPattern.png) top right repeat-y}div.dark_rounded .pp_next:hover{background:url(../images/prettyPhoto/dark_rounded/btnNext.png) center right no-repeat;cursor:pointer}div.dark_rounded .pp_previous:hover{background:url(../images/prettyPhoto/dark_rounded/btnPrevious.png) center left no-repeat;cursor:pointer}div.dark_rounded .pp_expand{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -31px -26px no-repeat;cursor:pointer}div.dark_rounded .pp_expand:hover{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -31px -47px no-repeat;cursor:pointer}div.dark_rounded .pp_contract{background:url(../images/prettyPhoto/dark_rounded/sprite.png) 0 -26px no-repeat;cursor:pointer}div.dark_rounded .pp_contract:hover{background:url(../images/prettyPhoto/dark_rounded/sprite.png) 0 -47px no-repeat;cursor:pointer}div.dark_rounded .pp_close{width:75px;height:22px;background:url(../images/prettyPhoto/dark_rounded/sprite.png) -1px -1px no-repeat;cursor:pointer}div.dark_rounded .pp_description{margin-right:85px;color:#fff}div.dark_rounded .pp_nav .pp_play{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -1px -100px no-repeat;height:15px;width:14px}div.dark_rounded .pp_nav .pp_pause{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -24px -100px no-repeat;height:15px;width:14px}div.dark_rounded .pp_arrow_previous{background:url(../images/prettyPhoto/dark_rounded/sprite.png) 0 -71px no-repeat}div.dark_rounded .pp_arrow_next{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -22px -71px no-repeat}div.dark_rounded .pp_bottom .pp_left{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -88px -80px no-repeat}div.dark_rounded .pp_bottom .pp_right{background:url(../images/prettyPhoto/dark_rounded/sprite.png) -110px -80px no-repeat}div.dark_rounded .pp_loaderIcon{background:url(../images/prettyPhoto/dark_rounded/loader.gif) center center no-repeat}div.dark_square .pp_left,div.dark_square .pp_middle,div.dark_square .pp_right,div.dark_square .pp_content{background:#000}div.dark_square .pp_description{color:#fff;margin:0 85px 0 0}div.dark_square .pp_loaderIcon{background:url(../images/prettyPhoto/dark_square/loader.gif) center center no-repeat}div.dark_square .pp_expand{background:url(../images/prettyPhoto/dark_square/sprite.png) -31px -26px no-repeat;cursor:pointer}div.dark_square .pp_expand:hover{background:url(../images/prettyPhoto/dark_square/sprite.png) -31px -47px no-repeat;cursor:pointer}div.dark_square .pp_contract{background:url(../images/prettyPhoto/dark_square/sprite.png) 0 -26px no-repeat;cursor:pointer}div.dark_square .pp_contract:hover{background:url(../images/prettyPhoto/dark_square/sprite.png) 0 -47px no-repeat;cursor:pointer}div.dark_square .pp_close{width:75px;height:22px;background:url(../images/prettyPhoto/dark_square/sprite.png) -1px -1px no-repeat;cursor:pointer}div.dark_square .pp_nav{clear:none}div.dark_square .pp_nav .pp_play{background:url(../images/prettyPhoto/dark_square/sprite.png) -1px -100px no-repeat;height:15px;width:14px}div.dark_square .pp_nav .pp_pause{background:url(../images/prettyPhoto/dark_square/sprite.png) -24px -100px no-repeat;height:15px;width:14px}div.dark_square .pp_arrow_previous{background:url(../images/prettyPhoto/dark_square/sprite.png) 0 -71px no-repeat}div.dark_square .pp_arrow_next{background:url(../images/prettyPhoto/dark_square/sprite.png) -22px -71px no-repeat}div.dark_square .pp_next:hover{background:url(../images/prettyPhoto/dark_square/btnNext.png) center right no-repeat;cursor:pointer}div.dark_square .pp_previous:hover{background:url(../images/prettyPhoto/dark_square/btnPrevious.png) center left no-repeat;cursor:pointer}div.light_square .pp_expand{background:url(../images/prettyPhoto/light_square/sprite.png) -31px -26px no-repeat;cursor:pointer}div.light_square .pp_expand:hover{background:url(../images/prettyPhoto/light_square/sprite.png) -31px -47px no-repeat;cursor:pointer}div.light_square .pp_contract{background:url(../images/prettyPhoto/light_square/sprite.png) 0 -26px no-repeat;cursor:pointer}div.light_square .pp_contract:hover{background:url(../images/prettyPhoto/light_square/sprite.png) 0 -47px no-repeat;cursor:pointer}div.light_square .pp_close{width:75px;height:22px;background:url(../images/prettyPhoto/light_square/sprite.png) -1px -1px no-repeat;cursor:pointer}div.light_square .pp_nav .pp_play{background:url(../images/prettyPhoto/light_square/sprite.png) -1px -100px no-repeat;height:15px;width:14px}div.light_square .pp_nav .pp_pause{background:url(../images/prettyPhoto/light_square/sprite.png) -24px -100px no-repeat;height:15px;width:14px}div.light_square .pp_arrow_previous{background:url(../images/prettyPhoto/light_square/sprite.png) 0 -71px no-repeat}div.light_square .pp_arrow_next{background:url(../images/prettyPhoto/light_square/sprite.png) -22px -71px no-repeat}div.light_square .pp_next:hover{background:url(../images/prettyPhoto/light_square/btnNext.png) center right no-repeat;cursor:pointer}div.light_square .pp_previous:hover{background:url(../images/prettyPhoto/light_square/btnPrevious.png) center left no-repeat;cursor:pointer}div.facebook .pp_top .pp_left{background:url(../images/prettyPhoto/facebook/sprite.png) -88px -53px no-repeat}div.facebook .pp_top .pp_middle{background:url(../images/prettyPhoto/facebook/contentPatternTop.png) top left repeat-x}div.facebook .pp_top .pp_right{background:url(../images/prettyPhoto/facebook/sprite.png) -110px -53px no-repeat}div.facebook .pp_content_container .pp_left{background:url(../images/prettyPhoto/facebook/contentPatternLeft.png) top left repeat-y}div.facebook .pp_content_container .pp_right{background:url(../images/prettyPhoto/facebook/contentPatternRight.png) top right repeat-y}div.facebook .pp_expand{background:url(../images/prettyPhoto/facebook/sprite.png) -31px -26px no-repeat;cursor:pointer}div.facebook .pp_expand:hover{background:url(../images/prettyPhoto/facebook/sprite.png) -31px -47px no-repeat;cursor:pointer}div.facebook .pp_contract{background:url(../images/prettyPhoto/facebook/sprite.png) 0 -26px no-repeat;cursor:pointer}div.facebook .pp_contract:hover{background:url(../images/prettyPhoto/facebook/sprite.png) 0 -47px no-repeat;cursor:pointer}div.facebook .pp_close{width:22px;height:22px;background:url(../images/prettyPhoto/facebook/sprite.png) -1px -1px no-repeat;cursor:pointer}div.facebook .pp_description{margin:0 37px 0 0}div.facebook .pp_loaderIcon{background:url(../images/prettyPhoto/facebook/loader.gif) center center no-repeat}div.facebook .pp_arrow_previous{background:url(../images/prettyPhoto/facebook/sprite.png) 0 -71px no-repeat;height:22px;margin-top:0;width:22px}div.facebook .pp_arrow_previous.disabled{background-position:0 -96px;cursor:default}div.facebook .pp_arrow_next{background:url(../images/prettyPhoto/facebook/sprite.png) -32px -71px no-repeat;height:22px;margin-top:0;width:22px}div.facebook .pp_arrow_next.disabled{background-position:-32px -96px;cursor:default}div.facebook .pp_nav{margin-top:0}div.facebook .pp_nav p{font-size:15px;padding:0 3px 0 4px}div.facebook .pp_nav .pp_play{background:url(../images/prettyPhoto/facebook/sprite.png) -1px -123px no-repeat;height:22px;width:22px}div.facebook .pp_nav .pp_pause{background:url(../images/prettyPhoto/facebook/sprite.png) -32px -123px no-repeat;height:22px;width:22px}div.facebook .pp_next:hover{background:url(../images/prettyPhoto/facebook/btnNext.png) center right no-repeat;cursor:pointer}div.facebook .pp_previous:hover{background:url(../images/prettyPhoto/facebook/btnPrevious.png) center left no-repeat;cursor:pointer}div.facebook .pp_bottom .pp_left{background:url(../images/prettyPhoto/facebook/sprite.png) -88px -80px no-repeat}div.facebook .pp_bottom .pp_middle{background:url(../images/prettyPhoto/facebook/contentPatternBottom.png) top left repeat-x}div.facebook .pp_bottom .pp_right{background:url(../images/prettyPhoto/facebook/sprite.png) -110px -80px no-repeat}div.pp_pic_holder a:focus{outline:none}div.pp_overlay{background:#000;display:none;left:0;position:absolute;top:0;width:100%;z-index:9500}div.pp_pic_holder{display:none;position:absolute;width:100px;z-index:10000}.pp_content{height:40px;min-width:40px}* html .pp_content{width:40px}.pp_content_container{position:relative;text-align:left;width:100%}.pp_content_container .pp_left{padding-left:20px}.pp_content_container .pp_right{padding-right:20px}.pp_content_container .pp_details{float:left;margin:10px 0 2px}.pp_description{display:none;margin:0}.pp_social{float:left;margin:7px 0 0}.pp_social .facebook{float:left;position:relative;top:-1px;margin-left:5px;width:55px;overflow:hidden}.pp_social .twitter{float:left}.pp_nav{clear:right;float:left;margin:3px 10px 0 0}.pp_nav p{float:left;margin:2px 4px}.pp_nav .pp_play,.pp_nav .pp_pause{float:left;margin-right:4px;text-indent:-10000px}a.pp_arrow_previous,a.pp_arrow_next{display:block;float:left;height:15px;margin-top:3px;overflow:hidden;text-indent:-10000px;width:14px}.pp_hoverContainer{position:absolute;top:0;width:100%;z-index:2000}.pp_gallery{display:none;left:50%;margin-top:-50px;position:absolute;z-index:10000}.pp_gallery div{float:left;overflow:hidden;position:relative}.pp_gallery ul{float:left;height:35px;position:relative;white-space:nowrap;margin:0 0 0 5px;padding:0}.pp_gallery ul a{border:1px rgba(0,0,0,0.5) solid;display:block;float:left;height:33px;overflow:hidden}.pp_gallery ul a img{border:0}.pp_gallery li{display:block;float:left;margin:0 5px 0 0;padding:0}.pp_gallery li.default a{background:url(../images/prettyPhoto/facebook/default_thumbnail.gif) 0 0 no-repeat;display:block;height:33px;width:50px}.pp_gallery .pp_arrow_previous,.pp_gallery .pp_arrow_next{margin-top:7px!important}a.pp_next{background:url(../images/prettyPhoto/light_rounded/btnNext.png) 10000px 10000px no-repeat;display:block;float:right;height:100%;text-indent:-10000px;width:49%}a.pp_previous{background:url(../images/prettyPhoto/light_rounded/btnNext.png) 10000px 10000px no-repeat;display:block;float:left;height:100%;text-indent:-10000px;width:49%}a.pp_expand,a.pp_contract{cursor:pointer;display:none;height:20px;position:absolute;right:30px;text-indent:-10000px;top:10px;width:20px;z-index:20000}a.pp_close{position:absolute;right:0;top:0;display:block;line-height:22px;text-indent:-10000px}.pp_loaderIcon{display:block;height:24px;left:50%;position:absolute;top:50%;width:24px;margin:-12px 0 0 -12px}#pp_full_res{line-height:1!important}#pp_full_res .pp_inline{text-align:left}#pp_full_res .pp_inline p{margin:0 0 15px}div.ppt{color:#fff;display:none;font-size:17px;z-index:9999;margin:0 0 5px 15px}div.pp_default .pp_content,div.light_rounded .pp_content{background-color:#fff}div.pp_default #pp_full_res .pp_inline,div.light_rounded .pp_content .ppt,div.light_rounded #pp_full_res .pp_inline,div.light_square .pp_content .ppt,div.light_square #pp_full_res .pp_inline,div.facebook .pp_content .ppt,div.facebook #pp_full_res .pp_inline{color:#000}div.pp_default .pp_gallery ul li a:hover,div.pp_default .pp_gallery ul li.selected a,.pp_gallery ul a:hover,.pp_gallery li.selected a{border-color:#fff}div.pp_default .pp_details,div.light_rounded .pp_details,div.dark_rounded .pp_details,div.dark_square .pp_details,div.light_square .pp_details,div.facebook .pp_details{position:relative}div.light_rounded .pp_top .pp_middle,div.light_rounded .pp_content_container .pp_left,div.light_rounded .pp_content_container .pp_right,div.light_rounded .pp_bottom .pp_middle,div.light_square .pp_left,div.light_square .pp_middle,div.light_square .pp_right,div.light_square .pp_content,div.facebook .pp_content{background:#fff}div.light_rounded .pp_description,div.light_square .pp_description{margin-right:85px}div.light_rounded .pp_gallery a.pp_arrow_previous,div.light_rounded .pp_gallery a.pp_arrow_next,div.dark_rounded .pp_gallery a.pp_arrow_previous,div.dark_rounded .pp_gallery a.pp_arrow_next,div.dark_square .pp_gallery a.pp_arrow_previous,div.dark_square .pp_gallery a.pp_arrow_next,div.light_square .pp_gallery a.pp_arrow_previous,div.light_square .pp_gallery a.pp_arrow_next{margin-top:12px!important}div.light_rounded .pp_arrow_previous.disabled,div.dark_rounded .pp_arrow_previous.disabled,div.dark_square .pp_arrow_previous.disabled,div.light_square .pp_arrow_previous.disabled{background-position:0 -87px;cursor:default}div.light_rounded .pp_arrow_next.disabled,div.dark_rounded .pp_arrow_next.disabled,div.dark_square .pp_arrow_next.disabled,div.light_square .pp_arrow_next.disabled{background-position:-22px -87px;cursor:default}div.light_rounded .pp_loaderIcon,div.light_square .pp_loaderIcon{background:url(../images/prettyPhoto/light_rounded/loader.gif) center center no-repeat}div.dark_rounded .pp_top .pp_middle,div.dark_rounded .pp_content,div.dark_rounded .pp_bottom .pp_middle{background:url(../images/prettyPhoto/dark_rounded/contentPattern.png) top left repeat}div.dark_rounded .currentTextHolder,div.dark_square .currentTextHolder{color:#c4c4c4}div.dark_rounded #pp_full_res .pp_inline,div.dark_square #pp_full_res .pp_inline{color:#fff}.pp_top,.pp_bottom{height:20px;position:relative}* html .pp_top,* html .pp_bottom{padding:0 20px}.pp_top .pp_left,.pp_bottom .pp_left{height:20px;left:0;position:absolute;width:20px}.pp_top .pp_middle,.pp_bottom .pp_middle{height:20px;left:20px;position:absolute;right:20px}* html .pp_top .pp_middle,* html .pp_bottom .pp_middle{left:0;position:static}.pp_top .pp_right,.pp_bottom .pp_right{height:20px;left:auto;position:absolute;right:0;top:0;width:20px}.pp_fade,.pp_gallery li.default a img{display:none}\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("/*-------LOGIN STARTS HERE -------*/\n");
      out.write("\n");
      out.write("/* Login Container (default to float:right) */\n");
      out.write("#loginContainer {\n");
      out.write("    position:relative;\n");
      out.write("    float:left;\n");
      out.write("    font-size:12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Login Button */\n");
      out.write("#loginButton { \n");
      out.write("    display:inline-block;\n");
      out.write("    float:right;\n");
      out.write("   /* background:pink ; \n");
      out.write("   border:1px solid #899caa;\n");
      out.write("    border-radius:3px;*/\n");
      out.write("    -moz-border-radius:3px;\n");
      out.write("    position:absolute;\n");
      out.write("    z-index:30;\n");
      out.write("    cursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Login Button Text */\n");
      out.write("#loginButton span {\n");
      out.write("    color:#fff; \n");
      out.write("    font-size:16px; \n");
      out.write("    /*font-weight:bold; */\n");
      out.write("    padding:7px 29px 9px 10px;\n");
      out.write("    text-align:right;\n");
      out.write("   \n");
      out.write("    display:block\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*#loginButton:hover {\n");
      out.write("    background: \t#FF33FF;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("/* Login Box */\n");
      out.write("#loginBox {\n");
      out.write("    position:absolute;\n");
      out.write("    top:34px;\n");
      out.write("    right:0;\n");
      out.write("    display:none;\n");
      out.write("    z-index:29;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* If the Login Button has been clicked */    \n");
      out.write("#loginButton.active {\n");
      out.write("    border-radius:3px 3px 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#loginButton.active span {\n");
      out.write("    background-position:53px -76px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* A Line added to overlap the border */\n");
      out.write("#loginButton.active em {\n");
      out.write("    position:absolute;\n");
      out.write("    width:100%;\n");
      out.write("    height:1px;\n");
      out.write("    background:pink;\n");
      out.write("    bottom:-1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Login Form */\n");
      out.write("#loginForm {\n");
      out.write("    width:248px; \n");
      out.write("    border:1px solid #899caa;\n");
      out.write("    border-radius:3px 0 3px 3px;\n");
      out.write("    -moz-border-radius:3px 0 3px 3px;\n");
      out.write("    margin-top:-1px;\n");
      out.write("    background:pink;\n");
      out.write("    padding:6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#loginForm fieldset {\n");
      out.write("    margin:0 0 12px 0;\n");
      out.write("    display:block;\n");
      out.write("    border:0;\n");
      out.write("    padding:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("fieldset#body {\n");
      out.write("    background:#fff;\n");
      out.write("    border-radius:3px;\n");
      out.write("    -moz-border-radius:3px;\n");
      out.write("    padding:10px 13px;\n");
      out.write("    margin:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#loginForm #checkbox {\n");
      out.write("    width:auto;\n");
      out.write("    margin:1px 9px 0 0;\n");
      out.write("    float:left;\n");
      out.write("    padding:0;\n");
      out.write("    border:0;\n");
      out.write("    *margin:-3px 9px 0 0; /* IE7 Fix */\n");
      out.write("}\n");
      out.write("\n");
      out.write("#body label {\n");
      out.write("    color:#3a454d;\n");
      out.write("    margin:9px 0 0 0;\n");
      out.write("    display:block;\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#loginForm #body fieldset label {\n");
      out.write("    display:block;\n");
      out.write("    float:none;\n");
      out.write("    margin:0 0 6px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Default Input */\n");
      out.write("#loginForm input {\n");
      out.write("    width:92%;\n");
      out.write("    border:1px solid #CF0883 ;\n");
      out.write("    border-radius:3px;\n");
      out.write("    -moz-border-radius:3px;\n");
      out.write("    color:#3a454d;\n");
      out.write("    font-weight:bold;\n");
      out.write("    padding:8px 8px;\n");
      out.write("    box-shadow:inset 0px 1px 3px #bbb;\n");
      out.write("    -webkit-box-shadow:inset 0px 1px 3px #bbb;\n");
      out.write("    -moz-box-shadow:inset 0px 1px 3px #bbb;\n");
      out.write("    font-size:12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Sign In Button */\n");
      out.write("#loginForm #login {\n");
      out.write("    width:auto;\n");
      out.write("    float:left;\n");
      out.write("    background:#FF00CC;\n");
      out.write("    color:#fff;\n");
      out.write("    padding:7px 7px 8px 10px;\n");
      out.write("    \n");
      out.write("    border:1px solid #fff;\n");
      out.write("    box-shadow:none;\n");
      out.write("    -moz-box-shadow:none;\n");
      out.write("    -webkit-box-shadow:none;\n");
      out.write("    margin:0 4px 0 0;\n");
      out.write("    cursor:pointer;\n");
      out.write("    *padding:7px 2px 8px 2px; /* IE7 Fix */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Forgot your password */\n");
      out.write("#loginForm span {\n");
      out.write("    \n");
      out.write("    display:block;\n");
      out.write("    padding:0px 0 0px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#loginForm span a {\n");
      out.write("    color:#3a454d;\n");
      out.write("    text-shadow:0px 0px #fff;\n");
      out.write("    font-size:12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus {\n");
      out.write("    outline:none;\n");
      out.write("}");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/base.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/skeleton.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/screen.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/prettyPhoto.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\"> <!--cambiar en todas-->\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"images/apple-touch-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"images/apple-touch-icon-114x114.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--Content Part ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  <div class=\"container\"> \r\n");
      out.write("    <!-- Header | Logo, Menu\r\n");
      out.write("\t\t================================================== -->\r\n");
      out.write("    <div class=\"logo\"><img src=\"");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\" style='float:left'/></div>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mainmenu\">\r\n");
      out.write("      <div id=\"mainmenu\">\r\n");
      out.write("        <ul class=\"sf-menu\">\r\n");
      out.write("          <li><a href=\"");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\" id=\"visited\">Inicio</a></li>\r\n");
      out.write("          <li><a href=\"");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\">About</a></li>\r\n");
      out.write("          <li><a href=\"");
      if (_jspx_meth_s_url_4(_jspx_page_context))
        return;
      out.write("\">Portfolio</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"");
      if (_jspx_meth_s_url_5(_jspx_page_context))
        return;
      out.write("\">Portfolio Project</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\">Blog</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"");
      if (_jspx_meth_s_url_7(_jspx_page_context))
        return;
      out.write("\">Single Post</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"");
      if (_jspx_meth_s_url_8(_jspx_page_context))
        return;
      out.write("\">Contact</a></li>\r\n");
      out.write("         <!--- <li> <a href=\"#\" id=\"loginButton\"><span>Login</span></a></li>-->\r\n");
      out.write("         <li><a href=\"");
      if (_jspx_meth_s_url_9(_jspx_page_context))
        return;
      out.write(" \" id=\"loginButton\"><span>Iniciar sesión</span></a></li>\r\n");
      out.write("         <div style=\"clear:both\"></div>\r\n");
      out.write("                <div id=\"loginBox\">                \r\n");
      out.write("                    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mainmenu ends here --> \r\n");
      out.write("      \r\n");
      out.write("      <!-- Responsive Menu -->\r\n");
      out.write("      <form id=\"responsive-menu\" action=\"#\" method=\"post\">\r\n");
      out.write("        <select>\r\n");
      out.write("          <option value=''>Navigation</option>\r\n");
      out.write("          <option value='/JSP/index.jsp'>Home</option>\r\n");
      out.write("          <option value='/JSP/about.jsp'>About</option>\r\n");
      out.write("          <option value='/JSP/portfolio.jsp'>Portfolio</option>\r\n");
      out.write("          <option value='/JSP/portfolioproject.jsp'>Portfolio Project</option>\r\n");
      out.write("          <option value='/JSP/blog.jsp'>Blog</option>\r\n");
      out.write("          <option value='/JSP/singleblog.jsp'>Single Post</option>\r\n");
      out.write("          <option value='/JSP/features.jsp'>Features</option>\r\n");
      out.write("          <option value='/JSP/contact.jsp'>Contact</option>\r\n");
      out.write("           <option value='/Admin/login.jsp'>Login</option>\r\n");
      out.write("        </select>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- mainmenu ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- header ends here --> \r\n");
      out.write("<!-- Slider ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<section class=\"slider\">\r\n");
      out.write("  <div class=\"flexslider\">\r\n");
      out.write("    <ul class=\"slides\">\r\n");
      out.write("      <li> <a href=\"#\"><img  src=\"");
      if (_jspx_meth_s_url_10(_jspx_page_context))
        return;
      out.write("\" alt=\"\"/></a>\r\n");
      out.write("      \r\n");
      out.write("      </li>\r\n");
      out.write("      <li> <img src=\"");
      if (_jspx_meth_s_url_11(_jspx_page_context))
        return;
      out.write("\" alt=\"\" />\r\n");
      out.write("       \r\n");
      out.write("      </li>\r\n");
      out.write("      <li> <a href=\"#\"><img src=\"");
      if (_jspx_meth_s_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("        \r\n");
      out.write("      </li>\r\n");
      out.write("        \r\n");
      out.write("         <li> <a href=\"#\"><img  src=\"");
      if (_jspx_meth_s_url_13(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("        \r\n");
      out.write("      </li>\r\n");
      out.write("        \r\n");
      out.write("         <li> <a href=\"#\"><img src=\"");
      if (_jspx_meth_s_url_14(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("        \r\n");
      out.write("      </li>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        <li> <a href=\"#\"><img src=\"");
      if (_jspx_meth_s_url_15(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("        \r\n");
      out.write("      </li>\r\n");
      out.write("        <li> <a href=\"#\"><img  src=\"");
      if (_jspx_meth_s_url_16(_jspx_page_context))
        return;
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("        \r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- flexslider ends here --> \r\n");
      out.write("</section>\r\n");
      out.write("<!-- slider ends here --> \r\n");
      out.write("<!-- info Box ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"infobox\">\r\n");
      out.write("  <div class=\"container info\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <h1>Categorías de productos</h1>\r\n");
      out.write("     <!-- <p class=\"infop\"><strong>Liverpool, </strong> es parte de tu vida.</p>-->\r\n");
      out.write("    </header>\r\n");
      out.write("    <hr class=\"separator\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- infobox ends here --> \r\n");
      out.write("<!--Latest Photos ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Portfolio ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"container portfolio\">\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_17(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Belleza</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_18(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Ropa para dama</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_19(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Ropa para caballero</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_20(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Ropa infantil</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_21(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Juguetes</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_22(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Línea blanca</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_23(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Deportes</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_24(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Computación</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_25(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Muebles</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_26(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Tecnología</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_27(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Salud</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third-->\r\n");
      out.write("  <div class=\"one_third lastcolumn shadow\">\r\n");
      out.write("    <div class=\"view view-first\"> <img alt=\"\" src=\"");
      if (_jspx_meth_s_url_28(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("      <div class=\"mask\">\r\n");
      out.write("        <h2><a href=\"#\">Hogar</a></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mask ends here --> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- view ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--end one_third--> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"headingblock\">\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("<!-- headingblock ends here --> \r\n");
      out.write("<!-- Latest News & Faq ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"container latest\">\r\n");
      out.write("  \r\n");
      out.write("  <!-- two_third ends here -->\r\n");
      out.write("\r\n");
      out.write("  <!-- one_third ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- end container --> \r\n");
      out.write("<!-- Socialize ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<!-- socialsblock ends here --> \r\n");
      out.write("<!-- Footer ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"one_fourth\">\r\n");
      out.write("      <h3>Contact Informations</h3>\r\n");
      out.write("      <p><span class=\"orange\"><strong>Address:</strong></span> <br>\r\n");
      out.write("        No.2 - 123678 street name City, Country</p>\r\n");
      out.write("      <p><span class=\"orange\"><strong>Phone:</strong></span> <br>\r\n");
      out.write("        + 9 (094) 067 93567<br>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p><span class=\"orange\"><strong>Email:</strong></span> <br>\r\n");
      out.write("        info@yoursite.com<br>\r\n");
      out.write("      </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- four columns ends here -->\r\n");
      out.write("    <div class=\"one_fourth\">\r\n");
      out.write("      <h3>Blogroll</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\" title=\"\">Development Blog</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">New Freebies</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">Themeforest Theme</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\"> Design News</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">WordPress Theme</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- four columns ends here -->\r\n");
      out.write("    <div class=\"one_fourth\">\r\n");
      out.write("      <h3>Archive</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\" class=\"\"> August 2012</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">July 2012</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">Juny 2012</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\"> May 2012</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"\">April 2012</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- four columns ends here -->\r\n");
      out.write("    <div class=\"one_fourth lastcolumn\">\r\n");
      out.write("      <h3>About</h3>\r\n");
      out.write("      <p>Freebix is responsive, simple and clean template with a lot attention to detail. Get it now!</p>\r\n");
      out.write("      <p>Visit <a href=\"http://anarieldesign.com/\" rel=\"nofollow\">Anariel Design</a> and find more interesting things.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- four columns ends here --> \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- footer ends here --> \r\n");
      out.write("<!-- Copyright ==================================================\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div id=\"copyright\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p class=\"copyright\">&copy; Copyright 2013. &quot;Freebix&quot; by <a href=\"http://www.anarieldesign.com/\" rel=\"nofollow\">Anariel Design</a>. All rights reserved.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container ends here --> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- copyright ends here --> \r\n");
      out.write("<!-- End Document\r\n");
      out.write("================================================== --> \r\n");
      out.write("<!-- Scripts ==================================================\r\n");
      out.write("================================================== --> \r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_29(_jspx_page_context))
        return;
      out.write("\"type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Main js files --> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_30(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Tabs --> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_31(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Include prettyPhoto --> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_32(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Include Superfish --> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_33(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_34(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Flexslider --> \r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_35(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("<!-- Modernizr --> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_s_url_36(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_s_url_37(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script> \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setValue("/images/imgr.png");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent(null);
    _jspx_th_s_url_1.setValue("/images/oie_transparent.png");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent(null);
    _jspx_th_s_url_2.setValue("/JSP/Index.jsp");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent(null);
    _jspx_th_s_url_3.setValue("/JSP/about.jsp");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent(null);
    _jspx_th_s_url_4.setValue("/JSP/portfolio.jsp");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent(null);
    _jspx_th_s_url_5.setValue("/JSP/portfolioproject.jsp");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent(null);
    _jspx_th_s_url_6.setValue("/JSP/blog.jsp");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent(null);
    _jspx_th_s_url_7.setValue("/JSP/singleblog.jsp");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent(null);
    _jspx_th_s_url_8.setValue("/JSP/contact.jsp");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent(null);
    _jspx_th_s_url_9.setValue("#");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("loginForm");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                        <fieldset id=\"body\">\r\n");
        out.write("                            \r\n");
        out.write("                            <fieldset>\r\n");
        out.write("                                <label for=\"email\">Correo</label>\r\n");
        out.write("                                <input type=\"text\" name=\"email\" id=\"email\" />\r\n");
        out.write("                            </fieldset>\r\n");
        out.write("                            <fieldset>\r\n");
        out.write("                                <label for=\"password\">Contraseña</label>\r\n");
        out.write("                                <input type=\"password\" name=\"password\" id=\"password\" />\r\n");
        out.write("                            </fieldset>\r\n");
        out.write("                            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                           <!-- <label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\" />Remember me</label>-->\r\n");
        out.write("                        </fieldset>\r\n");
        out.write("                       <!--- <span><a href=\"#\">Forgot your password?</a></span>-->\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_id_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setId("login");
    _jspx_th_s_submit_0.setValue("Aceptar");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_id_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_id_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent(null);
    _jspx_th_s_url_10.setValue("/images/flexslider/liverpool.jpg");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_11 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_11.setPageContext(_jspx_page_context);
    _jspx_th_s_url_11.setParent(null);
    _jspx_th_s_url_11.setValue("/images/flexslider/liverpool3.jpg");
    int _jspx_eval_s_url_11 = _jspx_th_s_url_11.doStartTag();
    if (_jspx_th_s_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_11);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_11);
    return false;
  }

  private boolean _jspx_meth_s_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_12 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_12.setPageContext(_jspx_page_context);
    _jspx_th_s_url_12.setParent(null);
    _jspx_th_s_url_12.setValue("/images/flexslider/liverpool5.jpeg");
    int _jspx_eval_s_url_12 = _jspx_th_s_url_12.doStartTag();
    if (_jspx_th_s_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_12);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_12);
    return false;
  }

  private boolean _jspx_meth_s_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_13 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_13.setPageContext(_jspx_page_context);
    _jspx_th_s_url_13.setParent(null);
    _jspx_th_s_url_13.setValue("/images/flexslider/liverpool1.jpg");
    int _jspx_eval_s_url_13 = _jspx_th_s_url_13.doStartTag();
    if (_jspx_th_s_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_13);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_13);
    return false;
  }

  private boolean _jspx_meth_s_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_14 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_14.setPageContext(_jspx_page_context);
    _jspx_th_s_url_14.setParent(null);
    _jspx_th_s_url_14.setValue("/images/flexslider/liverpool2.jpg");
    int _jspx_eval_s_url_14 = _jspx_th_s_url_14.doStartTag();
    if (_jspx_th_s_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_14);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_14);
    return false;
  }

  private boolean _jspx_meth_s_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_15 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_15.setPageContext(_jspx_page_context);
    _jspx_th_s_url_15.setParent(null);
    _jspx_th_s_url_15.setValue("/images/flexslider/liverpool6.jpg");
    int _jspx_eval_s_url_15 = _jspx_th_s_url_15.doStartTag();
    if (_jspx_th_s_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_15);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_15);
    return false;
  }

  private boolean _jspx_meth_s_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_16 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_16.setPageContext(_jspx_page_context);
    _jspx_th_s_url_16.setParent(null);
    _jspx_th_s_url_16.setValue("/images/flexslider/liverpool7.jpg");
    int _jspx_eval_s_url_16 = _jspx_th_s_url_16.doStartTag();
    if (_jspx_th_s_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_16);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_16);
    return false;
  }

  private boolean _jspx_meth_s_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_17 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_17.setPageContext(_jspx_page_context);
    _jspx_th_s_url_17.setParent(null);
    _jspx_th_s_url_17.setValue("/images/portafolio/belleza.jpg");
    int _jspx_eval_s_url_17 = _jspx_th_s_url_17.doStartTag();
    if (_jspx_th_s_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_17);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_17);
    return false;
  }

  private boolean _jspx_meth_s_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_18 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_18.setPageContext(_jspx_page_context);
    _jspx_th_s_url_18.setParent(null);
    _jspx_th_s_url_18.setValue("/images/portafolio/ropaDama.jpg");
    int _jspx_eval_s_url_18 = _jspx_th_s_url_18.doStartTag();
    if (_jspx_th_s_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_18);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_18);
    return false;
  }

  private boolean _jspx_meth_s_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_19 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_19.setPageContext(_jspx_page_context);
    _jspx_th_s_url_19.setParent(null);
    _jspx_th_s_url_19.setValue("/images/portafolio/ropaCaba.jpg");
    int _jspx_eval_s_url_19 = _jspx_th_s_url_19.doStartTag();
    if (_jspx_th_s_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_19);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_19);
    return false;
  }

  private boolean _jspx_meth_s_url_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_20 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_20.setPageContext(_jspx_page_context);
    _jspx_th_s_url_20.setParent(null);
    _jspx_th_s_url_20.setValue("/images/portafolio/ropaI.jpg");
    int _jspx_eval_s_url_20 = _jspx_th_s_url_20.doStartTag();
    if (_jspx_th_s_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_20);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_20);
    return false;
  }

  private boolean _jspx_meth_s_url_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_21 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_21.setPageContext(_jspx_page_context);
    _jspx_th_s_url_21.setParent(null);
    _jspx_th_s_url_21.setValue("/images/portafolio/juguetes.jpg");
    int _jspx_eval_s_url_21 = _jspx_th_s_url_21.doStartTag();
    if (_jspx_th_s_url_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_21);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_21);
    return false;
  }

  private boolean _jspx_meth_s_url_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_22 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_22.setPageContext(_jspx_page_context);
    _jspx_th_s_url_22.setParent(null);
    _jspx_th_s_url_22.setValue("/images/portafolio/lineaBlanca.jpg");
    int _jspx_eval_s_url_22 = _jspx_th_s_url_22.doStartTag();
    if (_jspx_th_s_url_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_22);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_22);
    return false;
  }

  private boolean _jspx_meth_s_url_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_23 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_23.setPageContext(_jspx_page_context);
    _jspx_th_s_url_23.setParent(null);
    _jspx_th_s_url_23.setValue("/images/portafolio/deporte.jpg");
    int _jspx_eval_s_url_23 = _jspx_th_s_url_23.doStartTag();
    if (_jspx_th_s_url_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_23);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_23);
    return false;
  }

  private boolean _jspx_meth_s_url_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_24 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_24.setPageContext(_jspx_page_context);
    _jspx_th_s_url_24.setParent(null);
    _jspx_th_s_url_24.setValue("/images/portafolio/computacion.jpg");
    int _jspx_eval_s_url_24 = _jspx_th_s_url_24.doStartTag();
    if (_jspx_th_s_url_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_24);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_24);
    return false;
  }

  private boolean _jspx_meth_s_url_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_25 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_25.setPageContext(_jspx_page_context);
    _jspx_th_s_url_25.setParent(null);
    _jspx_th_s_url_25.setValue("/images/portafolio/muebles.jpg");
    int _jspx_eval_s_url_25 = _jspx_th_s_url_25.doStartTag();
    if (_jspx_th_s_url_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_25);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_25);
    return false;
  }

  private boolean _jspx_meth_s_url_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_26 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_26.setPageContext(_jspx_page_context);
    _jspx_th_s_url_26.setParent(null);
    _jspx_th_s_url_26.setValue("/images/portafolio/tecnologia.jpg");
    int _jspx_eval_s_url_26 = _jspx_th_s_url_26.doStartTag();
    if (_jspx_th_s_url_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_26);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_26);
    return false;
  }

  private boolean _jspx_meth_s_url_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_27 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_27.setPageContext(_jspx_page_context);
    _jspx_th_s_url_27.setParent(null);
    _jspx_th_s_url_27.setValue("/images/portafolio/salud.jpg");
    int _jspx_eval_s_url_27 = _jspx_th_s_url_27.doStartTag();
    if (_jspx_th_s_url_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_27);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_27);
    return false;
  }

  private boolean _jspx_meth_s_url_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_28 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_28.setPageContext(_jspx_page_context);
    _jspx_th_s_url_28.setParent(null);
    _jspx_th_s_url_28.setValue("/images/portafolio/hogar.jpg");
    int _jspx_eval_s_url_28 = _jspx_th_s_url_28.doStartTag();
    if (_jspx_th_s_url_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_28);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_28);
    return false;
  }

  private boolean _jspx_meth_s_url_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_29 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_29.setPageContext(_jspx_page_context);
    _jspx_th_s_url_29.setParent(null);
    _jspx_th_s_url_29.setValue("/js/jquery-1.8.0.min.js");
    int _jspx_eval_s_url_29 = _jspx_th_s_url_29.doStartTag();
    if (_jspx_th_s_url_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_29);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_29);
    return false;
  }

  private boolean _jspx_meth_s_url_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_30 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_30.setPageContext(_jspx_page_context);
    _jspx_th_s_url_30.setParent(null);
    _jspx_th_s_url_30.setValue("/js/screen.js");
    int _jspx_eval_s_url_30 = _jspx_th_s_url_30.doStartTag();
    if (_jspx_th_s_url_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_30);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_30);
    return false;
  }

  private boolean _jspx_meth_s_url_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_31 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_31.setPageContext(_jspx_page_context);
    _jspx_th_s_url_31.setParent(null);
    _jspx_th_s_url_31.setValue("/js/tabs.js");
    int _jspx_eval_s_url_31 = _jspx_th_s_url_31.doStartTag();
    if (_jspx_th_s_url_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_31);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_31);
    return false;
  }

  private boolean _jspx_meth_s_url_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_32 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_32.setPageContext(_jspx_page_context);
    _jspx_th_s_url_32.setParent(null);
    _jspx_th_s_url_32.setValue("/js/jquery.prettyPhoto.js");
    int _jspx_eval_s_url_32 = _jspx_th_s_url_32.doStartTag();
    if (_jspx_th_s_url_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_32);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_32);
    return false;
  }

  private boolean _jspx_meth_s_url_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_33 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_33.setPageContext(_jspx_page_context);
    _jspx_th_s_url_33.setParent(null);
    _jspx_th_s_url_33.setValue("/js/superfish.js");
    int _jspx_eval_s_url_33 = _jspx_th_s_url_33.doStartTag();
    if (_jspx_th_s_url_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_33);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_33);
    return false;
  }

  private boolean _jspx_meth_s_url_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_34 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_34.setPageContext(_jspx_page_context);
    _jspx_th_s_url_34.setParent(null);
    _jspx_th_s_url_34.setValue("/js/hoverIntent.js");
    int _jspx_eval_s_url_34 = _jspx_th_s_url_34.doStartTag();
    if (_jspx_th_s_url_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_34);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_34);
    return false;
  }

  private boolean _jspx_meth_s_url_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_35 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_35.setPageContext(_jspx_page_context);
    _jspx_th_s_url_35.setParent(null);
    _jspx_th_s_url_35.setValue("/js/jquery.flexslider-min.js");
    int _jspx_eval_s_url_35 = _jspx_th_s_url_35.doStartTag();
    if (_jspx_th_s_url_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_35);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_35);
    return false;
  }

  private boolean _jspx_meth_s_url_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_36 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_36.setPageContext(_jspx_page_context);
    _jspx_th_s_url_36.setParent(null);
    _jspx_th_s_url_36.setValue("/js/modernizr.custom.29473.js");
    int _jspx_eval_s_url_36 = _jspx_th_s_url_36.doStartTag();
    if (_jspx_th_s_url_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_36);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_36);
    return false;
  }

  private boolean _jspx_meth_s_url_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_37 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_value_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_37.setPageContext(_jspx_page_context);
    _jspx_th_s_url_37.setParent(null);
    _jspx_th_s_url_37.setValue("/Admin/js/login.js");
    int _jspx_eval_s_url_37 = _jspx_th_s_url_37.doStartTag();
    if (_jspx_th_s_url_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_37);
      return true;
    }
    _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_37);
    return false;
  }
}
