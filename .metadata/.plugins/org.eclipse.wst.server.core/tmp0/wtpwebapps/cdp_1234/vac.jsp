<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="DTO.Vaccine" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="script.js"></script>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@ include file="top.jsp" %>
	<section>
		<div class="title">백신접종예약</div>
		<form name="frm" action="vaccine">
			<div class="wrapper">
			<table>
				<tr>
					<th>접종예약번호</th>
					<td><input type="text" name="resvno"><span>예) 20210001 </span></td>
				</tr>
				<tr>
					<th>주민번호</th>
					<td><input type="text" name="jumin"><span>예) 710101-1000001</span></td>
				</tr>
				<tr>
					<th>백신코드</th>
					<td><input type="text" name="vcode"><span>예) V001~V003</span></td>
				</tr>
				<tr>
					<th>병원코드</th>
					<td><input type="text" name="hcode"><span>예) H001</span></td>
				</tr>
				<tr>
					<th>예약일자</th>
					<td><input type="text" name="resvdate"><span>예) 20211231</span></td>
				</tr>
				<tr>
					<th>예약시간</th>
					<td><input type="text" name="resvtime"><span>예) 1230</span></td>
				</tr>
				<tr>
					<td colspan="2">
					<button class="btn" type="submit" onclick="fn_submit(); return flase;">등 록</button>
					<button class="btn" type="reset" onclick="fn_reset();">다시쓰기</button>
					</td>
				</tr>
			</table>
		</div>
		</form>
	</section>
	<%@ include file="footer.jsp" %>
</body>
</html>