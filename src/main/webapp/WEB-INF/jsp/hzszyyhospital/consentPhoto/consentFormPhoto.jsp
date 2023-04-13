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
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/elementui/elementui.css">
    <script type="text/javascript" src="${baseurl}lib/elementui/elementui.js"></script>
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

        html,
        body {
            width: 100%;
            height: 100%;
        }

        /* #region temp */
        ul li {
            list-style: none;
        }
        /* #endregion */

        /* #region element-ui */
        .el-button + .el-button {
            margin-left: 0px;
        }
        .el-table {
            border-radius: 10px;
            border: 1px solid #ebeef5;
        }
        .el-table::before {
            height: 0;
        }
        .el-table .el-table__cell {
            padding: 4px 2px;
        }
        .el-table.el-table--striped .el-table__body tr.el-table__row--striped td.el-table__cell {
            background-color: #eeeeff;
        }
        .el-table.el-table--striped .el-table__body tr.el-table__row--striped.current-row td.el-table__cell,
        .el-table .el-table__body tr.current-row > td.el-table__cell {
            background-color: rgb(251, 236, 136);
        }
        .el-table__body-wrapper {
            overflow-y: auto;
        }
        /* #endregion */

        /* #region img, img-popup, img-close, img-del, img-upload */
        .img {
            width: 120px;
            border-radius: 5px;
            cursor: zoom-in;
            display: block;
        }

        .queue-preview-img {
            width: 100%;
            height: 100%;
            display: flex;
            flex-flow: row nowrap;
            overflow-x: auto;
        }

        .preview-img + .preview-img {
            margin-left: 5px;
        }

        .img-panel {
            position: relative;
            padding: 2px;
            background-color: transparent;
            height: auto;
            width: auto;
            display: inline-block;
            transition: all 200ms ease;
            border-radius: 5px;
        }
        .img-panel:hover {
            background-color: #20a4f3;
        }
        .img-panel__select {
            background-color: #20a4f3;
        }

        .img-del {
            display: none;
            align-items: center;
            justify-content: center;
            width: 15px;
            height: 15px;
            font-size: 15px;
            color: white;
            position: absolute;
            top: 5px;
            right: 5px;
            border-radius: 50%;
            background-color: rgba(0, 0, 0, 0.5);
            cursor: pointer;
        }
        .img-panel:hover .img-del {
            display: flex;
        }

        .img-upload {
            display: none;
            align-items: center;
            justify-content: center;
            width: 22px;
            height: 22px;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            cursor: pointer;
        }
        .img-panel:hover .img-upload {
            display: flex;
        }

        .img-wrapper {
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: transparent;
            transition: all 200ms ease;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .img-wrapper__initial {
            background-color: rgba(0, 0, 0, 0.7);
        }

        .img__selected {
            max-height: 90vh;
            display: block;
            cursor: pointer;
            transition: all 300ms ease-in-out;
            position: relative;
            border: transparent solid 4px;
            border-radius: 5px;
        }
        .img-selected-initial {
            border: white solid 4px;
        }

        .img-close {
            height: 50px;
            width: 50px;
            position: absolute;
            top: 1.5em;
            left: 1.5em;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: all 200ms ease-in-out;
            cursor: pointer;
            border-radius: 5px;
        }
        .img-close:hover {
            background-color: #ca3b4e;
        }
        .img-close:before {
            content: ' ';
            height: 40px;
            width: 5px;
            background-color: white;
            transform: rotate(45deg);
            position: absolute;
            cursor: pointer;
        }
        .img-close:after {
            content: ' ';
            height: 40px;
            width: 5px;
            transform: rotate(135deg);
            position: absolute;
            z-index: 100;
            background-color: white;
            cursor: pointer;
        }
        /* #endregion */

        body {
            padding: 8px;
        }

        .container {
            width: 100%;
            height: 100%;
            display: grid;
            border-radius: 10px;
            border: 1px solid #ebeef5;
            grid-template-areas:
                    'nav main aside'
                    'footer footer footer';
            grid-template-rows: auto 110px;
            grid-template-columns: 200px auto 200px;
            grid-gap: 5px;
            transition: all;
        }

        section.nav {
            grid-area: nav;
        }
        section.nav .consent-list {
            width: 100%;
            height: 100%;
        }

        section.main {
            grid-area: main;
            display: flex;
            flex-direction: column;
        }
        section.main .handler {
            display: flex;
            flex-direction: row;
            align-items: center;
            gap: 10px;
            background-color: #ebeef5;
        }
        section.main .view {
            flex: 1;
            background: url('http://127.0.0.1:38088/video=stream&camidx=0') center center fixed;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: auto 100%;
        }

        section.aside {
            grid-area: aside;
        }
        section.aside .consent-info-list {
            width: 100%;
            height: 100%;
        }

        section.footer {
            grid-area: footer;
            border-top: 1px solid #ebeef5;
        }

        section.nav,
        section.main,
        section.aside,
        section.footer {
            padding: 5px;
            border-radius: 10px;
        }

        .user-select-none {
            user-select: none;
        }
    </style>
</head>

<body>
    <div id="app" class="container">
        <section class="nav">
            <el-table class="consent-list" ref="consentList" :data="consentList" stripe fit highlight-current-row @current-change="handleCurrentConsentChange">
                <el-table-column prop="consentFormName" label="同意书名称"> </el-table-column>
            </el-table>
        </section>
        <section class="main user-select-none">
            <header class="handler" v-show="currentConsent">
                <el-button type="primary" size="small" @click="grabimage()">拍照</el-button>
                <el-button type="primary" size="small" @click="rotate(90)">左转</el-button>
                <el-button type="primary" size="small" @click="rotate(270)">右转</el-button>
            </header>
            <main class="view" title="主摄像头"></main>
        </section>
        <section class="aside">
            <el-table class="consent-info-list" ref="consentInfoList" :data="consentInfoList" stripe fit highlight-current-row height="100%" @current-change="handleCurrentConsentInfoChange">
                <el-table-column label="历史上传图片">
                    <template slot-scope="scope">
                        <el-image style="width: 100%; height: 100%; overflow: initial" :src="scope.row.imgUri" fit="cover" @click="handlePreviewImgClick($event, scope.row.imgUri)"></el-image>
                    </template>
                </el-table-column>
            </el-table>
        </section>
        <section class="footer user-select-none">
            <div class="queue-preview-img">
                <div class="img-panel" v-for="previewImg in queuePreviewImg" :key="previewImg.id" :id="previewImg.id">
                    <img class="img preview-img" :src="previewImg.base64" style="height: 100%" @click="handlePreviewImgClick($event, previewImg.base64)" @error="handlePreviewImgError($event, previewImg.id)" />
                    <div class="img-del" @click="handlePreviewImgDelete($event, previewImg.id)">
                        <svg t="1642657470664" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2917" width="8px" height="8px">
                            <path
                                    d="M646.022677 512.096136l350.142243-350.142244c36.857078-36.857078 36.857078-96.74983 0-134.118812s-96.74983-36.857078-134.118812 0L511.903864 377.977323 161.761621 27.83508c-36.857078-36.857078-96.74983-36.857078-134.118812 0-36.857078 36.857078-36.857078 96.74983 0 134.118812L377.785052 512.096136 27.642809 862.238379c-36.857078 36.857078-36.857078 96.74983 0 134.118812 36.857078 36.857078 96.74983 36.857078 134.118812 0l350.142243-350.142243 350.142244 350.142243c36.857078 36.857078 96.74983 36.857078 134.118812 0 36.857078-36.857078 36.857078-96.74983 0-134.118812L646.022677 512.096136z"
                                    p-id="2918"
                                    fill="#ffffff"
                            ></path>
                        </svg>
                    </div>
                    <div class="img-upload" @click="handlePreviewImgUpload($event, previewImg)">
                        <svg t="1681299164098" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2655" width="20px" height="20px">
                            <path
                                    d="M576 631.466667V725.333333h170.666667c59.733333-8.533333 106.666667-64 106.666666-128 0-72.533333-55.466667-128-128-128-17.066667 0-29.866667 4.266667-42.666666 8.533334V469.333333c0-93.866667-76.8-170.666667-170.666667-170.666666s-170.666667 76.8-170.666667 170.666666c0 17.066667 4.266667 29.866667 4.266667 46.933334-8.533333-4.266667-17.066667-4.266667-25.6-4.266667C260.266667 512 213.333333 558.933333 213.333333 618.666667S260.266667 725.333333 320 725.333333h170.666667v-93.866666l-46.933334 46.933333L384 618.666667l149.333333-149.333334 149.333334 149.333334-59.733334 59.733333-46.933333-46.933333z m0 93.866666v85.333334h-85.333333v-85.333334h-42.666667v85.333334h-128C213.333333 810.666667 128 725.333333 128 618.666667c0-85.333333 55.466667-157.866667 128-183.466667C273.066667 311.466667 379.733333 213.333333 512 213.333333c110.933333 0 209.066667 72.533333 243.2 170.666667 102.4 12.8 183.466667 102.4 183.466667 213.333333s-85.333333 200.533333-192 213.333334h-128v-85.333334h-42.666667z"
                                    fill="#444444"
                                    p-id="2656"
                            ></path>
                        </svg>
                    </div>
                </div>
            </div>
        </section>
        <div ref="imgPopup" class="img-popup user-select-none"></div>
    </div>

    <script type="application/javascript">
        var vm = new Vue({
            el: '#app',
            data: function () {
                return {
                    patientId: '00100354',
                    fakeUrl: 'data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7',
                    viewUrl: 'http://127.0.0.1:38088/video=stream&camidx=0',
                    queuePreviewImg: [],
                    consentList: [],
                    currentConsent: null,
                    consentInfoList: [],
                    currentConsentInfo: null
                }
            },
            watch: {
                currentConsent: function (currentConsent) {
                    var self = this
                    if (currentConsent) {
                        this.getConsentInfoList(currentConsent).then(function (res) {
                            if (res.resultInfo.messageCode == 906) {
                                var sysdata = res.resultInfo.sysdata || {}
                                var consentInfoList = sysdata.consentFormImgInfo || []
                                self.consentInfoList = consentInfoList
                                self.setCurrentConsentInfo(self.consentInfoList[0])
                            } else {
                                // remove
                                self.consentInfoList = JSON.parse(localStorage.getItem('consentFormImgInfo') || [])
                                self.setCurrentConsentInfo(self.consentInfoList[0])
                            }
                        })
                    }
                }
            },
            mounted: function () {
                var self = this
                this.getConsentList().then(function (res) {
                    if (res.resultInfo.messageCode == 906) {
                        var sysdata = res.resultInfo.sysdata || {}
                        var consentList = sysdata.ConsentFormImgInfos || []
                        self.consentList = consentList
                        self.setCurrentConsent(self.consentList[0])
                    } else {
                        // remove
                        self.consentList = JSON.parse(localStorage.getItem('ConsentFormImgInfos') || [])
                        self.setCurrentConsent(self.consentList[0])
                        // alert('获取同意书列表失败')
                    }
                })
            },
            methods: {
                getConsentList: function () {
                    return $.ajax({
                        type: 'POST',
                        url: '${baseurl}consentForm/queryConsentFormImgInfos.do',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            hspConsentFormImgCustom: {
                                patientId: this.patientId
                            }
                        })
                    })
                },
                getConsentInfoList: function (consent) {
                    return $.ajax({
                        type: 'POST',
                        url: '${baseurl}consentForm/queryConsentFormImgInfo.do',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            hspConsentFormImgCustom: {
                                patientId: consent.patientId,
                                consentFormId: consent.consentFormId,
                                consentFormSeq: consent.consentFormSeq
                            }
                        })
                    })
                },
                setCurrentConsent: function (consent) {
                    this.currentConsent = consent || null
                    this.$refs.consentList.setCurrentRow(this.currentConsent)
                },
                handleCurrentConsentChange: function (currentRow) {
                    console.log('handleCurrentConsentChange')
                },
                setCurrentConsentInfo: function (consentInfo) {
                    this.currentConsentInfo = consentInfo || null
                    this.$refs.consentInfoList.setCurrentRow(this.currentConsentInfo)
                },
                handleCurrentConsentInfoChange: function (currentRow) {
                    console.log('handleCurrentConsentInfoChange')
                },
                handlePreviewImgError: function (e, id) {
                    var src = e.target.src
                    this.queuePreviewImg = this.queuePreviewImg.filter(function (img) {
                        if (id) return img.id !== id
                        return img.base64 !== src
                    })
                },
                handlePreviewImgClick: function (e, url) {
                    var imgElement = document.createElement('img')
                    var imgWrapper = document.createElement('div')
                    var imgClose = document.createElement('div')
                    var imgPopup = this.$refs.imgPopup
                    var container = e.target.parentNode // .img-panel

                    container.classList.toggle('img-panel__select')
                    imgClose.setAttribute('class', 'img-close')
                    imgElement.setAttribute('class', 'img__selected')
                    imgElement.src = url
                    imgWrapper.setAttribute('class', 'img-wrapper')
                    imgWrapper.appendChild(imgElement)
                    imgWrapper.appendChild(imgClose)
                    imgPopup.appendChild(imgWrapper)

                    this.$nextTick(function () {
                        imgWrapper.classList.add('img-wrapper__initial')
                        imgElement.classList.add('img-selected-initial')
                    })

                    imgClose.addEventListener('click', function () {
                        container.classList.remove('img-panel__select')
                        imgPopup.removeChild(imgWrapper)
                    })
                },
                handlePreviewImgDelete: function (e, id) {
                    this.queuePreviewImg = this.queuePreviewImg.filter(function (img) {
                        return img.id !== id
                    })
                },
                handlePreviewImgUpload: function (e, previewImg) {
                    var base64 = previewImg.base64
                    var currentConsent = this.currentConsent
                    var formData = new FormData()
                    var file = dataURLtoBlob(base64)
                    formData.append('files', file, 'image.jpg')
                    formData.append('hspConsentFormImgCustom.patientId', currentConsent.patientId)
                    formData.append('hspConsentFormImgCustom.consentFormId', currentConsent.consentFormId)
                    formData.append('hspConsentFormImgCustom.consentFormSeq', currentConsent.consentFormSeq)
                    formData.append('hspConsentFormImgCustom.consentFormName', currentConsent.consentFormName)
                    $.ajax({
                        url: '${baseurl}consentForm/uploadConsentFormImg.do',
                        type: 'POST',
                        cache: false,
                        contentType: false,
                        processData: false,
                        data: formData,
                        success: function (res) {
                            if (res.resultInfo.messageCode == 906) {
                                alert('上传成功')
                            } else {
                                alert('上传失败')
                            }
                        },
                        error: function () {
                            alert('上传失败')
                        }
                    })
                },
                // 高拍仪 旋转
                rotate: function (angle) {
                    var data = { camidx: '0', rotate: String(angle) }
                    $.post('http://127.0.0.1:38088/video=rotate', JSON.stringify(data))
                },
                // 高拍仪 拍照并获取base64
                grabimage: function () {
                    var self = this
                    var data = {
                        filepath: 'base64',
                        rotate: '0',
                        cutpage: '0',
                        camidx: '0',
                        ColorMode: '0',
                        quality: '3'
                    }
                    $.post('http://127.0.0.1:38088/video=grabimage', JSON.stringify(data)).done(function (res) {
                        if (res.code == '0') {
                            self.queuePreviewImg.push({
                                id: String(new Date().getTime()),
                                base64: 'data:image/jpg;base64,' + res.photoBase64
                            })
                        } else {
                            alert('拍照失败')
                        }
                    })
                },
                // 高拍仪 添加到PDF队列
                addpdf: function (base64) {
                    var data2 = { ImageBase64: base64 }
                    $.post('http://127.0.0.1:38088/pdf=addimage', JSON.stringify(data2)).then(res2 => {
                        if (res2.data.code == '0') {
                            console.log('加入到PDF队列中')
                        } else {
                            console.log('加入PDF队列失败')
                        }
                    })
                }
            }
        })

        /**
         * converting "Base64" to javascript "Blob Object"
         * @param dataurl
         * @returns {Blob}
         */
        function dataURLtoBlob(dataurl) {
            const splitDataURI = dataurl.split(',')
            const byteString =
                splitDataURI[0].indexOf('base64') >= 0 ? atob(splitDataURI[1]) : decodeURI(splitDataURI[1])
            const mimeString = splitDataURI[0].split(':')[1].split(';')[0]

            const ia = new Uint8Array(byteString.length)
            for (let i = 0; i < byteString.length; i++) ia[i] = byteString.charCodeAt(i)

            return new Blob([ia], { type: mimeString })
        }

        /**
         * @param {string} url
         */
        function download(url) {
            var a = document.createElement('a')
            a.setAttribute('href', url)
            document.body.appendChild(a)
            a.click()
            document.body.removeChild(a)
        }

        function downloadIMG(consentId) {
            var url = '${baseurl}consentForm/conFmImgDownload.do?id=' + consentId
            download(url)
        }
    </script>
</body>
</html>
