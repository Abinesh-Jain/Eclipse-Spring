<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>To Do - LIST</title>
</head>
<body>
	<div>Your To Do</div>
	<div>${todo}</div>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DISCRIPTION</th>
				<th>DATE</th>
				<th>DONE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todo}" var="todos">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.discription}</td>
					<td>${todo.date}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>