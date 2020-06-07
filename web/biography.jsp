<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.bean.Product"%>
<%@page import="com.bookbug.dao.Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



            
            
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Welcome | BOOKBUG</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">


<!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
  <!--RANGE slider-->
  <!--<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">-->



<link rel="stylesheet" href="css/styl1.css">
<link rel="stylesheet" href="css/merchant.css">
<link rel="stylesheet" href="css/style_1.css">
<!-- <link rel="stylesheet" href="css/admin.css"> -->
<style>
    .author{
        max-height: 260px;
        overflow-y: scroll;
    }
    .author::-webkit-scrollbar {
        display: none;
    }
    
    li{
        list-style: none;
        padding-left: 0;
    }
.container2{
  float: right;
  width: 80%;
}
.sidenav {
  height: 100%;
  width: 15%;
  position: fixed;
  float: left;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #afd566;
  overflow-x: hidden;
  padding-top: 150px;
  text-align: center;
}
.sidenav h2{
  font-size: 1.5em;
}
.sidenav a {
  padding: 7% 10% 7% 10%;
  text-decoration: none;
  font-size: 1.2em;
  color: #000;
  display: block;
  border-bottom: 1px solid #1a1a1d;
}

.sidenav a:hover {
  color: #818181;
}

.main {
  margin-left: 200px; /* Same as the width of the sidenav */
}

@media screen and (max-height: 999px) {
  .sidenav h2{font-size: 1em;}
  .sidenav {padding-top: calc(80vh/2);}
  .sidenav a {font-size: .8em;}
}
</style>
</head>


<body>

  <header class="container-fluid header">

      <div class="container cf">



          <a href="indx.html"><div class="brand">

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
              <li ><a href="shop.html" class="active-class"><i class="fas fa-shopping-bag"></i>&nbsp;Store</a></li>
              <li><a href="about.html"><i class="fas fa-users"></i>&nbsp;About Us</a></li>
              <li><a href="reglogin.html"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;Login / Register</a></li>
              <li><a href="reglogin.html"><i class="fa fa-shopping-cart" aria-hidden="true"></i>&nbsp;0 Items</a></li>


          </ul>

      </div>


  </header>


  <div class="sidenav" style="padding-top: 68px;margin-top: 0px;">
    	<div class="cd-filter">
			<form>
				<div class="cd-filter-block">
					<h4>Search</h4>

					<div class="cd-filter-content">
						<input type="search" placeholder="Try color-1...">
					</div> <!-- cd-filter-content -->
				</div> <!-- cd-filter-block -->

				<div class="cd-filter-block author">
					<h4>Check boxes</h4>

					<ul class="cd-filter-content cd-filters list" style="padding-left: 5%;">
						<li>
                                                    <input class="filter" type="checkbox" id="checkbox1" value="Option1"  >
			    			<label class="checkbox-label" for="checkbox1">Option 1</label>
						</li>

						<li>
							<input class="filter" type="checkbox" id="checkbox2" value="Option2">
							<label class="checkbox-label" for="checkbox2">Option 2</label>
						</li>

						<li>
							<input class="filter" type="checkbox" id="checkbox3" value="Option3">
							<label class="checkbox-label" for="checkbox3">Option 3</label>
						</li>
                                                <li>
							<input class="filter" type="checkbox" id="checkbox4" value="Option3">
							<label class="checkbox-label" for="checkbox3">Option 4</label>
						</li>
                                                <li>
							<input class="filter" type="checkbox" id="checkbox5" value="Option3">
							<label class="checkbox-label" for="checkbox5">Option 5</label>
						</li>
                                                <li>
							<input class="filter" type="checkbox" id="checkbox6" value="Option3">
							<label class="checkbox-label" for="checkbox6">Option 6</label>
						</li>
					</ul> <!-- cd-filter-content -->
				</div> <!-- cd-filter-block -->

				<div class="cd-filter-block">
					<h4>Select</h4>

					<div class="cd-filter-content">
						<div class="cd-select cd-filters">
							<select class="filter" name="" id="selectThis">
								<option value="">Choose an option</option>
								<option value="">Option 1</option>
								<option value="">Option 2</option>
								<option value="">Option 3</option>
								<option value="">Option 4</option>
							</select>
						</div> <!-- cd-select -->
					</div> <!-- cd-filter-content -->
				</div> <!-- cd-filter-block -->

				<div class="cd-filter-block">
					<h4>Radio buttons</h4>

					<ul class="cd-filter-content cd-filters list" style="padding-left: 5%;">
						<li>
							<input class="filter" data-filter="" type="radio" name="radioButton" id="radio1" checked>
							<label class="radio-label" for="radio1">All</label>
						</li>

						<li>
							<input class="filter" data-filter=".radio2" type="radio" name="radioButton" id="radio2">
							<label class="radio-label" for="radio2">Choice 2</label>
						</li>

						<li>
							<input class="filter" data-filter=".radio3" type="radio" name="radioButton" id="radio3">
							<label class="radio-label" for="radio3">Choice 3</label>
						</li>
					</ul> <!-- cd-filter-content -->
				</div> <!-- cd-filter-block -->
                                <p>
                                    <label for="amount">Price range:</label>
                                    <input type="text" id="amount" readonly style="border:0; color:#f6931f; font-weight:bold;">
                                  </p>

                                  <div id="slider-range"></div>
                                  
                                  <div data-role="main" class="ui-content">

                                        <div data-role="rangeslider">
                                          <label for="price-min">Price Range:</label>
                                          <input type="range" name="price-min" id="price-min" value="200" min="0" max="1000">
                                          <!--<label for="price-max">Price:</label>-->
                                          <input type="range" name="price-max" id="price-max" value="800" min="0" max="1000">
                                        </div>
                                          
                                    </div>
                                  <input type="submit" data-inline="true" value="SUBMIT">
                                          
                                          
                                 
			</form>
                         
            

            
		</div> <!-- cd-filter -->

  </div>


<section class="container2">

  <div class="books">
    <h2> Shop With Us</h2>
    <p></p>

  </div>







  

<!-- <h1 style="text-align: center; margin:auto;"> ------------- Feature Products ----------- </h1> -->


    

      <!-- Product 1 -->
      <%
      try{
                
        Product product=new Product();
        DbConnection con1=new DbConnection();
        String sql="select * from products where ProductCategory=?";
        
        
            PreparedStatement ps=con1.con.prepareStatement(sql);
        
            ps.setString(1,"Biographical");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String ProductId,ProductPrice,ProductImage, ProductName;
                ProductId=rs.getString(1);
                ProductPrice=rs.getString(3);
                ProductImage=rs.getString(9);
                ProductName=rs.getString(2);
                
            %>
            <form class="items" action="book1.jsp" method="post">
              <div class="pimg">
                <img src="images/<%=ProductImage%>" alt="">
                <!--<div class="quickviewbtn">Quick View</div>-->
              </div>
              <div class="details">
                <h3 class="item" title="ODI"> <%=ProductName%> </h3><br>
                Price : <span class="price"> <%=ProductPrice%> </span><br><br>
                <input type="text" hidden class="" value="<%=ProductId%>" name="ProductId">
                
                  <!--<input type="text" hidden value="go" onclick="window.location.href='book1.jsp'>-->
                 
<!--                  <button type="button" class="addbtn" name="button">Add To Cart</button>-->
                <input type="submit" value="View Product" class="addbtn">
              </div>
            </form>
      <%
           
            
            }
            }
            catch (Exception ex) {
            System.out.println(ex);
        }
            %>  
    

              <!-- Product 12 -->

        


          <!-- <div class="cart">

          </div> -->
          <!--<a href="#" style="text-decoration: none; font-weight: bold;">-->

    
    <!-- End of .products -->


<!-- End of .cardholder -->



</section>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
<script  src="js/index.js"></script>
 <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#slider-range" ).slider({
      range: true,
      min: 0,
      max: 500,
      values: [ 75, 300 ],
      slide: function( event, ui ) {
        $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
      }
    });
    $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
      " - $" + $( "#slider-range" ).slider( "values", 1 ) );
  } );
  </script>
</body>

</html>7
