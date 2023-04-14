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

        /* #region img */
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
            overflow: auto;
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
        .img-panel.error {
            background-color: #d2d2d2 !important;
            cursor: no-drop;
            pointer-events: none;
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

        .img-panel__hover-wrapper__center {
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
        .img-panel__hover-wrapper__center.error {
            display: flex;
            pointer-events: none;
        }
        .img-panel:hover .img-panel__hover-wrapper__center {
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

        .img-popup {
            display: none;
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
            grid-template-rows: minmax(0, calc(100% - 110px)) 110px;
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
        }
        section.main .main-container {
            height: 100%;
            width: 100%;
            display: flex;
            flex-direction: column;
            gap: 5px;
        }
        section.main .main-container .handler {
            display: flex;
            flex-direction: row;
            align-items: center;
            gap: 10px;
            background-color: #ebeef5;
        }
        section.main .main-container .view {
            flex: 1;
            background-position: center;
            background-attachment: fixed;
            background-repeat: no-repeat;
            background-size: auto 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            gap: 10px;
        }

        section.aside {
            grid-area: aside;
        }
        section.aside .content-info-container {
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            overflow-y: auto;
        }

        section.aside .content-info-container .content-info__title {
            width: 100%;
            display: inline-block;
            padding: 4px 10px;
            border-bottom: 1px solid #ebeef5;
            font-weight: 400;
            font-style: normal;
            color: #909399;
            vertical-align: middle;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: normal;
            word-break: break-all;
            line-height: 23px;
        }

        section.footer {
            grid-area: footer;
        }

        section.nav,
        section.main,
        section.aside,
        section.footer {
            padding: 5px;
        }

        .user-select-none {
            user-select: none;
        }
        .flex-col {
            flex-direction: column;
        }
        .border {
            border-radius: 10px;
            border: 1px solid #ebeef5;
        }
        .pointer-events-none {
            pointer-events: none;
        }
    </style>
</head>

<body>
    <div id="app" class="container">
        <section class="nav">
            <el-table class="consent-list border" ref="consentList" :data="consentList" stripe fit highlight-current-row @current-change="handleCurrentConsentChange">
                <el-table-column prop="consentFormName" label="同意书名称"> </el-table-column>
            </el-table>
        </section>
        <section class="main user-select-none">
            <div class="main-container border">
                <header class="handler border" v-show="currentConsent">
                    <el-button type="primary" size="small" @click="grabImageThenUpload()">拍照并上传</el-button>
                    <el-button type="primary" size="small" @click="grabImageThenPushQueue()">拍照</el-button>
                    <el-button type="primary" size="small" @click="rotate(90)">左转</el-button>
                    <el-button type="primary" size="small" @click="rotate(270)">右转</el-button>
                </header>
                <main class="view" title="主摄像头" :style="viewStyle">
                    <div v-show="currentConsent && viewStatus === 'no'" style="font-size: 30px; font-weight: bold; color: red;">高拍仪设备{{ viewStatusMessage }}</div>
                    <div v-show="!currentConsent" class="el-table__empty-block" style="width: 100%; font-size: 14px">
                        <span class="el-table__empty-text">
                            未选中文书，无法提供拍照
                        </span>
                    </div>
                </main>
            </div>
        </section>
        <section class="aside user-select-none">
            <div class="content-info-container border">
                <div class="content-info__title">历史保存照片</div>
                <div class="queue-preview-img flex-col" v-if="consentInfoList && consentInfoList.length > 0">
                    <div :class="['img-panel', consentInfo.imgError === true && 'error']" v-for="consentInfo in consentInfoList" :key="consentInfo.id" :id="consentInfo.id">
                        <img class="img preview-img" :src="consentInfo.imgUri" style="width: 100%; max-height: 250px" @click="handleImgPanelPreview($event, consentInfo.imgUri)" @error="handleConsentInfoImgError($event, consentInfo)" />
                        <div class="img-del" @click="handleConsentInfoImgDelete($event, consentInfo.id)">
                            <svg id="del" t="1642657470664" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2917" width="8px" height="8px">
                                <path
                                        d="M646.022677 512.096136l350.142243-350.142244c36.857078-36.857078 36.857078-96.74983 0-134.118812s-96.74983-36.857078-134.118812 0L511.903864 377.977323 161.761621 27.83508c-36.857078-36.857078-96.74983-36.857078-134.118812 0-36.857078 36.857078-36.857078 96.74983 0 134.118812L377.785052 512.096136 27.642809 862.238379c-36.857078 36.857078-36.857078 96.74983 0 134.118812 36.857078 36.857078 96.74983 36.857078 134.118812 0l350.142243-350.142243 350.142244 350.142243c36.857078 36.857078 96.74983 36.857078 134.118812 0 36.857078-36.857078 36.857078-96.74983 0-134.118812L646.022677 512.096136z"
                                        p-id="2918"
                                        fill="#ffffff"
                                ></path>
                            </svg>
                        </div>
                        <div :class="['img-panel__hover-wrapper__center', consentInfo.imgError === true && 'error']" @click="downloadIMG(consentInfo.id)">
                            <svg v-if="consentInfo.imgError === true" id="load-error" t="1681371699123" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4718" width="200" height="200">
                                <path
                                        d="M567.04 692.48c2.56-2.56 4.416-5.76 5.76-9.024 6.4-12.096 4.416-27.52-5.76-37.76L335.36 414.08l229.12-229.12c13.44-13.44 13.44-33.856 0-47.296C558.08 131.2 549.76 128 541.44 128L192 128C121.6 128 64 185.6 64 256l0 576c0 70.4 57.6 128 128 128l96.64 0c9.024 0 17.344-3.2 23.68-9.6L366.08 896l198.464-199.68C565.76 695.04 565.76 693.76 567.04 692.48zM272 896 192 896c-35.2 0-64-28.8-64-64L128 256c0-35.2 28.8-64 64-64l271.36 0L264.96 389.76C254.72 400 252.8 415.36 259.2 427.52 260.48 430.72 262.4 433.92 264.96 436.48 266.24 437.76 266.24 439.04 267.52 440.32l229.76 229.76L272 896zM832 128l-98.56 0c-8.96 0-17.344 3.2-23.68 9.6L655.36 192 456.96 389.76C440.448 407.744 443.52 423.296 459.52 440.32l229.76 229.76L456.96 903.04c-12.8 12.8-12.8 33.856 0 47.296C463.36 956.8 472.32 960 480.64 960L832 960c70.4 0 128-57.6 128-128L960 256C960 185.6 902.4 128 832 128zM896 832c0 35.2-28.8 64-64 64L558.08 896l198.464-199.68c15.232-14.848 14.72-37.376 2.56-50.56L527.36 414.08 749.44 192 832 192c35.2 0 64 28.8 64 64L896 832z"
                                        p-id="4719"
                                ></path>
                            </svg>
                            <svg v-else id="download" t="1681362731866" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1467" width="200" height="200">
                                <path
                                        d="M341.333333 640a42.666667 42.666667 0 0 1-42.666666 42.666667H256a170.666667 170.666667 0 0 1-40.277333-336.554667 298.709333 298.709333 0 0 1 570.154666-81.408A213.333333 213.333333 0 0 1 725.333333 682.666667a42.666667 42.666667 0 0 1 0.042667-85.333334 128 128 0 0 0 36.394667-250.794666l-38.144-11.264-15.914667-36.437334a213.376 213.376 0 0 0-407.296 58.026667l-7.381333 58.368-57.173334 13.824A85.418667 85.418667 0 0 0 256 597.333333h42.666667a42.666667 42.666667 0 0 1 42.666666 42.666667z m321.706667 87.338667a42.666667 42.666667 0 0 1 0 60.330666l-120.917333 120.832c-16.682667 16.64-43.690667 16.64-60.373334 0l-120.917333-120.832a42.666667 42.666667 0 0 1 60.330667-60.330666L469.333333 775.509333V426.666667a42.666667 42.666667 0 0 1 85.333334 0v348.714666l48.042666-48.042666a42.666667 42.666667 0 0 1 60.330667 0z"
                                        fill="#333333"
                                        p-id="1468"
                                ></path>
                            </svg>
                        </div>
                    </div>
                </div>
                <div v-else class="el-table__empty-block" style="width: 100%; font-size: 14px"><span class="el-table__empty-text">暂无数据</span></div>
            </div>
        </section>
        <section class="footer user-select-none">
            <div class="queue-preview-img border" v-if="queuePreviewImg && queuePreviewImg.length > 0">
                <div class="img-panel" v-for="previewImg in queuePreviewImg" :key="previewImg.id" :id="previewImg.id">
                    <img class="img preview-img" :src="previewImg.base64" style="height: 100%" @click="handleImgPanelPreview($event, previewImg.base64)" @error="handlePreviewImgError($event, previewImg.id)" />
                    <div class="img-del" @click="handlePreviewImgDelete($event, previewImg.id)">
                        <svg id="del" t="1642657470664" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2917" width="8px" height="8px">
                            <path
                                    d="M646.022677 512.096136l350.142243-350.142244c36.857078-36.857078 36.857078-96.74983 0-134.118812s-96.74983-36.857078-134.118812 0L511.903864 377.977323 161.761621 27.83508c-36.857078-36.857078-96.74983-36.857078-134.118812 0-36.857078 36.857078-36.857078 96.74983 0 134.118812L377.785052 512.096136 27.642809 862.238379c-36.857078 36.857078-36.857078 96.74983 0 134.118812 36.857078 36.857078 96.74983 36.857078 134.118812 0l350.142243-350.142243 350.142244 350.142243c36.857078 36.857078 96.74983 36.857078 134.118812 0 36.857078-36.857078 36.857078-96.74983 0-134.118812L646.022677 512.096136z"
                                    p-id="2918"
                                    fill="#ffffff"
                            ></path>
                        </svg>
                    </div>
                    <div :class="['img-panel__hover-wrapper__center', previewImg.uploaded === true && 'pointer-events-none']" @click="handlePreviewImgUpload($event, previewImg, true)">
                        <svg v-if="previewImg.uploaded" id="upload-success" t="1681370857997" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2968" width="200" height="200">
                            <path
                                    d="M512 0C230.4 0 0 230.4 0 512s230.4 512 512 512 512-230.4 512-512S793.6 0 512 0z m0 947.2c-240.64 0-435.2-194.56-435.2-435.2S271.36 76.8 512 76.8s435.2 194.56 435.2 435.2-194.56 435.2-435.2 435.2z m266.24-578.56c0 10.24-5.12 20.48-10.24 25.6l-286.72 286.72c-5.12 5.12-15.36 10.24-25.6 10.24s-20.48-5.12-25.6-10.24l-163.84-163.84c-15.36-5.12-20.48-15.36-20.48-25.6 0-20.48 15.36-40.96 40.96-40.96 10.24 5.12 20.48 10.24 25.6 15.36l138.24 138.24 261.12-261.12c5.12-5.12 15.36-10.24 25.6-10.24 20.48-5.12 40.96 15.36 40.96 35.84z"
                                    fill="#059026"
                                    p-id="2969"
                            ></path>
                        </svg>
                        <svg v-else id="upload" t="1681299164098" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2655" width="20px" height="20px">
                            <path
                                    d="M576 631.466667V725.333333h170.666667c59.733333-8.533333 106.666667-64 106.666666-128 0-72.533333-55.466667-128-128-128-17.066667 0-29.866667 4.266667-42.666666 8.533334V469.333333c0-93.866667-76.8-170.666667-170.666667-170.666666s-170.666667 76.8-170.666667 170.666666c0 17.066667 4.266667 29.866667 4.266667 46.933334-8.533333-4.266667-17.066667-4.266667-25.6-4.266667C260.266667 512 213.333333 558.933333 213.333333 618.666667S260.266667 725.333333 320 725.333333h170.666667v-93.866666l-46.933334 46.933333L384 618.666667l149.333333-149.333334 149.333334 149.333334-59.733334 59.733333-46.933333-46.933333z m0 93.866666v85.333334h-85.333333v-85.333334h-42.666667v85.333334h-128C213.333333 810.666667 128 725.333333 128 618.666667c0-85.333333 55.466667-157.866667 128-183.466667C273.066667 311.466667 379.733333 213.333333 512 213.333333c110.933333 0 209.066667 72.533333 243.2 170.666667 102.4 12.8 183.466667 102.4 183.466667 213.333333s-85.333333 200.533333-192 213.333334h-128v-85.333334h-42.666667z"
                                    fill="#444444"
                                    p-id="2656"
                            ></path>
                        </svg>
                    </div>
                </div>
            </div>
            <div v-else class="el-table__empty-block border" style="width: 100%; height: 100%; font-size: 14px">
                <span v-if="currentConsent" class="el-table__empty-text">暂无预览照片，请先拍照</span>
                <span v-else class="el-table__empty-text">未选中文书，无法提供预览</span>
            </div>
        </section>
        <div ref="imgPopup" class="img-popup user-select-none"></div>
    </div>

    <script type="application/javascript">
        var _viewUrl = 'http://127.0.0.1:38088/video=stream&camidx=0'
        var _fakeUrl = 'data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7'

        var vm = new Vue({
            el: '#app',
            data: function () {
                return {
                    patientId: '${patientId}',
                    fakeUrl: _fakeUrl,
                    viewUrl: _viewUrl,
                    viewStatus: 'no', // no:未连接；ok:已连接；run:已连接且运行
                    queuePreviewImg: [],
                    consentList: [],
                    currentConsent: null,
                    consentInfoList: []
                }
            },
            computed: {
                viewStyle: function () {
                    return {
                        backgroundImage: this.currentConsent && this.viewStatus !== 'no' ? 'url('+this.viewUrl+')' : 'url('+this.fakeUrl+')'
                    }
                },
                viewStatusMessage: function () {
                    switch (this.viewStatus) {
                        case "no":
                            return "未连接"
                        case "ok":
                            return "已连接"
                        case "run":
                            return "已连接且运行"
                        default:
                            return "异常"
                    }
                }
            },
            watch: {
                viewStatus(state) {
                    if (state === 'no') {
                        this.viewUrl = _fakeUrl
                    } else {
                        this.viewUrl = _viewUrl
                    }
                },
                currentConsent: function (currentConsent) {
                    if (currentConsent) {
                        this.getConsentInfoList(currentConsent)
                    }
                }
            },
            mounted: function () {
                this.getViewStatus()
                this.getConsentList()
            },
            methods: {
                downloadIMG: downloadIMG,
                getConsentList: function () {
                    var self = this
                    return $.ajax({
                        type: 'POST',
                        url: '${baseurl}consentForm/queryConsentFormImgInfos.do',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            hspConsentFormImgCustom: {
                                patientId: this.patientId
                            }
                        }),
                        success: function (res) {
                            if (res.resultInfo.messageCode == 906) {
                                var sysdata = res.resultInfo.sysdata || {}
                                var consentList = sysdata.ConsentFormImgInfos || []
                                self.consentList = consentList
                                self.setCurrentConsent(self.consentList[0])
                            }
                        }
                    })
                },
                getConsentInfoList: function (consent) {
                    var self = this
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
                        }),
                        success: function (res) {
                            if (res.resultInfo.messageCode == 906) {
                                var sysdata = res.resultInfo.sysdata || {}
                                var consentInfoList = sysdata.consentFormImgInfo || []
                                self.consentInfoList = consentInfoList.map(function (info) {
                                    info.imgError = false
                                    return info
                                })
                            }
                        }
                    })
                },
                setCurrentConsent: function (consent) {
                    this.currentConsent = consent || null
                    this.$refs.consentList.setCurrentRow(this.currentConsent)
                },
                handleCurrentConsentChange: function (currentRow) {
                    this.setCurrentConsent(currentRow)
                    this.queuePreviewImg = []
                },
                handleConsentInfoImgError: function (e, consentInfo) {
                    consentInfo.imgUri = this.fakeUrl
                    consentInfo.imgError = true
                },
                handlePreviewImgError: function (e, id) {
                    var src = e.target.src
                    this.queuePreviewImg = this.queuePreviewImg.filter(function (img) {
                        if (id) return img.id !== id
                        return img.base64 !== src
                    })
                },
                handleImgPanelPreview: function (e, url) {
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
                    imgPopup.style.display = 'block'

                    this.$nextTick(function () {
                        imgWrapper.classList.add('img-wrapper__initial')
                        imgElement.classList.add('img-selected-initial')
                    })

                    imgClose.addEventListener('click', function () {
                        container.classList.remove('img-panel__select')
                        imgPopup.removeChild(imgWrapper)
                        imgPopup.style.display = 'none'
                    })
                },
                handlePreviewImgDelete: function (e, id) {
                    this.queuePreviewImg = this.queuePreviewImg.filter(function (img) {
                        return img.id !== id
                    })
                },
                handlePreviewImgUpload: function (e, previewImg, successThenRemove) {
                    successThenRemove = successThenRemove === true
                    var self = this
                    if (previewImg.uploaded === true) {
                        return
                    }
                    this.imageUpload(previewImg.base64, this.currentConsent).then(function (idList) {
                        previewImg.uploaded = true
                        if (successThenRemove) {
                            self.queuePreviewImg = self.queuePreviewImg.filter(function (img) {
                                return img.id !== previewImg.id
                            })
                        }
                        var id = idList[0]
                        self.getConsentInfoList(self.currentConsent).then(function () {
                            self.$nextTick(function () {
                                if (id) {
                                    self.scrollToImage(id)
                                }
                            })
                        })
                    })
                },
                handleConsentInfoImgDelete: function (e, id) {
                    var self = this
                    $.messager.confirm('警告', "是否确认删除 ", function (confirmed) {
                        if (confirmed) {
                            self.imageDelete(id).then(function (res) {
                                self.consentInfoList = self.consentInfoList.filter(function (info) {
                                    return info.id !== id
                                })
                            }).fail(function (res) {
                                if (res.resultInfo) {
                                    message_alert(res)
                                } else {
                                    $.messager.alert('接口异常',"接口异常 删除失败",'error')
                                }
                            })
                        }
                    })
                },
                scrollToImage: function (id){
                    var $newUploadTarget = $('#'+id)
                    $('.content-info-container .queue-preview-img').animate({
                        scrollTop: $newUploadTarget.prev().length ? $newUploadTarget.prev().offset().top : $newUploadTarget.offset().top
                    }, 2000, function() {
                        $newUploadTarget.toggleClass('img-panel__select')
                        setTimeout(function () {
                            $newUploadTarget.toggleClass('img-panel__select')
                        }, 2000)
                    })
                },
                imageUpload: function (base64, consent) {
                    var file = dataURLtoBlob(base64)
                    var formData = new FormData()
                    formData.append('files', file, 'image.jpg')
                    formData.append('hspConsentFormImgCustom.patientId', consent.patientId)
                    formData.append('hspConsentFormImgCustom.consentFormId', consent.consentFormId)
                    formData.append('hspConsentFormImgCustom.consentFormSeq', consent.consentFormSeq)
                    formData.append('hspConsentFormImgCustom.consentFormName', consent.consentFormName)

                    return $.ajax({
                        url: '${baseurl}consentForm/uploadConsentFormImg.do',
                        type: 'POST',
                        cache: false,
                        contentType: false,
                        processData: false,
                        data: formData,
                    }).then(function (res) {
                        message_alert(res)
                        if (res.resultInfo.messageCode == 906) {
                            var sysdata = res.resultInfo.sysdata || {}
                            var idList = sysdata.idList || []
                            return idList
                        }
                        throw res
                    })
                },
                imageDelete: function (id) {
                    return $.ajax({
                        type: 'POST',
                        url: '${baseurl}consentForm/deleteConsentFormImgInfo.do',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            hspConsentFormImgCustom:{
                                id: id
                            }
                        })
                    }).then(function (res) {
                        if (res.resultInfo.messageCode == 906) {
                            return res
                        } else {
                            throw res
                        }
                    })
                },
                // 高拍仪 获取设备状态
                getViewStatus: function () {
                    var self = this
                    $.post("http://127.0.0.1:38088/video=status")
                        .then(function (res) {
                            // no:未连接；ok:已连接；run:已连接且运行
                            self.viewStatus = res.video0 || 'no'
                        })
                        .fail(function () {
                            self.viewStatus = 'no'
                        })
                },
                // 高拍仪 旋转
                rotate: function (angle) {
                    var data = { camidx: '0', rotate: String(angle) }
                    $.post('http://127.0.0.1:38088/video=rotate', JSON.stringify(data))
                },
                // 高拍仪 拍照并获取base64
                grabImage: function () {
                    var self = this
                    var data = {
                        filepath: 'base64',
                        rotate: '0',
                        cutpage: '0',
                        camidx: '0',
                        ColorMode: '0',
                        quality: '3'
                    }
                    return $.post('http://127.0.0.1:38088/video=grabimage', JSON.stringify(data))
                },
                grabImageThenUpload: function (){
                    var self = this
                    this.grabImage().then(function (res) {
                        if (res.code == '0') {
                            var base64 = 'data:image/jpg;base64,' + res.photoBase64
                            self.imageUpload(base64, self.currentConsent).then(function (idList) {
                                var id = idList[0]
                                self.getConsentInfoList(self.currentConsent).then(function () {
                                    self.$nextTick(function () {
                                        if (id) {
                                            self.scrollToImage(id)
                                        }
                                    })
                                })
                            })
                        } else {
                            $.messager.alert('高拍仪',"拍照失败",'error')
                        }
                    })
                },
                grabImageThenPushQueue: function () {
                    var self = this
                    this.grabImage().then(function (res) {
                        if (res.code == '0') {
                            self.queuePreviewImg.push({
                                id: String(new Date().getTime()),
                                base64: 'data:image/jpg;base64,' + res.photoBase64,
                                uploaded: false
                            })
                        } else {
                            $.messager.alert('高拍仪',"拍照失败",'error')
                        }
                    })
                },
                // 高拍仪 添加到PDF队列
                addPdf: function (base64) {
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
