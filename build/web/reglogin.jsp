

<!DOCTYPE html>
<html lang="en">
<head>
	  <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700i" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Reg or Login | BOOKBUG</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

	<!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


	<link rel="stylesheet" href="css/styl1.css">
	<link rel="stylesheet" href="css/reglogin.css">
	<link rel="stylesheet" href="css/form.css">
	<!-- <link rel="stylesheet" href="css/merchant.css"> -->
	<style media="screen">
	body{
		background: #ecf0f;
}
	</style>
	</head>


	<body>
	  <!-- NAVBAR -->
	  <div class="container navbar">
	      <div class="name">Hi, Guest</div>
	        <a class="account-container" href="reglogin.jsp">
	            <i class="fa fa-user" aria-hidden="true"></i>
	            <div class="cart-desc">Login / Register</div>
	        </a>
	        <!-- <div class="dropdown-con">
	          <p>Hello World!</p>
	        </div> -->
	        <a class="cart-container" href="cart.jsp">
	          <i class="fa fa-shopping-cart" aria-hidden="true"></i>
	          <div class="cart-desc">0 items</div>
	        </a>

	  </div><hr>
	<header class="container-fluid header">

	    <div class="container cf">



	        <a href="indx.jsp"><div class="brand">

	          <img src="log.png" alt="" height="65px" width="95px" style="left: 0; transform: translateY(-35%);">
	           &nbsp;
	          <span>B</span>
	          <span class="hidden">O</span>
	          <span class="hidden">O</span>
	          <span class="hidden">K</span>
	          <span>B</span>
	          <span class="hidden">U</span>
	          <span class="hidden">G</span>

	        </div></a>

	        <i class="fa fa-bars hamb"></i>

	         <ul>
	            <li><a href="#">Category 1</a></li>
	            <li><a href="#">Category 2</a></li>
	            <li ><a href="shop.jsp" class="">Store</a></li>
	            <li><a href="#">Contact Us</a></li>
	        </ul>

	    </div>
	    <!-- <hr style="border-bottom: 1px solid #000; width: 150%; margin: 0; left : 0; transform: scale(1.2);"> -->
	    <!-- <ul>
	       <li><a href="#">Category 1</a></li>
	       <li><a href="#">Category 2</a></li>
	       <li ><a href="shop.jsp" class="active-class">Browse Products</a></li>
	       <li><a href="#">Contact Us</a></li>
	   </ul> -->

	</header>

         <section class="" id="" >

          <div class="">
          	<div id="splitlayout" class="splitlayout">
          		<div class="intro">
          			<div class="side side-left">
          				<div class="intro-content">
          					<div class="profile"><img src="newuser.png" alt="profile1"></div>
          					<br><br>
          					<h1><span>New User? </span><span>Join Us</span></h1>
										<!-- <a href="#">Register Here</a> -->
          				</div>
          				<div class="overlay"></div>
          			</div>
          			<div class="side side-right">
          				<div class="intro-content">
          					<div class="profile"><img src="exuser.png" alt="profile2"></div>
          					<br><br>
          					<h1><span>Existing User?</span><span>Welcome Back</span></h1>
										<!-- <a href="#">Login Here</a> -->
          				</div>
          				<div class="overlay"></div>
          			</div>
          		</div><!-- /intro -->
          		<div class="page page-right">
          			<div class="page-inner">
          				<section>
          					<h2>Sign In</h2>
										<form id="regForm" action="login" method="post" onclick="return validation()">

										<div class=""> <span class="mid">	 Verify Your Account</span><br>
											<br>


											<!-- <p><input placeholder="Last name..." oninput="this.className = ''"></p> -->
											<p><input  id="mail" name="EmailId" required pattern="[\w]{1,}[\w.+-]{0,}@[\w-]{2,}([.][a-zA-Z]{2,}|[.][\w-]{2,}[.][a-zA-Z]{2,})"
												placeholder="E-Mail Address..." oninput="this.className = ''" autocomplete="off"></p>

											<p><input placeholder="Password.." oninput="this.className = ''" type="password" id="pass" name="Password"
												 pattern="(?=.*\d{2})(?=.*[a-z]{4}.{6}" title="use only 2 numeric 4 charecter" autocomplete="off"></p>
												 <a href="shop.jsp">
													<input type="submit" class=""	value="Sign Up" /></a>
										</div>
									</form>

									</section>
          			</div><!-- /page-inner -->
          		</div><!-- /page-right -->
          		<div class="page page-left">
          			<div class="page-inner">
          				<section>
          					<h2>Sign Up</h2>
										<form id="regForm" action="reg" method="post" onclick="return validation()">

											<!-- <h3>Create Ypur Account</h3> -->

											<!-- One "tab" for each step in the form: -->
											<div class="tab"> <span class="mid">	<span class="number">1</span> &nbsp; Account Info:</span><br>
												<br>


											  <!-- <p><input placeholder="Last name..." oninput="this.className = ''"></p> -->
											  <p><input  id="mail" name="EmailId" required pattern="[\w]{1,}[\w.+-]{0,}@[\w-]{2,}([.][a-zA-Z]{2,}|[.][\w-]{2,}[.][a-zA-Z]{2,})"
													placeholder="E-Mail Address..." oninput="this.className = ''" autocomplete="off"></p>

											  <p><input placeholder="Password.." oninput="this.className = ''" type="password" id="pass" name="Password"
													 pattern="(?=.*\d{2})(?=.*[a-z]{4}.{6}" title="use only 2 numeric 4 charecter" autocomplete="off"></p>
													<p><input placeholder="Confirm Password.." oninput="this.className = ''" type="password" id="cpass" name="Password"
														required pattern="(?=.*\d{2})(?=.*[a-z]{4}.{6}" title="use only 2 numeric 4 charecter" autocomplete="off"></p>
											</div>

											<div class="tab">
												<span class="mid">	<span class="number">2</span> &nbsp;Personal Info:</span><br><br>
												<p><input type="text" id="user" name="Name" required pattern="[a-zA-Z\s]{1,20}" title="Wrong name use only charecter"
													autocomplete="off" placeholder="Enter Your Full Name..." oninput="this.className = ''" ></p>

<!--												<p><label for="date" style="float: left">Birthday:</label>
													<input type="date" id="date" name="bdate" value="yyyy-mm-dd" min="1947-01-01" max="2018-12-31" required></p>
-->

													<p>	<label for="mobileNumber" style="float: left">Mobile Number:</label>
														<input type="text" id="mobileNumber" name="MobileNumber" value="" placeholder="Enter Your Mobile No." required pattern="\d{10}" title="Wrong contact number must be 10 digit use" autocomplete="off" oninput="this.className = ''">
														</p>

													<!-- <label>Gender:</label>
													<label for="male" class="light">Male</label>
														<input type="radio" id="male" value="Male" name="Gender" required>
															<label for="female" class="light">Female</label>
														<input type="radio" id="female" value="Female" name="Gender" required> -->
														<label for="radio-one" style="float: left">Gender:</label><br>
														<p class="gender">

																<input type="radio" id="radio-one" name="Gender" value="Male" checked/>
																<label for="radio-one">Male</label>
																<input type="radio" id="radio-two" name="Gender" value="Female" />
																<label for="radio-two">Female</label>
															</p>

											</div>
											<!-- <div class="tab">Birthday:
											  <p><input placeholder="dd" oninput="this.className = ''"></p>
											  <p><input placeholder="mm" oninput="this.className = ''"></p>
											  <p><input placeholder="yyyy" oninput="this.className = ''"></p>
											</div> -->

											<div class="tab">
												<span class="mid">	<span class="number">3</span> &nbsp;Shipping Info:</span><br><br>
												<label for="bio">Address:</label>
							           <textarea id="add" name="Address" required></textarea>

							          <label for="zip">Pincode:</label>
							           <input type="zip" id="pin" name="Pincode" required pattern="\d{6}" title="Invalid Pincode" autocomplete="off">
												 <!-- <input type="submit" class="" value="Sign Up" /> -->
                                                                                                 <input type="submit" value="Submit">
											</div>

											<div style="overflow:auto;">
											  <div style="float:right;">
											    <button type="submit" id="prevBtn" onclick="nextPrev(-1)"><a href="#">Previous </a></button>
											    <button type="submit" id="nextBtn" onclick="nextPrev(1)"><a href="#">Next </a></button>
											  </div>
											</div>

											<!-- Circles which indicates the steps of the form: -->
											<div style="text-align:center;margin-top:40px;">
											  <span class="step"></span>
											  <span class="step"></span>
											  <span class="step"></span>
											  <!-- <span class="step"></span> -->
											</div>

											</form>
									</section>
          			</div><!-- /page-inner -->
          		</div><!-- /page-left -->
          		<a href="#" class="back back-right" title="back to intro">&rarr;  Back</a>
          		<a href="#" class="back back-left" title="back to intro">&larr; Back</a>
          	</div><!-- /splitlayout -->
          </div><!-- /container -->
        </section>




<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>



  <script  src="js/index.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $(".side-left .intro-content").click(function(){
    	$(".splitlayout").addClass("open-left");
    	$(".splitlayout").removeClass("close-right reset-layout");

    });

    $(".back-right").click(function(){
			$(".splitlayout").removeClass("open-left");
    	$(".splitlayout").addClass("close-left reset-layout");
    });

    $(".side-right .intro-content").click(function(){
    	$(".splitlayout").addClass("open-right");
    	$(".splitlayout").removeClass("close-left reset-layout");

    });



    $(".back-left").click(function(){
    	$(".splitlayout").removeClass("open-right");
    	$(".splitlayout").addClass("close-right reset-layout");
    });
});




function validation(){


	var password = document.getElementById("pass").value;
	var confirmPassword = document.getElementById("cpass").value;



	if (password != confirmPassword) {


								 document.getElementById('confirmpassword').innerHTML =" ** Passwords do not match";
			 return false;
	}





	return true;
}


///////////////////////////////////
//Registration


//Tab-Switch
var currentTab = 0; // Current tab is set to be the first tab (0)
showTab(currentTab); // Display the current tab

function showTab(n) {
  // This function will display the specified tab of the form ...
  var x = document.getElementsByClassName("tab");
	// var x = 2;
	var abc = 'shop.jsp';
	///////////////// Set the Link
  x[n].style.display = "block";
  // ... and fix the Previous/Next buttons:
  if (n == 0) {
    document.getElementById("prevBtn").style.display = "none";
  }
	// else if (n >= 2) {
  // 	document.getElementById("nextBtn").style.display = "none";
  // }
	else  {
    document.getElementById("prevBtn").style.display = "inline";
  }


  if (n == (x.length - 1)) {
    document.getElementById("nextBtn").innerHTML = "reset";

document.getElementById('nextBtn').innerHTML = '<a href="' + abc + '">Submit</a>';

  } else {
    document.getElementById("nextBtn").innerHTML = "Next";
  }

  fixStepIndicator(n)
}


function nextPrev(n) {
  // This function will figure out which tab to display
  var x = document.getElementsByClassName("tab");
  // Exit the function if any field in the current tab is invalid:
  if (n == 1 && !validateForm()) return false;
  // Hide the current tab:
  x[currentTab].style.display = "none";
  // Increase or decrease the current tab by 1:
  currentTab = currentTab + n;
  // if you have reached the end of the form... :
  if (currentTab >= x.length) {
    //...the form gets submitted:
    document.getElementById("regForm").submit();
    return false;
  }
  // Otherwise, display the correct tab:
  showTab(currentTab);
}

function validateForm() {
  // This function deals with validation of the form fields
  var x, y, i, valid = true;
  x = document.getElementsByClassName("tab");
  y = x[currentTab].getElementsByTagName("input");
  // A loop that checks every input field in the current tab:
  for (i = 0; i < y.length; i++) {
    // If a field is empty...
    if (y[i].value == "") {
      // add an "invalid" class to the field:
      y[i].className += " invalid";
      // and set the current valid status to false:
      valid = false;
    }
  }
  // If the valid status is true, mark the step as finished and valid:
  if (valid) {
    document.getElementsByClassName("step")[currentTab].className += " finish";
  }
  return valid; // return the valid status


	// var password = document.getElementById("pass").value;
	// var confirmPassword = document.getElementById("cpass").value;
	//
	//
	//
	// if (password != confirmPassword) {
	//
	//
	// 							 document.getElementById('confirmpassword').innerHTML =" ** Passwords do not match";
	// 		 return false;
	// }





	// return true;
}

function fixStepIndicator(n) {
  // This function removes the "active" class of all steps...
  var i, x = document.getElementsByClassName("step");
  for (i = 0; i < x.length; i++) {
    x[i].className = x[i].className.replace(" active", "");
  }
  //... and adds the "active" class to the current step:
  x[n].className += " active";
}

</script>
</body>
</html>
