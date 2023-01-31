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

        table {
            width: 100%;
        }

        table tr th {
            /*width: 350px;*/
        }

        table tr td:nth-child(1) {
            /*width: 700px;*/
            /*width: 376.6px;*/
        }

        table tr td:nth-child(2) {
            /*width: 300px;*/
            /*width: 35.8%;*/
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
            background-color: #eaf2ff;
        }

        ul .active {
            background-color: #eaf2ff;
        }

        ul li div {
            height: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        ul li div:nth-child(1) {
            /*width: 348px;*/
            width: 50%;
            border-right: 1px solid #f1f1f1;
        }

        ul li div:nth-child(2) {
            /*width: 300px;*/
            width: 50%;
        }

        .panelGde table .eveItems {
            background-color: #fff

        }

        .panelGde table .oddItems {
            background-color: #e5f6ff
        }
        .save-btn{
            position: fixed;
            right: 10px;
            bottom: 10px;
            width: 120px;
            text-align: center;
            height: 40px;
            line-height: 40px;
            border-radius: 5px;
            background: #0d478f;
            color: #ffffff;
            cursor: pointer;
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
                        <tbody>
                            <tr>
                                <td colspan="1" align="center" style="width: 20%" v-for="(item, index) in headList" :key="index">
                                    {{item}}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="1" align="center" style="width: 20%">
                                    {{result.cstAge}}
                                </td>
                                <td colspan="1" align="center" style="width: 20%">
                                    {{result.hrtRte}}
                                </td>
                                <td colspan="1" align="center" style="width: 20%">
                                    {{result.sbpupNbr}}
                                </td>
                                <td colspan="1" align="center" style="width: 20%">
                                    {{result.jgdb}}
                                </td>
                                <td colspan="1" align="center" style="width: 20%">
                                    {{killip}}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="3" align="center">
                                    评分项目
                                </td>
                                <td colspan="2" align="center">
                                    分值
                                </td>
                            </tr>
                            <tr v-for="(item, index) in scoList">
                                <th colspan="1">{{item.name}}</th>
                                <td colspan="4">
                                    <ul>
                                        <li v-for="(ageItem, ageIndex) in item.ageList"
                                            @click="liClick(item,ageItem,ageIndex)"
                                            :class="[allScore[ageItem.type] == ageItem.score? 'active':'']">
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
                            <tr v-for="(item, index) in wxysArr">
                                <th colspan="1">{{item.name}}</th>
                                <td colspan="4">
                                    <ul>
                                        <li v-for="(ageItem, ageIndex) in item.ageList"
                                            @click="liClick(item,ageItem,ageIndex)"
                                            :class="[wxysResArr.includes(ageIndex + 1 + '')? 'active':'']">
                                            <div>
                                                <input ref="checkbox" type="checkbox">
                                                {{ageItem.name}}
                                            </div>
                                            <div>
                                                {{ageItem.score}}
                                            </div>
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="scoreDiv">
                        <span class="boldFont1">总分：{{graceScore}}</span><br/>
                        <%--                    <div class="common_btnGrp">--%>
                        <%--                        <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>--%>
                        <%--                        <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>--%>
                        <%--                    </div>--%>
                        <div class="save-btn" @click="commit()">保存</div>
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
                cstAgeScore: null,
                hrtRteScore: null,
                sbpupNbrScore: null,
                jgdbScore: null,
                killipScore: null,
                rfScore: 0
            },
            graceScore: 0,
            result: {},
            headList: ['年龄（岁）','心率（次/分）','收缩压（mmHg）','血肌酐（mg/dL）','Killip分级'],
            killpList:  publicFun.getDict('XT_KILLIP_COD') || [],
            WXYSList: publicFun.getDict('XT_WXYS_COD') || [],
            cstAge: [
                {
                    max: 29,
                    min: 0,
                    flgSco: 0
                },
                {
                    max: 39,
                    min: 30,
                    flgSco: 8
                },
                {
                    max: 49,
                    min: 40,
                    flgSco: 25
                },
                {
                    max: 59,
                    min: 50,
                    flgSco: 41
                },
                {
                    max: 69,
                    min: 60,
                    flgSco: 58
                },
                {
                    max: 79,
                    min: 70,
                    flgSco: 75
                },
                {
                    max: 89,
                    min: 80,
                    flgSco: 91
                },
                {
                    max: Infinity,
                    min: 200,
                    flgSco: 100
                },
            ],
            hrtRte: [
                {
                    max: 49,
                    min: 0,
                    flgSco: 0
                },
                {
                    max: 69,
                    min: 50,
                    flgSco: 3
                },
                {
                    max: 89,
                    min: 70,
                    flgSco: 9
                },
                {
                    max: 109,
                    min: 90,
                    flgSco: 15
                },
                {
                    max: 149,
                    min: 110,
                    flgSco: 24
                },
                {
                    max: 199,
                    min: 150,
                    flgSco: 38
                },
                {
                    max: Infinity,
                    min: 200,
                    flgSco: 3
                },
            ],
            sbpupNbr: [
                {
                    max: 79,
                    min: -Infinity,
                    flgSco: 58
                },
                {
                    max: 99,
                    min: 80,
                    flgSco: 53
                },
                {
                    max: 119,
                    min: 100,
                    flgSco: 43
                },
                {
                    max: 139,
                    min: 120,
                    flgSco: 34
                },
                {
                    max: 159,
                    min: 140,
                    flgSco: 24
                },
                {
                    max: 199,
                    min: 160,
                    flgSco: 10
                },
                {
                    max: Infinity,
                    min: 200,
                    flgSco: 0
                }
            ],
            jgdb: [
                {
                    max: 0.39,
                    min: 0,
                    flgSco: 1
                },
                {
                    max: 0.79,
                    min: 0.4,
                    flgSco: 4
                },
                {
                    max: 1.19,
                    min: 0.8,
                    flgSco: 7
                },
                {
                    max: 1.59,
                    min: 1.2,
                    flgSco: 10
                },
                {
                    max: 1.99,
                    min: 1.6,
                    flgSco: 13
                },
                {
                    max: 3.99,
                    min: 2,
                    flgSco: 21
                },
                {
                    max: Infinity,
                    min: 4,
                    flgSco: 7
                },
            ],
            wxysResArr:[],
            wxysArr: [
                {
                    name: '危险因素',
                    ageList: [
                        {
                            type: 'rfScore',
                            name: '发病后曾出现心脏骤停',
                            score: 39,
                            infocode: '1'
                        },
                        {
                            type: 'rfScore',
                            name: '心电图ST段改变',
                            score: 28,
                            infocode: '2'

                        },
                        {
                            type: 'rfScore',
                            name: '心肌坏死标志物升高',
                            score: 14,
                            infocode: '3'

                        }
                    ]
                }
            ],
            scoList: [
                {
                    name: '年龄（岁）',
                    ageList: [
                        {
                            type: 'cstAgeScore',
                            name: '<30',
                            score: 0,
                        },
                        {
                            type: 'cstAgeScore',
                            name: '30-39',
                            score: 8
                        },
                        {
                            type: 'cstAgeScore',
                            name: '40-49',
                            score: 25
                        },
                        {
                            type: 'cstAgeScore',
                            name: '50-59',
                            score: 41
                        },
                        {
                            type: 'cstAgeScore',
                            name: '60-69',
                            score: 58
                        },
                        {
                            type: 'cstAgeScore',
                            name: '70-79',
                            score: 75
                        },
                        {
                            type: 'cstAgeScore',
                            name: '80-89',
                            score: 91
                        },
                        {
                            type: 'cstAgeScore',
                            name: '≥90',
                            score: 100
                        }
                    ]
                },
                {
                    name: '心率（次/分）',
                    ageList: [
                        {
                            type: 'hrtRteScore',
                            name: '<50',
                            score: 0
                        },
                        {
                            type: 'hrtRteScore',
                            name: '50-69',
                            score: 3
                        },
                        {
                            type: 'hrtRteScore',
                            name: '70-89',
                            score: 9
                        },
                        {
                            type: 'hrtRteScore',
                            name: '90-109',
                            score: 15
                        },
                        {
                            type: 'hrtRteScore',
                            name: '110-149',
                            score: 24
                        },
                        {
                            type: 'hrtRteScore',
                            name: '150-199',
                            score: 38
                        },
                        {
                            type: 'hrtRteScore',
                            name: '≥200',
                            score: 46
                        }
                    ]
                },
                {
                    name: '收缩压（mmHg）',
                    ageList: [
                        {
                            type: 'sbpupNbrScore',
                            name: '<80',
                            score: 58
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '80-99',
                            score: 53
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '100-119',
                            score: 43
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '120-139',
                            score: 34
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '140-159',
                            score: 24
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '160-199',
                            score: 10
                        },
                        {
                            type: 'sbpupNbrScore',
                            name: '≥200',
                            score: 0
                        }
                    ]
                },
                {
                    name: '血肌酐（mg/dL）',
                    ageList: [
                        {
                            type: 'jgdbScore',
                            name: '0-0.39',
                            score: 1
                        },
                        {
                            type: 'jgdbScore',
                            name: '0.4-0.79',
                            score: 4
                        },
                        {
                            type: 'jgdbScore',
                            name: '0.8-1.19',
                            score: 7
                        },
                        {
                            type: 'jgdbScore',
                            name: '1.2-1.59',
                            score: 10
                        },
                        {
                            type: 'jgdbScore',
                            name: '1.6-1.99',
                            score: 13
                        },
                        {
                            type: 'jgdbScore',
                            name: '2.0-3.99',
                            score: 21
                        },
                        {
                            type: 'jgdbScore',
                            name: '≥4.0',
                            score: 28
                        }
                    ]
                },
                {
                    name: 'Killip分级',
                    ageList: [
                        {
                            type: 'killipScore',
                            name: 'Ⅰ（无心力衰竭征象）',
                            score: 0
                        },
                        {
                            type: 'killipScore',
                            name: 'Ⅱ（轻至中度心力衰竭）',
                            score: 20
                        },
                        {
                            type: 'killipScore',
                            name: 'Ⅲ（重度心力衰竭）',
                            score: 39
                        },
                        {
                            type: 'killipScore',
                            name: 'Ⅳ（心源性休克）',
                            score: 59
                        }
                    ]
                }
            ]
        },
        created() {
            this.getGraceInfo()
        },
        computed: {
            killip() {
                if (this.result.killip) {
                    let arr = this.killpList.filter(item => {
                        return item.infocode == this.result.killip
                    })
                    return arr[0].info
                }
            }
        },
        methods: {
            getGraceInfo() {
                let that = this
                $.ajax({
                    url: '${baseurl}cpc/getHspGraceInf.do',
                    type: 'post',
                    dataType: 'json',
                    contentType: 'application/json; charset=utf',
                    data: JSON.stringify({
                        emgSeq: '${regSeq}',
                        graceType: 0
                    }),
                    success: function (res) {
                        if (res && res.resultInfo.sysdata.hasOwnProperty('hspGraceInf')) {
                            that.result = res.resultInfo.sysdata.hspGraceInf
                            that.graceScore = that.result.total
                            let arr = ['cstAge', 'hrtRte', 'sbpupNbr']
                            arr.forEach(item => {
                                if (that.result.hasOwnProperty(item) && that.result[item]) {
                                    let itemSco = that[item].filter(item1 => {
                                        if (that.result[item] >= item1.min && that.result[item] <= item1.max) {
                                            return true
                                        }
                                    })
                                    that.allScore[item + 'Score'] = itemSco[0].flgSco
                                }
                            })

                            // wxys得分·
                            let wxysSco = [39, 28, 14]
                            if (that.result.wxys) {
                                that.wxysResArr = that.result.wxys.split(',')
                                that.wxysResArr.forEach(item => {
                                    that.$refs.checkbox[item - 1].checked = true
                                    that.allScore.rfScore += wxysSco[item - 1]
                                })
                            }
                            // killip得分
                            if (that.result.killip == 1) {
                                that.allScore.killipScore = 0
                            } else if (that.result.killip == 2) {
                                that.allScore.killipScore = 20
                            } else if (that.result.killip == 3) {
                                that.allScore.killipScore = 39
                            } else if (that.result.killip == 4) {
                                that.allScore.killipScore = 59
                            }

                        }

                    }
                })
            },
            liClick(item, ageItem, ageIndex) {
                this.allScore[ageItem.type] = ageItem.score
                let result = 0

                // 危险因素多选得分单独计算
                if (ageItem.type === 'rfScore') {
                    if (this.wxysResArr.indexOf(ageItem.infocode) > -1) {
                        this.wxysResArr.splice(this.wxysResArr.indexOf(ageItem.infocode), 1)
                        this.$refs.checkbox[ageIndex].checked = false
                    }else {
                        this.wxysResArr.push(ageItem.infocode)
                        this.$refs.checkbox[ageIndex].checked = true
                    }
                }
                for (let key in this.allScore) {
                    if (key !== 'rfScore' && this.allScore[key]) {
                        result += this.allScore[key]
                    }else if (key === 'rfScore'){
                        let wxysSco = [39, 28, 14]
                        this.wxysResArr.forEach(item => {
                            result += wxysSco[item - 1]
                        })
                    }
                }
                console.log(this.allScore, this.wxysResArr)
                this.graceScore = result

            },
            commit() {
                parent.publicFun.ajaxLoading('保存中 请稍等。。。')
                $.ajax({
                    url: '',
                    type: 'post',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify(),
                    success: function(res) {

                    },
                });
                setTimeout(() => {
                        parent.publicFun.ajaxLoadEnd()
                },1000)
            }
        }

    })


</script>
</html>
