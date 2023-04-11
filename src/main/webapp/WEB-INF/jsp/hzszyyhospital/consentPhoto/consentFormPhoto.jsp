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
            width: 200px;
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

        img.consent-info__img {
            display: block;
            margin: 0 auto;
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

    <div id="img-modal" class="easyui-window" title="文书照片预览" style="width:1200px;height:800px"
         data-options="modal:true,closed:true">
        <div class="easyui-layout" data-options="fit:true">
            <div data-options="region:'center'">
                <img id="img-preview" style="display:none; width:100%; aspect-ratio:1 / 1.41;" />
                <div id="img-download-handle" style="position:absolute; top:0; left:0; width:100%; padding:5px 20px 5px 5px;">
                    <a class="commonbtn" href="javascript:void(0);" onclick="downloadPDF(this)">下载PDF</a>
                    <a class="commonbtn" href="javascript:void(0);" onclick="downloadIMG(this)">下载图片</a>
                </div>
                <div id="img-upload-handle" style="display:none; position:absolute; top:0; left:0; width:100%; padding:5px 20px 5px 5px;">
                    <a class="commonbtn" href="javascript:void(0);" onclick="grabImage()">上传</a>
                </div>
            </div>
        </div>
    </div>

    <script type="application/javascript">
        var patientId = '${patientId}'
        var fakeUrl = 'data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7'
        var mainViewUrl = 'http://127.0.0.1:38088/video=stream&camidx=0'
        var mainViewSelector = '#view0'
        var consentListSelector = '#consent-list'
        var consentInfoSelector = '#consent-info'
        var imgModelSelector = '#img-modal'
        var imgPreviewSelector = '#img-preview'
        var dInitConsentInfoTable = publicFun.debounce(initConsentInfoTable)

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
                    width: 50,
                    formatter: function (value, row, index) {
                        if (value === false) return '';
                        var isHasPhoto = row.isPhoto == '1'
                        if (isHasPhoto) {
                            return '<span class="url-link"><a id="grab-image" href="javascript:void(0);" onclick="grabImage()">重拍</a></span>'
                        }
                        return '<span class="url-link"><a id="grab-image" href="javascript:void(0);" onclick="grabImage()">拍照</a></span>'
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
                    width: 120,
                    formatter: function (value, row, index) {
                        if (!value) return ''
                        return '<img class="consent-info__img" src="'+value+'" alt="'+row.consentFormName+'" width="100" height="130">'
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
            striped: true,
            fit: true,
            nowrap: false,
            onSelect: function (index, row) {
                dInitConsentInfoTable()
            }
        })

        $(mainViewSelector).error(function () {
            this.src = fakeUrl
            $(this).css({
                'background-color': 'rgba(156, 163, 175, 0.5)'
            })
        })

        function openImgModal(imgUrl, consentInfo) {
            $(imgModelSelector).window('open')
            $(imgPreviewSelector)
                .css({ display: "block" })
                .attr("src", imgUrl)
                .data('consentInfo', consentInfo || null)
        }

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
                    "bAutoAdjust": "",       // 是否自动摆正： 0：不摆正 1：摆正
                    "bIsPrint1to1": "",      // 是否1:1打印
                }),
                function success(res) {
                    if (!res.photoBase64) {
                        alert('请检查高拍仪是否连接，是否安装客户端！！！')
                        return
                    }
                    var formData = new FormData()
                    var file = dataURLtoBlob("data:image/jpg;base64," + res.photoBase64)
                    formData.append('files', file, 'image.jpg')
                    formData.append('hspConsentFormImgCustom.patientId', consent.patientId)
                    formData.append('hspConsentFormImgCustom.consentFormId', consent.consentFormId)
                    formData.append('hspConsentFormImgCustom.consentFormSeq', consent.consentFormSeq)
                    formData.append('hspConsentFormImgCustom.consentFormName', consent.consentFormName)

                    uploadPhoto(formData, function (res) {
                        if (res.resultInfo.messageCode == 906) {
                            dInitConsentInfoTable()
                        }
                    })
                }
            )
        }

        function uploadPhoto(formData, onSuccess) {
            onSuccess = onSuccess || console.info
            $.ajax({
                url: '${baseurl}consentForm/uploadConsentFormImg.do',
                type: "POST",
                cache: false,
                contentType: false,
                processData: false,
                data: formData,
                success: function (res) {
                    onSuccess(res)
                }
            })
        }

        function initConsentInfoTable() {
            var options = $(consentListSelector).data('datagrid')
            var consent = options ? $(consentListSelector).datagrid('getSelected') : null;

            var datagridOptions = {
                columns: consentInfoColumns,
                loadFilter: function (res) {
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
                fit: true,
                nowrap: true,
                onRowContextMenu: function (e, index, row) {
                    e.preventDefault()
                },
                onDblClickCell: function (index, field, value) {
                    if (field === 'imgUri') {
                        const row = $(this).datagrid('getSelected')
                        openImgModal(value, row)
                    }
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
            if (!value.rows || !value.total || value.total == 0) {
                value.total = 0
                value.rows = []
            }
            return value
        }

        function downloadPDF() {
            var data = $(imgPreviewSelector).data('consentInfo')
            var url = data.downloadPdfUrl // fake
            var fileName = data.fileName.split('/').pop()
            var hash = data.id.substring(0,8)
            download(url, hash + '_' + fileName)
        }

        function downloadIMG() {
            var data = $(imgPreviewSelector).data('consentInfo')
            var id = data.id
            var hash = data.id.substring(0,8)
            var consentFormName = data.consentFormName
            var url = '${baseurl}consentForm/conFmImgDownload.do?id'+id
            download(url, consentFormName + '_' + hash + '.jpg')
        }

        /**
         * @param {string} url
         * @param {string} [filename]
         */
        function download(url, filename) {
            var a = document.createElement('a')
            a.setAttribute('href', url)
            a.setAttribute('download', filename)
            document.body.appendChild(a)
            a.click()
            document.body.removeChild(a)
        }

        function extractMinio(minioUrl) {
            var minio = new URL(minioUrl)
            var origin = minio.origin
            var filePath = minio.pathname
            var fileName = filePath.split('/').pop()
            var downloadUrl = origin + '/minio/download' + filePath

            return {
                origin,
                filePath,
                fileName,
                downloadUrl,
            }
        }

        function getMinioToken(minioUrl) {
            var origin = new URL(minioUrl).origin
            var token = null
            $.ajax({
                type: 'POST',
                url: origin + '/minio/webrpc',
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                async: false,
                success: function (res) {
                    var result = res.result
                    if (result && result.token) {
                        token = result.token
                    }
                }
            })
            return token
        }

        /**
         * @params {string} url
         * @params {string} callback
         */
        function getUrlBase64(url, callback) {
            var canvas = document.createElement("canvas")
            var ctx = canvas.getContext("2d")
            var img = new Image()
            img.crossOrigin = "Anonymous"
            img.src = url
            img.onload = function () {
                canvas.height = img.height
                canvas.width = img.width
                ctx.drawImage(img, 0, 0, img.width, img.height)
                var dataURL = canvas.toDataURL("image/jpg", 1)
                callback = callback || console.info
                callback.call(this, dataURL)
                canvas = null
            };
        }

        /**
         * converting "image source" (url) to "Base64"
         * @param url
         * @param [onSuccess]
         * @param [onError]
         */
        function toDataURL(url, onSuccess, onError) {
            onSuccess = onSuccess || console.info
            onError = onError || console.error
            $.ajax({
                type: "GET",
                url: url,
                xhrFields: {
                    responseType: 'blob'
                },
                success: function (data) {
                    var reader = new FileReader()
                    reader.onloadend = () => onSuccess(reader.result)
                    reader.onerror = onError
                    reader.readAsDataURL(data)
                },
                error: function (xhr, status, error) {
                    console.error(error)
                }
            })
        }

        /**
         * converting "Base64" to javascript "Blob Object"
         * @param dataurl
         * @returns {Blob}
         */
        function dataURLtoBlob(dataurl) {
            const splitDataURI = dataurl.split(',')
            const byteString = splitDataURI[0].indexOf('base64') >= 0 ? atob(splitDataURI[1]) : decodeURI(splitDataURI[1])
            const mimeString = splitDataURI[0].split(':')[1].split(';')[0]

            const ia = new Uint8Array(byteString.length)
            for (let i = 0; i < byteString.length; i++)
                ia[i] = byteString.charCodeAt(i)

            return new Blob([ia], { type: mimeString })
        }

        /**
         * converting "Base64" to javascript "File Object"
         * @param dataurl
         * @param filename
         * @returns {File}
         */
        function dataURLtoFile(dataurl, filename) {
            var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
                bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
            while (n--) {
                u8arr[n] = bstr.charCodeAt(n);
            }
            return new File([u8arr], filename, { type: mime });
        }

        initConsentInfoTable()
    </script>
</body>
</html>
