<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>


<h2>All Employees</h2>
<br>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>City</th>

    </tr>
    <c:forEach var="usr" items="${allUsers}">

        <tr>
            <td>${usr.name}</td>
            <td>${usr.surname}</td>
            <td>${usr.city}</td>
        </tr>
    </c:forEach>



</table>

<br>











</body>








</html>