<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.2.js"></script>
    <script type="text/jscript">
$(function(){
$('.search_sort a').click(function(){
$(this).parent().each(function () {//移除其余非点中状态
$('.search_sort a').removeClass("special_color");
});
$(this).addClass("special_color");//给所点中的增加样式
alert($(this).text());//输出所点的a的内容
})
})
</script>
    <style>
        .special_color{
            font-size:16px;
            color:#006633;
            font-family:"微软雅黑";
        }
    </style>
</head>
<body>
<div class="search_sort">
    <a href="#" class="special_color">all</a>
    <a href="#">abc</a>
    <a href="#">123</a>
    <a href="#">ppp</a>
</div>
</body>
</html>