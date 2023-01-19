<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Grace评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/elementui/elementui.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery1.css?aaa=5555">
    <style type="text/css">
        .nursingSco .scoreQuery .boldFont1 {
            font-weight: bold;
            bottom: 15px;
            font-size: 16px;
        }

        table tr th {
            width: 350px;
        }

        table tr td:nth-child(1) {
            width: 700px;
        }

        table tr td:nth-child(2) {
            width: 300px;
        }

        ul {
            width: 100%;
        }

        ul li {
            cursor: pointer;
            height: 30px;
            display: flex;
            align-items: center;
            justify-content: flex-start;
        }
        ul li:not(:last-child) {
            border-bottom: 1px solid #e2e4e8;
        }
        ul li:hover {
            background-color: #f1f1f1;
        }
        ul .active{
            background-color: #f1f1f1;
        }
        ul li div {
            height: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        ul li div:nth-child(1) {
            width: 348px;
            border-right: 1px solid #f1f1f1;
        }

        ul li div:nth-child(2) {
            width: 300px;
        }

        .panelGde table .eveItems {
            background-color: #fff

        }

        .panelGde table .oddItems {
            background-color: #e5f6ff
        }
    </style>
</head>
<body class="nursingSco" style="width: 80%;margin:10px auto">
<div id="grace" class="scoreQuery">
    <template>
        <div>
            <select v-model="scovalue" placeholder="请选择">
                <option
                    v-for="item in options"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                </option>
            </select>
        </div>
        <div>
            <p class="headtitle">Grace评分</p>
            <div class="panelGde">
                <div class="BradenContent panelContent">
                    <table>
                        <tr>
                            <td colspan="2" align="center">
                                评分项目
                            </td>
                            <td align="center">
                                分值
                            </td>
                        </tr>
                        <tr v-for="(item, index) in scoList">
                            <th :class="[index % 2 == 0? 'oddItems': 'eveItems']">{{item.name}}</th>
                            <td colspan="2">
                                <ul>
                                    <li v-for="(ageItem, ageIndex) in item.ageList" @click="liClick(item,ageItem,ageIndex)" :class="[allScore[ageItem.type] == ageItem.score? 'active':'']">
                                        <div>
                                            {{ageItem.name}}
                                        </div>
                                        <div>
                                            {{ageItem.score}}
                                        </div>
                                    </li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                    <div class="scoreDiv">
                        <span class="boldFont1">总分：{{graceScore}}</span><br/>
                        <%--                    <div class="common_btnGrp">--%>
                        <%--                        <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>--%>
                        <%--                        <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>--%>
                        <%--                    </div>--%>
                    </div>
                </div>
            </div>
        </div>
    </template>
</div>
</body>
<script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
<script type="text/javascript" src="${baseurl}lib/elementui/elementui.js"></script>
<script type="text/javascript">

    var grace = new Vue({
        el: '#grace',
        data: {
            options: [{
                value: 'grace评分',
                label: 'grace评分'
            }],
            scovalue: 'grace评分',
            allScore: {
                ageScore: null,
                heartrateScore: null,
                sbpScore: null,
                scScore: null,
                KillipScore: null,
                rfScore: null
            },
            graceScore: 0,
            scoList: [
                {
                    name: '年龄（岁）',
                    ageList: [
                        {
                            type: 'ageScore',
                            name: '<30',
                            score: 0
                        },
                        {
                            type: 'ageScore',
                            name: '30-39',
                            score: 8
                        },
                        {
                            type: 'ageScore',
                            name: '40-49',
                            score: 25
                        },
                        {
                            type: 'ageScore',
                            name: '50-59',
                            score: 41
                        },
                        {
                            type: 'ageScore',
                            name: '60-69',
                            score: 58
                        },
                        {
                            type: 'ageScore',
                            name: '70-79',
                            score: 75
                        },
                        {
                            type: 'ageScore',
                            name: '80-89',
                            score: 91
                        },
                        {
                            type: 'ageScore',
                            name: '≥90',
                            score: 100
                        }
                    ]
                },
                {
                    name: '心率（次/分）',
                    ageList: [
                        {
                            type: 'heartrateScore',
                            name: '<50',
                            score: 0
                        },
                        {
                            type: 'heartrateScore',
                            name: '50-69',
                            score: 3
                        },
                        {
                            type: 'heartrateScore',
                            name: '70-89',
                            score: 9
                        },
                        {
                            type: 'heartrateScore',
                            name: '90-109',
                            score: 15
                        },
                        {
                            type: 'heartrateScore',
                            name: '110-149',
                            score: 24
                        },
                        {
                            type: 'heartrateScore',
                            name: '150-199',
                            score: 38
                        },
                        {
                            type: 'heartrateScore',
                            name: '≥200',
                            score: 46
                        }
                    ]
                },
                {
                    name: '收缩压（mmHg）',
                    ageList: [
                        {
                            type: 'sbpScore',
                            name: '<80',
                            score: 58
                        },
                        {
                            type: 'sbpScore',
                            name: '80-99',
                            score: 53
                        },
                        {
                            type: 'sbpScore',
                            name: '100-119',
                            score: 43
                        },
                        {
                            type: 'sbpScore',
                            name: '120-139',
                            score: 34
                        },
                        {
                            type: 'sbpScore',
                            name: '140-159',
                            score: 24
                        },
                        {
                            type: 'sbpScore',
                            name: '160-199',
                            score: 10
                        },
                        {
                            type: 'sbpScore',
                            name: '≥200',
                            score: 0
                        }
                    ]
                },
                {
                    name: '血肌酐（mg/dL）',
                    ageList: [
                        {
                            type: 'scScore',
                            name: '0-0.39',
                            score: 1
                        },
                        {
                            type: 'scScore',
                            name: '0.4-0.79',
                            score: 4
                        },
                        {
                            type: 'scScore',
                            name: '0.8-1.19',
                            score: 7
                        },
                        {
                            type: 'scScore',
                            name: '1.2-1.59',
                            score: 10
                        },
                        {
                            type: 'scScore',
                            name: '1.6-1.99',
                            score: 13
                        },
                        {
                            type: 'scScore',
                            name: '2.0-3.99',
                            score: 21
                        },
                        {
                            type: 'scScore',
                            name: '≥4.0',
                            score: 28
                        }
                    ]
                },
                {
                    name: 'Killip分级',
                    ageList: [
                        {
                            type: 'KillipScore',
                            name: 'Ⅰ（无心力衰竭征象）',
                            score: 0
                        },
                        {
                            type: 'KillipScore',
                            name: 'Ⅱ（轻至中度心力衰竭）',
                            score: 20
                        },
                        {
                            type: 'KillipScore',
                            name: 'Ⅲ（重度心力衰竭）',
                            score: 39
                        },
                        {
                            type: 'KillipScore',
                            name: 'Ⅳ（心源性休克）',
                            score: 59
                        }
                    ]
                },
                {
                    name: '危险因素',
                    ageList: [
                        {
                            type: 'rfScore',
                            name: '入院前心脏停搏',
                            score: 39
                        },
                        {
                            type: 'rfScore',
                            name: 'ST段下移',
                            score: 28
                        },
                        {
                            type: 'rfScore',
                            name: '心肌酶升高',
                            score: 14
                        }
                    ]
                }
            ]
        },
        methods: {
            liClick(item,ageItem,ageIndex) {
                this.allScore[ageItem.type] = ageItem.score
                let result = 0
                for(let key in this.allScore) {
                    if (this.allScore[key]) {
                        result  += this.allScore[key]
                    }
                }
                this.graceScore = result

            }
        }

    })


</script>
</html>
