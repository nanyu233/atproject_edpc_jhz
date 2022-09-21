/**
 * jeasyui 1.3.2
 * @param id treegrid的id
 * @param url	远程连接
 * @param idField 树表格的唯一标识符
 * @param treeField	//树的表示符 可以和唯一标识符一样
 * @returns
 */
var ZTREEGRID=function(id,url,idField,treeField){
	this.id=id;
	this.url=url;
	this.idField=idField||null;
	this.treeField=treeField||null;
	/**
	 * 
	 *	properity : 需要添加的属性对象
	 * eventobj : 需要绑定的事件 绑定事件名参考jeasyui给出的事件名
	 * **/
	this.ztreegridload = function(propObj,eventObj) {
		var url=this.url;
		var id =this.id;
		var idField = this.idField;
		var treeField = this.treeField;
		var buffer = new Array();
	    buffer.push("$('#' + id).treegrid({");
		buffer.push("url : url,");
		buffer.push("idField : idField,");
		if(propObj){
		$.each( propObj, function(i, n){
				buffer.push(i+" : propObj[\""+i+"\"],");
			});
		}
		if(eventObj){
			$.each( eventObj, function(i, n){
					buffer.push(i+" : eventObj[\""+i+"\"],");
				});
			}
		buffer.push("treeField : treeField");
		buffer.push("});");
		eval(buffer.join(""));//初始化数据
	};
	this.reload = function(){//刷新
		var id=this.id;
		$('#'+id).treegrid('reload');
	};
	this.find = function(idField){
		var id=this.id;
		if(idField){
			$('#'+id).treegrid('find',idField);
		}
	};
	this.getParent = function(rownode){//获取父节点
		var idField = this.idField;
		var id=this.id;
		var node = rownode||$('#'+id).treegrid('getSelected');
		var nodeParent=null;
		if (node){
			nodeParent= $('#'+id).treegrid('getParent', node[idField]);
		}
		return nodeParent;
	};
	this.getChildren=function(rownode){//获取子节点
			var idField = this.idField;
			var id=this.id;
			var node = rownode||$('#'+id).treegrid('getSelected');
			var nodes;
			if (node){
				nodes= $('#'+id).treegrid('getChildren', node[idField]);
			} else {
				nodes = $('#'+id).treegrid('getChildren');
			}
			return nodes;
		};
	this.getSelected = function(){//获取选中节点
		var id=this.id;
		var node = $('#'+id).treegrid('getSelected');
		return node;
	};

	this.collapse =  function (nodeold){//折叠节点
		var idField = this.idField;
		var id = this.id;
		var node = nodeold||$('#'+id).treegrid('getSelected');
		if (node){
			$('#'+id).treegrid('collapse', node[idField]);
		}
	};
	this.expand = function(nodeold){//打开节点
		var idField = this.idField;
		var id = this.id;
		var node = nodeold||$('#test').treegrid('getSelected');
		if (node){
			$('#'+id).treegrid('expand', node[idField]);
		}
	};
	this.collapseAll = function(node){//折叠全部
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('collapseAll', node[idField]);
		} else {
			$('#'+id).treegrid('collapseAll');
		}
	};
	this.expandTo = function(node){//展开到一个节点
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('expandTo', node[idField]);
		}
	};
	this.select = function(node){//选中一个节点传输的数据至少要有节点的主键id
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('select', node[idField]);
		}
	};
	this.expandAll = function(node){//展开全部
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('expandAll', node[idField]);
		} else {
			$('#'+id).treegrid('expandAll');
		}
	};
	this.remove= function(node){//移除一个节点
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('remove', node[idField]);
		}
	};
	this.beginEdit= function(node){//开始编辑节点
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('beginEdit', node[idField]);
		}
	};
	this.endEdit= function(node){//结束编辑节点
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('endEdit', node[idField]);
		}
	};
	this.cancelEdit= function(node){//撤销编辑节点
		var idField = this.idField;
		var id = this.id;
		if (node){
			$('#'+id).treegrid('cancelEdit', node[idField]);
		}
	};
	this.getEditor= function(node,field){//获取编辑中的节点
		var idField = this.idField;
		var id = this.id;
		if (node&&field){
			var editor= $('#'+id).treegrid('getEditor', {id:node[idField],field:field});
			return editor;
		}
	};
	this.getEditorvalue=function(node){//获取编辑器中的值和没有编辑器的数据合并
		if(node){
			var edits = $('#'+id).treegrid('getEditors', node[idField]);
			var obj = {};
			$.each(edits,function(i,n){
				obj[n.field]=n.target.val();
				//alert(n.field+"   "+n.target.val());
			});
			jQuery.extend(node,obj);//对象合并
			return node;
		}
		
	}
	/**
	 * data 插入的数据是一个object对象类型的数组
	 * nodeold 需要插入的节点，默认是选中节点
	 * **/
	this.append = function(data,nodeold) {//插入一个节点
		var idField = this.idField;
		var id = this.id;
		var node = nodeold||$('#' + id).treegrid('getSelected');
		if (!data) {
			$.messager.show({
				title : '提示信息',
				msg : '没有数据无法插入！',
				timeout : 3000,
				showType : 'slide'
			});
			return false;
		}
		$('#' + id).treegrid('append', {
			parent : (node ? node[idField] : null),
			data :  data
		});
	};
	/**
	 * data 插入的数据是一个object对象类型的数组
	 * nodeold 需要插入的节点，默认是选中节点
	 * **/
	this.update = function(data,nodeold) {//更新一个节点
		var idField = this.idField;
		var id = this.id;
		var node = nodeold||$('#' + id).treegrid('getSelected');
		if (!data) {
			$.messager.show({
				title : '提示信息',
				msg : '没有数据无法插入！',
				timeout : 3000,
				showType : 'slide'
			});
			return false;
		}
	    $('#' + id).treegrid('update',{id : node[idField] ,row : data});
	};
	this.ajaxGetNodes = function(urlnew,data,fn){//url,数据,成功回调函数
		var url=urlnew||this.ulr;
		if(url){
			$.ajax({
				   url: url,
				   dataType : "json",
				   async : false,
				   data: data,
				   success: fn
				 });
		}
	};
};