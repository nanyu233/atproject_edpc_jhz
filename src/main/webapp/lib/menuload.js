﻿

//打开标签窗口
var opentabwindow = function (tabTitle, url, reloadtype) {
  addTab(tabTitle, url, 'icon icon-emergency-record', reloadtype);
};
/**
 * 
 * @param subtitle 标题
 * @param url 访问地址
 * @param icon 图标
 * @wdy changed 2017/06/22
 * @新增 限制tab个数
 */
function addTab(subtitle, url, icon, reloadtype) {
  //如果指定标题的tab不存则添加一个新的
  if (!$('#tabs').tabs('exists', subtitle)) {
    //
    var tabs = $('#tabs').tabs('tabs');
    if (tabs.length > 15) {
      publicFun.alert("选项卡打开数量已达到最大值");
      return
    }
    $('#tabs').tabs('add', {
      title: subtitle,
      content: createFrame(url, reloadtype),
      closable: true,
      iconCls: 'icon ' + icon
    });
  } else {
    if ('2' == reloadtype) {
      $('#tabs').tabs('close', subtitle);
      $('#tabs').tabs('add', {
        title: subtitle,
        content: createFrame(url, reloadtype),
        closable: true,
        iconCls: 'icon ' + icon
      });
    } else {
      //如果tabs已创建则选中
      $('#tabs').tabs('select', subtitle);
      sessionStorage.setItem("isValidateForm", "false");
    }
  }
  sessionStorage.setItem("isValidateForm", "false");
}

function createFrame(url, reloadtype) {
  var s = '<iframe scrolling="auto" frameborder="0"  reloadtype="' + reloadtype + '"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
  return s;
}
