$(function(){
	//初始化页面的验证，基本信息数据加载
	var userId
	var companyNames
	$.ajax({
			type: "get",
			url: 'http://192.168.3.124:8082/userMessage.do',
			async: true,
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				
				
				if(data.redirects!=""){
////					location.href="/"+data.redirects
					location.href="http://192.168.3.124:8082/dengL.do"
				}else if(data.redirects==""){
					console.log(data)
					var datas=data.user
					userId=datas.id
					var userName = datas.userName
					var companyName=datas.companyName
					companyNames=datas.companyName
					if(datas.sex==0){
						var sex='女'
					}else if(datas.sex==1){
						var sex='男'
					}
					var mobile=datas.mobile
					var userEmail=datas.userEmail
					$("#main_name").html(userName)
					$("#userName").html(userName)
					$("#wtb1").html(userName)	
					$("#companyName").html(companyName)
					$("#sex").html(sex)
					$("#mobile").html(mobile)
					$("#userEmail").html(userEmail)
					
				}
		},
		error: function(data){
			console.log(data)
		}
	});

	$("#basicIformation").click(function(){
		$('.changePassword').css('display','none')
		$('.inFormations').css('display','block')
		$(this).addClass("actives")
		$("#changeThepassword").removeClass('actives');
		
	})
	$("#changeThepassword").click(function(){
		$('.changePassword').css('display','block')
		$('.inFormations').css('display','none')
		$(this).addClass("actives")
		$("#basicIformation").removeClass('actives');
		
	})
	$(".navigation li").click(function(){
		$(this).addClass("active").siblings().removeClass('active');
		if($(this).index()==1){
			$('.lists').show()
			
		}else{
			$('.lists').hide()
		}
		if($(this).index()==0){
			location.href="../index.do"
		}
		if($(this).index()==1){
			$('.changePassword').css('display','none')
			$('.inFormations').css('display','block')
			$('.myRelease').css('display','none')
			$("#basicIformation").addClass("actives")
			$("#changeThepassword").removeClass('actives');
				$('.expert_information').css('display','none')
		}
		if($(this).index()==2){
			$('.checkView').off()
			$('.checkViews').off()
			$('.changePassword').css('display','none')
			$('.inFormations').css('display','none')
			$('.myRelease').css('display','block')
			$('.expert_information').css('display','none')
			$.ajax({
				type:"get",
//				url:"http://192.168.3.124:9091/api/bid/alltenders.do",
				url:"http://192.168.3.124:8082/alltenders.do",
				data:{
					"page":1
				},
				async:true,
				success:function(data){
					console.log(data)
					var html=""
					var times
					var initial_page=1
					var datas=data.pagination.list
					html+='<tr height="40"><th width="445">标题</th><th width="200">发布时间</th><th width="230">操作</th></tr>'
					for (var i=0;i<datas.length;i++){
						times=datas[i].startTime
		    		html+='<tr height="40" style="font-size:13px;">'
		        html+='<td >'+datas[i].projectName+'</td>'
		        html+='<td >'+date('Y-m-d',times)+'</td>'
		       html+= '<td >'
		        html+='<button class="checkView" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;margin-right:30px ;">查看</button>'
		       	html+='<button class="deleteList" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">删除</button>'
		        html+='</td> </tr>'
					}
					$("#myRelesa").html(html)
					//查看
						$('.checkView').on('click',function(){
										
										var title=$(this).attr('name')
										layer.open({
										  type: 2,
										  title: false,
										  closeBtn: 2,
										  area: ['1500px', '800px'],
										  shadeClose: true,
										  skin: 'yourclass',
										  content: "../html/myfabu.html?projectName="+title
										});
									})
								//删除发布
					$(".deleteList").click(function(){
							var deltitle=$(this).attr('name')
							$.ajax({
								type: "get",
								url: 'http://192.168.3.124:8082/deleteByneed.do ',
								async: true,
								data:{
									'projectName':deltitle
								},
								datatype: "json",
								beforeSend: function() { 
											},
								success: function(data) {
									console.log(data)
									if(data.success){
										  //询问框
										layer.confirm('确定删除这篇文章？', {
										  btn: ['确定','取消'] //按钮
										}, function(){
										  $(this).parents("tr").remove();
										 location.reload() 
										}, function(){
										 
										});
									}
									
								}
								})
					})
					var all_page=data.pagination.totalPage
				//分页
						$(".page").createPage(function(n){
						console.log(n);
						$.ajax({
									type:"get",
									url:"http://192.168.3.124:8082/alltenders.do",
									data:{
										"page":n
									},
									async:true,
									success:function(data){
										console.log(data)
										var html=""
										var times
										var datas=data.pagination.list
										html+='<tr height="40"><th width="445">标题</th><th width="200">发布时间</th><th width="230">操作</th></tr>'
										for (var i=0;i<datas.length;i++){
											times=datas[i].startTime
							    		html+='<tr height="40" style="font-size:13px;">'
							        html+='<td >'+datas[i].projectName+'</td>'
							        html+='<td >'+date('Y-m-d',times)+'</td>'
							       html+= '<td >'
							        html+='<button class="checkView" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;margin-right:30px ;">查看</button>'
							       	html+='<button class="deleteList" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">删除</button>'
							        html+='</td> </tr>'
										}
										$("#myRelesa").html(html)
										$('.checkView').on('click',function(){
											
											var title=$(this).attr('name')
											layer.open({
											  type: 2,
											  title: false,
											  closeBtn: 2,
											  area: ['1000px', '800px'],
											  shadeClose: true,
											  skin: 'yourclass',
											  content: "../html/myfabu.html?projectName="+title
											});
									})
						//删除发布
							$(".deleteList").click(function(){
								var deltitle=$(this).attr('name')
							$.ajax({
								type: "get",
								url: 'http://192.168.3.124:8082/deleteByneed.do',
								async: true,
								data:{
									'projectName':deltitle
								},
								datatype: "json",
								beforeSend: function() { 
											},
								success: function(data) {
									console.log(data)
									if(data.success){
										  //询问框
										layer.confirm('确定删除这篇文章？', {
										  btn: ['确定','取消'] //按钮
										}, function(){
										  $(this).parents("tr").remove();
										 location.reload() 
										}, function(){
										 
										});
									}
									
								}
								})
					})
									}
								});
					},{
					
						pageCount:all_page,//总页码,默认10
						current:initial_page,//当前页码,默认1
						showPrev:true,//是否显示上一页按钮
						showNext:true,//是否显示下一页按钮
						showTurn:true,//是否显示跳转,默认可以
						showNear:2,//显示当前页码前多少页和后多少页，默认2
						pageSwap:true,//是否同意调剂,默认是。调剂会最大数量显示页码。例如当前页面之前无页码可以显示。则会增加之后的页码。
						showSumNum:true, //是否显示总页码
						align:'right' //对齐方式。默认右对齐。可选：left,right;
					    },{
						"color":"#999999",//字体颜色
						"fontSize":12,//字体大小
						"width":800,//页码总宽度
						"height":30,//页码总高度
						"pagesMargin":5,//每个页码或按钮之间的间隔
						"paddL":0,//左边留白
						"paddR":0,//右边留白
						"borderColor":"#000000",//边线颜色
						"currentColor":"#ed601b",//当前页码的字体颜色
						"disableColor":"#bfbfbf",//不可点击按钮的字体颜色
						"disableBackColor":"#f2f2f2",//不可点击按钮的背景色
						"prevNextWidth":48,//上页下页的宽度
						"pagecountWidth":48,//共计多少也的宽度
						"trunWidth":130,//跳转模块宽度
						"pageWidth":(function(){})()//根据当前所有因素计算出来的最适合宽度。也可自己设定成固定值
					})
    
				}
	
			});
			
			$(".tag span").click(function(){
				$('.checkView').off()
				$('.checkViews').off()
				layer.closeAll(); 
				$(this).addClass("act1").siblings().removeClass('act1');
				if($(this).index()==0){					
					$('.basicInPassword').css('display','block')
					$('.basicInPassbiaobiao').css('display','none')
					$.ajax({
				type:"get",
				url:"http://192.168.3.124:8082/alltenders.do",
				data:{
					"page":1
				},
				async:true,
				success:function(data){
					console.log(data)
					var html=""
					var times
					var initial_page=1
					var datas=data.pagination.list
					html+='<tr height="40"><th width="445">标题</th><th width="200">发布时间</th><th width="230">操作</th></tr>'
					for (var i=0;i<datas.length;i++){
						times=datas[i].startTime
		    		html+='<tr height="40" style="font-size:13px;">'
		        html+='<td >'+datas[i].projectName+'</td>'
		        html+='<td >'+date('Y-m-d',times)+'</td>'
		       html+= '<td >'
		        html+='<button class="checkView" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;margin-right:30px ;">查看</button>'
		       	html+='<button class="deleteList" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">删除</button>'
		        html+='</td> </tr>'
					}
					$("#myRelesa").html(html)
					//查看
						$('.checkView').on('click',function(){
										
										var title=$(this).attr('name')
										layer.open({
										  type: 2,
										  title: false,
										  closeBtn: 2,
										  area: ['1000px', '800px'],
										  shadeClose: true,
										  skin: 'yourclass',
										  content: "../html/myfabu.html?projectName="+title
										});
									})
								//删除发布
					$(".deleteList").click(function(){
							var deltitle=$(this).attr('name')
							$.ajax({
								type: "get",
								url: 'http://192.168.3.124:8082/deleteByneed.do ',
								async: true,
								data:{
									'projectName':deltitle
								},
								datatype: "json",
								beforeSend: function() { 
											},
								success: function(data) {
									console.log(data)
									if(data.success){
										  //询问框
										layer.confirm('确定删除这篇文章？', {
										  btn: ['确定','取消'] //按钮
										}, function(){
										  $(this).parents("tr").remove();
										 location.reload() 
										}, function(){
										 
										});
									}
									
								}
								})
					})
					var all_page=data.pagination.totalPage
				//分页
						$(".page").createPage(function(n){
						console.log(n);
						$.ajax({
									type:"get",
									url:"http://192.168.3.124:8082/alltenders.do",
									data:{
										"page":n
									},
									async:true,
									success:function(data){
										console.log(data)
										var html=""
										var times
										var datas=data.pagination.list
										html+='<tr height="40"><th width="445">标题</th><th width="200">发布时间</th><th width="230">操作</th></tr>'
										for (var i=0;i<datas.length;i++){
											times=datas[i].startTime
							    		html+='<tr height="40" style="font-size:13px;">'
							        html+='<td >'+datas[i].projectName+'</td>'
							        html+='<td >'+date('Y-m-d',times)+'</td>'
							       html+= '<td >'
							        html+='<button class="checkView" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;margin-right:30px ;">查看</button>'
							       	html+='<button class="deleteList" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">删除</button>'
							        html+='</td> </tr>'
										}
										$("#myRelesa").html(html)
										$('.checkView').on('click',function(){
											
											var title=$(this).attr('name')
											layer.open({
											  type: 2,
											  title: false,
											  closeBtn: 2,
											  area: ['1000px', '800px'],
											  shadeClose: true,
											  skin: 'yourclass',
											  content: "../html/myfabu.html?projectName="+title
											});
									})
						//删除发布
							$(".deleteList").click(function(){
								var deltitle=$(this).attr('name')
							$.ajax({
								type: "get",
								url: 'http://192.168.3.124:8082/deleteByneed.do',
								async: true,
								data:{
									'projectName':deltitle
								},
								datatype: "json",
								beforeSend: function() { 
											},
								success: function(data) {
									console.log(data)
									if(data.success){
										  //询问框
										layer.confirm('确定删除这篇文章？', {
										  btn: ['确定','取消'] //按钮
										}, function(){
										  $(this).parents("tr").remove();
										 location.reload() 
										}, function(){
										 
										});
									}
									
								}
								})
					})
									}
								});
					},{
					
						pageCount:all_page,//总页码,默认10
						current:initial_page,//当前页码,默认1
						showPrev:true,//是否显示上一页按钮
						showNext:true,//是否显示下一页按钮
						showTurn:true,//是否显示跳转,默认可以
						showNear:2,//显示当前页码前多少页和后多少页，默认2
						pageSwap:true,//是否同意调剂,默认是。调剂会最大数量显示页码。例如当前页面之前无页码可以显示。则会增加之后的页码。
						showSumNum:true, //是否显示总页码
						align:'right' //对齐方式。默认右对齐。可选：left,right;
					    },{
						"color":"#999999",//字体颜色
						"fontSize":12,//字体大小
						"width":800,//页码总宽度
						"height":30,//页码总高度
						"pagesMargin":5,//每个页码或按钮之间的间隔
						"paddL":0,//左边留白
						"paddR":0,//右边留白
						"borderColor":"#000000",//边线颜色
						"currentColor":"#ed601b",//当前页码的字体颜色
						"disableColor":"#bfbfbf",//不可点击按钮的字体颜色
						"disableBackColor":"#f2f2f2",//不可点击按钮的背景色
						"prevNextWidth":48,//上页下页的宽度
						"pagecountWidth":48,//共计多少也的宽度
						"trunWidth":130,//跳转模块宽度
						"pageWidth":(function(){})()//根据当前所有因素计算出来的最适合宽度。也可自己设定成固定值
					})
    
				}
	
			});
				}else if($(this).index()==1){
					
//——————————————————我的投标————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
					
					$('.basicInPassword').css('display','none')
					$('.basicInPassbiaobiao').css('display','block')
//					$('.checkViews').on('click',function(){
//						layer.closeAll();
//						var title1=$(this).attr('name')
//						layer.open({
//											  type: 2,
//											  title: false,
//											  closeBtn: 2,
//											  area: ['1000px', '800px'],
//											  shadeClose: true,
//											  skin: 'yourclass',
//											  content: "../html/mytoubiao.html?userId="+title1
//											});
//					})
				$.ajax({
				type:"get",
//				url:"http://192.168.3.124:9091/api/bid/getMyBid.do",
//				url:"http://192.168.3.124/api/bid/getMyBid.do?userId="+userId,
				url:"http://192.168.3.124:9091/api/bid/getMyBid.do?com_userId="+1,
//				data:{
//					"page":1
//				},
//				async:true,
				success:function(data){
					
					var html1=""
					var times
					var dsb1
					var initial_page=1
					var datas=data.resultData.Bid
					console.log(datas[0].bidOrder.updatetime)
					html1+=' <tr height="40"><th width="445">投标信息</th><th width="200">投标状态</th><th width="230">投标保证金</th><th width="230">开标时间</th><th width="230">操作</th></tr>'
					for (var i=0;i<datas.length;i++){
						times=datas[i].bidOrder.updatetime
						if(datas[i].bidOrder.payStatus==0){
							dsb1= '未支付'
						}else if(datas[i].bisdOrder.payStatus==1){
							dsb1='已支付' 
						}
						html1+='<tr height="40" style="font-size:13px;">'
				        html1+='<td >'+datas[i].projectName +'</td>'
				        html1+='<td >'+dsb1+'</td>'
				        html1+='<td >'+datas[i].bidOrder.bidBond+'</td>'
				        html1+='<td >'+date('Y-m-d',times)+'</td>'
				        html1+='<td >'
				        html1+='<button class="checkViews" name="'+datas[i].projectName+'" style="width:88px;height:30px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">查看</button></td></tr>'		    
					}
					$("#myRelesas1").html(html1)
					//查看
						$('.checkViews').on('click',function(){
							
						var title1=$(this).attr('name')
						layer.open({
											  type: 2,
											  title: false,
											  closeBtn: 2,
											  area: ['1000px', '800px'],
											  shadeClose: true,
											  skin: 'yourclass',
											  content: "../html/mytoubiao.html?userId="+title1
											});
					})
//					var all_page=data.pagination.totalPage
				//分页
//						$(".page").createPage(function(n){
//						console.log(n);
//						$.ajax({
//									type:"get",
//									url:"http://192.168.3.124:9091/api/bid/alltenders.do",
//									data:{
//										"page":n
//									},
//									async:true,
//									success:function(data){
//										console.log(data)
//										var html=""
//										var times
//										var datas=data.pagination.list
//										html+='<tr height="40"><th width="445">投标信息</th><th width="200">投标状态</th><th width="230">投标保证金</th><th width="230">开标时间</th><th width="230">操作</th></tr>'
//										for (var i=0;i<datas.length;i++){
//											times=datas[i].startTime
////							    		html+='<tr height="40" style="font-size:13px;">'
////							        html+='<td >'+datas[i].projectName+'</td>'
////							        html+='<td >'+date('Y-m-d',times)+'</td>'
////							       html+= '<td >'
////							        html+='<button class="checkView" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;margin-right:30px ;">查看</button>'
////							       	html+='<button class="deleteList" name="'+datas[i].projectName+'" style="width:58px;height:20px;border:1px solid #9d9d9d; font-size: 12px; border-radius: 5px;">删除</button>'
////							        html+='</td> </tr>'
//										}
//										$("#myRelesas1").html(html)
//										$('.checkViews').click(function(){
//											
//										var title1=$(this).attr('name')
//										layer.open({
//											  type: 2,
//											  title: false,
//											  closeBtn: 2,
//											  area: ['1000px', '800px'],
//											  shadeClose: true,
//											  skin: 'yourclass',
//											  content: "../html/mytoubiao.html?userId="+title1
//											});
//										})
//				
//									}
//								});
//					},{
//					
//						pageCount:all_page,//总页码,默认10
//						current:initial_page,//当前页码,默认1
//						showPrev:true,//是否显示上一页按钮
//						showNext:true,//是否显示下一页按钮
//						showTurn:true,//是否显示跳转,默认可以
//						showNear:2,//显示当前页码前多少页和后多少页，默认2
//						pageSwap:true,//是否同意调剂,默认是。调剂会最大数量显示页码。例如当前页面之前无页码可以显示。则会增加之后的页码。
//						showSumNum:true, //是否显示总页码
//						align:'right' //对齐方式。默认右对齐。可选：left,right;
//					    },{
//						"color":"#999999",//字体颜色
//						"fontSize":12,//字体大小
//						"width":800,//页码总宽度
//						"height":30,//页码总高度
//						"pagesMargin":5,//每个页码或按钮之间的间隔
//						"paddL":0,//左边留白
//						"paddR":0,//右边留白
//						"borderColor":"#000000",//边线颜色
//						"currentColor":"#ed601b",//当前页码的字体颜色
//						"disableColor":"#bfbfbf",//不可点击按钮的字体颜色
//						"disableBackColor":"#f2f2f2",//不可点击按钮的背景色
//						"prevNextWidth":48,//上页下页的宽度
//						"pagecountWidth":48,//共计多少也的宽度
//						"trunWidth":130,//跳转模块宽度
//						"pageWidth":(function(){})()//根据当前所有因素计算出来的最适合宽度。也可自己设定成固定值
//					})
    
				}
	
			});
				}
			})
			
		}
		if($(this).index()==3){
			$('.changePassword').css('display','none')
			$('.inFormations').css('display','none')
			$('.myRelease').css('display','none')
			$('.expert_information').css('display','block')
			$.ajax({
			type: "get",
			url: 'http://192.168.3.124:9091/api/bid/queryExpert.do',
			async: true,
			data:{
				'id':userId
			},
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				$("#btnrz").attr("name",userId)
				if(data!=""){
					$(".basicInformation").show()
					$(".basicInformationone").hide()
					
				console.log(data)
				var zjName=data.spare3
				var major=data.major
				var zjuserEmail=data.spare4
				$("#zjName").html(zjName)
				$("#major").html(major)
				$("#zjuserEmail").html(zjuserEmail)
				$("#btnzj").attr("name",data.id)
				$("#delzj").attr("name",data.id)
				
				
				
				
//专家信息编辑
//	location.href = "zjXq1.html?id="+$(this).attr('id'); 
	$("#btnzj").click(function(){
		location.href = "Expert_infor.html?id="+$(this).attr('name'); 
	})
//专家信息删除
$("#delzj").click(function(){
	 var id=$(this).attr('name')
		  //询问框
					layer.confirm('确认删除专家信息吗？？', {
										btn: ['确定','取消'] //按钮
								}, function(){
									$.ajax({
											type: "post",
												url: 'http://192.168.3.124:9091/api/bid/deleteExpert.do',
												async: true,
												data:{
													'id':id
												},
												datatype: "json",
												success:function(data){
													console.log(data)
													location.reload() 
												}
										})
									
										
										}, function(){
										 layer.msg("删除信息失败")
										});
	
	

})
				}else{
					$(".basicInformation").hide()
					$(".basicInformationone").show()
				}

			}
			})
			
		}
		if($(this).index()==4){
			$('.changePassword').css('display','none')
			$('.inFormations').css('display','none')
			$('.myRelease').css('display','none')
			$('.expert_information').css('display','none')
			
		}
		if($(this).index()==5){
			$('.changePassword').css('display','none')
			$('.inFormations').css('display','none')
			$('.myRelease').css('display','none')
				$('.expert_information').css('display','none')
		}
	})
	//专家库入驻
	$("#btnrz").click(function(){
		location.href ="Expert_infor.html";
	})
	//基本信息编辑
	$("#btn").click(function(){
	layer.open({
		  type: 1,
		  title: false,
		  closeBtn: 2,
		  area: ['700px', '300px'],
		  shadeClose: true,
		  skin: 'yourclass',
		  content: $(".t_basicInformation")
		});
	})
	$("#nicknames").click(function(){
		if($("#nickname").val().length<=8){
			$.ajax({
			type:"get",
			url:"http://192.168.3.124:9091/api/bid/updateMessage.do",
			data:{"companyName":$("#nickname").val(),
					"id":userId
			},
			async:true,
			success:function(data){
				console.log(data)
				location.reload()      
			}
		});
		}else{
			layer.msg("请输入小于8位的昵称")
		}
		
	})
	//修改密码模块验证
		$("#currentPassword").blur(function(){
				  $(this).css("background-color","#D6D6FF");
				  $.ajax({
			type: "get",
			url: 'http://192.168.3.124:9091/api/bid/ajaxPassword.do',
			async: true,
			data:{
				'password':$("#currentPassword").val()
			},
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				if(data.admin==0){
					layer.msg('密码输入错误');
					$(this).css('border',"red")
						$("#currentPassword").css('borderColor',"red")
					
				}else if(data.admin==1){
						$("#currentPassword").css('borderColor',"")
					
				}
				
		},
		error: function(data){
			console.log(data)
		}
	});
				  
				});
	
	//新密码验证
		$("#newPassword").blur(function(){
		$.ajax({
			type: "get",
			url: 'http://192.168.3.124:9091/api/bid/ajaxPassword.do',
			async: true,
			data:{
				'password':$("#currentPassword").val()
			},
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				if(data.admin==0){
					layer.msg('原密码输入错误');
					$("#currentPassword").css('borderColor',"red")
						 layer.msg('请先输入原密码');
				}else if(data.admin==1){
					$("#currentPassword").css('borderColor',"")
						  if($("#newPassword").val()){
						  	var patten = /^[0-9a-zA-Z_]{6,18}$/ig;
						  	var psdd=$("#newPassword").val()
				            	if(patten.test(psdd)){
				       				
				       			$("#mesePsw").css("color","#999999");
								$("#mesePsw").html("请输入6-18个字符，可使用字母,数字，下划线")
				       				
				            }else{
				            	$("#mesePsw").html("*密码格式错误,请输入6-18个字符，可使用字母,数字，下划线")
				       				$("#mesePsw").css("color","red");
				            }
				            }
						
				}
				
		},
		error: function(data){
			console.log(data)
		}
	});
				  
				});
		//新密码二次验证
		$("#newsPassword").blur(function(){
		$.ajax({
			type: "get",
			url: 'http://192.168.3.124:9091/api/bid/ajaxPassword.do',
			async: true,
			data:{
				'password':$("#currentPassword").val()
			},
			datatype: "json",
			beforeSend: function(){ 
						},
			success: function(data){
				console.log(data)
				if(data.admin==0){
					layer.msg('原密码输入错误');
					$("#currentPassword").css('borderColor',"red")
						 layer.msg('请先输入原密码');
				}else if(data.admin==1){
					$("#currentPassword").css('borderColor',"")
						  if($("#newPassword").val()){
						  	var psdn=$("#newPassword").val()
//				            	if(patten.test(psdn)){
//				       				$("#mesePsw").html("请输入6-18个字符，可使用字母,数字，下划线")
//				       			$("#mesePsw").css("color","#999999");
								//新密码二次对比验证
									  if($("#newsPassword").val()==$("#newPassword").val()){
							       		
							            }else{
							            	 layer.msg('两次密码不一致');
							            }
//				            }else{
//				            	
//							       $("#mesePsw").html("*密码格式错误,请输入6-18个字符，可使用字母,数字，下划线")
//				       				$("#mesePsw").css("color","red");     
//									
//								
//				            }
				            }
						
				}
				
		},
		error: function(data){
			console.log(data)
		}
	});
				  
				});
	//修改密码提交 
	$("#xgPassword").click(function(){
			$.ajax({
			type: "get",
			url: 'http://192.168.3.124:9091/api/bid/ajaxPassword.do',
			async: true,
			data:{
				'password':$("#currentPassword").val()
			},
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				if(data.admin==0){
					layer.msg('原密码输入错误');
					$("#currentPassword").css('borderColor',"red")
						 layer.msg('请先输入原密码');
				}else if(data.admin==1){
					$("#currentPassword").css('borderColor',"")
						  if($("#newPassword").val()){
						  		var patten =/^[0-9a-zA-Z_]{6,18}$/ig;
						  		var psdn=$("#newPassword").val()
				            	if(patten.test(psdn)){
				       				$("#mesePsw").html("请输入6-18个字符，可使用字母,数字，下划线")
				       				$("#mesePsw").css("color","#999999");
								//新密码二次对比验证
									  if($("#newsPassword").val()==$("#newPassword").val()){
							       		$.ajax({
											type: "get",
											url: 'http://192.168.3.124:9091/api/bid/updatePassword.do',
											async: true,
											data:{
												'password':$("#currentPassword").val(),
												'newpassword':$("#newPassword").val()
											},
											datatype: "json",
											beforeSend: function() { 
														},
											success: function(data) {
											
												console.log(data)
												 location.reload()
										},
										error: function(data){
											console.log(data)
											
										}
									});
							            }else{
							            	 layer.msg('两次密码不一致');
							            }
				            }else{
				            	
							       $("#mesePsw").html("*密码格式错误,请输入6-18个字符，可使用字母,数字，下划线")
				       			$("#mesePsw").css("color","red");     
									
								
				            }
				            }
						
				}
				
		},
		error: function(data){
			console.log(data)
		}
	});
				   
})

	
	
	 function getLocalTime(nS) {     
       return new Date(parseInt(nS)).toLocaleString().replace(/年|月/g, "-").replace(/日/g, " ");      
    }   
    
})
