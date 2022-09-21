
var width = $(window).width();
var _initWidth = 0;
if (width <= 1366 && width>= 960) {
    _initWidth = 150
} else {
    _initWidth = 180
}
function noTransitionSetLayout(leftBarWth) {
    var _thisWidth = $(window).width() - leftBarWth;
    $('#mainPanle').parent().width(_thisWidth+ 2);
    $('#mainPanle').width(_thisWidth);
    $('#mainPanle').children().find('div').width(_thisWidth);
    $('#mainPanle').children().find('div.tabs-scroller-left').width(20);
    $('#mainPanle').children().find('div.tabs-scroller-right').width(20);
    $('#tabs').width(_thisWidth);
}
function setLayout(leftBarWth){
    var _thisWidth = $(window).width()-leftBarWth;
    $('#mainPanle').parent().css({ 'width': '' + _thisWidth + 2 + '', 'transition': 'all .3s' });
    $('#mainPanle').css({ 'width': '' + _thisWidth + '', 'transition': 'all .3s'});
    $('#mainPanle').children().find('div').css({ 'width': '' + _thisWidth + '', 'transition': 'all .3s' });
    $('#mainPanle').children().find('div.tabs-scroller-left').width(20);
    $('#mainPanle').children().find('div.tabs-scroller-right').width(20);
    $('#tabs').css({ 'width': '' + _thisWidth + '', 'transition': 'all .3s' });
}
$(function(){
    noTransitionSetLayout(_initWidth);
    $('#mainPanle').parent().addClass('leftPositon');
    $('#mainPanle').parent().removeClass('minileftPositon');
    //nav-mini切换
    $('#mini').on('click',function(){
        if (!$('.nav').hasClass('nav-mini')) {
            $('.nav-item.nav-show').removeClass('nav-show');
            $('.nav-item').children('ul').removeAttr('style');
            $('.nav').addClass('nav-mini');
            $('.menuBar').hide();
            noTransitionSetLayout(45);
            $('#mainPanle').parent().removeClass('leftPositon');
            $('#mainPanle').parent().addClass('minileftPositon');
            // $('.subMenu').css('max-height','360px');
            $('.subMenu li a').css('padding-left','10px');
        }else{
            $('.subMenu li a').css('padding-left', '30px');
            if (_initWidth == 150) {
                $('.subMenu li a').css('padding-left', '10px'); 
            }
            $('.menuBar').show();
            $('.nav').removeClass('nav-mini');
            noTransitionSetLayout(_initWidth);
            $('#mainPanle').parent().addClass('leftPositon');
            $('#mainPanle').parent().removeClass('minileftPositon');
            // if($('.nav-item a.nav-a').hasClass('nav-hover')){
            //     $('.nav-item a.nav-hover').parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
            // }
            if($('.nav-item i.nav-more').hasClass('at-fa-down')){
                $('.nav-item i.at-fa-down').parent().parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
            }
        }
        var height = $(window).height();
        var maxContentHeight = height - 64 - 37*inum;
        $('.subMenu').css({"max-height": "" + maxContentHeight + ""});
    });
});
window.onload = function() {
    window.onresize = noTransitionSetLayout;
    var _width = $('.nav').width();
    noTransitionSetLayout(_width)
}
$(window).resize(function() {  
    var _width = $('.nav').width();
    setTimeout(function(){ noTransitionSetLayout(_width) }, 200);
    var height = $(window).height();
    var maxContentHeight = height - 64 - 37*inum;
    $('.subMenu').css({"max-height": "" + maxContentHeight + ""});
});  

//打开标签窗口
var opentabwindow = function (tabTitle, url, reloadtype) {
    addTab(tabTitle, encodeURI(url), 'icon icon-emergency-record', reloadtype);
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