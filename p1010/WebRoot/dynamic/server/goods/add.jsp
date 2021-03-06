<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/dynamic/link/taglib.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- JavaScript Skin -->
<jsp:include page="/dynamic/link/crud.jsp"></jsp:include>

<script type="text/javascript">
$(function(){
	loadBrand();
	brandEvent();
	submitForm('<%=path %>/server/goods!add.action', '#submitForm');
});

function loadBrand(){
	$.post('<%=path %>/server/brand!show.action','',function(data){
		var json = toJSON(data);
		$.each(json.value, function(i, v){
			$('#brand').append('<option value="'+v.id+'">'+v.name+'</option>');
		});
	});
}
function brandEvent(){
	$('#brand').change(function(){
		if($(this).val() == ''){
			$('#items').html('<option value="">选择...</option>');
		}else{
			$.post('<%=path %>/server/items!show.action','brandid='+$(this).val(),function(data){
				var json = toJSON(data);
				$('#items').html('<option value="">选择...</option>');
				$.each(json.value, function(i, v){
					$('#items').append('<option value="'+v.id+'">'+v.name+'</option>');
				});
			});
		}
	});
}
</script>
</head>
<body leftmargin="8" topmargin="8" background='/static/skin/server/images/allbg.gif'>
<!-- head -->
<div id="head"></div>

<!-- 数据提交表单   -->
<form id="submitForm" method="post">
<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="2" background="/static/skin/server/images/tbg.gif">新增商品</td>
</tr>
<tr align="left" bgcolor="#FAFAF1">
	<td width="15%">品牌:</td>
	<td width="85%">
	<select name="goods.brand.id" id="brand" class="{required:true}">
		<option value="">选择...</option>
	</select>&nbsp;<label class="lb_rq">*</label>
	</td>
</tr>
<tr align="left" bgcolor="#FAFAF1">
	<td width="15%">分类:</td>
	<td width="85%">
	<select name="goods.items.id" id="items" class="{required:true}">
		<option value="">选择...</option>
	</select>&nbsp;<label class="lb_rq">*</label>
	</td>
</tr>
<tr align="left" bgcolor="#FAFAF1">
	<td width="15%">名称:</td>
	<td width="85%"><input type="text" name="goods.name" style="width:150px;" class="{required:true,rangelength:[2,20]}" />&nbsp;<label class="lb_rq">*</label></td>
</tr>
<tr align="left" bgcolor="#FAFAF1">
	<td width="15%">备注信息:</td>
	<td width="85%">
	<textarea rows="5" cols="50" name="goods.expound" class="{rangelength:[0,200]}"></textarea>
	</td>
</tr>
<tr align="left" bgcolor="#FAFAF1">
	<td colspan="2" align="left">
		<div style="margin-left:150px;">
			<button type="submit" id="submitBtn" class="coolbg np">提交</button>&nbsp;<button id="resetBtn" type="reset" class="coolbg np">重置</button>
		</div>
	</td>
</tr>
</table>
</form>
</body>
</html>