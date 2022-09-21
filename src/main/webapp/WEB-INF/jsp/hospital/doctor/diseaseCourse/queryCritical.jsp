<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>极危值病程</title>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/cssReseat.css" />
	<link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/common.css?5" />
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
	<script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="${baseurl}js/public.js"></script>
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="diseaseHtml">
	<div class="print-body">
		<p class="title">${hospitalPlatformNameGap}</p>
		<p class="subTitle">危急值病程记录</p>
		<ul class="print-ul">
			<li class="bordered">
				<span class="basic-span">
					<label class="title-label">姓名：</label>
					<span>${hspemginfCustom.cstNam}</span>
				</span>
				<span class="basic-span">
					<label class="title-label">性别：</label>
					<span>${hspemginfCustom.cstSexCod}</span>
				</span>
				<span class="basic-span">
					<label class="title-label">年龄：</label>
					<span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
				</span>
				<span class="basic-span">
					<label class="title-label">科别：</label>
					<span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
				</span>
				<span class="basic-span">
					<label class="title-label">病历号：</label>
					<span id="_mpi">${hspemginfCustom.mpi}</span>
				</span>
				<span class="basic-span">
					<label class="title-label">留观号：</label>
					<span id="_lgh">${hspemginfCustom.observationCode}</span>
				</span>
			</li>
		</ul>
		<div ms-controller="criticalTable">
			<div ms-repeat="list" class="contentDiv">
				<p>{{el.courseDateStr}} <span class="printText">危急值病程记录</span></p>
				<p class="boldText">一、危急值及报告时间：</p>
				<p class="contentText">{{el.reportingTime}}</p>
				<p class="boldText">二、危急值数据临床意义：</p>
				<p class="contentText">{{el.criticalSignificance}}</p>
				<p class="boldText">三、处理措施：</p>
				<p class="contentText">{{el.treatmentMeasures}}</p>
				<p class="rightText">记录医师：{{el.createNam}}</p>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var vm = avalon.define({
			$id: 'criticalTable',
			list: []
		});
		function loadQuery(emgSeq) {
			publicFun.httpServer({ url: '${baseurl}zyylqblqrb/queryDiseaseCourse_result.do' }, {
				'hspDiseaseCourseCustom.courseType': '4',
				'hspDiseaseCourseCustom.emgSeqDc': emgSeq
			}, function (data) {
				var res = data.rows;
				for (var i = 0; i < res.length; i++) {
					if (res[i].courseDateStr) {
						res[i].courseDateStr = publicFun.timeFormat(res[i].courseDateStr, 'yyyy年MM月dd日 hh时mm分')
					}
				}
				vm.list = res;
			})
			var height = $('.mainDiv', parent.document).height() - 120;
			$('#criticalTable').css({ 'max-height': height + 'px' });
		}

		$(function () {
			var emgSeq = parent.$('#emgSeq').val();
			loadQuery(emgSeq);
		})
	</script>
</body>

</html>