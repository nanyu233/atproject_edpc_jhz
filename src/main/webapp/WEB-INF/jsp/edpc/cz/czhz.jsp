<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%--<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'csSbList.jsp' starting page</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/elementui/elementui.css">
    <style>
        #hzxq {
            width: 100%;
            height: 100%;
        }
        .el-container {
            height: 100%;
        }
        .el-aside {
            height: 100%;
            overflow: hidden;
            transition: width 0.25s;
        }
        .el-main {
            padding: 0;
        }
        .el-menu-item, .el-submenu__title {
            height: 6.7%;
        }
        ul {
            height: 98%;
            text-align: center;
        }
        .taggle-button {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 2%;
            /*background-color: #4a5064;*/
            color: #909399;
            border-right: 1px solid #e6e6e6;
            font-size: 12px;
            line-height: 24px;
            text-align: center;
            cursor: pointer;
            overflow: hidden;
            transition: width 0.25s;
        }

        .mainicon {
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
    </style>
</head>

<body>
<div id="hzxq">
    <el-container>
        <el-aside :width="collapse ? '66px': '140px'">
            <div  class="taggle-button" @click="toggleCollapse()">
                <i :class="collapse === true? 'el-icon-d-arrow-right': 'el-icon-d-arrow-left'"></i>
            </div>
            <el-menu
                :default-active="currentIframeSrc"
                class="el-menu-vertical-demo"
                :collapse="collapse"
                :collapse-transition=false
                @open="handleOpen"
                @close="handleClose">
                <el-menu-item v-for="(item, index) in sidebar" :key="index" :index="index.toString()" @click="toIframe(item,index)">
                    <i :class="[iconList[index], 'mainicon']" v-if="collapse"></i>
                    <span slot="title">{{item.name}}</span>
                </el-menu-item>
            </el-menu>
        </el-aside>
        <el-main>
            <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="mainIfream" scrolling="auto" :src="iframeSrc"></iframe>
        </el-main>
    </el-container>
</div>

</body>
<script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
<script type="text/javascript" src="${baseurl}lib/elementui/elementui.js"></script>
<script type="text/javascript">
    var hzxq = new Vue({
        el: '#hzxq',
        data: {
            currentIframeSrc: '0',
            iframeSrc: '',
            collapse: false,
            iconList: ['el-icon-date','el-icon-mouse','el-icon-guide','el-icon-time','el-icon-notebook-1','el-icon-notebook-2','el-icon-document','el-icon-tickets','el-icon-document-checked','el-icon-document-copy','el-icon-chat-dot-square','el-icon-data-line','el-icon-first-aid-kit','el-icon-reading'],
            sidebar: [
                <%--{--%>
                <%--    name: '时间管理记录表',--%>
                <%--    src: 'cpc/toXtzlPrintPage.do?regSeq=' + '${regSeq}' + '&cstNam=' + '${cstNam}' + '&emgSeq='  + '${emgSeq}' + '&tempNo=TEMP10000001'--%>
                <%--},--%>
                {
                    name: '卒中上报',
                    src: 'cz/toCzxqPage.do?regSeq=' + '${regSeq}' + '&cstNam=' + '${cstNam}' + '&emgSeq='  + '${emgSeq}' + '&wayTyp=' + '${wayTyp}'
                },
                {
                    name: '诊疗流程',
                    src: 'cz/toCzHomePage.do?regSeq=' + '${regSeq}' + '&cstNam=' + '${cstNam}' + '&emgSeq='  + '${emgSeq}' + '&wayTyp=' + '${wayTyp}'
                },
                {
                    name: '时间轴',
                    src: '${baseurl}cz/toCzTimeline.do?emgSeq='  + '${emgSeq}'+'&wayTyp=' + '${wayTyp}' + '&regSeq=' +'${regSeq}'
                },
                {
                    name: '随访记录',
                    src: '${baseurl}cpc/toFollowUpManagement.do?emgSeq='  + '${emgSeq}'+'&wayTyp=' + '${wayTyp}' + '&regSeq=' +'${regSeq}' + '&cstNam=' + '${cstNam}'
                },
                {
                    name: '知情同意书'
                },
                {
                    name: '评分总览',
                    src:'${baseurl}icuscore/toBasicPage.do?gradeType=GTOTAL&liveNo=' + '${regSeq}' + "&menuKind=3"
                },
                {
                    name: '检验信息',
                    src:'${baseurl}zyyqjs/toqjscaseexaminenew.do?regSeq='  + '${regSeq}'
                },

                {
                    name: '检查结果',
                    src:'${baseurl}zyyqjs/qjsjcbg.do?regSeq='+ '${regSeq}'
                },
                {
                    name: '医嘱信息',
                    src:'${baseurl}zyyqjs/qjsyzxx.do?regSeq='+ '${regSeq}'
                },
                {
                    name: '会诊信息'
                },
                {
                    name: '心电图'
                },
                // {
                //     name: '留抢病历'
                // },
                // {
                //     name: '护理记录'
                // },
            ]
        },
        created() {
            if (window.sessionStorage.getItem('currentczIframeSrc' + '${regSeq}') && window.sessionStorage.getItem('currentczIframeSrc' + '${regSeq}')!=0) {
                this.currentIframeSrc = window.sessionStorage.getItem('currentczIframeSrc' + '${regSeq}')
                this.iframeSrc = this.sidebar[this.currentIframeSrc].src
            }else {
                this.iframeSrc = this.sidebar[0].src
            }
        },
        methods: {
            toggleCollapse() {
                this.collapse = !this.collapse
            },
            toIframe(item,index) {
                this.iframeSrc = item.src + '&time' + new Date().getTime()
                window.sessionStorage.setItem('currentczIframeSrc' + '${regSeq}',index)
            },
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        },
    })
</script>
</html>
