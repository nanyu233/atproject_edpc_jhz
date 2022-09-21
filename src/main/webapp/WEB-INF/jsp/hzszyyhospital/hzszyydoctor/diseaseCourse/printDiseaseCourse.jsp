<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
	<script type="text/javascript">
		//const cfjlSeqList = new Set(),jjbjlSeqList=new Set(),qjjlSeqList=new Set(),diseaseCourseSeqList=new Set();
		var cfjlSeqList = [], jjbjlSeqList = [], qjjlSeqList = [], diseaseCourseSeqList = [], operateInfList = [], transfusionSeqList = [];
		//首次病程打印基础
		function initBaseHtmlDom_first() {
			var initBaseHtmlDom = [];
			initBaseHtmlDom.push(
				'<div style="margin:0;padding:0 5mm;width:95%;font-family:\5fae\8f6f\96c5\9ed1;">',
				'<div style="display:block;float:left;width:15%;margin-left:5%">',
				'<img style="width:15mm;vertical-aligh:middle;text-align:center;float:right;margin-top:1mm" src="../images/hems/print/printLogo.jpg">',
				'</div>',
				'<div id="titleDivJZ" style="float:left;margin:0;width:65%;text-align:center;margin-top:1mm">',
				'<div style="font-size:0.6cm"><label id="id_title1">${nurseDocumentName}</label></div>',
				'<div style="font-size:0.6cm;font-weight:bolder"><label id="id_title2">病程记录</label></div>',
				'</div>',
				'<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;color:#333;width:100%;display:block;float:left">姓名：${hspemginfCustom.cstNam}&emsp;&emsp;性别：${hspemginfCustom.cstSexCod}&emsp;&emsp;年龄：', '${hspemginfCustom.cstAge}' || '__/__', '${hspemginfCustom.cstAgeCod}', '&emsp;&emsp;科别：急诊科门诊&emsp;&emsp;病历号：${hspemginfCustom.mpi}&emsp;&emsp;</p><hr style="margin:1mm 0 1mm 0;float:left;width:100%"/ >',
				'</div>'
			);
			return initBaseHtmlDom.join('');
		}
		function initHtmlDom(row, idx) {
			//判断是否为病程
			if (row.courseType) {
				switch (row.courseType) {
					// case "1":
					// 	diseaseCourseSeqList.push(row.diseaseCourseSeq);
					// 	return initHtmlDom_first(row, idx);
					// 	break;
					case "2":
						diseaseCourseSeqList.push(row.diseaseCourseSeq);
						return initHtmlDom_daily(row, idx);
						break;
					case "4":
						diseaseCourseSeqList.push(row.diseaseCourseSeq);
						return initHtmlDom_critical(row, idx);
						break;
				}
			} else if (row.cfjlType && row.cfjlType == '9') { //判断是否为查房
				cfjlSeqList.push(row.cfjlSeq);
				return initHtmlDom_editHead(row, idx);
			} else if (row.cfjlType) {
				cfjlSeqList.push(row.cfjlSeq);
				return initHtmlDom_cfjl(row, idx);
			} else if (row.jjbjlType) {//判断是否为交接班
				// jjbjlSeqList.push(row.jjbjlSeq);
				// return initHtmlDom_jjbjl(row, idx);
			} else if (row.operSeq) { // 手术病程记录
				operateInfList.push(row.operSeq);
				return initHtmlDom_operate(row, idx);
			} else if (row.transfusionSeq) { // 输血(血制品)记录
				transfusionSeqList.push(row.transfusionSeq);
				return initHtmlDom_transfusion(row, idx);
			} else {//抢救记录
				qjjlSeqList.push(row.qjjlSeq);
				return initHtmlDom_qjjl(row, idx);
			}
		}

		//首次病程打印内容
		function initHtmlDom_first(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var initHtmlDomList = [];
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			$.each(_imgList, function (index, val) {
				_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
			})

			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;float:left;width:95%;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">首次病程记录</p>',
				'<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;">',
				'<span>', publicFun.timeFormat(row['courseDateStr'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">一、病例特点：</span>',
				'</p>',
				//'<p style="margin:0;padding:0;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;color: ' + colorFt + '">', '&emsp;&emsp;', row.diseasePoint, '</pre>',
				//'</p>',
				'<br/>',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">二、初步诊断：</span>',
				'</p>',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;color: ' + colorFt + '">', '&emsp;&emsp;', row.jbzdDes, '</pre>',
				'<br/>',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">三、诊疗计划：</span>',
				'</p>',
				//'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;color: ' + colorFt + '">', '&emsp;&emsp;', row.treatmentPlan, '</pre>',
				//'</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'<label>记录医师：</label><span>', row.createNam, '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>'
			);
			return initHtmlDomList.join('');
		}
		//日常病程打印内容
		function initHtmlDom_daily(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var initHtmlDomList = [];
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			$.each(_imgList, function (index, val) {
				_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
			})
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span>', publicFun.timeFormat(row['courseDateStr'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>', '&emsp;', '&emsp;',
				'<span style="color: ' + colorFt + '">日常病程记录</span>',
				'</p>',
				// '<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;color: ' + colorFt + '">', '&emsp;&emsp;', row['record'], '</pre>',
				// '</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'<label>记录医师：</label><span>', row['createNam'], '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}

		// 手术操作病程打印内容
		function initHtmlDom_operate(row, idx, trans) {
			var colorFt = '';
			if (trans) {
				colorFt = '#fff'
			} else {
				colorFt = '#000'
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">手术、操作病程记录：</span>',
				'</p>',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;color: ' + colorFt + '">', '&emsp;&emsp;', row['operBcjl'], '</pre>',
				'<br/>',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">病程记录名称：', row['operNam'], '</span>',
				'</p>',
				'<div style="float:left;width:40%;text-align:left;list-style:none;margin-left:60%;padding-bottom:2mm;font-size:.38cm;">',
				'<label>手术操作医生：</label><span>', row['operYs'], '</span>',
				'</div>',
				'<div style="float:left;width:40%;text-align:left;list-style:none;margin-left:60%;padding-bottom:2mm;font-size:.38cm;">',
				'<label class="lab-span">日期：</label><span>', publicFun.timeFormat(row['operDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>',
				'</div>',
				'</div>')
			return initHtmlDomList.join('');
		}

		//极危值病程打印内容
		function initHtmlDom_critical(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var initHtmlDomList = [];
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			$.each(_imgList, function (index, val) {
				_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
			})
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;">',
				'<span>', publicFun.timeFormat(row['courseDateStr'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>', '&emsp;', '&emsp;',
				'<span>危急值病程记录</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">一、危急值及报告时间：</span>',
				'</p>',
				//'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: ' + colorFt + '">', '&emsp;&emsp;', row['reportingTime'], '</pre>',
				//'</p>',
				'<br/>',
				//           '<p style="margin:0;padding:0;font-size:.38cm;">',
				//           '<span style="font-weight:bold;color: '+ colorFt + '">二、危急值数据临床意义：</span>',
				//           '</p>',
				//           //'<p style="margin:0;padding:0;font-size:.38cm;">',
				// '<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: '+ colorFt + '">','&emsp;&emsp;',row['criticalSignificance'],'</pre>',
				//           //'</p>',
				//           '<br/>',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold;color: ' + colorFt + '">二、处理措施：</span>',
				'</p>',
				//'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: ' + colorFt + '">', '&emsp;&emsp;', row['treatmentMeasures'], '</pre>',
				//'</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'<label>记录医师：</label><span>', row['createNam'], '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}

		//可编辑抬头打印
		function initHtmlDom_editHead(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			if (_imgList) {
				$.each(_imgList, function (index, val) {
					_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
				})
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;font-size:.38cm;color: ' + colorFt + '">',
				//'<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;">',
				'<span style="color: ' + colorFt + '">', publicFun.timeFormat(row['cfjlDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '&emsp;', '&emsp;',
				row['checkNam'],
				'</span><br /><pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: ' + colorFt + '">', '&emsp;&emsp;', row['cfjlContent'] || '', '</pre>',
				//'</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'<label>记录医师：</label><span style="color: ' + colorFt + '">', row['cfjlNam'] || '', '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}

		//查房记录打印内容
		function initHtmlDom_cfjl(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			if (_imgList) {
				$.each(_imgList, function (index, val) {
					_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
				})
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;font-size:.38cm;color: ' + colorFt + '">',
				//'<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;">',
				'<span style="color: ' + colorFt + '">', publicFun.timeFormat(row['cfjlDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '&emsp;', '&emsp;',
				row['checkNam'] || '', ['主任医师', '副主任医师', '主治医师'][row['cfjlType']] || '',
				'查房记录</span><br /><pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: ' + colorFt + '">', '&emsp;&emsp;', row['cfjlContent'] || '', '</pre>',
				//'</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'<label>记录医师：</label><span style="color: ' + colorFt + '">', row['cfjlNam'] || '', '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}
		//交接班打印内容
		function initHtmlDom_jjbjl(row, idx, trans) {
			var colorFt = '';
			if (trans) {
				colorFt = '#fff'
			} else {
				colorFt = '#000'
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="color: ' + colorFt + '">', publicFun.timeFormat(row['jjbjlDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>',
				'&emsp;&emsp;<span style="color: ' + colorFt + '">', row['jjbjlType'] == '0' ? '交班记录' : '接班记录', '</span>',
				'</p>',
				//'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0;color: ' + colorFt + '">', '&emsp;&emsp;', row['jjbjlContent'] || '', '</pre>',
				//'</p>',
				'<p style="float:left;margin:0;margin-left:65%;padding:2mm 0 0 0;width:35%;list-style:none;text-align:left;font-size:.38cm">',
				'记录医师 ：<span style="color: ' + colorFt + '">', row['jjbjlNam'] || '', '</span>',
				'</p>',
				'</div>');
			return initHtmlDomList.join('');
		}

		//抢救记录打印内容
		function initHtmlDom_qjjl(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			if (_imgList) {
				$.each(_imgList, function (index, val) {
					_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
				})
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;float:left;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="color: ' + colorFt + '">', publicFun.timeFormat(row['createDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>', '&emsp;', '&emsp;',
				'<span>抢救记录</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">&emsp;&emsp;&emsp;&emsp;是否抢救成功：</span><span style="color: ' + colorFt + '">', row['qjjlIsSucc'] == '0' ? '是' : '否', '</span>', '&emsp;', '&emsp;',
				'<span style="font-weight:bold; color: ' + colorFt + '">抢救人员：</span><span style="color: ' + colorFt + '">', row['qjjlJlnam'] || '', '</span>',
				'</p>',
				//'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0; color: ' + colorFt + '">', '&emsp;&emsp;', row['qjjlContent'] || '', '</pre>',
				//'</p>',
				'<br/>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'记录医师 ：<span style="color: ' + colorFt + '">', row['qjjlNam'] || '', '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}

    // 输血(血制品)记录
		function initHtmlDom_transfusion(row, idx, trans) {
			var colorFt = '',
				showImg = '';
			if (trans) {
				colorFt = '#fff',
				showImg = 'none'
			} else {
				colorFt = '#000'
			}
			var _imgList = row.hspAotographInfoList;
			var _imgStr = '';
			if (_imgList) {
				$.each(_imgList, function (index, val) {
					_imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,' + val.docImg + '">'
				})
			}
			var initHtmlDomList = [];
			initHtmlDomList.push(
				'<div style="margin:0;padding:0 5mm;width:95%;font-family:\5fae\8f6f\96c5\9ed1;color: ' + colorFt + '">',
				'<p style="margin:0;padding:0;font-size:.38cm;">',
				'<span style="color: ' + colorFt + '">', publicFun.timeFormat(row['transfusionDat'] || '', 'yyyy年MM月dd日 hh时mm分'), '</span>', '&emsp;', '&emsp;',
				'<span>输血(血制品)记录</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输注时间：</span><span style="color: ' + colorFt + '">', publicFun.timeFormat(row['infusionStartDat'] || '', 'yyyy/MM/dd hh:mm:ss'), '-' , publicFun.timeFormat(row['infusionEndDat'] || '', 'yyyy/MM/dd hh:mm:ss') ,'</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血(血制品)指征：</span><span style="color: ' + colorFt + '">', row['indication'] || '', '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血(血制品)成分：</span><span style="color: ' + colorFt + '">', row['composition'] || '', '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血(血制品)量：</span><span style="color: ' + colorFt + '">', row['amount'] || '', '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血前评估及处理：</span>',
				'</p>',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0; color: ' + colorFt + '">', '&emsp;&emsp;', row['assessment'] || '', '</pre>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输注过程：</span>',
				'</p>',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0; color: ' + colorFt + '">', '&emsp;&emsp;', row['infusionProcess'] || '', '</pre>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血后评估：</span><span style="color: ' + colorFt + '">', row['vitalSigns'] || '', '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血反应：</span><span style="color: ' + colorFt + '">', row['reaction'] === '0' ? '无' : '有', row['reactionContent'] ? row['reactionContent'] : '', '</span>',
				'</p>',
				'<p style="margin:2mm 0 0 0;padding:0;font-size:.38cm;">',
				'<span style="font-weight:bold; color: ' + colorFt + '">输血(血制品)疗效评价计划：</span>',
				'</p>',
				'<pre style="white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:2mm 0 0 0; color: ' + colorFt + '">', '&emsp;&emsp;', row['evaluationPlan'] || '', '</pre>',
				'<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
				'医师签名 ：<span style="color: ' + colorFt + '">', row['docNam'] || '', '</span><span style="display:'+showImg+'">', _imgStr, '</span>',
				'</div>',
				// '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
				// '<label>电子签名：</label><span style="display:'+showImg+'">', _imgStr, '</span>',
				// '</div>',
				'</div>');
			return initHtmlDomList.join('');
		}

		//拼接旧医嘱记录，设为透明
		function initHtmlDom_transparent(row, idx) {
			//判断是否为病程
			if (row.courseType) {
				switch (row.courseType) {
					// case "1":
					// 	return initHtmlDom_first(row, idx, 'trans');
					// 	break;
					case "2":
						return initHtmlDom_daily(row, idx, 'trans');
						break;
					case "4":
						return initHtmlDom_critical(row, idx, 'trans');
						break;
					// case "9":
					// 	return initHtmlDom_hzjl_transparent(row, idx, 'trans');
					// 	break;
				}
			} else if (row.cfjlType && row.cfjlType == '9') { //判断是否为查房
				return initHtmlDom_editHead(row, idx, 'trans');
			} else if (row.cfjlType) { //判断是否为查房
				return initHtmlDom_cfjl(row, idx, 'trans');
			} else if (row.jjbjlType) {//判断是否为交接班
				// return initHtmlDom_jjbjl(row, idx, 'trans');
			} else if (row.operSeq) {
				return initHtmlDom_operate(row, idx, 'trans');
			} else if (row.transfusionSeq) { // 输血(血制品)记录
				return initHtmlDom_transfusion(row, idx, 'trans');
			} else {//抢救记录
				return initHtmlDom_qjjl(row, idx, 'trans');
			}
		}

		function printall(allRows) {
			cfjlSeqList = [];
			// jjbjlSeqList = [];
			qjjlSeqList = [];
			diseaseCourseSeqList = [];
			operateInfList = [];
			transfusionSeqList = [];
			if (allRows.length > 0) {
				try {
					// LODOP = window.top.getLodop();
					LODOP = getLodop();
					LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
					LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
					LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
					LODOP.SET_PRINT_STYLE('FontSize', 10); // 设置打印字体
					LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', initBaseHtmlDom_first());
					LODOP.SET_PRINT_STYLEA(1, 'ItemType', 1);
					LODOP.ADD_PRINT_TEXT(1050, 344, '90%', '100%', "第#页/共&页");
					LODOP.SET_PRINT_STYLEA(2, 'ItemType', 2);
					var allDiv = $("<div>");
					for (var i = 0; i < allRows.length; i++) {
						allDiv.append(initHtmlDom(allRows[i], i));
					}

					LODOP.ADD_PRINT_HTM(100, 0, '100%', '82%', allDiv.html());
					LODOP.PREVIEW();
					if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
						// console.log("************全打印************");
						// console.log(Value);
						if (Value == 1) {
							// getTotalPage('PREVIEW_PAGE_COUNT');//PREVIEW_PAGE_COUNT----打印预览时或打印后，获得总页数
							getTotalPage('PRINTSETUP_PAGE_COUNT');//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
						}
					}
				} catch (e) {
					$.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
				}
			} else {
				$.messager.alert('提示信息', '当前无打印数据', 'warning');
			}

		}

		function getTotalPage(strType) {
			var LODOP = getLodop();
			var ajaxOption = new AjaxOption();
			ajaxOption.requestType = 'POST';
			ajaxOption.requestDataType = "json";
			// var pages;
			if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
				// pages = Value;
				// console.log("&&&&&&& C-Lodop &&&&&&&&");
				// console.log(Value);

				ajaxOption.requestData = {
					'emgSeq': window.parent.$('#emgSeq').val(),
					'printPage': Value,
					'printType': '2',
					'diseaseCourseSeqList': diseaseCourseSeqList,
					'cfjlSeqList': cfjlSeqList,
					// 'jjbjlSeqList': jjbjlSeqList,
					'qjjlSeqList': qjjlSeqList,
					'operateInfList': operateInfList,
					'transfusionSeqList': transfusionSeqList
				};
				ajaxOption.requestUrl = "${baseurl}diseaseCourse/afterPrint.do";
				ajaxOption.asyncFlg = false;
				ajaxOption.returnDataType = 'json';
				_ajaxPostRequest(ajaxOption, null, function (res) {
					// console.log('发送上传页数后：');
					// console.log(res);
				});
			};
			var stResult = LODOP.GET_VALUE(strType, "0");
			if (!LODOP.CVERSION) {
				// pages = stResult;
				// console.log("&&&&&&& LODOP &&&&&&&&");
				// var ajaxOption = new AjaxOption();
				// ajaxOption.requestType = 'POST';
				// ajaxOption.requestDataType = "pame";
				ajaxOption.requestData = {
					'emgSeq': window.parent.$('#emgSeq').val(),
					'printPage': stResult,
					'printType': '2',
					'diseaseCourseSeqList': diseaseCourseSeqList,
					'cfjlSeqList': cfjlSeqList,
					// 'jjbjlSeqList': jjbjlSeqList,
					'qjjlSeqList': qjjlSeqList,
					'operateInfList': operateInfList,
					'transfusionSeqList': transfusionSeqList
				};
				ajaxOption.requestUrl = "${baseurl}diseaseCourse/afterPrint.do";
				ajaxOption.asyncFlg = false;
				ajaxOption.returnDataType = 'json';
				_ajaxPostRequest(ajaxOption, null, function (res) {
					// console.log('发送上传页数后：');
					// console.log(res);
				});
			}
		}

		function continuePrint(rows, oldPages) {
			cfjlSeqList = [];
			// jjbjlSeqList = [];
			qjjlSeqList = [];
			diseaseCourseSeqList = [];
			operateInfList = [];
			transfusionSeqList = [];
			var rows_old = [], rows_new = [];
			if (rows.length > 0) {
				for (var j = 0; j < rows.length; j++) {
					if (rows[j].isprint == 1) {
						rows_old.push(rows[j]);
					} else {
						rows_new.push(rows[j]);
					}
				}
			}
			if (rows_old.length && rows_new.length) {
				// LODOP = window.top.getLodop();
				var oldPageRange = ''; //oldPageRange：旧数据占用的页码范围
				var pageArr = [];
				for (var p = 1; p <= oldPages; p++) {
					pageArr.push(p);
					oldPageRange = pageArr.join(',');
				}
				LODOP = getLodop();
				LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
				LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
				LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
				LODOP.SET_PRINT_STYLE('FontSize', 10); // 设置打印字体
				LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', initBaseHtmlDom_first());
				LODOP.SET_PRINT_STYLEA(1, 'ItemType', 1);
				LODOP.SET_PRINT_STYLEA(1, "PageUnIndex", oldPageRange);

				LODOP.ADD_PRINT_TEXT('282mm', 344, '90%', '100%', "第#页/共&页");
				LODOP.SET_PRINT_STYLEA(2, 'ItemType', 2);
				LODOP.SET_PRINT_STYLEA(2, "PageUnIndex", oldPageRange);

				//旧的医嘱数据拼接成透明html
				var allDiv = $("<div>");
				for (var i = 0; i < rows_old.length; i++) {
					allDiv.append(initHtmlDom_transparent(rows_old[i], i));
				}
				//新的医嘱数据与旧数据一同拼接进allDiv
				for (var k = 0; k < rows_new.length; k++) {
					allDiv.append(initHtmlDom(rows_new[k], k));
				}
				LODOP.ADD_PRINT_HTM(100, 0, '100%', '82%', allDiv.html());
				LODOP.SET_PRINT_MODE('PRINT_START_PAGE', oldPages); //设置打印起始页，控制打印范围
				LODOP.PREVIEW();
				if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
					// console.log("************续打返回************");
					// console.log(Value);
					if (Value == 1) {
						// getTotalPage('PREVIEW_PAGE_COUNT');//PREVIEW_PAGE_COUNT----打印预览时或打印后，获得总页数
						getTotalPage('PRINTSETUP_PAGE_COUNT');//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
					}
				}
			}
			else {
				$.messager.alert('提示信息', '当前无续打数据', 'warning');
			}
		}
	</script>
</body>

</html>