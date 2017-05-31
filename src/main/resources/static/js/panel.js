$(document).ready(function(){
	$('.panel-toggle').on('click', function(){
		$('#demo-panel').toggleClass('panel-hide');
	})
	
	$('.music-panel-toggle').on('click', function(){
		$('#music-panel').toggleClass('panel-hide');
	})
	
	$('#startpause').on('click', function(){
		if ($('#startpause').hasClass("fa-pause")) {
			$('#startpause').removeClass("fa-pause");
			$('#startpause').addClass("fa-play");
		}
		else {
			$('#startpause').removeClass("fa-play");
			$('#startpause').addClass("fa-pause");
		}
	})

	$('#demo-panel ul > li').on('click', function(){
		var color = $(this).attr('data-color');
		$('#skin').attr('href', 'css/skin-'+color+'.min.css');
	})
})