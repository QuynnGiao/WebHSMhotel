
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="db" class="dao.DAO" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title></title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="view/client/css/bootstrap.css">
        <link rel="stylesheet" href="view/client/vendors/linericon/style.css">
        <link rel="stylesheet" href="view/client/vendors/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="view/client/vendors/nice-select/css/nice-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css">
        <!-- main css -->
        <link rel="stylesheet" href="view/client/css/stylethu1.css">
        <link rel="stylesheet" href="view/client/css/responsive.css">
    </head>
    <body>
        <!--================Header Area =================-->
        <jsp:include page="header.jsp"></jsp:include>
        <!--================Header Area =================-->        
        <!--================Banner Area =================-->
        <section class="banner_area">
            <div class="booking_table d_flex align-items-center">
            	<div class="overlay bg-parallax" data-stellar-ratio="0.9" data-stellar-vertical-offset="0" data-background=""></div>
				<div class="container">
                                    <div class="banner_content text-center">
                                        <span>
                                            <i class="star-rating"></i>
                                            <i class="star-rating"></i>
                                            <i class="star-rating"></i>
                                            <i class="star-rating"></i>
                                            <i class="star-rating"></i>
                                        </span>
                                        <h6>Unique place to relax & enjoy</h6>
                                        <h2>Enjoy the best moments of life</h2>
                                        <a href="#" class="btn theme_btn button_hover" style="border: 1px solid rgba(255,255,255,0.5);">Get Started</a>
                                    </div>
				</div>
            </div>
            <div class="hotel_booking_area position">
                <div class="container">
                    <div class="hotel_booking_table">
                        <div class="col-md-3">
                            <h2>Book<br> Your Room</h2>
                        </div>
                        <div class="col-md-9">
                            <form action="searchR" id="searchroom">
                            <div class="boking_table">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="book_tabel_item">
                                            <div class="form-group">
                                                <div class='input-group date' id='datetimepicker11'>
                                                    <input type='text' class="form-control" placeholder="Arrival Date"/>
                                                    <span class="input-group-addon">
                                                        <i class="fa fa-calendar" aria-hidden="true"></i>
                                                    </span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class='input-group date' id='datetimepicker1'>
                                                    <input type='text' class="form-control" placeholder="Departure Date"/>
                                                    <span class="input-group-addon">
                                                        <i class="fa fa-calendar" aria-hidden="true"></i>
                                                    </span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="book_tabel_item">
                                            <div class="input-group">                                            
                                                <select class="wide" name="AmountP">
                                                    <option data-display="Amount Of People" value="0">Amount Of People</option>
                                                    <option value="2">2</option>    
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                    <option value="6">6</option>
                                                </select>
                                            </div>
                                            <div class="input-group">
                                                <select class="wide" name="rank">
                                                    <option data-display="Rank OF Room" value="0">Rank OF Room</option>
                                                    <option value="NORMAL">NORMAL</option>
                                                    <option value="VIP">VIP</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="book_tabel_item">
                                            <button style="cursor: pointer;" class="book_now_btn button_hover" type="submit">Search Now</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================Banner Area =================-->
         <!--================ About History Area  =================-->
         <section class="about section-padding">
             <div class="container">
                 <div class="row">
                     <div class="col-md-6 mb-30 animate-box" data-animate-effect="fadeInUp">
                         <span>
                             <i class="star-rating"></i>
                             <i class="star-rating"></i>
                             <i class="star-rating"></i>
                             <i class="star-rating"></i>
                             <i class="star-rating"></i>
                         </span>
                         <div class="section-subtitle">The Cappa Luxury Hotel</div>
                         <div class="section-title">Enjoy a Luxury Experience</div>
                         <p>Welcome to the best five-star deluxe hotel in New York. Hotel elementum sesue the aucan vestibulum aliquam justo in sapien rutrum volutpat. Donec in quis the pellentesque velit. Donec id velit ac arcu posuere blane.</p>
                         <p>Hotel ut nisl quam nestibulum ac quam nec odio elementum sceisue the aucan ligula. Orci varius natoque penatibus et magnis dis parturient monte nascete ridiculus mus nellentesque habitant morbine.</p>
                         <a href="about" class="button_hover theme_btn_two">Discover</a>

                     </div>
                     <div class="col col-md-3 animate-box" data-animate-effect="fadeInUp">
                         <img src="https://images.pexels.com/photos/221457/pexels-photo-221457.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" width="100%" height="100%" class="mt-90 mb-30">
                     </div>
                     <div class="col col-md-3 animate-box" data-animate-effect="fadeInUp">
                         <img src="https://images.pexels.com/photos/2096983/pexels-photo-2096983.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" width="100%" height="100%">
                     </div>
                 </div>
             </div>
         </section>
        <!--================ About History Area  =================-->
        <!--================ Facilities Area  =================-->
        <section class="facilities_area section_gap">
            <div class="overlay bg-parallax" data-stellar-ratio="0.8" data-stellar-vertical-offset="0" data-background="">  
            </div>
            <div class="container">
                <div class="section_title text-center">
                    <h2 class="title_w">Royal Facilities</h2>
                    <p>Who are in extremely love with eco friendly system.</p>
                </div>
                <div class="row mb_30">
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-dinner"></i>Restaurant</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-bicycle"></i>Sports CLub</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-shirt"></i>Swimming Pool</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-car"></i>Rent a Car</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-construction"></i>Gymnesium</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="facilities_item">
                            <h4 class="sec_h4"><i class="lnr lnr-coffee-cup"></i>Bar</h4>
                            <p>Usage of the Internet is becoming more common due to rapid advancement of technology and power.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================ Facilities Area  =================-->
        <!--================ Room Area  =================-->
        <section class="rooms1 section-padding bg-cream" data-scroll-index="1">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-subtitle">The Cappa Luxury Hotel</div>
                        <div class="section-title">Rooms & Suites</div>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${listRT}" var="rt">
                    <div class="col-md-4">
                        <div class="item">
                            <div class="position-re o-hidden"> <img width="100%" height="100%" src="img/${rt.urlimage}"> </div> <span class="category"><a href="listRoomByID?rtid=${rt.rtid}">Type Room</a></span>
                            <div class="con">
                                <h6><a href="listRoomByID?rtid=${rt.rtid}">LUXURY HOTEL</a></h6>
                                <h5><a href="listRoomByID?rtid=${rt.rtid}">${rt.roomType}</a> </h5>
                                <div class="line"></div>
                                <div class="row facilities">
                                    <div class="col col-md-7">
                                        <ul>
                                            <li><i class="fas fa-bed"></i></li>
                                            <li><i class="fas fa-bath"></i></li>
                                            <li><i class="fas fa-utensils"></i></i></li>
                                            <li><i class="fas fa-shower"></i></li>
                                        </ul>
                                    </div>
                                    <div class="col col-md-5 text-right">
                                        <div class="permalink"><a href="listRoomByID?rtid=${rt.rtid}">See More <i class="fas fa-arrow-right"></i></a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </section>
        <!--================ Room Area  =================-->  
        <!--================ Service Area  =================-->  
        <section class="pricing section-padding bg-black">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="section-subtitle"><span>Best Prices</span></div>
                        <div class="section-title"><span>Extra Services</span></div>
                        <p class="color-2">The best prices for your relaxing vacation. The utanislen quam nestibulum ac quame odion elementum sceisue the aucan.</p>
                        <p class="color-2">Orci varius natoque penatibus et magnis disney parturient monte nascete ridiculus mus nellen etesque habitant morbine.</p>
<!--                        <a class="service_btn button_hover" href="#">Discover</a>-->
                    </div>
                    <div class="col-md-8 picService">
                        <div class="owl-carousel owl-theme">
                            <c:forEach items="${listST}" var="s">
                                <div class="pricing-card">                             
                                <img src="img/${s.urlimage}" alt="">
                                <div class="desc">
                                    <div class="name">${s.stname}</div>
                                    <div class="amount">Enjoy unforgettable experiences in dream hotels.</div>
                                    <ul class="list-unstyled list">
                                        <li><i class="fas fa-check"></i> Relax and feel peace in you.</li>
                                        <li><i class="fas fa-check"></i> Your smile, our happiness.</li>
                                        <li><i class="fas fa-times unavailable"></i> It is strictly forbidden to bring materials and objects with unpleasant odors into any area of ​​the hotel.</li>
                                    </ul>
                                </div>                              
                            </div>
                            </c:forEach>       
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================ Service Area  =================-->  
        <!--================ Gallery  Area  =================-->
        <section class="GalleryImg">
            <video class="video-slide" src="view/client/image/gallery/videohotel1.mp4" autoplay muted loop></video>
             <div class="heading_gallery">
                 <span>Gallery</span>
                 <h3>Image Gallery</h3>    
             </div>
            <div class="full-img" id="fullImgBox">
              <img id="fullImg" src="">
              <span onclick="CloseFullImg()">X</span>
            </div>
            <div id="drag-container">
                <div id="spin-container">

                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/189333/pexels-photo-189333.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/2305457/pexels-photo-2305457.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/2205270/pexels-photo-2205270.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/1579253/pexels-photo-1579253.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/8937756/pexels-photo-8937756.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
                  <img onclick="OpenFullImg(this.src)" src="https://images.pexels.com/photos/1267320/pexels-photo-1267320.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">                 

                  <p>the hotel's art museum</p>
                </div>
                <div id="ground"></div>
            </div>
        </section>
        <!--================ Gallery  Area  =================-->
        
        <!--================ Testimonial Area  =================-->
        <section class="testimonials">
            <div class="background bg-img bg-fixed section-padding pb-0" data-background="https://images.unsplash.com/photo-1540541338287-41700207dee6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGhvdGVsc3xlbnwwfHwwfHw%3D&w=1000&q=80" data-overlay-dark="3">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 offset-md-2">
                        <div class="testimonials-box">
                            <div class="head-box">
                                <h6>Testimonials</h6>
                                <h4>What Client's Say?</h4>
                                <div class="line"></div>
                            </div>
                            <div class="owl-carousel owl-theme">
                                <div class="item">
                                    <span class="quote"><img src="view/client/image/icon/quot.png" alt=""></span>
                                    <p>Hotel dapibus asue metus the nec feusiate eraten miss hendreri net ve ante the lemon sanleo nectan feugiat erat hendrerit necuis ve ante otel inilla duiman at finibus viverra neca the sene on satien the miss drana inc fermen norttito sit space, mus nellentesque habitan.</p>
                                    <div class="info">
                                        <div class="author-img"> <img src="view/client/image/elements/g1.jpg" alt=""> </div>
                                        <div class="cont"> <span><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i></span>
                                            <h6>Emily Brown</h6> <span>Guest review</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <span class="quote"><img src="view/client/image/icon/quot.png" alt=""></span>
                                    <p>Hotel dapibus asue metus the nec feusiate eraten miss hendreri net ve ante the lemon sanleo nectan feugiat erat hendrerit necuis ve ante otel inilla duiman at finibus viverra neca the sene on satien the miss drana inc fermen norttito sit space, mus nellentesque habitan.</p>
                                    <div class="info">
                                        <div class="author-img"> <img src="view/client/image/elements/g2.jpg" alt=""> </div>
                                        <div class="cont"> <span><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i></span>
                                            <h6>Nolan White</h6> <span>Guest review</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="item">
                                    <span class="quote"><img src="view/client/image/icon/quot.png" alt=""></span>
                                    <p>Hotel dapibus asue metus the nec feusiate eraten miss hendreri net ve ante the lemon sanleo nectan feugiat erat hendrerit necuis ve ante otel inilla duiman at finibus viverra neca the sene on satien the miss drana inc fermen norttito sit space, mus nellentesque habitan.</p>
                                    <div class="info">
                                        <div class="author-img"> <img src="view/client/image/elements/g3.jpg" alt=""> </div>
                                        <div class="cont"> <span><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i><i class="star-rating"></i></span>
                                            <h6>Olivia Martin</h6> <span>Guest review</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
        <!--================ Testimonial Area  =================-->
        <!--================ New Area  =================-->
        <!-- News -->
    <section class="news section-padding bg-black">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="section-subtitle"><span>hotel events</span></div>
                    <div class="section-title"><span>Our Voucher</span></div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="owl-carousel owl-theme">
                    <c:forEach items="${listV}" var="v">
                        <div class="item">
                            <div class="position-re o-hidden"> <img src="img/${v.urlimage}" alt="">
                                <div class="date">
                                    <a href="#"> <i>${v.discout}%</i> </a>
                                </div>
                            </div>
                            <div class="con"> <span class="category">
                                    <a href="#">${v.vname}</a>
                                </span>
                                <h5><a href="#">${v.describle}</a></h5>                               
                            </div>                           
                        </div>
                    </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </section> 
        <!--================ News Area  =================-->
         <!--================ More Service Area  =================-->
         <!-- Services -->
    <section class="services section-padding">
        <div class="container">
            <div class="row">
                <div class="col-md-6 p-0 animate-box" data-animate-effect="fadeInLeft">
                    <div class="img left">
                        <a href="#"><img src="https://wallpaperaccess.com/full/3014596.jpg" alt=""></a>
                    </div>
                </div>
                <div class="col-md-6 p-0 bg-cream valign animate-box" data-animate-effect="fadeInRight">
                    <div class="content">
                        <div class="cont text-left">
                            <div class="info">
                                <h6>Discover</h6>
                            </div>
                            <h4>The Restaurant</h4>
                            <p>Restaurant inilla duiman at elit finibus viverra nec a lacus themo the nesudea seneoice misuscipit non sagie the fermen ziverra tristiue duru the ivite dianne onen nivami acsestion augue artine.</p>
                            <div class="butn-dark"> <a href="#"><span>Learn More</span></a> </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 bg-cream p-0 order2 valign animate-box" data-animate-effect="fadeInLeft">
                    <div class="content">
                        <div class="cont text-left">
                            <div class="info">
                                <h6>Experiences</h6>
                            </div>
                            <h4>Spa Center</h4>
                            <p>Spa center inilla duiman at elit finibus viverra nec a lacus themo the nesudea seneoice misuscipit non sagie the fermen ziverra tristiue duru the ivite dianne onen nivami acsestion augue artine.</p>
                            <div class="butn-dark"> <a href="#"><span>Learn More</span></a> </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 p-0 order1 animate-box" data-animate-effect="fadeInRight">
                    <div class="img">
                        <a href="#"><img src="https://live.staticflickr.com/4374/37080061505_411b4f0da2_z.jpg" alt=""></a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 p-0 animate-box" data-animate-effect="fadeInLeft">
                    <div class="img left">
                        <a href="#"><img src="https://c0.wallpaperflare.com/preview/541/597/191/exercise-fitnessgear-gymrat-trainhard.jpg" alt=""></a>
                    </div>
                </div>
                <div class="col-md-6 p-0 bg-cream valign animate-box" data-animate-effect="fadeInRight">
                    <div class="content">
                        <div class="cont text-left">
                            <div class="info">
                                <h6>Modern</h6>
                            </div>
                            <h4>Fitness Center</h4>
                            <p>Fitness Center is a place where you go to exercise, for example by lifting weights or using other equipment.</p>
                            <div class="butn-dark"> <a href="#"><span>Learn More</span></a> </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 bg-cream p-0 order2 valign animate-box" data-animate-effect="fadeInLeft">
                    <div class="content">
                        <div class="cont text-left">
                            <div class="info">
                                <h6>Experiences</h6>
                            </div>
                            <h4>The Health Club & Pool</h4>
                            <p>The health club & pool at elit finibus viverra nec a lacus themo the nesudea seneoice misuscipit non sagie the fermen ziverra tristiue duru the ivite dianne onen nivami acsestion augue artine.</p>
                            <div class="butn-dark"> <a href="#"><span>Learn More</span></a> </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 p-0 order1 animate-box" data-animate-effect="fadeInRight">
                    <div class="img">
                        <a href="#"><img src="https://images8.alphacoders.com/458/458482.jpg" alt=""></a>
                    </div>
                </div>
            </div>
        </div>
    </section>
         <!--================ More Service Area  =================-->
         <!--================ Start footer Area  =================-->
         <jsp:include page="footer.jsp"></jsp:include>
        <!--================ End footer Area  =================-->
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="view/client/js/jquery-3.2.1.min.js"></script>
        <script src="view/client/vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="view/client/js/jquery.ajaxchimp.min.js"></script>
        <script src="view/client/vendors/nice-select/js/jquery.nice-select.js"></script>       
        <script src="view/client/js/stellar.js"></script>    
        <script src="view/client/js/thu5.6.js"></script>
        <script src="view/client/js/thu7.js"></script>
        <script src="view/client/js/jquery-3.6.0.min.js"></script>
        <script src="view/client/js/popper.js"></script>
        <script src="view/client/js/bootstrap.min.js"></script>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
 
        <script src="view/client/vendors/lightbox/simpleLightbox.min.js"></script>
        <script src="view/client/js/scrollIt.min.js"></script>
        <script src="view/client/js/owl.carousel.min.js"></script>
        <script src="view/client/js/YouTubePopUp.js"></script>
        <script src="view/client/js/smooth-scroll.min.js"></script>
        <script>
            $(document).ready(function(){
            $('#datetimepicker11').datepicker({
            format: 'dd-mm-yyyy',
            todayHighlight: true,
            startDate: '0d'   
            });
                $('#datetimepicker1').datepicker({
            format: 'dd-mm-yyyy',
            todayHighlight: true,
            startDate: '0d'
            });
            });
        </script>
    </body>
</html>
