<div class="container">

	<!-- Breadcrumb -->
	<div class="row">
		
		<div class="col-xs-12">
		
			
			<ol class="breadcrumb">
			
				<li><a href="${contextRoot}/pocetna">Pocetma</a></li>
				<li><a href="${contextRoot}/prikazi/sve/pumpe">Pumpe</a></li>
				<li class="active">${pumpa.naziv}</li>
			
			</ol>
		
		
		</div>
	
	
	</div>
	
	
	<div class="row">
	
		<!-- Display the product image -->
		<div class="col-xs-12 col-sm-4">
		
			<div class="thumbnail">
							
				<img src="${images}/${pumpa.code}.jpg" class="img img-responsive"/>
						
			</div>
		
		</div>
	
		
		<!-- Display the product description -->	
		<div class="col-xs-12 col-sm-8">
		
			<h3>${pumpa.naziv}</h3>
			<hr/>
			
			<p>${pumpa.opis}</p>
			<hr/>
			
			<h4>Cena: <strong> &#8377; ${pumpa.cena} /-</strong></h4>
			<hr/>
			
			
			
			
			
			
		

							
				
				<a href="${contextRoot}/rezervacija/dodaj/${pumpa.id}/pumpa" class="btn btn-success">
				<span class="glyphicon glyphicon-shopping-cart"></span> Rezervisi</a>
				
				
				
						
				
			
			
			
			
			
				<a href="${contextRoot}/izmeni/${pumpa.id}/pumpa" class="btn btn-success">
				<span class="glyphicon glyphicon-pencil"></span> Izmeni</a>
				
						
			

			<a href="${contextRoot}/prikazi/sve/epumpe" class="btn btn-warning">
				Nastavi</a>
					
		</div>

	
	</div>

</div>