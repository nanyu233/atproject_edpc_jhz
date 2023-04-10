<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <title>胸痛患者详情</title>
    <style type="text/css">
        *,
        *::before,
        *::after {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        a * {
            box-sizing: initial;
        }

        a.disabled {
            pointer-events: none;
            color: #c1bcbc;
        }

        .datagrid-mask-msg {
            height: auto;
        }

        html, body {
            width: 100%;
            height: 100%;
        }

        body {
            padding: 8px;
        }

        .container {
            width: 100%;
            height: 100%;
            display: flex;
        }

        .list {
            flex: none;
            width: 260px;
        }

        .view-container {
            flex: 1;
        }

        .view-container #view0 {
            width: 100%;
            height: 100%;
        }

        .info {
            flex: none;
            width: 150px;
        }
    </style>
</head>
<body>
    <div id="app" class="container">
        <div class="list">
          <table id="consent-list"></table>
        </div>
        <!-- 高拍仪视频预览区 -->
        <div class="view-container">
            <img id="view0" class="view" alt="主摄像头" src="http://127.0.0.1:38088/video=stream&camidx=0">
        </div>
        <!-- 缩略图 -->
        <div class="info">
            <table id="consent-info"></table>
        </div>
    </div>

    <script type="application/javascript">
        var patientId = '${patientId}'
        var consentListSelector = '#consent-list'
        var consentInfoSelector = '#consent-info'
        var dInitConsentInfoTable = publicFun.debounce(initConsentInfoTable, 300)

        var consentListColumns = [
            [
                {
                    field: 'id',
                    title: 'ID',
                    hidden: true,
                },
                {
                    field: 'consentFormSeq',
                    title: '同意书历史ID',
                    hidden: true,
                },
                {
                    field: 'consentFormId',
                    title: '同意书模板ID',
                    hidden: true,
                },
                {
                    field: 'patientId',
                    title: '患者ID',
                    hidden: true,
                },
                {
                    field: 'isPhoto',
                    title: '是否已拍照',
                    hidden: true,
                },
                {
                    field: 'consentFormName',
                    title: '同意书名字',
                    width: 150
                },
                {
                    field: '__handle',
                    title: '操作',
                    width: 100,
                    formatter: function (value, row, index) {
                        if (value === false) return '';
                        var isHasPhoto = row.isPhoto == '1'
                        if (isHasPhoto) {
                            return '<a class="commonbtn" id="grab-image" href="javascript:void(0);" onclick="grabImage()">重拍</a>'
                        }
                        return '<a class="commonbtn" id="grab-image" href="javascript:void(0);" onclick="grabImage()">拍照</a>'
                    }
                }
            ]
        ]

        var consentInfoColumns = [
            [
                {
                    field: 'id',
                    title: 'ID',
                    hidden: true,
                },
                {
                    field: 'consentFormSeq',
                    title: '同意书历史ID',
                    hidden: true,
                },
                {
                    field: 'imgUri',
                    title: '历史上传图片',
                    width: 150,
                    formatter: function (value, row, index) {
                        if (!value) return ''
                        return '<img src="'+value+'" alt="'+row.consentFormName+'" width="100" height="130">'
                    }
                }
            ]
        ]

        $(consentListSelector).datagrid({
            queryParams: {
                hspConsentFormImgCustom: {
                    patientId: patientId
                }
            },
            loader: function(params, success, error) {
                $.ajax({
                    type: 'POST',
                    url: '${baseurl}consentForm/queryConsentFormImgInfos.do',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify(params),
                    success: function (res) {
                        success(res)
                    }
                })
            },
            loadFilter: function(res){
                var sysdata = res.resultInfo.sysdata || {}
                var rows = sysdata.ConsentFormImgInfos || []
                return commonLoadFilter({
                    rows: rows,
                    total: rows.length
                })
            },
            columns: consentListColumns,
            idField: "id",
            singleSelect: true,
            height: 'auto',
            fit: true ,
            nowrap: true,
            onSelect: function (index,row) {
                dInitConsentInfoTable()
            }
        })

        function grabImage() {
            var options = $(consentListSelector).data('datagrid')
            var consent = options ? $(consentListSelector).datagrid('getSelected') : null;

            return $.post(
                "http://127.0.0.1:38088/video=grabimage",
                JSON.stringify({
                    "filepath": "base64",   // 传base64，拍照返回base64数据。不保存本地
                    "rotate": "",           // 图像旋转角度，90的整数倍，默认："0"
                    "deskew": "0",          // 纠偏（主头有效），参数：0:不纠偏；1:纠偏
                    "deskewval": "0",       // 纠偏像素值：正常给0，正数时多裁，负数时少裁
                    "camidx": "0",          // 摄像头索引，参数：0:主头；1:副头
                    "ColorMode": "4",       // 色彩模式，图片保存本地时调用。0：彩色 1：灰色 2：黑白 3：白纸印章 4：去背景色(普通文件) 5:去背景色(身份证)
                    "quality": "2",         // 图片质量，图片保存本地调用。0:默认质量；1:高质量；2:较高质量；3:中质量；4:较低质量；5:低质量
                    "bAutoAdjust":"",       // 是否自动摆正： 0：不摆正 1：摆正
                    "bIsPrint1to1":"",      // 是否1:1打印
                }),
                function success(res) {
                    var imageJpgBase64 = "data:image/jpg;base64,"+ res.photoBase64
                    var file = DataURIToBlob(imageJpgBase64)
                    var formData = new FormData()
                    formData.append('files', file, 'image.jpg')
                    formData.append('hspConsentFormImgCustom.patientId', consent.patientId)
                    formData.append('hspConsentFormImgCustom.consentFormId', consent.consentFormId)
                    formData.append('hspConsentFormImgCustom.consentFormSeq', consent.consentFormSeq)
                    formData.append('hspConsentFormImgCustom.consentFormName', consent.consentFormName)

                    uploadPhoto(formData)
                }
            );
        }

        function DataURIToBlob(dataURI) {
            const splitDataURI = dataURI.split(',')
            const byteString = splitDataURI[0].indexOf('base64') >= 0 ? atob(splitDataURI[1]) : decodeURI(splitDataURI[1])
            const mimeString = splitDataURI[0].split(':')[1].split(';')[0]

            const ia = new Uint8Array(byteString.length)
            for (let i = 0; i < byteString.length; i++)
                ia[i] = byteString.charCodeAt(i)

            return new Blob([ia], { type: mimeString })
        }

        function uploadPhoto(formData) {
           $.ajax({
               url: '${baseurl}consentForm/uploadConsentFormImg.do',
               type: "POST",
               cache: false,
               contentType: false,
               processData: false,
               data: formData,
               success: function(res) {
                   console.log("upload success")
               }
           })
        }

        function initConsentInfoTable() {
            var options = $(consentListSelector).data('datagrid')
            var consent = options ? $(consentListSelector).datagrid('getSelected') : null;

            // test
            if(!consent) {
                consent = {
                    consentFormSeq: "5cfcf7e772174d3cb944305e337bae03"
                }
            }


            var datagridOptions = {
                columns: consentInfoColumns,
                loadFilter: function(res){
                    var sysdata = res.resultInfo.sysdata || {}
                    var rows = sysdata.consentFormImgInfo || []
                    return commonLoadFilter({
                        rows: rows,
                        total: rows.length
                    })
                },
                toolbar: [
                    {
                        text: '刷新',
                        iconCls: 'icon-reload',
                        handler: function () {
                            $(consentListSelector).datagrid('reload')
                        }
                    }
                ],
                idField: "id",
                singleSelect: true,
                height: 'auto',
                fit: true ,
                nowrap: true,
                onRowContextMenu: function (e,index,row) {
                    e.preventDefault()
                }
            }

            if (consent && consent.consentFormSeq) {
                datagridOptions.queryParams = {
                    hspConsentFormImgCustom:{
                        consentFormSeq: consent.consentFormSeq
                    }
                }
                datagridOptions.loader = function(params, success, error) {
                    $.ajax({
                        type: 'POST',
                        url: '${baseurl}consentForm/queryConsentFormImgInfo.do',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify(params),
                        success: function (res) {
                            success(res)
                        }
                    })
                }
            } else {
                datagridOptions.data = {
                    resultInfo: {
                        sysdata: {
                            consentFormImgInfo: []
                        }
                    }
                }
            }
            $(consentInfoSelector).datagrid(datagridOptions)
        }

        function commonLoadFilter(value) {
            if (!value.total || value.total == 0) {
                value.rows = [{ __handle: false }]
            }
            return value
        }


        initConsentInfoTable()
    </script>
</body>
</html>
