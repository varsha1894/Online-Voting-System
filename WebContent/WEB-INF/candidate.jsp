<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
<script type="text/javascript">
var count=0;
<% String website=(String)session.getAttribute("website");%>
</script>

<SCRIPT >

function add(type) {
	
	//Create an input type dynamically.
	var element = document.createElement("input");
	var foo = document.getElementById("fooBar");
	var element1=document.createElement("input");
	var foo1=document.getElementById("fooBar");
	//Assign different attributes to the element.
count++;
	element.type="text";
		element.name="candidate["+count+"].candidateName";
		element.placeholder="Candidate name";
		element1.type="hidden";
		element1.name="candidate["+count+"].website";
		element1.value="<%=website%>";
	foo.appendChild(element);
	foo1.appendChild(element1);
	

	//Append the element in page (in span).

}
</SCRIPT>
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
              <a class="navbar-brand" href="home"><img src="${pageContext.request.contextPath}/Resources/images/8.jpg"  height="70px" alt="logo"></a>
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
                 <li ><a href="#about">About</a></li>
                 <li ><a href="#contact">Contact</a></li>                 
             <li ><a href="logout">Log Out</a></li>   
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
<br/>
<h2 class="text-center  wowload fadeInUp">Voting Details</h2>
  <div class="row wowload fadeInLeftBig">      
      <div class="col-sm-5 col-sm-offset-3 col-xs-12"> 
      <h2>${errorMessage}</h2>
      <h4><%
		if (session != null) {
			if (session.getAttribute("website") != null) {
				String name = (String) session.getAttribute("organizerName");
				
				out.print("Hello,<b> " + name + " </b><br/> Welcome to ur Profile website: <b>"+website);
			} else {
				response.sendRedirect("login.html");
			}
		}
	%></b></h4>
       
    <form:form action="/onlinevoting/SubmitCandidate" Method="post" modelAttribute="Candidates">
    
    
   	 <h2 class="text-center  wowload fadeInUp">Add Candidate </h2>	
	
	   <input type="hidden" name="candidate[0].website"  value="<%=website%>">
       
<input type="text" name="candidate[0].candidateName" placeholder="Candidate Name">       
 <INPUT type="button" value="Do you want to enter more Candidates" onclick="add('text')"/>

<span id="fooBar">&nbsp;</span>        
	    
        <button class="btn btn-primary"><i class="fa fa-paper-plane"></i> Submit</button>
      </form:form>
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