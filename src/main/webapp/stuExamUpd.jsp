<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>
<!-- 周考成绩修改界面 -->
<div id="container" style="margin-top: 30px" class="container">
<form action="gsUpdSave.do" method="post" class="form-horizontal">
	<div class="form-group">
		<label class="col-md-3 col-sm-3 control-label">新成绩：</label>
		<div class="col-md-7 col-sm-7 control-label">
			<input type="text" class="form-control" id="goods_code" required="required" name="goods_code" value="${requestScope.goods.goods_code}">
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-3 col-sm-3 control-label"></label>
		<div class="col-md-7 col-sm-7 control-label">
			<input type="submit" class="btn btn-info btn-block" value="保存">
		</div>
	</div>
	
	<input type="hidden" name="goods_id" value="${requestScope.goods.goods_id}">
</form>
</div>
<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript"  src="js/bootstrap.min.js"></script>
</body>
</html>