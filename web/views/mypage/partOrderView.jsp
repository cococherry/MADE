<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="part.model.vo.Part, java.util.*" %>
<%
Part p = (Part) request.getAttribute("part");
int price = ((Integer)request.getAttribute("price")).intValue();
int quan = ((Integer)request.getAttribute("quan")).intValue();
%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="ko"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="ko"> <!--<![endif]-->
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>Order Part View - MAːDÆ</title>
	<meta name="description" content="">
	<link rel="shortcut icon" href="/made/images/icon.ico">
	<!-- CSS FILES -->
    <link rel="stylesheet" href="/made/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/made/css/style.css">
    <link rel="stylesheet" type="text/css" href="/made/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/made/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" href="/made/css/fractionslider.css"/>
    <link rel="stylesheet" href="/made/css/style-fraction.css"/>

    <link rel="stylesheet" type="text/css" href="/made/css/switcher.css" media="screen" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	
	<!--Start Header-->
	<%@ include file="../../header.jsp" %>
	<!--End Header-->

	<!--start wrapper-->
	<section class="wrapper">
       <section class="page_head">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<h2><%= p.getPartName() %>주문 내역</h2>
					</div>
				</div>
			</div>
		</section>
		<section class="content portfolio_single">
        <div class="container">
        <div class="row sub_content">
       		<div class="col-lg-5 col-md-5 col-sm-5">
						<div class="porDetCarousel">
							<div class="carousel-content">
								<img class="carousel-item img-rounded active" style="width:'400px'; height: '300px';" src="/made/images/items/parts/<%=p.getPartCategory().toLowerCase() %>/<%=p.getPartImg()%>">
							</div>
						</div>
					</div>
					<div class="col-lg-7 col-md-7 col-sm-7">
						<div class="dividerHeading">
							<h4><span>상세 주문 내역</span></h4>
						</div>
						<div class="project_details">
						<ul class="details">
								<li><span>상품명:</span><%=p.getPartName()%></li>
								<li><span>재질:</span><%=p.getPartCategory()%></li>
								<li><span>단가:</span><%=p.getPrice()%>원</li>
								<li><span>구매수량 :</span><%= quan %>개</li>
						</ul>
						</div>
					</div>
				</div>
				<div class="row sub_content">
					<div class="col-lg-12">
						<div class="dividerHeading">
							<h4><span>주문 견적표</span></h4>
						</div>
					<table class="table table-striped table-hover">
                    <thead>
                    <tr>
                    	<th>상품 이미지</th>
                    	<th>상품 명</th>
                        <th>상품 가격</th>
                        <th>구매 갯수</th>
                        <th>계산 가격</th>
                    </tr>
                    </thead>
                    <tbody>
					<tr>
                        <td><img style="width:70px; height:70px;" class="img-circle img-responsive" src="/made/images/items/parts/<%=p.getPartCategory().toLowerCase() %>/<%=p.getPartImg()%>"></td>
                        <td><%=p.getPartName() %></td>
                        <td><%=p.getPrice() %>원</td>
                        <td><%=quan %>개</td>
                        <td><%=p.getPrice()*quan %>원</td>
                    </tr>
					</tbody>
                </table>
					<blockquote class="default">
					<p align="center"><span class="dropcap default">∴ </span><font id="totPrice" style="font-size:17pt;">총 구매 가격 : <i class="fa fa-won"></i>&nbsp;&nbsp;</font></p>
						<p align="center">
						<button class="btn btn-success btn-lg" onclick="pay_test();">결제하기</button>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<button class="btn btn-danger btn-lg" onclick="javascript:history.back();">취소하기</button>
						&nbsp;&nbsp;&nbsp;&nbsp;
						</p>
						</blockquote>
					</div>
				</div>
			</div>
    </section>
    </section>
<!-- I'm Port 전자결제 -->
	<script type="text/javascript"
		src="https://service.iamport.kr/js/iamport.payment-1.1.2.js"></script>
	<script>
	function numberWithCommas(x) {
		$('#totPrice').append(x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ","));
	}
		var IMP = window.IMP; // 생략가능
		$(function() {
			var price = <%=price%>;
			numberWithCommas(price);
			IMP.init('imp99940489');
		}); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
		// 문서 로딩될 때 바로 호출
		function pay_test() {
			IMP.request_pay({
				pg : 'kakao',
			    pay_method : 'card',
			    merchant_uid : 'merchant_' + new Date().getTime(),
				name : '주문명:<%=p.getPartName() %>',
				amount : <%=price%>,
				buyer_email : '<%=m.getEmail()%>',
				buyer_name : '<%=m.getName()%>',
				buyer_tel : '<%=m.getPhone()%>',
				buyer_addr : '<%=addr[1]+" "+addr[2]%>',
				buyer_postcode : '<%=addr[0]%>'
				//kakaoOpenApp : true,
			    //m_redirect_url : ""
			}, function(rsp) {
				if (rsp.success) {
					//[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기
					$.ajax({
						url : "/made/orderconfirm", //cross-domain error가 발생하지 않도록 동일한 도메인으로 전송
						type : 'POST',
						dataType : 'json',
						data : {
							item : 'part',
							code : '<%=p.getPartId()%>',
							quan : <%=quan%>,
							imp_uid : rsp.imp_uid,
							pay_method : rsp.pay_method,
							price : rsp.paid_amount,
							status : rsp.status,
							title : rsp.name,
							pg_tid : rsp.pg_tid,
							buyer_name : rsp.buyer_name,
							paid_at : rsp.paid_at,
							receipt_url : rsp.receipt_url
						//기타 필요한 데이터가 있으면 추가 전달
						}
					});
					location.href="/made/views/mypage/orderConfirm.jsp?item=part&pay_method="+rsp.pay_method
							+"&quan=<%=quan%>&nick="+rsp.buyer_name
							+"&date="+rsp.paid_at+"&price="+rsp.paid_amount;
				} else {
					var msg = '결제에 실패하였습니다.';
					msg += '\n에러내용 : ' + rsp.error_msg;
					alert(msg);
				}
			});
		};
	</script>
	<!--------------------->
	
	<!--start footer-->
	<%@ include file="../../footer.jsp" %>
	<!--end footer-->

</body>
</html>