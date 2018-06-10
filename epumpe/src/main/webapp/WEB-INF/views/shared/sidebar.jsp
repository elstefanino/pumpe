<p class="lead">ePumpe po gradovima:</p>
<div class="list-group">

	<c:forEach items="${gradovi}" var="grad">
		<a href="${contextRoot}/prikazi/grad/${grad.id}/epumpe" class="list-group-item" id="a_${grad.ime}">${grad.ime}</a>
	</c:forEach>
</div>