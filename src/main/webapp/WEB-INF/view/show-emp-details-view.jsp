<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear client, the order has been created!</h2>
<br>
<br>
<br>


Your price: ${order.price}
<br>
Your currency: ${order.currency}
<br>
Your product type: ${order.productType}
<br>
Your signed documents:
<ul>
<c:forEach var="lang" items="${order.signedDocuments}">
<li>${lang} </li>
</c:forEach>
</ul>

<br>
Your comission: ${order.comission}
<br>
Your id: ${order.id}
</body>


</html>