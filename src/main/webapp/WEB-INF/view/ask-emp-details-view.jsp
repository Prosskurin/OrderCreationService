<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>Dear client, Please enter your details!</h2>

<br>
<br>

<form:form action ="showDetails" modelAttribute="order">

Price <form:input path="price"/>
<br>
<br>
Currency <form:input path="currency"/>
<br><br>
Product Type <form:select path="productType">

<form:option value="Stock" label="Stock"/>
<form:option value="Bond" label="Bond"/>

</form:select>

<br><br>
SignedDocuments <textarea name="signedDocuments"></textarea>

<form:hidden path = "id"/>


<input type="submit" value="OKEY"/>
</form:form>
    </body>

</html>