$(function(){
	//目标定位数据 ：jsion 模拟
	var address = new Array();
	 address['0'] = {a:'a',b:'b',c:'c',d:'d'};
	 address['a'] =  {a:'a1',b:'a2',c:'a3',d:'a4'};
	 address['b']  =  {a:'b1',b:'b2',c:'b3',d:'b4'};
	 address['c']  =  {a:'c1',b:'c2',c:'c3',d:'c4'};
	 address['d']  =  {a:'d1',b:'d2',c:'d3',d:'d4'};
	/*
	搜索页面下拉选择	
	 */
	//显示下拉
	$('.car_main_content  dl dd font').click(function(){
		if($(this).hasClass('redio')){
			console.log('显示目标定位');
			//$(this).parent().find('ul').append('<li data-name="aa">啊啊</li>');
			$(this).parent().find('div').show();
			$('.address_select').empty();
			$('.address_select').append('<a class="search_text"><input type="text" class="child_search_input"  value="" ><input type="button" class="child_search_btn" value="搜索" ></a>' );
			$.each(address[0],function(k,v){
				console.log(k,v);
				$('.address_select').append('<li data-name="'+v+'">'+v+'</li>' );
			})
		}else{
			console.log('显示下拉');
			$(this).parent().find('div').show();
		}
		
	})
	// 显示目标定位 子选择
	$('.car_main_content  dl dd .address_select').delegate('li','click',function(){
		var  name = $(this).attr('data-name');
		// console.log(typeof (address[name]));
		$(this).parent().parent().parent().find('input').val($(this).html());
		if (typeof (address[name]) != 'undefined'){
			$('.address_select').empty();
			$('.address_select').append('<a class="search_text"><input type="text" class="child_search_input"  value="" ><input type="button" class="child_search_btn" value="搜索" ></a>' );

			$.each(address[name],function(k,v){
				// console.log(k,v);
				$('.address_select').append('<li data-name="'+v+'">'+v+'</li>' );
			})
		}else{
			
			$(this).parent().parent().hide();
		}
	});
	//显示目标定位 搜索
	$('.car_main_content  dl dd .address_select').delegate('.child_search_btn','click',function(){
		$('.address_select').empty();
		$('.address_select').append('<a class="search_text"><input type="text" class="child_search_input"  value="" ><input type="button" class="child_search_btn" value="搜索" ></a>' );
		$.each(address[0],function(k,v){
			console.log(k,v);
			$('.address_select').append('<li data-name="'+v+'">'+v+'</li>' );
		})
	});
	


	//选择下拉选项
	$('.car_main_content  dl dd ul li').click(function(){
		console.log('选择下拉选项');
		$(this).parent().find('li').removeClass('selected');
		$(this).addClass('selected');
		$(this).parent().parent().parent().find('input').val($(this).html());
		$(this).parent().parent().hide();
	})

	//导航菜单鼠标经过显示隐藏
	$('.nav ul li').on('mouseover',function(){
		$(this).find('dl').show();
	})
	$('.nav ul li').on('mouseout',function(){
		$(this).find('dl').hide();
	})

	//搜索页面 提交显示结果
	$('.sourch_btn').click(function(){
		$('.sourch_result').show();
	})
	
});