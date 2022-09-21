/**基于jquery Easyyui 的 树的封装

 * id 树的id
 * url 树的远程连接
 * checkbox 是否有checked框
 * **/

function ZTREE(id, url, checkbox) {
	this.id =id;
	this.url =url;
	this.checkbox =checkbox||false;
	/**
	 * 初始化树
	 *	properity:需要添加的属性对象
	 * eventobj : 需要绑定的事件 绑定事件名参考jeasyui给出的事件名
	 * **/
	this.ztreeload = function(propObj,eventObj) {
		var url=this.url;
		var id =this.id;
		var checkbox = this.checkbox;
		
		var buffer = new Array();
	    buffer.push("$('#' + id).tree({");
		buffer.push("url : url,");
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
		buffer.push("checkbox : checkbox");
		buffer.push("});");
		eval(buffer.join(""));//初始化数据
	}
	function checknode(node) {
		if (!node.checked)
			$('#' + id).tree("check", node.target);
		else
			$('#' + id).tree("uncheck", node.target);
		return;
	}
	this.onclickfn=function(node){//打开或者折叠节点
		var id = this.id;
		$('#'+id).tree('toggle', node.target);
	}
	this.reload = function() {//重新加载数据
		var id =this.id;
		$('#' + id).tree('reload');
	}
	this.getChildren = function(nodeOld) {//获取取子节点 可以指定选中节点
		var id =this.id;
		var node = nodeOld||$('#' + id).tree('getSelected');
		var children =null;
		if (node) {
			children = $('#' + id).tree('getChildren', node.target);
		} else {
			children = $('#' + id).tree('getChildren');
		}
		return children;
	}
	this.getChecked = function() {//获取所有选中项 和获取不确定的节点1.3.4
		var id =this.id;
		var nodes = $('#' + id).tree('getChecked',['checked','indeterminate']);
		return nodes;
	}
	this.CheckedAll = function() {//选中所有（checkbox=true）
		var id =this.id;
		var nodes = $('#' + id).tree('getRoots');
		for ( var i = 0; i < nodes.length; i++) {
			$('#' + id).tree("check", nodes[i].target);
		}
	}
	this.unCheckedAll = function() {//全部不选选中所有
		var id =this.id;
		var nodes = $('#' + id).tree('getRoots');
		for ( var i = 0; i < nodes.length; i++) {
			$('#' + id).tree("uncheck", nodes[i].target);
		}
	}
	this.getSelected = function() {//获取选择项
		var id =this.id;
		var node = $('#' + id).tree('getSelected');
		return node;
	}
	this.collapse = function() {//关闭一个选中节点
		var id =this.id;
		var node = $('#' + id).tree('getSelected');
		$('#' + id).tree('collapse', node.target);
	}
	this.expand = function() {//打开一个选中节点
		var id =this.id;
		var node = $('#' + id).tree('getSelected');
		$('#' + id).tree('expand', node.target);
	}
	this.collapseAll = function(node) {//关闭一个指定的节点，没有指定节点则关闭所有节点
		var id =this.id;
		if (node) {
			$('#' + id).tree('collapseAll', node.target);
		} else {
			$('#' + id).tree('collapseAll');
		}
	}
	this.expandAll = function(node) {//全部展开一个指定的节点，没有指定节点则展开全部节点
		var id =this.id;
		if (node) {
			$('#' + id).tree('expandAll', node.target);
		} else {
			$('#' + id).tree('expandAll');
		}
	}
	/**
	 * data 插入的数据是一个object对象类型的数组
	 * nodeold 需要插入的节点，默认是选中节点
	 * **/
	this.append = function(data,nodeold) {//插入一个节点
		var id = this.id;
		var node = nodeold||$('#' + id).tree('getSelected');
		if (!data) {
			$.messager.show({
				title : '提示信息',
				msg : '没有数据无法插入！',
				timeout : 3000,
				showType : 'slide'
			});
			return false;
		}
		$('#' + id).tree('append', {
			parent : (node ? node.target : null),
			data : data
		});
	}
	this.remove = function() {//删除一个选中的节点
		var id =this.id;
		var node = $('#' + id).tree('getSelected');
		$('#' + id).tree('remove', node.target);
	}
	this.removeChildNode = function(node) {//删除一个选中父节点的子节点
		var id =this.id;
		$('#' + id).tree('remove', node.target);
	}
	/**
	 * 更新指定节点
	 * nodenew 节点修改或添加的属性
	 * nodeold 被更新的节点默认是选中节点
	 * **/
	this.update = function(nodenew,nodeold) {//更新数据需要先选中一个节点
		if (!nodenew) {
			$.messager.show({
				title : '提示信息',
				msg : '没有数据无法更新！',
				timeout : 3000,
				showType : 'slide'
			});
			return false;
		}
		var id =this.id;
		var node = nodeold||$('#' + id).tree('getSelected');
		if(node){
			jQuery.extend(node,nodenew);//对象合并
			$('#' + id).tree('update', node);
		}
	}
	this.isLeaf = function() {//检查节点是否是叶子节点
		var id =this.id;
		var node = $('#' + id).tree('getSelected');
		var b = $('#' + id).tree('isLeaf', node.target);
		return b;
	}
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
	}
	
}