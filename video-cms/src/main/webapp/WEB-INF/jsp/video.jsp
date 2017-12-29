<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>视频管理</title>

<!-- Bootstrap -->
<link href='<c:url value="/css/bootstrap.min.css"></c:url>'
	rel="stylesheet">
<link href='<c:url value="/css/bootstrap-table.min.css"></c:url>'
	rel="stylesheet">
<link href='<c:url value="/css/bootstrap-editable.css"></c:url>'
	rel="stylesheet">

</head>
<body>
	<div class="container">

		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">智游公开课后台管理系统</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li>
						<a href="#"> 首页 </a>
					</li>
					<li class="active">
						<a href="#"> 视频管理 </a>
					</li>
					<li>
						<a href="#">讲师管理</a>
					</li>
					<li>
						<a href="#">课程管理</a>
					</li>
					<li>
						<a href="#">学科管理</a>
					</li>
				</ul>
			</div>
		</div>
		</nav>

		<a id="username">用户名</a>

		<div class="panel panel-info">
			<div class="panel-heading">视频管理</div>

			<div id="toolbar">
				<select id="speaker_select">
					<option value="0">全部讲师</option>
					<c:forEach items="${speakers}" var="speaker">
						<option value="${speaker.id }">${speaker.name }</option>
					</c:forEach>
				</select>
			</div>

			<table class="table"></table>
		</div>
	</div>


	<script src='<c:url value="/js/jquery-3.2.1.min.js"></c:url>'></script>
	<script src='<c:url value="/js/bootstrap.min.js"></c:url>'></script>
	<script src='<c:url value="/js/bootstrap-table.min.js"></c:url>'></script>
	<script src='<c:url value="/js/bootstrap-table-zh-CN.min.js"></c:url>'></script>
	<script src='<c:url value="/js/bootstrap-editable.min.js"></c:url>'></script>
	<script
		src='<c:url value="/js/bootstrap-table-editable.min.js"></c:url>'></script>

	<script>
		$(document).ready(function() {

			$('#username').editable();

			$('#speaker_select').change(function() {

				// 选择讲师后，自动刷新 table
				$('.table').bootstrapTable('refresh');
			})

			$('.table').bootstrapTable({

				url : '<c:url value="/videos"></c:url>',

				columns : [ {
					checkbox : true
				}, {
					title : '标题',
					field : 'name',
					editable : {
						type : 'text',
						title : '课程标题',
						validate : function(v) {
							if (!v)
								return '课程标题不能为空';

						}
					}
				}, {
					title : '课程',
					field : 'course.name',
				}, {
					title : '学科',
					field : 'subject.name',
				}, {
					title : '讲师',
					field : 'speaker.name',
				}, {
					title : '时长',
					field : 'length',
				}, {
					title : '播放次数',
					field : 'playCount',
				}, {
					title : '操作',
				} ],

				toolbar : '#toolbar',
				dataField : 'data',
				cache : false,
				pagination : true,
				paginationLoop : false,
				sidePagination : 'server',
				pageSize : 5,
				pageList : [ 3, 5, 10 ],

				// 启用搜索
				search : true,
				queryParams : function(params) {

					// 设置传递给服务器的数据
					// params 默认包含 offset，limit，search，sort，order

					// 新增参数 speakerId
					params['speakerId'] = $("#speaker_select").val();

					return params;
				},

				responseHandler : function(responseVO) {
					return {
						'total' : responseVO.data.count,
						'data' : responseVO.data.rows
					};
				},

				onEditableSave : function(field, row, oldValue, $el) {
					$.ajax({

						url : "<c:url value='/videos/" + row.id + "'></c:url>",
						type : 'PUT',
						
						// 415 是 contentType 没有设置对
						contentType : 'application/json',
						data : JSON.stringify(row),

						success : function(responseVO) {

							alert("===============");
						},

						error : function(error) {

							alert(JSON.stringify(error));
						},
					});
				},
			});
		});
	</script>
</body>
</html>