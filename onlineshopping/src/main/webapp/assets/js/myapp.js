$(function()
	{
	switch(menu)
	{
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#ListProducts').addClass('active');
	$('#a_'+menu).addClass('active');
		break;
	}
	
	
	}	





);


