<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
<h1 Add Product></h1>
<form action="add-product" method="post" >
<fieldset>
<legend>Add product form</legend>

Product name <input type="text" name ="name" id="name"/><br>
Product price <input type="text" name ="price" id="price"/><br>
<input type="submit" value="add product">

</fieldset>


</form>
</body>
</html>