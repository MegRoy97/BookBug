<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Checkout | BOOKBUG</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

<!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<link rel="stylesheet" href="css/styl1.css">
<link rel="stylesheet" href="css/checkout.css">
<!-- <link rel="stylesheet" href="css/merchant.css"> -->
<!-- <link rel="stylesheet" href="css/profile.css"> -->



</head>


<body>
  <!-- NAVBAR -->
  <div class="container navbar">
      <div class="name"><a href="account.jsp">Hi, Guest</a></div>
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


        <!-- <div class="brand">
            <a href="#splash">BOOKBUG</a>
        </div> -->
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
    <!-- <hr style="border-bottom: 1px solid #000; width: 150%; margin: 0; left : 0; transform: scale(1.2); overflow: hidden;"> -->
    <!-- <ul>
       <li><a href="#">Category 1</a></li>
       <li><a href="#">Category 2</a></li>
       <li ><a href="shop.jsp" class="active-class">Browse Products</a></li>
       <li><a href="#">Contact Us</a></li>
   </ul> -->

</header>


<body>
  <h1 id="heading">Checkout Here</h1>
<section class="container">


  <form id="checkout" action="reg" method="post" onclick="">

    <!-- <h3>Create Ypur Account</h3> -->

    <!-- One "tab" for each step in the form: -->
    <div class="col1">
      <span class="mid">
          <span class="number">1</span> &nbsp; Account Info:</span><br>
          <br>
          <p><input type="email" id="mail" name="EmailId" required pattern="[\w]{1,}[\w.+-]{0,}@[\w-]{2,}([.][a-zA-Z]{2,}|[.][\w-]{2,}[.][a-zA-Z]{2,})"
            placeholder="E-Mail Address..." oninput="this.className = ''" autocomplete="off" readonly style="cursor:not-allowed; user-select: none;"></p>


            <span class="mid">	<span class="number">2</span> &nbsp;Shipping Info:</span><br>
            <p><label for="mobileNumber" style="float: left">Registered Name:</label>
              <input type="text" id="user" name="Name" required pattern="[a-zA-Z\s]{1,20}" title="Wrong name use only charecter"
                autocomplete="off" placeholder="Full Name..." oninput="this.className = ''" ></p>

                <!-- <p><input placeholder="Last name..." oninput="this.className = ''"></p> -->


                <p>	<label for="mobileNumber" style="float: left">Registered Contact Number:</label>
                  <input type="text" id="mobileNumber" name="MobileNumber" value="" placeholder="Enter Your Mobile No." required pattern="\d{10}" title="Wrong contact number must be 10 digit use" autocomplete="off" oninput="this.className = ''">
                </p>



            <label for="bio">Address:</label>
             <textarea id="add" name="Address" required></textarea>

            <label for="zip">Pincode:</label>
             <input type="zip" id="pin" name="Pincode" required pattern="\d{6}" title="Invalid Pincode" autocomplete="off">
             <!-- <input type="submit" class="" value="Sign Up" /> -->



    </div>

    <div class="col2">
      <span class="mid"><span class="number">3</span> &nbsp;Shipping Details:</span><br><br>

          <label for="radio-one" style="float: left">Choose Your Shipping Method:</label><br>
          <p class="gender">

              <input type="radio" id="radio-one" name="Method" value="Male" checked/>
              <label for="radio-one">Standard Shipping [Free]</label>
              <input type="radio" id="radio-two" name="Method" value="Female" />
              <label for="radio-two">Express Shipping [+ Rs.50]</label>
              <input type="radio" id="radio-three" name="Method" value="Female" />
              <label for="radio-three">Overnight Shipping [+ Rs.70]</label>
            </p>
            <span class="mid"><span class="number">4</span> &nbsp;Payment Details:</span><br><br>


            <p class="pay">

                <input type="radio" id="radio1" name="Payment" value="Male" checked/>
                <label for="radio1">COD <br> <br>[Cash On Delivery]</label>
                <input type="radio" id="radio2" name="Payment" value="Female" alt="We're Still Working On That" disabled />
                <label for="radio2" style="cursor:not-allowed;">Credit or Debit Card</label>
                <input type="radio" id="radio3" name="Payment" value="Female" />
                <label for="radio3">PayPal</label>
              </p>

              <input type="checkbox" onchange="document.getElementById('Update').disabled = !this.checked;" checked style="left: 0;"/>
              <label style="text-align: center;"> <i> I have read and agree to the <a href="#">Terms & Policy</a></i><br><br><br></label>
              <input type="submit" id="Update" value="Update" type="submit" name="" class="" style="border-color: #fff;
              background: #afd566;color: #fff;font-weight: bold; letter-spacing: 1.5px; border-radius: 50%; cursor: pointer;transform: scale(1.2); "/>


 </form>

</section>

</body>




<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
<script  src="js/index.js"></script>
<script type="text/javascript">

</script>
</body>

</html>
