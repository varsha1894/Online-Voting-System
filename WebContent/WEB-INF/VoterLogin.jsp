<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Online voting system</title>

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700' rel='stylesheet' type='text/css'>

<!-- font awesome -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- bootstrap -->
 
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/bootstrap/css/bootstrap.min.css" />

<!-- animate.css -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/animate/animate.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/animate/set.css" />

<!-- gallery -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/gallery/blueimp-gallery.min.css">

<!-- favicon -->
<link rel="shortcut icon" href="${pageContext.request.contextPath}/Resources/images/favicon.ico" type="image/x-icon">
<link rel="icon" href="${pageContext.request.contextPath}/Resources/images/favicon.ico" type="image/x-icon">


<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/style.css">

</head>

<body>
<div class="topbar animated fadeInLeftBig"></div>

<!-- Header Starts -->
<div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-default navbar-fixed-top" role="navigation" id="top-nav">
          <div class="container">
            <div class="navbar-header">
              <!-- Logo Starts -->
              <a class="navbar-brand" href="#home"><img src="${pageContext.request.contextPath}/Resources/images/8.jpg"  height="70px" alt="logo"></a>
              <!-- #Logo Ends -->


              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>

            </div>


            <!-- Nav Starts -->
            <div class="navbar-collapse  collapse">
              <ul class="nav navbar-nav navbar-right">
                 <li class="active"><a href="home">Home</a></li>
                 <li ><a href="home#about">About</a></li>
                 <li ><a href="home#contact">Contact</a></li>                 
              </ul>
            </div>
            <!-- #Nav Ends -->

          </div>
        </div>

      </div>
    </div>
	
	


<div id="contact" class="spacer">
<!--Contact Starts-->
<div class="container contactform center">
<h2 class="text-center  wowload fadeInUp">Get in touch to start your Voting</h2>
  <div class="row wowload fadeInLeftBig">      
      <div class="col-xs-12"> 
<c:if test="${n>0}"> <marquee><h3 class="winner">Winner of this voting is: ${winner}</h3></marquee>    </c:if> 
 
      <h3 id="invalidlogin">${errorMessage}</h3>
      <h3 id="logout">${logout}</h3>
       
       
       <div class=" col-md-6">
            <h3 class="instructhead"> Instructions</h3>
            <h6><ul class="instructions"><li>Voters arrive at website and authenticate their identity (using Login).</li><br/><li>
            If authentication was successful, the voter will be presented with a list of candidates for ongoing election.</li><br/><li>
            If the voter hasn't yet voted, he may click on the Vote. The voter is now blocked from voting for this election again.
           </li><br/><li> Once voting has ended the results are immediately tabulated. You can view the results. Once published, the results are made available to the public on your voting website.
            </li>
            </ul></h6>
       </div>
       
      <div class=" col-sm-offset-1 col-sm-5 jumbotron animated bounce flipInX white right">   
        <h3 id="above">LOGIN</h3>	
        <form:form method="POST" action="/onlinevoting/VoterSubmitLogin" modelAttribute="VoterLogin" >	 
        <input type="text" placeholder="Elector Id" name="electoralId" id="textboxshadow">
        <input type="password" placeholder="Password" name="password" id="textboxshadow">
		
   <!--     <textarea rows="5" placeholder="Message"></textarea>   -->
        <button class="btn btn-primary"><i class="fa fa-paper-plane"></i> Login</button>
        </form:form>
        <br/>
        <p id="clickhere"> To Sign up,<a href="voter"> Click Here</a></p>
        </div>
      </div>
  </div>



</div>
</div>
<!--Contact Ends-->



<!-- Footer Starts -->
<div class="footer text-center spacer">
<p class="wowload flipInX"><a href="#"><i class="fa fa-facebook fa-2x"></i></a> <a href="#"><i class="fa fa-dribbble fa-2x"></i></a> <a href="#"><i class="fa fa-twitter fa-2x"></i></a> <a href="#"><i class="fa fa-linkedin fa-2x"></i></a> </p>
Copyright 2014 Cyrus Creative Studio. All rights reserved.
</div>
<!-- # Footer Ends -->
<a href="#home" class="gototop "><i class="fa fa-angle-up  fa-3x"></i></a>





<!-- The Bootstrap Image Gallery lightbox, should be a child element of the document body -->
<div id="blueimp-gallery" class="blueimp-gallery blueimp-gallery-controls">
    <!-- The container for the modal slides -->
    <div class="slides"></div>
    <!-- Controls for the borderless lightbox -->
    <h3 class="title">title</h3>
    <a class="prev"></a>
    <a class="next"></a>
    <a class="close"></a>
    <!-- The modal dialog, which will be used to wrap the lightbox content -->    
</div>



<!-- jquery -->

<script src="${pageContext.request.contextPath}/Resources/assets/jquery.js"></script>

<!-- wow script -->

<script src="${pageContext.request.contextPath}/Resources/assets/wow/wow.min.js"></script>


<!-- boostrap -->

<script src="${pageContext.request.contextPath}/Resources/assets/bootstrap/js/bootstrap.js" type="text/javascript" ></script>

<!-- jquery mobile -->

<script src="${pageContext.request.contextPath}/Resources/assets/mobile/touchSwipe.min.js"></script>
<script src="${pageContext.request.contextPath}/Resources/assets/respond/respond.js"></script>

<!-- gallery -->

<script src="${pageContext.request.contextPath}/Resources/assets/gallery/blueimp-gallery.min.js"></script>

<!-- custom script -->

<script src="${pageContext.request.contextPath}/Resources/assets/script.js"></script>

</body>
</html>