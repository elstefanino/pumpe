$(function() {
	
	
	switch (menu) {

	case 'Opis':
		$('#opis').addClass('active');
		break;
	case 'Kontakt':
		$('#kontakt').addClass('active');
		break;
	case 'Sve ePumpe':
		$('#listaPumpi').addClass('active');
		break;		
	default:
		if (menu == "Pocetna")
			break;
		$('#listPumpi').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}


	var $tabela = $('#pumpeListTable');

	// execute the below code only where we have this table
	if ($tabela.length) {
		 //console.log('test da li cita tabelu!');
		 
		 var jsonUrl = '';
			if (window.gradId == '') {
				jsonUrl = window.contextRoot + '/json/podaci/sve/pumpe';
			} else {
				jsonUrl = window.contextRoot + '/json/podaci/grad/'
						+ window.gradId + '/pumpe';
			}
		 
		 
		 $tabela.DataTable({
			 lengthMenu : [ [ 3, 5, 10, -1 ],
					[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			columns : [
				{
					data : 'code',
					bSortable : false,
					mRender : function(data, type, row) {

						return '<img src="' + window.contextRoot
								+ '/resources/images/' + data
								+ '.jpg" class="dataTableImg"/>';

					}
				},
					{
						data : 'naziv'
					},
					{
						data : 'adresa'
					},
					{
						data : 'opis'
					},
					{
						data : 'cena'
					},
					{
						data : 'id',
						bSortable : false,
							mRender : function(data, type, row){
								var str = '';
								str += '<a href="' + window.contextRoot+ '/prikazi/' + data+'/pumpa" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a>&#160;';
								str += '<a href="' + window.contextRoot+ '/rezervacija/dodaj' + data+'/pumpa"class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
							return str;
							}
					}
					]
		 });
	
}
});


