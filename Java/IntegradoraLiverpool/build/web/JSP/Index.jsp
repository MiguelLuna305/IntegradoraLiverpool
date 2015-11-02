<%-- 
    Document   : Index
    Created on : 10-oct-2015, 19:52:36
    Author     : Sandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<!--<![endif]-->
<head>

<!-- Basic Page Needs ================================================== 
================================================== -->

<meta charset="utf-8">
<title>Liverpool</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="Place to put your description text">
<meta name="author" content="">
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
    <%@include file="/Admin/css/style.css" %>
</style>

<link rel="stylesheet" href="CSS/base.css"/>
<link rel="stylesheet" href="CSS/skeleton.css">
<link rel="stylesheet" href="CSS/screen.css">
<link rel="stylesheet" href="CSS/prettyPhoto.css" type="text/css" media="screen" />

<!-- Favicons ==================================================
================================================== -->

<link rel="shortcut icon" href="<s:url value='/images/imgr.png'/>"> <!--cambiar en todas-->
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
    <div class="logo"><img src="<s:url value='/images/oie_transparent.png'/>" style='float:left'/></div>
    
   
    
    <div class="mainmenu">
      <div id="mainmenu">
        <ul class="sf-menu">
          <li><a href="<s:url value='/JSP/Index.jsp'/>" id="visited">Inicio</a></li>
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
          <li><a href="<s:url value='/JSP/contact.jsp'/>">Contact</a></li>
         <!--- <li> <a href="#" id="loginButton"><span>Login</span></a></li>-->
         <li><a href="<s:url value='#'/> " id="loginButton"><span>Iniciar sesión</span></a></li>
         <div style="clear:both"></div>
                <div id="loginBox">                
                    <s:form action="loginForm">
                        <fieldset id="body">
                            
                            <fieldset>
                                <label for="email">Correo</label>
                                <input type="text" name="email" id="email" />
                            </fieldset>
                            <fieldset>
                                <label for="password">Contraseña</label>
                                <input type="password" name="password" id="password" />
                            </fieldset>
                            <s:submit id="login" value="Aceptar"/>
                           <!-- <label for="checkbox"><input type="checkbox" id="checkbox" />Remember me</label>-->
                        </fieldset>
                       <!--- <span><a href="#">Forgot your password?</a></span>-->
                    </s:form>
                </div>
            </div>
        
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
           <option value='/Admin/login.jsp'>Login</option>
        </select>
      </form>
    </div>
    <!-- mainmenu ends here --> 
  </div>
  <!-- container ends here --> 
</div>
<!-- header ends here --> 
<!-- Slider ==================================================
================================================== -->
<section class="slider">
  <div class="flexslider">
    <ul class="slides">
      <li> <a href="#"><img  src="<s:url value='/images/flexslider/liverpool.jpg'/>" alt=""/></a>
      
      </li>
      <li> <img src="<s:url value='/images/flexslider/liverpool3.jpg'/>" alt="" />
       
      </li>
      <li> <a href="#"><img src="<s:url value='/images/flexslider/liverpool5.jpeg'/>" alt="" /></a>
        
      </li>
        
         <li> <a href="#"><img  src="<s:url value='/images/flexslider/liverpool1.jpg'/>" alt="" /></a>
        
      </li>
        
         <li> <a href="#"><img src="<s:url value='/images/flexslider/liverpool2.jpg'/>" alt="" /></a>
        
      </li>
        
    
        <li> <a href="#"><img src="<s:url value='/images/flexslider/liverpool6.jpg'/>" alt="" /></a>
        
      </li>
        <li> <a href="#"><img  src="<s:url value='/images/flexslider/liverpool7.jpg'/>" alt="" /></a>
        
      </li>
    </ul>
  </div>
  <!-- flexslider ends here --> 
</section>
<!-- slider ends here --> 
<!-- info Box ==================================================
================================================== -->
<div class="infobox">
  <div class="container info">
    <header>
      <h1>Categorías de productos</h1>
     <!-- <p class="infop"><strong>Liverpool, </strong> es parte de tu vida.</p>-->
    </header>
    <hr class="separator">
  </div>
  <!-- container ends here --> 
</div>
<!-- infobox ends here --> 
<!--Latest Photos ==================================================
================================================== -->
<!-- Portfolio ==================================================
================================================== -->
<div class="container portfolio">
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/belleza.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Belleza</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/ropaDama.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Ropa para dama</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third lastcolumn shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/ropaCaba.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Ropa para caballero</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/ropaI.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Ropa infantil</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/juguetes.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Juguetes</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third lastcolumn shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/lineaBlanca.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Línea blanca</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/deporte.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Deportes</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/computacion.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Computación</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third lastcolumn shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/muebles.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Muebles</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/tecnologia.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Tecnología</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/salud.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Salud</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third-->
  <div class="one_third lastcolumn shadow">
    <div class="view view-first"> <img alt="" src="<s:url value='/images/portafolio/hogar.jpg'/>"/>
      <div class="mask">
        <h2><a href="#">Hogar</a></h2>
      </div>
      <!-- mask ends here --> 
    </div>
    <!-- view ends here --> 
  </div>
  <!--end one_third--> 
</div>

<div class="headingblock">
 
</div>
<!-- headingblock ends here --> 
<!-- Latest News & Faq ==================================================
================================================== -->
<div class="container latest">
  
  <!-- two_third ends here -->

  <!-- one_third ends here --> 
</div>
<!-- end container --> 
<!-- Socialize ==================================================
================================================== -->

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
<script src="<s:url value='/js/tabs.js'/>" type="text/javascript"></script> 
<!-- Include prettyPhoto --> 
<script src="<s:url value='/js/jquery.prettyPhoto.js'/>" type="text/javascript"></script> 
<!-- Include Superfish --> 
<script src="<s:url value='/js/superfish.js'/>" type="text/javascript"></script> 
<script src="<s:url value='/js/hoverIntent.js'/>" type="text/javascript"></script> 
<!-- Flexslider --> 
<script src="<s:url value='/js/jquery.flexslider-min.js'/>" type="text/javascript"></script> 
<!-- Modernizr --> 
<script type="text/javascript" src="<s:url value='/js/modernizr.custom.29473.js'/>"></script>
<script src="<s:url value='/Admin/js/login.js'/>" type="text/javascript"></script> 

</body>
</html>