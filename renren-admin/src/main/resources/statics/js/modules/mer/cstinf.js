$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'mer/cstinf/list',
        datatype: "json",
        colModel: [			
			{ label: 'merCstNo', name: 'merCstNo', index: 'mer_cst_no', width: 50, key: true },
			{ label: '商户名称', name: 'merName', index: 'mer_name', width: 80 }, 			
			{ label: '商户编码', name: 'merNo', index: 'mer_no', width: 80 }, 			
			{ label: '联系人姓名', name: 'merLegalName', index: 'mer_legal_name', width: 80 },
			{ label: '证件号码', name: 'merIdNumber', index: 'mer_id_number', width: 80 },
			{ label: '联系电话', name: 'merPhone', index: 'mer_phone', width: 80 },
			{ label: '所在省,市', name: 'merProviceCity', index: 'mer_provice_city', width: 80 },
			{ label: '详细地址', name: 'merAddress', index: 'mer_address', width: 80 },
			{ label: '备注', name: 'merRemorkName', index: 'mer_remork_name', width: 80 },
			{ label: '联系人姓名', name: 'merRemrk', index: 'mer_remrk', width: 80 },
			{ label: '邮箱', name: 'merContactEmail', index: 'mer_contact_email', width: 80 },
			{ label: '联系人手机号', name: 'merContactPhone', index: 'mer_contact_phone', width: 80 },
			{ label: 'QQ号', name: 'merContactQq', index: 'mer_contact_qq', width: 80 },
			{ label: '微信号', name: 'merContactWechat', index: 'mer_contact_wechat', width: 80 },
			{ label: '创建时间', name: 'merCreateTime', index: 'mer_create_time', width: 80 },
			{ label: '商户最后修改时间', name: 'merModifyTime', index: 'mer_modify_time', width: 80 }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		cstInf: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.cstInf = {};
		},
		update: function (event) {
			var merCstNo = getSelectedRow();
			if(merCstNo == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(merCstNo)
		},
		saveOrUpdate: function (event) {
			var url = vm.cstInf.merCstNo == null ? "mer/cstinf/save" : "mer/cstinf/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.cstInf),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var merCstNos = getSelectedRows();
			if(merCstNos == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "mer/cstinf/delete",
                    contentType: "application/json",
				    data: JSON.stringify(merCstNos),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(merCstNo){
			$.get(baseURL + "mer/cstinf/info/"+merCstNo, function(r){
                vm.cstInf = r.cstInf;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});