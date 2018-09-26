<html>
<body>

<form action="add">

Number 1 : <input type="text" name="t1" value="<%=request.getAttribute("x") %>"><br>
Number 2 : <input type="text" name="t2" value="<%=request.getAttribute("y") %>"><br>
<input type="submit" name="calc" value="add">
<input type="submit" name="calc" value="sub">
<br>
<input type="submit" name="calc" value="mul">
<input type="submit" name="calc" value="div">

</form>

Result : <%=request.getAttribute("z") %>


<br>


IP is <%=request.getRemoteAddr()%>

</body>
</html>
