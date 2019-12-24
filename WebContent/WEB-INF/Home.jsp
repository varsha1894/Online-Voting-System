<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>ONLINE VOTING SYSTEM</title>

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700' rel='stylesheet' type='text/css'>

<!-- font awesome -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- bootstrap -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/bootstrap/css/bootstrap.min.css" />

<!-- animate.css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/animate/animate.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/animate/set.css" />

<!-- gallery -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/assets/gallery/blueimp-gallery.min.css">

<!-- favicon -->
<!--<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="icon" href="images/favicon.ico" type="image/x-icon">-->


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
              <a class="navbar-brand" href="#home"><img src="${pageContext.request.contextPath}/Resources/images/8.jpg"  height="70px"  alt="logo"></a>
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
                <li ><a href="login">Login</a></li>                
              </ul>
            </div>
            <!-- #Nav Ends -->

          </div>
        </div>

      </div>
    </div>
<!-- #Header Starts -->




<div id="home">
<!-- Slider Starts -->
<div id="myCarousel" class="carousel slide banner-slider animated flipInX" data-ride="carousel">     
      <div class="carousel-inner">
        <!-- Item 1 -->
        <div class="item active">
          <img src="${pageContext.request.contextPath}/Resources/images/back1.jpg" alt="banner">          
            <div class="carousel-caption">
            	<div class="caption-wrapper">
            		<div class="caption-info">
            		<!--<img src="images/logobig.png" class="animated bounceInUp" alt="logo">-->
              		<h1 class="animated bounceInLeft">ONLINE VOTING SYSTEM</h1>
              		<p class="animated bounceInRight">Every vote matters .Every vote count</p>
              		<div class="animated fadeInUp"><a href="organizer" class="btn btn-default"><i class="fa fa-flask"></i>Register as organizer</a> </div>
              		</div>
              	</div>
            </div>
        </div>
        <!-- #Item 1 -->

        <!-- Item 1 -->
        <div class="item">
          <img src="${pageContext.request.contextPath}/Resources/images/back2.jpg" alt="banner">          
             <div class="carousel-caption">
            	<div class="caption-wrapper">
            		<div class="caption-info">
                <!--<img src="images/logobig.png" class="animated bounceInUp" alt="logo">-->
                  <h1 class="animated bounceInLeft">ONLINE VOTING SYSTEM</h1>
                  <p class="animated bounceInRight">Every vote matters .Every vote count</p>
                  <div class="animated fadeInUp"><a href="organizer" class="btn btn-default"><i class="fa fa-flask"></i>Register as organizer</a> </div>
                  </div>
                </div>
            </div>
        </div>
        <!-- #Item 1 -->

        <!-- Item 1 -->
        <div class="item">
          <img src="${pageContext.request.contextPath}/Resources/images/back3.jpg" alt="banner">          
             <div class="carousel-caption">
            	<div class="caption-wrapper">
            		<div class="caption-info">
                <!--<img src="images/logobig.png" class="animated bounceInUp" alt="logo">-->
                  <h1 class="animated bounceInLeft">ONLINE VOTING SYSTEM</h1>
                  <p class="animated bounceInRight">Every vote matters .Every vote count</p>
                  <div class="animated fadeInUp"><a href="organizer" class="btn btn-default"><i class="fa fa-flask"></i>Register as organizer</a> </div>
                  </div>
                </div>
            </div>
        </div>
        <!-- #Item 1 -->

        <!-- Item 1 -->
        <div class="item">
          <img src="${pageContext.request.contextPath}/Resources/images/back4.jpg" alt="banner">          
             <div class="carousel-caption">
            	<div class="caption-wrapper">
            		<div class="caption-info">
                <!--<img src="images/logobig.png" class="animated bounceInUp" alt="logo">-->
                  <h1 class="animated bounceInLeft">ONLINE VOTING SYSTEM</h1>
                  <p class="animated bounceInRight">Every vote matters .Every vote count</p>
                  <div class="animated fadeInUp"><a href="organizer" class="btn btn-default"><i class="fa fa-flask"></i>Register as organizer</a> </div>
                  </div>
                </div>
            </div>
        </div>
        <!-- #Item 1 -->
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon-chevron-left"><i class="fa fa-angle-left"></i></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon-chevron-right"><i class="fa fa-angle-right"></i></span></a>
    </div>
<!-- #Slider Ends -->
</div>









<!-- Cirlce Starts -->
<div id="about"  class="container spacer about">
<h2 class="text-center wowload fadeInUp">ABOUT ONLINE VOTING SYSTEM </h2>  
  <div class="row">
  <div class="col-sm-6 wowload fadeInLeft">
    <h4><i class="fa fa-paint-brush"></i>ABOUT</h4>
	<p>Online voting system is to develop an online application like online reservation system, for citizens who are above 18 years of age to vote through online. Using these system citizens of India can vote through online without visiting polling booth. A centralized database is maintained by election commission of India where citizens information is maintained when ever citizen is using online voting system his/her information is authenticated with the data present in database if user is not in the list he cannot use online voting system.</p>

  </div>
  <div class="col-sm-6 wowload fadeInRight">
  <h4> Working</h4>
  <p>Users are provided with a online registration form before voting user should fill online form and submit details these details are compared with details in database and if they match then user is provided with username and password using this information user can login and vote. If conditions are not correct entry will be canceled.</p>    
  </div>
  </div>

  <!--<div class="process">
  <h3 class="text-center wowload fadeInUp">Process</h3>
	<ul class="row text-center list-inline  wowload bounceInUp">
   		<li>
            <span><i class="fa fa-history"></i><b>Research</b></span>
        </li>
        <li>
            <span><i class="fa fa-puzzle-piece"></i><b>Plan</b></span>
        </li>
        <li>
            <span><i class="fa fa-database"></i><b>Develop</b></span>
        </li>
        <li>
            <span><i class="fa fa-magic"></i><b>Integration</b></span>
        </li>        
        <li>
            <span><i class="fa fa-cloud-upload"></i><b>Deliver</b></span>
        </li>
  	</ul>
  </div>
</div>-->
<!-- #Cirlce Ends -->


<!-- works -->
<div id="works"  class=" clearfix grid"> 
    <figure class="effect-oscar  wowload fadeInUp imagesize">
    
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/1.jpg" ></iframe>
        <figcaption>
            <h2>Commitment</h2>
            <p>Voting is the expression of our commitment to ourselves,one another,this country and this world<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/1.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
     <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/2.jpg" ></iframe>
        <figcaption>
             <h2>People</h2>
            <p>Voting is the most precious right of every citizen, and we have a moral obligation to ensure the integrity of our voting process<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/2.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
 <!--      <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/3.jpg" ></iframe>
        <figcaption>
            <h2>Count</h2>
            <p>Your people need to vote.They need to get out there.Every vote counts.Educate yourself too.Dont just vote.Know what you're voting for,and stand by that.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/3.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
     <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/4.jpg" ></iframe>
        <figcaption>
            <h2>Democracy</h2>
            <p>Democracy must be something more than two wolves and a sheep voting on what to have for dinner.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/4.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>-->
     <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/5.jpg" ></iframe>
        <figcaption>
            <h2>Voting</h2>
            <p>Voting is a right best excercised by people who have taken time to learn about the issues.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/5.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption> 
    </figure>
     
     <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/6.jpg" ></iframe>
        <figcaption>
            <h2>Right</h2>
            <p>We must continue to have voting rights in the state,not to politicize this,but they must have a voice in the rebuilding effort in the community from which they have been displaced.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/6.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
  <!--   <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/7.jpg" ></iframe>
        <figcaption>
            <h2>Citizen</h2>
            <p>As a citizen,you need to know how to be a part of it,how to express yourself-and not just by voting.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/7.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
    <figure class="effect-oscar  wowload fadeInUp imagesize">
        <iframe src="${pageContext.request.contextPath}/Resources/images/portfolio/8.jpg" ></iframe>
        <figcaption>
            <h2>Quote</h2>
            <p>It's not the voting that's democracy;it's the counting.<br>
            <a href="${pageContext.request.contextPath}/Resources/images/portfolio/8.jpg" title="1" data-gallery>View more</a></p>            
        </figcaption>
    </figure>
-->
     
</div>
<!-- works -->


<!--<div id="partners" class="container spacer ">
	<h2 class="text-center  wowload fadeInUp">Some of our happy clients</h2>
  <div class="clearfix">
    <div class="col-sm-6 partners  wowload fadeInLeft">
         <img src="images/partners/1.jpg"  alt="partners">
         <img src="images/partners/2.jpg"  alt="partners">
         <img src="images/partners/3.jpg" alt="partners">
         <img src="images/partners/4.jpg" alt="partners">
    </div>
    <div class="col-sm-6">-->


    <!--<div id="carousel-testimonials" class="carousel slide testimonails  wowload fadeInRight" data-ride="carousel">
    <div class="carousel-inner">  
      <div class="item active animated bounceInRight row">
      <div class="animated slideInLeft col-xs-2"><img alt="portfolio" src="images/team/1.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p> I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. </p>      
      <span>Angel Smith - <b>eshop Canada</b></span>
      </div>
      </div>-->
     <!-- <div class="item  animated bounceInRight row">
      <div class="animated slideInLeft col-xs-2"><img alt="portfolio" src="images/team/2.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful.</p>
      <span>John Partic - <b>Crazy Pixel</b></span>
      </div>
      </div>
      <div class="item  animated bounceInRight row">
      <div class="animated slideInLeft  col-xs-2"><img alt="portfolio" src="images/team/3.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue.</p>
      <span>Harris David - <b>Jet London</b></span>
      </div>
      </div>
  </div>-->

   <!-- Indicators -->
   	<ol class="carousel-indicators">
    <li data-target="#carousel-testimonials" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-testimonials" data-slide-to="1"></li>
    <li data-target="#carousel-testimonials" data-slide-to="2"></li>
  	</ol>
  	<!-- Indicators -->
  </div>



    </div>
  </div>


<!-- team -->
<!--<h3 class="text-center  wowload fadeInUp">Our team</h3>
<p class="text-center  wowload fadeInLeft">Our creative team that is making everything possible</p>
<div class="row grid team  wowload fadeInUpBig">	
	<div class=" col-sm-3 col-xs-6">
	<figure class="effect-chico">
        <img src="images/team/8.jpg" alt="img01" class="img-responsive" />
        <figcaption>
            <p><b>Barbara Husto</b><br>Senior Designer<br><br><a href="#"><i class="fa fa-dribbble"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i></a></p>            
        </figcaption>
    </figure>
    </div>

    <div class=" col-sm-3 col-xs-6">
	<figure class="effect-chico">
        <img src="images/team/10.jpg" alt="img01"/>
        <figcaption>            
            <p><b>Barbara Husto</b><br>Senior Designer<br><br><a href="#"><i class="fa fa-dribbble"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i></a></p>            
        </figcaption>
    </figure>
    </div>

    <div class=" col-sm-3 col-xs-6">
	<figure class="effect-chico">
        <img src="images/team/12.jpg" alt="img01"/>
        <figcaption>
            <p><b>Barbara Husto</b><br>Senior Designer<br><br><a href="#"><i class="fa fa-dribbble"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i></a></p>          
        </figcaption>
    </figure>
    </div>

    <div class=" col-sm-3 col-xs-6">
	<figure class="effect-chico">
        <img src="images/team/17.jpg" alt="img01"/>
        <figcaption>
            <p><b>Barbara Husto</b><br>Senior Designer<br><br><a href="#"><i class="fa fa-dribbble"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i></a></p>
        </figcaption>
    </figure>
    </div>

 
</div>-->
<!-- team -->

</div>









<!-- About Starts -->
<div class="highlight-info">
<div class="overlay spacer">
<div class="container">
<div class="row text-center  wowload fadeInDownBig">
	<div class="col-sm-3 col-xs-6">
	<i class="fa fa-smile-o  fa-6x"></i><h4>1 Country</h4>
	</div>
	<!--<div class="col-sm-3 col-xs-6">
	<i class="fa fa-rocket  fa-5x"></i><h4>75 Projects</h4>
	</div>-->
	<div class="col-sm-3 col-xs-6">
	<i class="fa fa-cloud-download  fa-6x"></i><h4>100 candidates</h4>
	</div>
	<div class="col-sm-3 col-xs-6">
	<i class="fa fa-map-marker fa-6x"></i><h4>Million voters</h4>
	</div>
</div>
</div>
</div>
</div>
<!-- About Ends -->








<!--<div id="contact" class="spacer">-->
<!--Contact Starts-->
<!--<div class="container contactform center">
<h2 class="text-center  wowload fadeInUp">Get in touch to start your project</h2>
  <div class="row wowload fadeInLeftBig">      
      <div class="col-sm-6 col-sm-offset-3 col-xs-12">      
        <input type="text" placeholder="Name">
        <input type="text" placeholder="Company">
        <textarea rows="5" placeholder="Message"></textarea>
        <button class="btn btn-primary"><i class="fa fa-paper-plane"></i> Send</button>
      </div>
  </div>



</div>
</div>-->
<!--Contact Ends-->



<!-- Footer Starts -->
<div class="footer text-center spacer">
<p class="wowload flipInX"><a href="#"><i class="fa fa-facebook fa-2x"></i></a> <a href="#"><i class="fa fa-dribbble fa-2x"></i></a> <a href="#"><i class="fa fa-twitter fa-2x"></i></a> <a href="#"><i class="fa fa-linkedin fa-2x"></i></a> </p>
Copyright 2016 Online Voting System. All rights reserved.
</div>
<!-- # Footer Ends -->
<a href="#home" class="gototop "><i class="fa fa-angle-up  fa-3x"></i></a>





<!-- The Bootstrap Image Gallery lightbox, should be a child element of the document body -->
<div id="blueimp-gallery" class="blueimp-gallery blueimp-gallery-controls">
    <!-- The container for the modal slides -->
    <div class="slides"></div>
    <!-- Controls for the borderless lightbox -->
    <h3 class="title">title</h3>
    <a class="prev">‹</a>
    <a class="next">›</a>
    <a class="close">×</a>
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
<script src="${pageContext.request.contextPath}/Resources/assets/gallery/jquery.blueimp-gallery.min.js"></script>

<!-- custom script -->
<script src="${pageContext.request.contextPath}/Resources/assets/script.js"></script>

</body>
</html>