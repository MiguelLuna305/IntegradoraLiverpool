<%-- 
    Document   : singleblog
    Created on : 10-oct-2015, 21:37:19
    Author     : Sandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>

<!-- Basic Page Needs ================================================== 
================================================== -->

<meta charset="utf-8">
<title>Liverpool</title>
<meta name="description" content="Place to put your description text">
<meta name="author" content="">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

<!-- Mobile Specific Metas ================================================== 
================================================== -->

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">

<!-- CSS ==================================================
================================================== -->
<style type="text/css">
    
    <%@include file="/CSS/base.css" %>

    <%@include file="/CSS/skeleton.css" %>
     
    <%@include file="/CSS/screen.css" %>
    
    <%@include file="/CSS/prettyPhoto.css"%>
</style>
<link rel="stylesheet" href="css/base.css">
<link rel="stylesheet" href="css/skeleton.css">
<link rel="stylesheet" href="css/screen.css">
<link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="screen" />

<!-- Favicons ==================================================
================================================== -->

<link rel="shortcut icon" href="images/favicon.png">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">

<!-- Google Fonts ==================================================
================================================== -->
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
</head>
<body> 

<!--Content Part ==================================================
================================================== -->
<div id="header">
  <div class="container"> 
    <!-- Header | Logo, Menu
		================================================== -->
    <link rel="shortcut icon" href="<s:url value='/images/imgr.png'/>"> <!--cambiar en todas-->
<div class="mainmenu">
      <div id="mainmenu">
        <ul class="sf-menu">
           <li><a href="<s:url value='/JSP/Index.jsp'/>" id="visited">Home</a></li>
          <li><a href="<s:url value='/JSP/about.jsp'/>">About</a></li>
          <li><a href="<s:url value='/JSP/portfolio.jsp'/>">Portfolio</a>
            <ul>
              <li><a href="<s:url value='/JSP/portfolioproject.jsp'/>">Portfolio Project</a></li>
            </ul>
          </li>
          <li><a href="<s:url value='/JSP/blog.jsp'/>">Blog</a>
            <ul>
              <li><a href="<s:url value='/JSP/singleblog.jsp'/>">Single Post</a></li>
            </ul>
          </li>
          <li><a href="<s:url value='/JSP/features.jsp'/>">Features</a></li>
          <li><a href="<s:url value='/JSP/contact.jsp'/>">Contact</a></li>
        </ul>
      </div>
      <!-- mainmenu ends here --> 
      
      <!-- Responsive Menu -->
      <form id="responsive-menu" action="#" method="post">
        <select>
          <option value=''>Navigation</option>
          <option value='/JSP/index.jsp'>Home</option>
          <option value='/JSP/about.jsp'>About</option>
          <option value='/JSP/portfolio.jsp'>Portfolio</option>
          <option value='/JSP/portfolioproject.jsp'>Portfolio Project</option>
          <option value='/JSP/blog.jsp'>Blog</option>
          <option value='/JSP/singleblog.jsp'>Single Post</option>
          <option value='/JSP/features.jsp'>Features</option>
          <option value='/JSP/contact.jsp'>Contact</option>
        </select>
      </form>
    </div>
    <!-- mainmenu ends here --> 
  </div>
  <!-- container ends here --> 
</div>
<!-- header ends here --> 
<!--Breadcrumbs ==================================================
================================================== -->
<div class="breadcrumbs">
  <div class="container">
    <header>
      <h3>Blog Single Post Page</h3>
      <p>- Free, fully <span class="pink">responsive HTML</span> site template made by <a href="http://www.anarieldesign.com/" rel="nofollow"><strong>Anariel Design</strong></a> -</p>
    </header>
  </div>
  <!-- container ends here -->
  <hr class="separator1">
</div>
<!-- breadcrumbs ends here --> 
<!-- Blog Single ==================================================
================================================== -->
<div class="container">
  <section class="slider">
    <div class="flexslider">
      <ul class="slides">
        <li> <img src="images/flexslider/1.jpg" alt=""/></li>
        <li> <img src="images/flexslider/2.jpg" alt="" /></li>
        <li> <img src="images/flexslider/3.jpg" alt="" /></li>
      </ul>
    </div>
    <!-- flexslider ends here --> 
  </section>
  <!-- slider ends here -->
  <hr class="separator1">
  <p>Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. <span class="green">Semper</span> sit amet bibendum ac, tincidunt sit <span class="green">Semper</span> amet eros. In scelerisque vestibulum tempor. Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque <span class="green">semper</span> vestibulum tempor.  Sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor.</p>
  <p class="quote">Donec commodo tortor pellentesque nisl <span class="red">cursus volutpat</span>. Sed sit amet odio et magna tempor posuere vestibulum ac risus. Sed  nec magna dolor. Donec commodo tortor pellentesque nisl . Sed sit amet odio et magna tempor posuere <span class="red">cursus volutpat</span> vestibulum ac risus. Sed nec magna dolor.</p>
  <p>Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. <span class="green">Semper</span> sit amet bibendum ac, tincidunt sit <span class="green">Semper</span> amet eros. In scelerisque vestibulum tempor. Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor. Semper sit amet bibendum ac, tincidunt sit amet eros. In scelerisque <span class="green">semper</span> vestibulum tempor.  Sit amet bibendum ac, tincidunt sit amet eros. In scelerisque vestibulum tempor.</p>
  <p class="quote">Donec commodo tortor pellentesque nisl <span class="red">cursus volutpat</span>. Sed sit amet odio et magna tempor posuere vestibulum ac risus. Sed  nec magna dolor. Donec commodo tortor pellentesque nisl . Sed sit amet odio et magna tempor posuere <span class="red">cursus volutpat</span> vestibulum ac risus. Sed nec magna dolor.</p>
</div>
<!-- container ends here --> 

<!-- Socialize ==================================================
================================================== -->
<hr class="separator2">
<div class="socialsblock">
  <div class="container socialize">
    <h3>Socialize with us!</h3>
    <section class="socials">
      <ul class="socials">
        <li><a href="#"><img src="images/socials/twitter.png" alt="" /></a></li>
        <li><a href="#"><img src="images/socials/facebook.png" alt="" /></a></li>
        <li><a href="#"><img src="images/socials/dribbble.png" alt="" /></a></li>
        <li><a href="#"><img src="images/socials/google+.png" alt="" /></a></li>
        <li><a href="#"><img src="images/socials/linkedin.png" alt="" /></a></li>
        <li><a href="#"><img src="images/socials/youtube.png" alt="" /></a></li>
      </ul>
    </section>
  </div>
  <!-- container ends here --> 
</div>
<!-- socialsblock ends here --> 
<!-- Footer ==================================================
================================================== -->
<div class="footer">
  <div class="container">
    <div class="one_fourth">
      <h3>Contact Informations</h3>
      <p><span class="orange"><strong>Address:</strong></span> <br>
        No.2 - 123678 street name City, Country</p>
      <p><span class="orange"><strong>Phone:</strong></span> <br>
        + 9 (094) 067 93567<br>
      </p>
      <p><span class="orange"><strong>Email:</strong></span> <br>
        info@yoursite.com<br>
      </p>
    </div>
    <!-- four columns ends here -->
    <div class="one_fourth">
      <h3>Blogroll</h3>
      <ul>
        <li><a href="#" title="">Development Blog</a></li>
        <li><a href="#" class="">New Freebies</a></li>
        <li><a href="#" class="">Themeforest Theme</a></li>
        <li><a href="#" class=""> Design News</a></li>
        <li><a href="#" class="">WordPress Theme</a></li>
      </ul>
    </div>
    <!-- four columns ends here -->
    <div class="one_fourth">
      <h3>Archive</h3>
      <ul>
        <li><a href="#" class=""> August 2012</a></li>
        <li><a href="#" class="">July 2012</a></li>
        <li><a href="#" class="">Juny 2012</a></li>
        <li><a href="#" class=""> May 2012</a></li>
        <li><a href="#" class="">April 2012</a></li>
      </ul>
    </div>
    <!-- four columns ends here -->
    <div class="one_fourth lastcolumn">
      <h3>About</h3>
      <p>Freebix is responsive, simple and clean template with a lot attention to detail. Get it now!</p>
      <p>Visit <a href="http://anarieldesign.com/" rel="nofollow">Anariel Design</a> and find more interesting things.</p>
    </div>
    <!-- four columns ends here --> 
  </div>
  <!-- container ends here --> 
</div>
<!-- footer ends here --> 
<!-- Copyright ==================================================
================================================== -->
<div id="copyright">
  <div class="container">
    <p class="copyright">&copy; Copyright 2013. &quot;Freebix&quot; by <a href="http://www.anarieldesign.com/" rel="nofollow">Anariel Design</a>. All rights reserved.</p>
  </div>
  <!-- container ends here --> 
</div>
<!-- copyright ends here --> 
<!-- End Document
================================================== --> 
<!-- Scripts ==================================================
================================================== --> 
<script src="<s:url value='/js/jquery-1.8.0.min.js'/>"type="text/javascript"></script> 
<!-- Main js files --> 
<script src="<s:url value='/js/screen.js'/>" type="text/javascript"></script> 
<!-- Tabs --> 
<script src="<s:url value='/js/tabs.js'/>"type="text/javascript"></script> 
<!-- Include prettyPhoto --> 
<script src="<s:url value='/js/jquery.prettyPhoto.js'/>" type="text/javascript"></script> 
<!-- Include Superfish --> 
<script src="<s:url value='/js/superfish.js'/>" type="text/javascript"></script> 
<script src="<s:url value='/js/hoverIntent.js'/>" type="text/javascript"></script> 
<!-- Flexslider --> 
<script src="<s:url value='/js/jquery.flexslider-min.js'/>"type="text/javascript"></script> 
<!-- Modernizr --> 
<script type="text/javascript" src="<s:url value='/js/modernizr.custom.29473.js'/>"></script>
</body>
</html>
