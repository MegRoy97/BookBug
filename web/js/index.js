
//========================= NAVIGATION SHOW/HIDE

$("header ul").hide();

$(".hamb").click( function() {
  $("header ul").slideToggle("medium");
});

$("header ul li a, .brand a").click( function() {
  $("header ul").hide();
});

//================SMOOTH SCROLLING WITH NAV HEIGHT OFFSET

$(function() {
  var navHeight = $("header").outerHeight();
  $('a[href*="#"]:not([href="#"])').click(function() {
    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
      if (target.length) {
        $('html, body').animate({
          scrollTop: target.offset().top - navHeight
        }, 1000);
        return false;
      }
    }
  });
});


//==========================NAVIGATION STICKY

var viewHeight = $(window).height();
var navigation = $('header');

$(window).scroll( function() {
  if ( $(window).scrollTop() > (viewHeight - 50) ) { //edit for nav height
    navigation.addClass('sticky');
  } else {
    navigation.removeClass('sticky');
  }
});

//=================MAKE THE SPLASH CONTAINER VERTICALLY CENTERED

function centerSplash() {
  var navHeight = $("header").outerHeight();
  var splashHeight = $(".splash .container").height();
  var remainingHeight = $(window).height() - splashHeight - navHeight;
  $(".splash .container").css({"padding-top" : remainingHeight/2, "padding-bottom" : remainingHeight/2});
}

$( document ).ready( function() {
  centerSplash();
});

$( window ).resize( function() {
  centerSplash();
});


  //
  // $('.bio').on('click', function (e) {
  //
  //   $('.shop-card').hide(300);
  //   $('*[data-cat="bio"]').show(300);
  //
  // });
  //
  // $('.novels').on('click', function (e) {
  //
  //   $('.shop-card').hide(300);
  //   $('*[data-cat="novels"]').show(300);
  //
  // });
  //
  // $('.motivational').on('click', function (e) {
  //
  //   $('.shop-card').hide(300);
  //   $('*[data-cat="motivational"]').show(300);
  //
  // });
  // $('.others').on('click', function (e) {
  //
  //   $('.shop-card').hide(300);
  //   $('*[data-cat="others"]').show(300);
  //
  // });
  // $('.tech').on('click', function (e) {
  //
  //   $('.shop-card').hide(300);
  //   $('*[data-cat="tech"]').show(300);
  //
  // });
