<!DOCTYPE html>
<html>
	<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<head>
	<title>My Rest Client</title>
	<style>
		input{width:400px}
	</style>
	
</head>
<body>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span4">
				</div>
				<div class="span4">
					<form action="rest" method="post">
							<legend>My Rest Client</legend>
							<input type="text" name="url"/>
								<%--<input type="text" name="url" value="https://api.weibo.com/2/statuses/public_timeline.json"/>
							--%></p>
							<p>
								<button class="btn" type="submit">提交</button>
							</p>
						</fieldset>
					</form>
					<h2>
						标题
					</h2>
					<p>
						本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.
					</p>
					
					<div>
						<ul class="pagination">
							<li>
								<a href="#">上一页</a>
							</li>
							<li>
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">5</a>
							</li>
							<li>
								<a href="#">下一页</a>
							</li>
						</ul>
					</div>
				</div>
				<div class="span4">
				</div>
			</div>
		</div>
</body>
</html>