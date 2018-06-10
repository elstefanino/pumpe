<div class="container">

	<div class="row">


		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-md-9">

			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${korisnikKliknePumpe == true}">

						<script>
							window.gradId = '';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/pocetna">Pocetna</a></li>
							<li class="active">Sve pumpe</li>


						</ol>
					</c:if>


					<c:if test="${korisnikKlikneGradovePumpe == true}">
						<script>
							window.gradId = '${grad.id}';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/pocetna">Pocetna</a></li>
							<li class="active">Grad</li>
							<li class="active">${grad.ime}</li>


						</ol>
					</c:if>


				</div>


			</div>


			<div class="row">

				<div class="col-xs-12">


					<table id="pumpeListTable"
						class="table table-striped table-borderd">


						<thead>

							<tr>
								<th></th>
								<th>naziv</th>
								<th>adresa</th>
								<th>opis</th>
								<th>cena po satu</th>
								<th></th>

							</tr>

						</thead>


						<tfoot>

							<tr>
								<th></th>
								<th>naziv</th>
								<th>adresa</th>
								<th>opis</th>
								<th>cena po satu</th>
								<th></th>
							</tr>

						</tfoot>
					</table>

				</div>

			</div>


		</div>



	</div>






</div>