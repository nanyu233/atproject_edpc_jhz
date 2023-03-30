<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/csSbList.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <style>
        .main .tab-header{
            list-style: none;
            clear: both;
        }
        .main .tab-header .tab{
            background-color: #6FA7F0;
            color: white;
            width: 140px;
            padding: 10px 0;
            text-align: center;
            float: left;
            cursor: pointer;
        }
        .main select.w-auto {
            min-width: 155px;
            width: auto;
        }
        .main input[name=idNbr] {
            width: 170px;
        }

        a {
            text-decoration: underline;
            cursor: pointer;
            color: #528bd6;
        }
        table {
            width: 70%;
        }
        .tableTr {
            border: 1px solid #e0e0e0;
            height: 30px
        }
        .tableTr td:nth-child(-n + 4) {
            border-right: 1px solid #e0e0e0;
            text-align: center;
        }
        .tableTr1 td:nth-child(-n + 5) {
            text-align: center;
            border-right: 1px solid #e0e0e0;
        }
        .file {
            cursor: pointer;
            position: relative;
            display: inline-block;
            background: #D0EEFF;
            border: 1px solid #99D3F5;
            border-radius: 4px;
            padding: 4px 12px;
            overflow: hidden;
            color: #1E88C7;
            text-decoration: none;
            text-indent: 0;
            line-height: 30px;
            margin-left: 40px;
        }
        .file input {
            position: absolute;
            font-size: 100px;
            right: 0;
            top: 0;
            opacity: 0;
        }
        .inputs .input-group .btn1 {
            background-color: #eeeeee;
            cursor: pointer;
        }

        .custom-btn {
            width: fit-content;
            height: 40px;
            color: #fff;
            border-radius: 5px;
            padding: 0 10px;
            font-weight: 500;
            background: transparent;
            cursor: pointer;
            transition: all 0.3s ease;
            position: relative;
            display: inline-block;
            box-shadow:inset 2px 2px 2px 0px rgba(255,255,255,.5),
            7px 7px 20px 0px rgba(0,0,0,.1),
            4px 4px 5px 0px rgba(0,0,0,.1);
            outline: none;
        }

        .btn-1 {
            background: #428bca;
            border: none;
        }
        .btn-1:hover {
            background: #0d478f;
            box-shadow: none;
        }

        .gap-3 {
            gap: 3px;
        }
        .w-full {
            width: 100% !important;
        }
        .flex {
            display: flex !important;
        }
        .flex-1 {
            flex: 1 !important;
        }
        .flex-none {
            flex: none !important;
        }
    </style>
</head>
<body>
 <div id="main">
  <template>
<%--  时间轴--%>
    <div class="time_axis fl">
    <h4>
        <span class="iconfont icon-time"></span>
        <span class="ranking_time">时间轴</span>
    </h4>
    <div class="timeline timeline-single-column">
        <div class="timeline-item ng-scope timeLeftBlock" v-for="(item, index) in timeList" :key="index">
            <div class="timeline-point timeline-point-blank"></div>
            <div class="timeline-event">
                <div class="timeline_title">{{item.proVal | formatDateTimeNonSecWithSlash}}</div>
                <div class="timeline_value">{{item.proName}}</div>
                <div class="timeline_diff_warning">{{item.diffred}}</div>
                <!-- 红色 -->
                <div class="timeline_diff">{{item.diffblue}}</div>
                <!-- 蓝色 -->
            </div>
        </div>
    </div>
</div>
<%--表单--%>
    <div class="main fl">
          <div class="tab-header">
                  <div class="tab" v-for="(item, index) in baseData.Tab" :class="[activeTab === index ? 'active' : '']"  @click="onTabClick(index)">{{item}}</div>
          </div>
<%--          基本信息--%>
          <div v-if="activeTab === 0">
              <div class="basic-info">
                  <div class="title1">基本信息</div>
                  <div class="content">
                      <div class="row">
                          <div class="input-wrapper w23">
                              <div class="lb">姓名</div>
                              <div class="input">
                                  <input type="text" class="input" v-model="baseInfo.cstNam" disabled="disabled"/>
                              </div>
                          </div>
                          <div class="input-wrapper w23">
                              <div class="lb"><span class="required">*</span>性别</div>
                              <div class="input">
                                  <select name="" v-model="baseInfo.cstSexCod" disabled="disabled">
                                      <option value="null">请选择</option>
                                      <option v-for="item in baseData.cstSexCodArr" :value="item.infocode">{{item.info}}</option>
                                  </select>
                              </div>
                          </div>
                          <div class="input-wrapper w23">
                              <div class="lb"><span class="required">*</span>年龄</div>
                              <div class="input">
                                  <select name="" v-model="info.NIANL" disabled="disabled">
                                      <option value="null">请选择</option>
                                      <option v-for="item in baseData.NIANL" :value="item.infocode">{{item.info}}</option>
                                  </select>
                              </div>
                          </div>
                          <div class="input-wrapper w23">
                              <div class="lb"><span class="required">*</span>年龄值</div>
                              <div class="input">
                                  <input type="text" class="input"maxlength="3" v-model="baseInfo.cstAge" disabled="disabled" />
                                  <div class="unit">岁</div>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="input-wrapper w23" >
                              <div class="lb">身份证号<span class="required">*</span></div>
                              <div class="input">
                                  <input type="text" name="idNbr" class="input" v-model="baseInfo.idNbr" />
                              </div>
                          </div>
                          <div class="input-wrapper w23" >
                              <div class="lb">紧急联系人<span class="required">*</span></div>
                              <div class="input">
                                  <input type="text"  class="input" v-model="info.JJLXR" />
                              </div>
                          </div>
                          <div class="input-wrapper w23" >
                              <div class="lb">联系电话</div>
                              <div class="input">
                                  <input type="text"  class="input" v-model="baseInfo.pheNbr" disabled="disabled"/>
                              </div>
                          </div>
                      </div>
                      <div class="block">
                          <div class="inputs flex gap-3">
                              <div class="input-group flex-none">
                                  <div class="lb">家庭住址</div>
                                  <div class="input">
                                      <select name="" v-model="aidPatient.scePrvCod">
                                          <!-- onchange="ReSelected()" -->
                                          <option value="">请选择</option>
                                          <option v-for="item in baseData.provinceList" :value="item.addrCode">{{item.addrName}}</option>
                                      </select>
                                      <select name=""  v-model="aidPatient.sceCtyCod">
                                          <option value="">请选择</option>
                                          <option v-for="item in baseData.cityList" :value="item.addrCode">{{item.addrName}}</option>
                                      </select>
                                      <select name="" v-model="aidPatient.sceAr0Cod">
                                          <option value="">请选择</option>
                                          <option v-for="item in baseData.cntyList" :value="item.addrCode">{{item.addrName}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group flex-1 flex" >
                                  <div class="lb flex-none">详细地址</div>
                                  <div class="input flex-1">
                                      <input type="text" class="input w-full" v-model="baseInfo.cstAdr"/>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="title1">病人信息</div>
                      <div class="block">
                          <div class="inputs flex gap-3">
                              <div class="input-group flex-none" >
                                  <div class="lb">发病时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="FBSJ" onclick="WdatePickerEnd('FBSJ','info.FBSJ','yyyy-MM-dd HH:mm')" v-model="info.FBSJ"/>
                                  </div>
                              </div>
                              <div class="input-group flex-none" >
                                  <div class="lb">呼救时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="HJSJ" onclick="WdatePickerEnd('HJSJ','info.HJSJ','yyyy-MM-dd HH:mm')" v-model="info.HJSJ"/>
                                  </div>
                              </div>
                              <div class="input-group flex-1 flex">
                                <div class="lb flex-none">发病地址</div>
                                <div class="input flex-1">
                                    <input type="text" class="input w-full" v-model="info.FBDZ"/>
                                </div>
                            </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group" >
                                  <div class="lb">救护车出发时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="CCSJ" onclick="WdatePickerEnd('CCSJ','info.CCSJ','yyyy-MM-dd HH:mm')" v-model="info.CCSJ"/>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">到达现场时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="DCSJ" onclick="WdatePickerEnd('DCSJ','info.DCSJ','yyyy-MM-dd HH:mm')" v-model="info.DCSJ"/>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">离场时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="LCSJ" onclick="WdatePickerEnd('LCSJ','info.LCSJ','yyyy-MM-dd HH:mm')" v-model="info.LCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group" >
                                  <div class="lb">到达医院时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="DYSJ" onclick="WdatePickerEnd('DYSJ','info.DYSJ','yyyy-MM-dd HH:mm')" v-model="info.DYSJ"/>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">死亡时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="SWSJ" onclick="WdatePickerEnd('SWSJ','info.SWSJ','yyyy-MM-dd HH:mm')" v-model="info.SWSJ"/>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">院前预警时间</div>
                                  <div class="input">
                                      <input type="text"  class="Wdate input" ref="YJSJ" onclick="WdatePickerEnd('YJSJ','info.YJSJ','yyyy-MM-dd HH:mm')" v-model="info.YJSJ"/>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="block">
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>MPDS症状</div>
                                  <div class="input">
                                      <select class="w-auto" name="" v-model="info.MPDS">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.MDPS" :value="item.infocode">{{item.info}}</option>
                                      </select>
                              </div>
                          </div>
<%--                          <div class="inputs">--%>
<%--                              <div style="margin-left: 130px">--%>
<%--                                  <div class="checkbox-group">--%>
<%--                                      <div v-for="(item, index) in MDPS.slice(0,9)" class="btn" :class="[query.MDPSSel.includes(item.infocode) ? 'active':'']" @click="onCheckClick('MDPS',item.infocode)">--%>
<%--                                          {{item.info}}--%>
<%--                                      </div>--%>
<%--                                  </div>--%>
<%--                              </div>--%>
<%--                          </div>--%>
                      </div>
                      <div class="block">
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>病情判断</div>
                                  <div class="input">
                                      <select name="" v-model="info.BQPD">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.BQPD" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">来院方式</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>来院方式</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.LYFS" :class="[info.LYFS == item.infocode? 'active': '']" @click="onRadioClick('LYFS',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs" v-if="info.LYFS == 1">
                              <div class="input-group" >
                                  <div class="lb">出车单位</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.HJJHC" :class="[info.HJJHC == item.infocode? 'active': '']" @click="onRadioClick('HJJHC',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">跟车医生</div>
                                  <div class="input">
                                      <input type="text"  class="input" v-model="info.GCYS"/>
                                  </div>
                              </div>
                              <div class="input-group" >
                                  <div class="lb">跟车护士</div>
                                  <div class="input">
                                      <input type="text"  class="input" v-model="info.GCHS"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs" v-if="info.LYFS == 3">
                              <div class="input-group" >
                                  <div class="lb">自行来院</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ZXLY" :class="[info.ZXLY == item.infocode? 'active': '']" @click="onRadioClick('ZXLY',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="block">
                          <div class="title1">院前诊断</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">院前诊断</div>
                                  <div class="input">
                                      <input type="text"  class="input" v-model="info.YQZD"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">诊断时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="ZDSJ" onclick="WdatePickerEnd('ZDSJ','info.ZDSJ','yyyy-MM-dd HH:mm')" v-model="info.ZDSJ" />
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group flex" style="width: 634px;">
                                  <div class="lb">主诉</div>
                                  <div class="input flex-1">
                                      <input type="text"  class="input w-full" v-model="info.ZHUS"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group flex" style="width: 634px;">
                                  <div class="lb">现病史</div>
                                  <div class="input flex-1">
                                      <input type="text"  class="input w-full" v-model="info.XIANBS"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group flex" style="width: 634px;">
                                  <div class="lb">既往史</div>
                                  <div class="input flex-1">
                                      <input type="text"  class="input w-full" v-model="info.JIWS"/>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">院前生命体征</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">血压</div>
                                  <div class="input">
                                      <input type="text" class="input" placeholder="--/--" v-model="info.XUEY" />
                                      <div class="unit">mmHg</div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">心率</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="limitInput(this,300)" v-model="info.XINL" />
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">脉搏</div>
                                  <div class="input">
                                      <input type="text" class="input"  onkeyup="limitInput(this,300)" v-model="info.MAIB"/>
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">呼吸频率</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="limitInput(this,40)" v-model="info.HXPL" />
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">体温</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="NumberInput(this)" maxlength="5" v-model="info.TIWEN"/>
                                      <div class="unit">℃</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">血糖</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="NumberInput(this)" maxlength="5" v-model="info.XUET"/>
                                      <div class="unit">mmol/L</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">血氧饱和度</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="NumberInput(this)" maxlength="5" v-model="info.XYBHD"/>
                                      <div class="unit">%</div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">瞳孔</div>
                                  <div class="input">
                                           <select name="" v-model="info.TONGK">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.TONGK" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">光反射</div>
                                  <div class="input">
                                      <select name="" v-model="info.GUANGFS">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.GUANGFS" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">意识</div>
                                  <div class="input">
                                      <select name="" v-model="info.YISHI">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.YISHI" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">气道</div>
                                  <div class="input">
                                      <select name="" v-model="info.QIDAO">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.QIDAO" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">循环</div>
                                  <div class="input">
                                      <select name="" v-model="info.XUNH">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.XUNH" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">心律</div>
                                  <div class="input">
                                      <select name="" v-model="info.XINLV">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.XINLV" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">胸部</div>
                                  <div class="input">
                                      <select name="" v-model="info.XIONGB">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.XIONGB" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">腹部</div>
                                  <div class="input">
                                      <select name="" v-model="info.FUBU">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.FUBU" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">肠鸣</div>
                                  <div class="input">
                                      <select name="" v-model="info.CHANGM">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.CHANGM" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">肌张力</div>
                                  <div class="input">
                                      <select name=""  v-model="info.JIZL">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.JIZL" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">骨折</div>
                                  <div class="input">
                                      <select name="" v-model="info.GUZHE">
                                          <option value="null">请选择</option>
                                          <option v-for="item in baseData.GUZHE" :value="item.infocode">{{item.info}}</option>
                                      </select>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">体格检查其他</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.TGJCQT"/>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="block">
                          <div class="title1">院前抢救</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">院前抢救措施</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div style="margin-left: 130px;margin-top: -52px">
                                      <div class="checkbox-group">
                                           <div v-for="(item, index) in baseData.YQQJCS" class="btn"  :class="[query.YQQJCSSel.includes(item.infocode)? 'active': '']" @click="onCheckClick('YQQJCS',item.infocode)">
                                                {{item.info}}
                                           </div>
                                      </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">抢救措施说明</div>
                                  <div class="input">
                                      <input type="text" style="width: 790px" class="input" v-model="info.QJCSSM"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">治疗药物</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.ZLYW"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">心电图</div>
                                  <div class="input">
                                      <!-- TODO: 上传心电图 -->
                                      <a href="javascript:;" class="file">上传心电图
                                          <input type="file" name="ecgFile" id="ecgFile" accept=".png,.jpg,.jpeg,.pdf">
                                      </a>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="title1">接诊/就诊信息 (门/急诊ID(或住院ID) 至少填一项)</div>
                      <div class="tab-container emergency">
                          <div class="block">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb"><span class="required">*</span>门/急诊ID</div>
                                      <div class="input"><input type="text" class="input" v-model="info.MENZH"/></div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb"><span class="required">*</span>住院ID</div>
                                      <div class="input"><input type="text" class="input" v-model="info.ZHUYH" /></div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">接诊医生</div>
                                      <div class="input"><input type="text" class="input" v-model="info.jzys"/></div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">接诊护士</div>
                                      <div class="input"><input type="text" class="input"  v-model="info.jzhs"/></div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">卡类型</div>
                                      <div class="input">
                                          <select name="" v-model="baseInfo.cardType">
                                              <option value="null">请选择</option>
                                              <option v-for="item in baseData.cardType" :value="item.infocode">{{item.info}}</option>
                                          </select>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">卡号</div>
                                      <div class="input"><input type="text" class="input" v-model="baseInfo.vstCard" /></div>
                                  </div>
                              </div>
                              <div class="title1">时刻记录</div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">接诊时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="JZSJ" onclick="WdatePickerEnd('JZSJ','info.JZSJ','yyyy-MM-dd HH:mm')" v-model="info.JZSJ" />
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              </div>
          </div>
<%--      接诊信息--%>
          <div v-if="activeTab === 1">
              <div class="basic-info">
                  <div class="title1">接诊科室</div>
                  <div class="content">
                      <div class="block">
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>到达急诊科</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDJZK == item.infocode? 'active': '']" @click="onRadioClick('ISDDJZK',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb"><span class="required">*</span>到达急诊科时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="DDJZKSJ" onclick="WdatePickerEnd('DDJZKSJ','info.DDJZKSJ','yyyy-MM-dd HH:mm')" v-model="info.DDJZKSJ" />
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb"><span class="required">*</span>到达急诊科是否已死亡</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDYYSW == item.infocode? 'active': '']" @click="onRadioClick('ISDYYSW',item.infocode)">
                                                  {{item.info}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">急诊接诊时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="JZSJ" onclick="WdatePickerEnd('JZSJ','info.JZSJ','yyyy-MM-dd HH:mm')" v-model="info.JZSJ" />
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">急诊诊断</div>
                                      <div class="input">
                                          <input type="text" class="input" v-model="info.CSJZZD"/>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.ISDDJZK == 1">
                                                            <div class="title1">生命体征</div>
                                                            <div class="inputs">
                                                                <div class="input-group">
                                                                    <div class="lb">血压</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.XYJZ" placeholder="--/--" />
                                                                        <div class="unit">mmHg</div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="inputs">
                                                                <div class="input-group">
                                                                    <div class="lb">心率</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.XLJZ" onkeyup="limitInput(this,300)" />
                                                                        <div class="unit">次/分</div>
                                                                    </div>
                                                                </div>
                                                                <div class="input-group">
                                                                    <div class="lb">脉搏</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.MBJZ"  onkeyup="limitInput(this,300)" />
                                                                        <div class="unit">次/分</div>
                                                                    </div>
                                                                </div>
                                                                <div class="input-group">
                                                                    <div class="lb">呼吸频率</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.HXPLJZ" onkeyup="limitInput(this,40)" />
                                                                        <div class="unit">次/分</div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="inputs">
                                                                <div class="input-group">
                                                                    <div class="lb">体温</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.TWJZ" onkeyup="NumberInput(this)" maxlength="5" />
                                                                        <div class="unit">℃</div>
                                                                    </div>
                                                                </div>
                                                                <div class="input-group">
                                                                    <div class="lb">血糖</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" v-model="info.XTJZ" onkeyup="NumberInput(this)" maxlength="5" />
                                                                        <div class="unit">mmol/L</div>
                                                                    </div>
                                                                </div>
                                                                <div class="input-group">
                                                                    <div class="lb">血氧饱和度</div>
                                                                    <div class="input">
                                                                        <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.XUEYANG" maxlength="5" />
                                                                        <div class="unit">%</div>
                                                                    </div>
                                                                </div>
                                                        </div>
                              </div>

                          <div class="title1">抢救措施</div>
<%--                          <div class="inputs">--%>
<%--                              <div class="input-group">--%>
<%--                                  <div class="lb">抢救措施</div>--%>
<%--                                  <div class="input">--%>
<%--                                      <div class="radio-btns">--%>
<%--                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.JZQJCS" :class="[info.JZQJCS == item? 'active': '']" @click="onRadioClick('JZQJCS',item)">--%>
<%--                                              {{item}}--%>
<%--                                          </div>--%>
<%--                                      </div>--%>
<%--                                  </div>--%>
<%--                              </div>--%>
<%--                          </div>--%>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('01')? 'active': '']" @click="onCheckClick('JZQJCS','01')">{{baseData.JZQJCS[0].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('01')">
                                  <div class="input-group">
                                      <div class="lb">提出放置时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="TCFZSJ" onclick="WdatePickerEnd('TCFZSJ','info.TCFZSJ','yyyy-MM-dd HH:mm')" v-model="info.TCFZSJ"/>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">成功放置时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="CGFZSJ" onclick="WdatePickerEnd('CGFZSJ','info.CGFZSJ','yyyy-MM-dd HH:mm')" v-model="info.CGFZSJ"/>
                                      </div>
                                  </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('02')? 'active': '']" @click="onCheckClick('JZQJCS','02')">{{baseData.JZQJCS[1].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('02')">
                                  <div class="input-group">
                                  <div class="lb">申请输血时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="SQSXSJ" onclick="WdatePickerEnd('SQSXSJ','info.SQSXSJ','yyyy-MM-dd HH:mm')" v-model="info.SQSXSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">执行输血时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="ZXSXSJ" onclick="WdatePickerEnd('ZXSXSJ','info.ZXSXSJ','yyyy-MM-dd HH:mm')" v-model="info.ZXSXSJ"/>
                                  </div>
                              </div>
                              </span>

                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('03')? 'active': '']" @click="onCheckClick('JZQJCS','03')">{{baseData.JZQJCS[2].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('03')">
                                  <div class="input-group">
                                  <div class="lb">提出建立时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="TCJLSJ" onclick="WdatePickerEnd('TCJLSJ','info.TCJLSJ','yyyy-MM-dd HH:mm')" v-model="info.TCJLSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">成功建立时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="CGJLSJ" onclick="WdatePickerEnd('CGJLSJ','info.CGJLSJ','yyyy-MM-dd HH:mm')" v-model="info.CGJLSJ"/>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('04')? 'active': '']" @click="onCheckClick('JZQJCS','04')">{{baseData.JZQJCS[3].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('04')">
                                  <div class="input-group">
                                  <div class="lb">提出手术医嘱时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="TCSSYZSJ" onclick="WdatePickerEnd('TCSSYZSJ','info.TCSSYZSJ','yyyy-MM-dd HH:mm')" v-model="info.TCSSYZSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">开始手术时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="KSSSJ" onclick="WdatePickerEnd('KSSSJ','info.KSSSJ','yyyy-MM-dd HH:mm')" v-model="info.KSSSJ"/>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('05')? 'active': '']" @click="onCheckClick('JZQJCS','05')">{{baseData.JZQJCS[4].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('05')">
                                  <div class="input-group">
                                  <div class="lb">呼吸使用时长</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.HXSYSC"/>
                                      <div class="unit">分钟</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">是否发生了呼吸机相关肺炎</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISXGFY == item.infocode? 'active': '']" @click="onRadioClick('ISXGFY',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">抢救说明</div>
                                  <div class="input">
                                      <input type="text" style="width: 790px" class="input" v-model="info.QJSM"/>
                                  </div>
                              </div>
                          </div>
                      <div class="block">
                          <div class="title1">检验检查</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" style="background-color: #eeeeee" :class="[query.JZJYJCSel.includes('01')? 'active': '']" @click="onCheckClick('JZJYJC','01')">全身快速CT</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('01')">
                                  <div class="lb">全身快速CT完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="QSKSCTWCSJ" onclick="WdatePickerEnd('QSKSCTWCSJ','info.QSKSCTWCSJ','yyyy-MM-dd HH:mm')" v-model="info.QSKSCTWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('02')? 'active': '']" @click="onCheckClick('JZJYJC','02')">胸片X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('02')">
                                  <div class="lb">胸片X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="XPXPWCSJ" onclick="WdatePickerEnd('XPXPWCSJ','info.XPXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.XPXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('03')? 'active': '']" @click="onCheckClick('JZJYJC','03')">骨盆X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('03')">
                                  <div class="lb btn1">骨盆X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="GPXPWCSJ" onclick="WdatePickerEnd('GPXPWCSJ','info.GPXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.GPXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('04')? 'active': '']" @click="onCheckClick('JZJYJC','04')">FAST</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('04')">
                                  <div class="lb">FAST完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="FASTWCSJ" onclick="WdatePickerEnd('FASTWCSJ','info.FASTWCSJ','yyyy-MM-dd HH:mm')" v-model="info.FASTWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('05')? 'active': '']" @click="onCheckClick('JZJYJC','05')">其他X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('05')">
                                  <div class="lb">其他X片类型</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.QTXPLX"/>
                                  </div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('05')">
                                  <div class="lb">其他X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="QTXPWCSJ" onclick="WdatePickerEnd('QTXPWCSJ','info.QTXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.QTXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1":class="[query.JZJYJCSel.includes('06')? 'active': '']" @click="onCheckClick('JZJYJC','06')">血常规</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('07')? 'active': '']" @click="onCheckClick('JZJYJC','07')">凝血功能</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('08')? 'active': '']" @click="onCheckClick('JZJYJC','08')">感染全项</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('09')? 'active': '']" @click="onCheckClick('JZJYJC','09')">生化</div>
                              </div>
                          </div>
                          <div class="title1">检验检查说明</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">检查检验说明</div>
                                  <div class="input">
                                      <input type="text" style="width: 790px" class="input" v-model="info.JCJYSM"/>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">其他记录</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">是否到达抢救室</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDQJS == item.infocode? 'active': '']" @click="onRadioClick('ISDDQJS',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <span v-if="info.ISDDQJS == 1">
                                  <div class="input-group">
                                      <div class="lb">到达抢救室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="DDQJSSJ" onclick="WdatePickerEnd('DDQJSSJ','info.DDQJSSJ','yyyy-MM-dd HH:mm')" v-model="info.DDQJSSJ" />
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">离开抢救室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="LKQJSSJ" onclick="WdatePickerEnd('LKQJSSJ','info.LKQJSSJ','yyyy-MM-dd HH:mm')" v-model="info.LKQJSSJ"/>
                                      </div>
                                  </div>
                              </span>

                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">是否到达手术室</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDSSS == item.infocode? 'active': '']" @click="onRadioClick('ISDDSSS',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <span v-if="info.ISDDSSS == 1">
                                  <div class="input-group">
                                      <div class="lb">到达手术室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="DDSSSSJ" onclick="WdatePickerEnd('DDSSSSJ','info.DDSSSSJ','yyyy-MM-dd HH:mm')" v-model="info.DDSSSSJ"/>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">离开手术室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="LKSSSSJ" onclick="WdatePickerEnd('LKSSSSJ','info.LKSSSSJ','yyyy-MM-dd HH:mm')" v-model="info.LKSSSSJ" />
                                      </div>
                                  </div>
                              </span>

                          </div>
                          <div class="title1">病人去向 <button @click="getCsBRQX()" class="custom-btn btn-1">【同步转归】</button></div>
                          <div class="inputs">
                              <div class="input-group" style="color: red;display: block">
                                  病人去向时间 只记录离开急诊后第一次转归，包含：急诊离院、住院、转院、死亡、急诊留观、其他
                              </div>
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>病人去向</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.BRQX" :class="[info.BRQX == item.infocode? 'active': '']" @click="onRadioClick('BRQX',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>

                          </div>
                          <div>
                            <div v-if="info.BRQX == '01'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb"><span class="required">*</span>急诊离院时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="JZLYSJ" onclick="WdatePickerEnd('JZLYSJ','info.JZLYSJ','yyyy-MM-dd HH:mm')" v-model="info.JZLYSJ" />
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">治疗结果</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ZLJG" :class="[info.ZLJG == item.infocode? 'active': '']" @click="onRadioClick('ZLJG',item.infocode)">
                                                  {{item.info}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="input-group" v-if="info.ZLJG == '04'">
                                      <div class="lb">其他离院原因</div>
                                      <div class="input">
                                          <input type="text" class="input" v-model="info.QTLYYY" style="width: 500px"/>
                                      </div>
                                  </div>
                              </div>
                          </div>
                            <div v-if="info.BRQX == '02'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">住院科室</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ZYKS" :class="[info.ZYKS == item? 'active': '']" @click="onRadioClick('ZYKS',item)">
                                                  {{item}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">办理住院时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="BLZYSJ" onclick="WdatePickerEnd('BLZYSJ','info.BLZYSJ','yyyy-MM-dd HH:mm')" v-model="info.BLZYSJ" />
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">结束住院时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="JSZYSJ" onclick="WdatePickerEnd('JSZYSJ','info.JSZYSJ','yyyy-MM-dd HH:mm')" v-model="info.JSZYSJ" />
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">住院后死亡</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISZYHSW == item.infocode? 'active': '']" @click="onRadioClick('ISZYHSW',item.infocode)">
                                                  {{item.info}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">是否到达ICU</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ICU" :class="[info.ISDDICU == item.infocode? 'active': '']" @click="onRadioClick('ISDDICU',item.infocode)">
                                                  {{item.info}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="input-group" v-if="info.ISDDICU == 1">
                                      <div class="lb">到达ICU时间</div>
                                      <div class="input">
                                          <input type="text"  class="Wdate input" ref="DDICUSJ" onclick="WdatePickerEnd('DDICUSJ','info.DDICUSJ','yyyy-MM-dd HH:mm')" v-model="info.DDICUSJ"/>
                                      </div>
                                  </div>
                                  <div class="input-group" v-if="info.ISDDICU == 1">
                                      <div class="lb">离开ICU时间</div>
                                      <div class="input">
                                          <input type="text"  class="Wdate input" ref="LKICUSJ" onclick="WdatePickerEnd('LKICUSJ','info.LKICUSJ','yyyy-MM-dd HH:mm')" v-model="info.LKICUSJ"/>
                                      </div>
                                  </div>
                              </div>
                          </div>
                            <div v-if="info.BRQX == '03'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">交接时间</div>
                                      <div class="input">
                                          <input type="text"  class="Wdate input" ref="JJSJ" onclick="WdatePickerEnd('JJSJ','info.JJSJ','yyyy-MM-dd HH:mm')" v-model="info.JJSJ"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">接收医院</div>
                                      <div class="input">
                                          <input type="text"  class="input" v-model="info.JSYY"/>
                                      </div>
                                  </div>
                              </div>
                          </div>
                            <div v-if="info.BRQX == '04'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">死亡原因描述</div>
                                      <div class="input">
                                          <input type="text"  class="input" v-model="info.SWYYMS"/>
                                      </div>
                                  </div>
                              </div>
                          </div>
                            <div v-if="info.BRQX == '05'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">留观时间</div>
                                      <div class="input">
                                          <input type="text"  class="Wdate input" ref="LGSJ" onclick="WdatePickerEnd('LGSJ','info.LGSJ','yyyy-MM-dd HH:mm')" v-model="info.LGSJ"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">留观后死亡</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISLGHSW == item.infocode? 'active': '']" @click="onRadioClick('ISLGHSW',item.infocode)">
                                                  {{item.info}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">留观原因描述</div>
                                      <div class="input">
                                          <input type="text"  class="input" v-model="info.LGYYMS"/>
                                      </div>
                                  </div>
                              </div>
                          </div>
                            <div v-if="info.BRQX == '06'">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">转归时间</div>
                                      <div class="input">
                                          <input type="text"  class="Wdate input" ref="ZGSJ" onclick="WdatePickerEnd('ZGSJ','info.ZGSJ','yyyy-MM-dd HH:mm')" v-model="info.ZGSJ"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">具体去向</div>
                                      <div class="input">
                                          <input type="text"  class="input" v-model="info.JTQX" />
                                      </div>
                                  </div>
                              </div>
                          </div>
                          </div>
                          <div class="title1">病人去向情况备注</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">病人去向情况备注</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.BRQXBZ" style="width: 790px" />
                                  </div>
                              </div>
                          </div>
                          <div class="title1">诊断符合情况 <button @click="getCsZYXX()" class="custom-btn btn-1">【同步住院信息】</button></div>
                          <div class="block">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">入院诊断</div>
                                      <div class="input">
                                          <input type="text" class="input" v-model="info.YQZD"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">出院诊断</div>
                                      <div class="input">
                                          <input type="text" class="input" v-model="info.CYZD"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">入院诊断是否与出院诊断符合</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISCRYZDFH == item.infocode? 'active': '']" @click="onRadioClick('ISCRYZDFH',item.infocode)">
                                                  {{item.info == '是'? '符合': '不符合'}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">抢救情况 <button @click="getCsQJQK()" class="custom-btn btn-1">【同步抢救情况】</button></div>
                          <div class="block">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">抢救结果</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.Tab7" :class="[info.QJJG == item? 'active': '']" @click="onRadioClick('QJJG',item)">
                                                  {{item}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">手术次数</div>
                                      <div class="input">
                                          <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.SSCS"/>
                                          <div class="unit">次</div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">住院费用</div>
                                      <div class="input">
                                          <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.ZYFY"/>
                                          <div class="unit">元</div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              </div>
          </div>
<%--      创伤评估--%>
          <div v-if="activeTab === 2">
           <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="mainIfream" scrolling="auto" :src="iframeSrc"></iframe>
          <!-- <div class="basic-info">
              <div class="title1">TI评分</div>
              <div class="content">
                  <div class="block">
                      <table>
                          <tr style="border: 1px solid #6FA7F0;background-color: #6FA7F0;color:#ffffff;height: 30px">
                            <td v-for="item in baseData.Ti" style="width: 10%" align="center">{{item}}</td>
                          </tr>
                          <tr class="tableTr">
                              <td>{{aboutSco.tiSco}}</td>
                              <td :class="[aboutSco.tiriskType == 2? 'red': 'orgern']">{{aboutSco.tirisk}}</td>
                              <td>急诊室</td>
                              <td>{{aboutSco.tiNowData}}</td>
                              <td align="center">
                                  <a @click="openTiSco">编辑</a>
                              </td>
                          </tr>
                      </table>
                  </div>
              </div>
              <div class="title1">GCS评分</div>
              <div class="content">
                  <div class="block">
                      <table>
                          <tr style="border: 1px solid #6FA7F0;background-color: #6FA7F0;color:#ffffff;height: 30px">
                              <td v-for="item in baseData.Gcs" style="width: 10%" align="center">{{item}}</td>
                          </tr>
                          <tr class="tableTr">
                              <td>{{aboutSco.gcsSco}}</td>
                              <td :class="[aboutSco.gcsriskType == 2? 'red': '',aboutSco.gcsriskType == 3? 'orgern': '','green']">{{aboutSco.gcsrisk}}</td>
                              <td>急诊室</td>
                              <td>{{aboutSco.gcsNowData}}</td>
                              <td align="center">
                                  <a @click="openGcssco">编辑</a>
                              </td>
                          </tr>
                      </table>
                  </div>
              </div>
              <div class="title1">ISS-AIS评分</div>
              <div class="content">
                  <div class="block">
                      <table>
                          <tr style="border: 1px solid #6FA7F0;background-color: #6FA7F0;color:#ffffff;height: 30px">
                              <td v-for="item in baseData.Iss" style="width: 10%" align="center">{{item}}</td>
                          </tr>
                          <tr class="tableTr tableTr1">
                              <td>{{aboutSco.ISSMax}}</td>
                              <td>{{aboutSco.AISMax}}</td>
                              <td :class="[aboutSco.issriskType == 1? 'red': 'orgern']">{{aboutSco.issrisk}}</td>
                              <td>急诊室</td>
                              <td>{{aboutSco.ISSNowData}}</td>
                              <td align="center">
                                  <a @click="openISS">编辑</a>
                              </td>
                          </tr>
                      </table>
                  </div>
              </div>
              <div class="title1">Tash评分</div>
              <div class="content">
                  <div class="block">
                      <table>
                          <tr style="border: 1px solid #6FA7F0;background-color: #6FA7F0;color:#ffffff;height: 30px">
                              <td v-for="item in baseData.Tash" style="width: 10%" align="center">{{item}}</td>
                          </tr>
                          <tr class="tableTr">
                              <td>{{aboutSco.tashSco}}</td>
                              <td>{{aboutSco.tashPr}}</td>
                              <td>急诊室</td>
                              <td>{{aboutSco.tashNowData}}</td>
                              <td align="center">
                                  <a @click="openTashSco">编辑</a>
                              </td>
                          </tr>
                      </table>
                  </div>
              </div>
          </div> -->
      </div>
<%--      质控指标--%>
          <div v-if="activeTab === 3">
              <div class="basic-info">
                  <div class="title1">接诊科室</div>
                  <div class="content">
                      <div class="block">
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>接诊科室</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDJZK == item.infocode? 'active': '']" @click="onRadioClick('ISDDJZK',item.infocode)">
                                              {{item.info == '是'? '急诊': '门诊'}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>到达急诊科时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="DDJZKSJ" onclick="WdatePickerEnd('DDJZKSJ','info.DDJZKSJ','yyyy-MM-dd HH:mm')" v-model="info.DDJZKSJ" />
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>到达急诊科是否已死亡</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDYYSW == item.infocode? 'active': '']" @click="onRadioClick('ISDYYSW',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">生命体征</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">血压</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.XYJZ" placeholder="--/--" />
                                      <div class="unit">mmHg</div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">心率</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.XLJZ" onkeyup="limitInput(this,300)" />
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">脉搏</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.MBJZ"  onkeyup="limitInput(this,300)" />
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">呼吸频率</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.HXPLJZ" onkeyup="limitInput(this,40)" />
                                      <div class="unit">次/分</div>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">体温</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.TWJZ" onkeyup="NumberInput(this)" maxlength="5" />
                                      <div class="unit">℃</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">血糖</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.XTJZ" onkeyup="NumberInput(this)" maxlength="5" />
                                      <div class="unit">mmol/L</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">血氧饱和度</div>
                                  <div class="input">
                                      <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.XYBHDJZ" maxlength="5" />
                                      <div class="unit">%</div>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">抢救措施</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('01')? 'active': '']" @click="onCheckClick('JZQJCS','01')">{{baseData.JZQJCS[0].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('01')">
                                  <div class="input-group">
                                      <div class="lb">提出放置时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="TCFZSJ" onclick="WdatePickerEnd('TCFZSJ','info.TCFZSJ','yyyy-MM-dd HH:mm')" v-model="info.TCFZSJ"/>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">成功放置时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="CGFZSJ" onclick="WdatePickerEnd('CGFZSJ','info.CGFZSJ','yyyy-MM-dd HH:mm')" v-model="info.CGFZSJ"/>
                                      </div>
                                  </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('02')? 'active': '']" @click="onCheckClick('JZQJCS','02')">{{baseData.JZQJCS[1].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('02')">
                                  <div class="input-group">
                                  <div class="lb">申请输血时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="SQSXSJ" onclick="WdatePickerEnd('SQSXSJ','info.SQSXSJ','yyyy-MM-dd HH:mm')" v-model="info.SQSXSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">执行输血时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="ZXSXSJ" onclick="WdatePickerEnd('ZXSXSJ','info.ZXSXSJ','yyyy-MM-dd HH:mm')" v-model="info.ZXSXSJ"/>
                                  </div>
                              </div>
                              </span>

                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('03')? 'active': '']" @click="onCheckClick('JZQJCS','03')">{{baseData.JZQJCS[2].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('03')">
                                  <div class="input-group">
                                  <div class="lb">提出建立时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="TCJLSJ" onclick="WdatePickerEnd('TCJLSJ','info.TCJLSJ','yyyy-MM-dd HH:mm')" v-model="info.TCJLSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">成功建立时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="CGJLSJ" onclick="WdatePickerEnd('CGJLSJ','info.CGJLSJ','yyyy-MM-dd HH:mm')" v-model="info.CGJLSJ"/>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('04')? 'active': '']" @click="onCheckClick('JZQJCS','04')">{{baseData.JZQJCS[3].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('04')">
                                  <div class="input-group">
                                  <div class="lb">提出手术医嘱时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="TCSSYZSJ" onclick="WdatePickerEnd('TCSSYZSJ','info.TCSSYZSJ','yyyy-MM-dd HH:mm')" v-model="info.TCSSYZSJ"/>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">开始手术时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="KSSSJ" onclick="WdatePickerEnd('KSSSJ','info.KSSSJ','yyyy-MM-dd HH:mm')" v-model="info.KSSSJ"/>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZQJCSSel.includes('05')? 'active': '']" @click="onCheckClick('JZQJCS','05')">{{baseData.JZQJCS[4].info}}</div>
                              </div>
                              <span v-if="query.JZQJCSSel.includes('05')">
                                  <div class="input-group">
                                  <div class="lb">呼吸使用时长</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.HXSYSC"/>
                                      <div class="unit">分钟</div>
                                  </div>
                              </div>
                              <div class="input-group">
                                  <div class="lb">是否发生了呼吸机相关肺炎</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISXGFY == item.infocode? 'active': '']" @click="onRadioClick('ISXGFY',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              </span>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">抢救说明</div>
                                  <div class="input">
                                      <input type="text" style="width: 790px" class="input" v-model="info.QJSM"/>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">检验检查</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" style="background-color: #eeeeee" :class="[query.JZJYJCSel.includes('01')? 'active': '']" @click="onCheckClick('JZJYJC','01')">全身快速CT</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('01')">
                                  <div class="lb">全身快速CT完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="QSKSCTWCSJ" onclick="WdatePickerEnd('QSKSCTWCSJ','info.QSKSCTWCSJ','yyyy-MM-dd HH:mm')" v-model="info.QSKSCTWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('02')? 'active': '']" @click="onCheckClick('JZJYJC','02')">胸片X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('02')">
                                  <div class="lb">胸片X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="XPXPWCSJ" onclick="WdatePickerEnd('XPXPWCSJ','info.XPXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.XPXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('03')? 'active': '']" @click="onCheckClick('JZJYJC','03')">骨盆X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('03')">
                                  <div class="lb btn1">骨盆X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="GPXPWCSJ" onclick="WdatePickerEnd('GPXPWCSJ','info.GPXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.GPXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('04')? 'active': '']" @click="onCheckClick('JZJYJC','04')">FAST</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('04')">
                                  <div class="lb">FAST完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="FASTWCSJ" onclick="WdatePickerEnd('FASTWCSJ','info.FASTWCSJ','yyyy-MM-dd HH:mm')" v-model="info.FASTWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('05')? 'active': '']" @click="onCheckClick('JZJYJC','05')">其他X片</div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('05')">
                                  <div class="lb">其他X片类型</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.QTXPLX"/>
                                  </div>
                              </div>
                              <div class="input-group" v-if="query.JZJYJCSel.includes('05')">
                                  <div class="lb">其他X片完成时间</div>
                                  <div class="input">
                                      <input type="text" class="Wdate input" ref="QTXPWCSJ" onclick="WdatePickerEnd('QTXPWCSJ','info.QTXPWCSJ','yyyy-MM-dd HH:mm')" v-model="info.QTXPWCSJ"/>
                                  </div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1":class="[query.JZJYJCSel.includes('06')? 'active': '']" @click="onCheckClick('JZJYJC','06')">血常规</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('07')? 'active': '']" @click="onCheckClick('JZJYJC','07')">凝血功能</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('08')? 'active': '']" @click="onCheckClick('JZJYJC','08')">感染全项</div>
                              </div>
                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb btn1" :class="[query.JZJYJCSel.includes('09')? 'active': '']" @click="onCheckClick('JZJYJC','09')">生化</div>
                              </div>
                          </div>
                          <div class="title1">检验检查说明</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">检查检验说明</div>
                                  <div class="input">
                                      <input type="text" style="width: 790px" class="input" v-model="info.JCJYSM"/>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">其他记录</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">是否到达抢救室</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDQJS == item.infocode? 'active': '']" @click="onRadioClick('ISDDQJS',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <span v-if="info.ISDDQJS == 1">
                                  <div class="input-group">
                                      <div class="lb">到达抢救室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="DDQJSSJ" onclick="WdatePickerEnd('DDQJSSJ','info.DDQJSSJ','yyyy-MM-dd HH:mm')" v-model="info.DDQJSSJ" />
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">离开抢救室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="LKQJSSJ" onclick="WdatePickerEnd('LKQJSSJ','info.LKQJSSJ','yyyy-MM-dd HH:mm')" v-model="info.LKQJSSJ"/>
                                      </div>
                                  </div>
                              </span>

                          </div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">是否到达手术室</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISDDSSS == item.infocode? 'active': '']" @click="onRadioClick('ISDDSSS',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <span v-if="info.ISDDSSS == 1">
                                  <div class="input-group">
                                      <div class="lb">到达手术室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="DDSSSSJ" onclick="WdatePickerEnd('DDSSSSJ','info.DDSSSSJ','yyyy-MM-dd HH:mm')" v-model="info.DDSSSSJ"/>
                                      </div>
                                  </div>
                                  <div class="input-group">
                                      <div class="lb">离开手术室时间</div>
                                      <div class="input">
                                          <input type="text" class="Wdate input" ref="LKSSSSJ" onclick="WdatePickerEnd('LKSSSSJ','info.LKSSSSJ','yyyy-MM-dd HH:mm')" v-model="info.LKSSSSJ" />
                                      </div>
                                  </div>
                              </span>
                          </div>
                          <div class="title1">病人去向</div>
                          <div class="inputs">
                              <div class="input-group" style="color: red;display: block">
                                  病人去向时间 只记录离开急诊后第一次转归，包含：急诊离院、住院、转院、死亡、急诊留观、其他
                              </div>
                              <div class="input-group">
                                  <div class="lb"><span class="required">*</span>病人去向</div>
                                  <div class="input">
                                      <div class="radio-btns">
                                          <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.BRQX" :class="[info.BRQX == item.infocode? 'active': '']" @click="onRadioClick('BRQX',item.infocode)">
                                              {{item.info}}
                                          </div>
                                      </div>
                                  </div>
                              </div>

                          </div>
                          <div>
                              <div v-if="info.BRQX == '01'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb"><span class="required">*</span>急诊离院时间</div>
                                          <div class="input">
                                              <input type="text" class="Wdate input" ref="JZLYSJ" onclick="WdatePickerEnd('JZLYSJ','info.JZLYSJ','yyyy-MM-dd HH:mm')" v-model="info.JZLYSJ" />
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">治疗结果</div>
                                          <div class="input">
                                              <div class="radio-btns">
                                                  <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ZLJG" :class="[info.ZLJG == item.infocode? 'active': '']" @click="onRadioClick('ZLJG',item.infocode)">
                                                      {{item.info}}
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                      <div class="input-group" v-if="info.ZLJG == '04'">
                                          <div class="lb">其他离院原因</div>
                                          <div class="input">
                                              <input type="text" class="input" v-model="info.QTLYYY" style="width: 500px"/>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.BRQX == '02'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">住院科室</div>
                                          <div class="input">
                                              <div class="radio-btns">
                                                  <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ZYKS" :class="[info.ZYKS == item? 'active': '']" @click="onRadioClick('ZYKS',item)">
                                                      {{item}}
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                      <div class="input-group">
                                          <div class="lb">办理住院时间</div>
                                          <div class="input">
                                              <input type="text" class="Wdate input" ref="BLZYSJ" onclick="WdatePickerEnd('BLZYSJ','info.BLZYSJ','yyyy-MM-dd HH:mm')" v-model="info.BLZYSJ" />
                                          </div>
                                      </div>
                                      <div class="input-group">
                                          <div class="lb">结束住院时间</div>
                                          <div class="input">
                                              <input type="text" class="Wdate input" ref="JSZYSJ" onclick="WdatePickerEnd('JSZYSJ','info.JSZYSJ','yyyy-MM-dd HH:mm')" v-model="info.JSZYSJ" />
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">是否到达ICU</div>
                                          <div class="input">
                                              <div class="radio-btns">
                                                  <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.ICU" :class="[info.ISDDICU == item.infocode? 'active': '']" @click="onRadioClick('ISDDICU',item.infocode)">
                                                      {{item.info}}
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                      <div class="input-group" v-if="info.ISDDICU == 1">
                                          <div class="lb">到达ICU时间</div>
                                          <div class="input">
                                              <input type="text"  class="Wdate input" ref="DDICUSJ" onclick="WdatePickerEnd('DDICUSJ','info.DDICUSJ','yyyy-MM-dd HH:mm')" v-model="info.DDICUSJ"/>
                                          </div>
                                      </div>
                                      <div class="input-group" v-if="info.ISDDICU == 1">
                                          <div class="lb">离开ICU时间</div>
                                          <div class="input">
                                              <input type="text"  class="Wdate input" ref="LKICUSJ" onclick="WdatePickerEnd('LKICUSJ','info.LKICUSJ','yyyy-MM-dd HH:mm')" v-model="info.LKICUSJ"/>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.BRQX == '03'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">交接时间</div>
                                          <div class="input">
                                              <input type="text"  class="Wdate input" ref="JJSJ" onclick="WdatePickerEnd('JJSJ','info.JJSJ','yyyy-MM-dd HH:mm')" v-model="info.JJSJ"/>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">接收医院</div>
                                          <div class="input">
                                              <input type="text"  class="input" v-model="info.JSYY"/>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.BRQX == '04'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">死亡原因描述</div>
                                          <div class="input">
                                              <input type="text"  class="input" v-model="info.SWYYMS"/>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.BRQX == '05'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">留观时间</div>
                                          <div class="input">
                                              <input type="text"  class="Wdate input" ref="LGSJ" onclick="WdatePickerEnd('LGSJ','info.LGSJ','yyyy-MM-dd HH:mm')" v-model="info.LGSJ"/>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">留观后死亡</div>
                                          <div class="input">
                                              <div class="radio-btns">
                                                  <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISLGHSW == item.infocode? 'active': '']" @click="onRadioClick('ISLGHSW',item.infocode)">
                                                      {{item.info}}
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">留观原因描述</div>
                                          <div class="input">
                                              <input type="text"  class="input" v-model="info.LGYYMS"/>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div v-if="info.BRQX == '06'">
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">转归时间</div>
                                          <div class="input">
                                              <input type="text"  class="Wdate input" ref="ZGSJ" onclick="WdatePickerEnd('ZGSJ','info.ZGSJ','yyyy-MM-dd HH:mm')" v-model="info.ZGSJ"/>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="inputs">
                                      <div class="input-group">
                                          <div class="lb">具体去向</div>
                                          <div class="input">
                                              <input type="text"  class="input" v-model="info.JTQX" />
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">病人去向情况备注</div>
                          <div class="inputs">
                              <div class="input-group">
                                  <div class="lb">病人去向情况备注</div>
                                  <div class="input">
                                      <input type="text" class="input" v-model="info.BRQXBZ" style="width: 790px" />
                                  </div>
                              </div>
                          </div>
                          <div class="title1">诊断符合情况</div>
                          <div class="block">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">入院诊断</div>
                                      <div class="input">
                                          <input type="text" class="input"  v-model="info.YQZD"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">出院诊断</div>
                                      <div class="input">
                                          <input type="text" class="input" v-model="info.CYZD"/>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">入院诊断是否与出院诊断符合</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.RADIOArr" :class="[info.ISCRYZDFH == item.infocode? 'active': '']" @click="onRadioClick('ISCRYZDFH',item.infocode)">
                                                  {{item.info == '是'? '符合': '不符合'}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                          <div class="title1">抢救情况</div>
                          <div class="block">
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">抢救结果</div>
                                      <div class="input">
                                          <div class="radio-btns">
                                              <div class="btn" style="height: 40px;line-height: 40px" v-for="(item, index) in baseData.Tab7" :class="[info.QJJG == item? 'active': '']" @click="onRadioClick('QJJG',item)">
                                                  {{item}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">手术次数</div>
                                      <div class="input">
                                          <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.SSCS"/>
                                          <div class="unit">次</div>
                                      </div>
                                  </div>
                              </div>
                              <div class="inputs">
                                  <div class="input-group">
                                      <div class="lb">住院费用</div>
                                      <div class="input">
                                          <input type="text" class="input" onkeyup="NumberInput(this)" v-model="info.ZYFY"/>
                                          <div class="unit">元</div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
  </div>
    <div class="save-btn" style="cursor: pointer" @click="commit">保存</div>
  </template>
 </div>

</body>
<script type="text/javascript">
    var _emgSeq = "${emgSeq}";
    var _regSeq = "${regSeq}";
    var  sub = new Vue({
        el: '#main',
        data: {
            name: 'csList',
            activeTab: 0,
						iframeSrc:'${baseurl}icuscore/toBasicPage.do?gradeType=GTOTAL&liveNo=' + '${regSeq}' +"&menuKind=2",
            query: {
                MDPSSel: [],
                YQQJCSSel: [],
                JZJYJCSel: [],
                JZQJCSSel: []
            },
            aboutSco: {
                gcsSco:null,
                gcsSeq:'',
                gcsrisk: '',
                gcsriskType: '',
                gcsNowData: '',
                tiSco: null,
                tirisk: '',
                tiriskType: '',
                tiNowData: '',
                ISSList: [],
                AISMax: 0,
                ISSMax: 0,
                issrisk: '',
                issriskType: '',
                ISSNowData: '',
                tashSco: null,
                tashPr: null,
                tashNowData: '',
                tashriskType: '',
                tashNowData: ''
            },
            timeList: [], //时间轴
            baseInfo: {
                regSeq: _regSeq,  //登记注册序列号
                regTim: '', //登记时间
                mpi: '',  //患者id
                cstNam: '', //患者姓名
                cstSexCod: '', //性别
                cstAge: '', //年龄
                cardType: null, //证件类别
                idNbr: '', //证件号码
                bthDat: '', //出生日期
                pheNbr: '', //联系电话
                cstAdr: '', //患者地址
                emgJob: '', //职业
                cstEdu: '', //文化程度
                maritalStatus: '', //婚姻状况
                nation: '', //民族
                zyxh: '', //住院ID
                jzxh: '', //门诊ID（就诊ID）
            },    //患者基本信息
            cszlInfo: {}, //患者诊疗表信息
            baseData: {
                // 手动的
                Ti: ['Ti评分（分）', '测评结果', '测评入口','时间','操作'],
                Gcs: ['Gcs评分（分）', '测评结果', '测评入口','时间','操作'],
                Iss: ['ISS评分（分）', 'AIS最大值(分)','测评结果', '测评入口','时间','操作'],
                Tash: ['Tash评分（分）', '需要输血概率', '测评入口','时间','操作'],
                RADIOArr: [{info: '否', infocode: '0'}, {info: '是', infocode: '1'}],
                Tab: ['基本信息', '接诊信息', '创伤评估', '质控指标'],
                Tab7: ['抢救成功','抢救失败'],
                ZYKS: ['急诊','门诊'],
                JZQJCS: [{info:'胸腔闭式引流', infocode: '01'},{info: '输血',infocode: '02'},{info: '建立人工气道', infocode: '03'}, {info: '损伤控制性手术', infocode: '04'},{info: '呼吸机', infocode: '05'}],
                // 获取的
                cardType: [],
                cstSexCodArr: [],
                gcsMap: publicFun.getItem('icuDic').riskMap.GCS || [],
                provinceList: publicFun.getItem('addrInfoList').province || [],
                cityList: [],
                cntyList: [],
                BQPD: [],
                NIANL: [],
                MDPS: [], //mdps
                LYFS: [],
                HJJHC: [],
                ZXLY: [],
                TONGK: [],
                GUANGFS: [],
                YISHI: [],
                QIDAO: [],
                XUNH: [],
                XINLV: [],
                XIONGB: [],
                FUBU: [],
                CHANGM: [],
                JIZL: [],
                GUZHE: [],
                YQQJCS: [],
                JZJYJC: [],
                BRQX: [],
                ZLJG: [],
            },
            props: {},
            tiProps: {},
            aidPatient: {
                scePrvCod: '', //发病地址--省
                sceCtyCod: '', //发病地址--市
                sceAr0Cod: '', //发病地址--县/区
                allJTZZ: '',
                provinceL1: '',

                cityFlag: '',
                cntyFlag: '',
                provinceL: 0,
                cityL: 0,
            },
            info: {
                XINGM: '', //姓名
                XINGB: '', //患者性别
                NIANL: '', // 年龄
                NIANLZ: '', //年龄值
                SFZH: '',
                JTZZ: '',
                XXDZ: '',
                JJLXR: '',
                LXDH: '',
                KAHAO: '',
                KALX: '',
                ZHUYH: '',
                MENZH: '',
                FBDZ: '',
                FBSJ: '',
                HJSJ: '',
                CCSJ: '',
                DCSJ: '',
                LCSJ: '',
                YJSJ: '',
                DYSJ: '',
                SWSJ: '',
                BQPD: '',
                MPDS: '',
                LYFS: '',
                HJJHC: '',
                GCYS: '',
                GCHS: '',
                ZXLY: '',
                YQZD: '',
                ZDSJ: '',
                ZHUS: '',
                XIANBS: '',
                JIWS: '',
                XUEY: '',
                ISWFCL: '',
                XINL: '',
                MAIB: '',
                HXPL: '',
                TIWEN: '',
                XUET: '',
                XYBHD: '',
                TONGK: '',
                GUANGFS: '',
                YISHI: '',
                QIDAO: '',
                XUNH: '',
                XINLV: '',

                XIONGB: '',
                FUBU: '',
                CHANGM: '',
                JIZL: '',
                GUZHE: '',
                TGJCQT: '',
                YQQJCS: '',
                QJCSSM: '',
                ZLYW: '',
                XINDT: '',
                ZHAOP: '',
                ISDDJZK: '',
                DDJZKSJ: '',
                ISDYYSW: '',
                JZSJ: '',
                CSJZZD: '',
                XYJZ: '',
                MBJZ: '',
                HXPLJZ: '',
                TWJZ: '',
                XTJZ: '',
                XYBHDJZ: '',
                JZQJCS: '',
                TCFZSJ: '',
                CGFZSJ: '',
                SQSXSJ: '',
                ZXSXSJ: '',
                TCJLSJ: '',
                CGJLSJ: '',
                TCSSYZSJ: '',
                KSSSJ: '',
                HXSYSC: '',
                ISXGFY: '',
                QJSM: '',
                JZJYJC: '',
                QSKSCTWCSJ: '',
                XPXPWCSJ: '',
                GPXPWCSJ: '',
                FASTWCSJ: '',
                QTXPLX: '',
                QTXPWCSJ: '',
                JCJYSM: '',
                ISDDQJS: '',
                DDQJSSJ: '',
                LKQJSSJ: '',
                ISDDSSS: '',
                DDSSSSJ: '',
                LKSSSSJ: '',
                BRQX: '',
                JZLYSJ: '',
                ZLJG: '',
                QTLYYY: '',
                ZYKS: '',
                BLZYSJ: '',
                JSZYSJ: '',
                ISZYHSW: '',
                ISDDICU: '',
                DDICUSJ: '',
                LKICUSJ: '',
                JJSJ: '',
                JSYY: '',
                SWYYMS: '',
                LGSJ: '',
                ISLGHSW: '',
                LGYYMS: '',
                ZGSJ: '',
                JTQX: '',
                BRQXBZ: '',
                CYZD: '',
                ISCRYZDFH: '',
                QJJG: '',
                SSCS: '',
                ZYFY: '',
            },
        },
        filters: {
            formatDateTimeNonSecWithSlash: function (date) {
                return publicFun.timeFormat(date, 'yyyy/MM/dd hh:mm')
            }
        },
        created() {
            this.getTimeList()
            this.getCsinfo()
            this.getGcsSco()
            this.getTiSco()
            this.getISSSco()
            this.getTashSco()
        },
        methods: {
            getISSSco() {
                $.ajax({
                        url: '${baseurl}cs/getHspCsfDef.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _regSeq,
                        }),
                        success: function (res) {
                            if (res && res.resultInfo.success) {
                                sub.aboutSco.ISSList = []
                                sub.aboutSco.AISMax = 0
                                sub.aboutSco.ISSMax = 0
                                var checked =  res.resultInfo.sysdata.hadChecked[0]
                                var crtTime = checked && checked.crtTime
                                if(crtTime && sub.aboutSco.hasOwnProperty('ISSNowData')) {
                                    sub.aboutSco.ISSNowData = formatDateTimeNonSec(crtTime)
                                }
                                sub.aboutSco.ISSList = res.resultInfo.sysdata.hadChecked.sort(function (a, b) {
                                    return b.optScoe - a.optScoe
                                })
                                for(var i = 0;i < sub.aboutSco.ISSList.length;i++) {
                                    sub.aboutSco.AISMax += sub.aboutSco.ISSList[i].optScoe
                                    if(i < 3) {
                                        sub.aboutSco.ISSMax += Math.pow(sub.aboutSco.ISSList[i].optScoe, 2)
                                    }
                                }
                                console.log(sub.aboutSco.ISSList, 'okkkkkkkkkkkk')
                            }
                            }

                })
            },
            getTiSco() {
                $.ajax({
                    url: '${baseurl}scorequery/findTiScoreByXtpgSeq.do',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: {
                        xtpgSeq: _regSeq
                    },
                    success: function (res) {
                        if (res) {
                            console.log(res,'获取ti数据')
                            sub.tiProps = res
                            sub.aboutSco.tiSco = res.tiSco;
                            if(sub.aboutSco.hasOwnProperty('tiNowData')) {
                                sub.aboutSco.tiNowData = formatDateTimeNonSec(res.cratDat)
                            }
                        }

                    }
                })
            },
            getGcsSco() {
                $.ajax({
                    url: '${baseurl}scorequery/findGcsScoreByXtpgSeq.do',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: {
                        emgSeq: _regSeq
                    },
                    success: function (res) {
                        if (res) {
                            sub.aboutSco.gcsSco = res.totSco;
                            if(sub.aboutSco.hasOwnProperty('gcsNowData')) {
                                sub.aboutSco.gcsNowData = formatDateTimeNonSec(res.updTime)
                            }
                            console.log(res,'获取GCS数据')
                        }
                    }
                })
            },
            getTashSco() {
                $.ajax({
                    url: '${baseurl}scorequery/findTashScoreByTashSeq.do',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: {
                        tashSeq: _regSeq
                    },
                    success: function (res) {
                        if (res) {
                            sub.props = res
                            sub.aboutSco.tashSco = res.tashSco;
                            sub.aboutSco.tashPr = res.tashPr
                            if(sub.aboutSco.hasOwnProperty('tashNowData')) {
                                sub.aboutSco.tashNowData = formatDateTimeNonSec(res.crtDat)
                            }
                        }
                    }
                })
            },
            openTiSco: function () {
                createmodalwindow('TI创伤指数评分', 1200, 430, '${baseurl}hlpgb/toTiSco.do')
            },
            openGcssco() {
                createmodalwindow('GCS评分', 500, 490, '${baseurl}hlpgb/toGcsSco.do?emgSeq='+_regSeq)
            },
            openISS: function () {
                createmodalwindow('ISS/AIS评分', 950, 685, '${baseurl}cs/toAisIss.do?emgSeq='+_regSeq)
            },
            openTashSco() {
                createmodalwindow('Tash评分', 1200, 500, '${baseurl}cs/toTash.do?emgSeq='+_regSeq)
            },
            getTimeList() {
                $.ajax({
                    url: '${baseurl}cs/queryCsTimeline.do',
                    contentType: 'application/json;charset=UTF-8',
                    dataType: 'json',
                    data: {
                        regSeq: _regSeq
                    },
                    success: function (res) {
                        if (res && res.resultInfo.success) {
                            sub.timeList = res.resultInfo.sysdata.csTimeline
                            console.log(res,'获取时间轴数据', sub.timeList)
                        }
                    }
                })
            },
            getCsinfo() {
                $.ajax({
                    url: 'cs/getCsinf.do',
                    type: 'post',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        regSeq: _regSeq,
                    }),
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    success: function (res) {
                        if (res && res.resultInfo.success) {
                            var sysdata = res.resultInfo.sysdata || {}
                            sub.baseInfo = res.resultInfo.sysdata.hspDbzlBas || {}
                            for(var item of res.resultInfo.sysdata.cszlList) {
                                var proVal = item.proVal
                                if (isDateTime(proVal)) {
                                    proVal = formatDateTimeNonSec(proVal)
                                }
                                sub.info[item.proCode] = proVal
                                if (item.proCode == 'JZJYJC' && item.proVal) {
                                    sub.query.JZJYJCSel = item.proVal.split(',')
                                }else if(item.proCode == 'YQQJCS' && item.proVal) {
                                    sub.query.YQQJCSSel = item.proVal.split(',')
                                }else if(item.proCode == 'JZQJCS' && item.proVal) {
                                    sub.query.JZQJCSSel = item.proVal.split(',')
                                }
                            }

                            if (!sub.info.JTZZ) {
                                sub.info.JTZZ = sysdata.locProvinceCity || ""
                            }

                            if (sub.baseInfo.cstAge > 6) {
                                sub.info.NIANL = '01'
                            }else if(sub.baseInfo.cstAge <= 6 && sub.baseInfo.cstAge > 1) {
                                sub.info.NIANL = '02'
                            }else {
                                sub.info.NIANL = '03'
                            }

                            sub.aidPatient.allJTZZ = sub.info.JTZZ
                            if(sub.aidPatient.allJTZZ) {
                                sub.aidPatient.scePrvCod = sub.aidPatient.allJTZZ.slice(0, 6)
                            }
                        }
                    }
                });
            },
            getCsBRQX: function () {
                var self = this
                $.ajax({
                    type: 'post',
                    url: 'cs/csBRQXdataFromEmis.do',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        hspDbzlBasCustom: {
                            regSeq: _regSeq
                        }
                    }),
                    dataType: 'json',
                    success: function (res) {
                        if (res.resultInfo.type == '1') {
                            var sysdata = res.resultInfo.sysdata || {}
                            var BRQXMap = sysdata.BRQXMap || {}
                            Object.assign(self.info, BRQXMap)
                        }
                    }
                })
            },
            getCsZYXX: function (){
                var self = this
                $.ajax({
                    type: 'post',
                    url: 'cs/csZYXXdataFromEmis.do',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        hspDbzlBasCustom: {
                            regSeq: _regSeq
                        }
                    }),
                    dataType: 'json',
                    success: function (res) {
                        if (res.resultInfo.type == '1') {
                            var sysdata = res.resultInfo.sysdata || {}
                            var ZYXXMap = sysdata.ZYXXMap || {}
                            Object.assign(self.info, ZYXXMap)
                        }
                    }
                })
            },
            getCsQJQK: function (){
                var self = this
                $.ajax({
                    type: 'post',
                    url: 'cs/csQJQKdataFromEmis.do',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        hspDbzlBasCustom: {
                            regSeq: _regSeq
                        }
                    }),
                    dataType: 'json',
                    success: function (res) {
                        if (res.resultInfo.type == '1') {
                            var sysdata = res.resultInfo.sysdata || {}
                            var QJQKMap = sysdata.QJQKMap || {}
                            Object.assign(self.info, QJQKMap)
                        }
                    }
                })
            },
            commit() {
                    parent.publicFun.ajaxLoading('保存中，请稍等。。。')
                    console.log(this.info, '???', )

                    var succeedCount = 0;

                    //提交基本信息
                    sub.baseInfo.regTim = moment(sub.baseInfo.regTim).valueOf();
                    var dataSubmit = {};
                    dataSubmit.hspDbzlBasCustom = sub.baseInfo;
                    $.ajax({
                        url: '${baseurl}cs/csPatietBasicInfSubmit.do', //创伤字段还没定所以没做数据保存
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify(dataSubmit),
                        success: function(res) {
                            if(res.resultInfo.success) {
                                succeedCount++;
                            }
                        },
                    });

                    var list = [];
                    for (var prop in this.info) {
                        if (this.info.hasOwnProperty(prop)) {
                            var proVal = this.info[prop]
                            if (isDateTimeNonSec(proVal)) {
                                proVal = formatDateTime(proVal)
                            }
                            list.push({
                                emgNo: _regSeq,
                                proCode: prop,
                                proVal: proVal
                            });
                        }
                    }

                    $.ajax({
                        url: '${baseurl}cs/submitCsInf.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _regSeq,
                            zlInfList: list,
                        }),
                        success: function(res) {
                            if(res.resultInfo.success) {
                                succeedCount++;
                            }
                            if(succeedCount === 2){
                                parent.publicFun.ajaxLoadEnd()
                                parent.publicFun.successalert('保存成功')
                                sub.getCsinfo()
                                sub.getTimeList()
                            }else{
                                parent.publicFun.alert('保存失败')
                            }
                        }
                    });
            },
            onRadioClick: function(prop, val) {
                this.info[prop] = val;
            },
            onCheckClick(prop, code) {
                var list = this.query[prop + 'Sel'];
                if (list.indexOf(code) > -1) {
                    list.splice(list.indexOf(code), 1);
                } else {
                    list.push(code)
                }
                this.info[prop] = list.join(',')
            },

            onTabClick(index) {
                this.activeTab = index
            },
        },
        watch: {
            'aboutSco.gcsSco': {
                deep: true,
                handler: function (newV, oldV) {
                    if (this.baseData.gcsMap) {
                        var item = this.baseData.gcsMap
                        if(newV >= item.lowValue && newV <= item.uppValue) {
                            if(newV >= 3 && newV <= 8) {
                                this.aboutSco.gcsrisk = '重度意识障碍'
                                return this.aboutSco.gcsriskType = item.riskType
                            }else if(newV >= 9 && newV <= 12) {
                                this.aboutSco.gcsrisk = '中度意识障碍'
                                return this.aboutSco.gcsriskType = item.riskType
                            }else if(newV >= 13 && newV <= 14) {
                                this.aboutSco.gcsrisk = '轻度意识障碍'
                                return this.aboutSco.gcsriskType = item.riskType
                            }else {
                                this.aboutSco.gcsrisk = '正常'
                                return this.aboutSco.gcsriskType = item.riskType
                            }
                        }
                    }
                }
            },
            'aboutSco.tiSco': {
              deep: true,
              handler: function (newV, oldV) {
                 if (newV > 18) {
                     this.aboutSco.tirisk =  '严重伤'
                     return this.aboutSco.tiriskType = '2'
                 }else if(newV >= 8 && newV <=18) {
                     this.aboutSco.tirisk =  '重伤'
                     return this.aboutSco.tiriskType = '1'
                 }else {
                     this.aboutSco.tirisk =  '轻伤'
                     return this.aboutSco.tiriskType = '0'
                 }
              }
            },
            'aboutSco.ISSMax': {
                deep: true,
                handler: function(newV) {
                    if(newV >= 16 || this.aboutSco.AISMax >=3) {
                        this.aboutSco.issrisk =  '严重创伤病人'
                        return this.aboutSco.issriskType = '1'
                    }else {
                        this.aboutSco.issrisk =  '创伤病人'
                        return this.aboutSco.issriskType = '0'
                    }
                }
            },
            'aidPatient.scePrvCod': {
                deep: true,
                handler: function (newV, oldV) {
                    if (newV == '') {
                        this.baseData.cityList = []
                        this.aidPatient.sceCtyCod = ''
                    } else {
                        this.info.JTZZ = ''
                        this.baseData.cityList = []
                        this.baseData.cityList = publicFun.getItem('addrInfoList').cityMap[newV]
                        this.info.JTZZ += newV + ','
                        if (this.aidPatient.allJTZZ && this.aidPatient.allJTZZ.length > 6) {
                            if(this.aidPatient.scePrvCod === this.aidPatient.allJTZZ.slice(0,6)) {
                                this.aidPatient.sceCtyCod = this.aidPatient.allJTZZ.slice(7, 13)
                            }else {
                                this.aidPatient.sceCtyCod = ''
                            }
                        }
                    }
                    if(!this.aidPatient.allJTZZ) {
                        this.aidPatient.sceCtyCod = ''
                    }
                }
            },
            'aidPatient.sceCtyCod': {
                deep: true,
                handler: function (newV, oldV) {
                    if (newV == '') {
                        this.baseData.cntyList = []
                        this.aidPatient.sceAr0Cod = ''
                    } else {
                        this.baseData.cntyList = []
                        this.baseData.cntyList = publicFun.getItem('addrInfoList').cntyMap[newV]
                        this.info.JTZZ += newV + ','
                        if (this.aidPatient.allJTZZ && this.aidPatient.allJTZZ.length > 13) {
                            if(this.aidPatient.sceCtyCod === this.aidPatient.allJTZZ.slice(7, 13)) {
                                this.aidPatient.sceAr0Cod = this.aidPatient.allJTZZ.slice(14)
                            }else {
                                this.aidPatient.sceAr0Cod = ''
                            }
                        }
                    }
                    if(!this.aidPatient.allJTZZ) {
                        this.aidPatient.sceAr0Cod = ''
                    }

                }
            },
            'aidPatient.sceAr0Cod': {
                deep: true,
                handler: function (newV, oldV) {
                    var cntyMap = publicFun.getItem('addrInfoList').cntyMap
                    this.info.JTZZ += newV
                }
            }
        }
    })

    $(function () {
        getDicts()
    })

    function getDicts() {
        var map = [{
            prop: 'cardType',
            key: 'CARD_TYPE_COD'
        },{
            prop: 'cstSexCodArr',
            key: 'CST_SEX_COD'
        },{
            prop: 'MDPS',
            key: 'MPDS_COD'
        },{
            prop: 'NIANL',
            key: 'CS_NIANL_COD'
        },{
            prop: 'BQPD',
            key: 'CS_BQPD_COD'
        },{
            prop: 'LYFS',
            key: 'CS_LYFS_COD'
        },{
            prop: 'HJJHC',
            key: 'CS_HJJHC_COD'
        },{
            prop: 'ZXLY',
            key: 'CS_ZXLY_COD'
        },{
            prop: 'TONGK',
            key: 'CS_TONGK_COD'
        },{
            prop: 'GUANGFS',
            key: 'CS_GUANGFS_COD'
        },{
            prop: 'YISHI',
            key: 'CS_YISHI_COD'
        },{
            prop: 'QIDAO',
            key: 'CS_QIDAO_COD'
        },{
            prop: 'XUNH',
            key: 'CS_XUNH_COD'
        },{
            prop: 'XINLV',
            key: 'CS_XINLV_COD'
        },{
            prop: 'XIONGB',
            key: 'CS_XIONGB_COD'
        },{
            prop: 'FUBU',
            key: 'CS_FUBU_COD'
        },{
            prop: 'CHANGM',
            key: 'CS_CHANGM_COD'
        },{
            prop: 'JIZL',
            key: 'CS_JIZL_COD'
        },{
            prop: 'GUZHE',
            key: 'CS_GUZHE_COD'
        },{
            prop: 'YQQJCS',
            key: 'CS_YQQJCS_COD'
        },{
            prop: 'JZJYJC',
            key: 'CS_JZJYJC_COD'
        },{
            prop: 'BRQX',
            key: 'CS_BRQX_COD'
        },{
            prop: 'ZLJG',
            key: 'CS_ZLJG_COD'
        }]
        map.forEach(function(el) {
            sub.baseData[el.prop] = publicFun.getDict(el.key)
        })
    }
    //只能输入整数
    function limitInput(obj, max) {
        obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
        obj.value = obj.value.replace(/^(\-)*(\d+)\.*$/, '$1$2'); //只能保留一位小数
        if (obj.value != "") {
            if (obj.value > max) {
                alert('数值不能超过' + max);
                obj.value = '';
                return;
            } else {
                obj.value = parseFloat(obj.value);
            }
        }
    }
    //数值
    function NumberInput(obj) {
        obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
        obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的
        obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
        obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/, '$1$2.$3'); //只能输入两个小数
        if (obj.value.indexOf(".") < 0 && obj.value != "") {
            obj.value = parseFloat(obj.value);
        }
    }
    // 解决vue与WdatePicker v-model问题
    function WdatePickerEnd(elementId, str, wdate) {
        WdatePicker({
            dateFmt: wdate,//日期格式，可以只显示年或年月，也可以额外显示时间
            onpicked: function () {
                var strArr = str.split('.')
                sub[strArr[0]][strArr[1]] = sub.$refs[elementId].value;
            },
            oncleared: function () {
                var strArr = str.split('.')
                sub[strArr[0]][strArr[1]] = '';
            },
        });
    }

    function formatDateTime(date) {
        return publicFun.timeFormat(date, 'yyyy-MM-dd hh:mm:ss');
    }

    function formatDateTimeNonSec(date) {
        return publicFun.timeFormat(date, 'yyyy-MM-dd hh:mm')
    }

    function isDateTime(dateStr) {
        if (!dateStr || typeof dateStr !== 'string') return false
        return /^(\d{4})(-|\/)(\d{2})(-|\/)(\d{2})\s(\d{2}):(\d{2}):(\d{2})$/.test(dateStr)
    }

    function isDateTimeNonSec(dateStr) {
        if (!dateStr || typeof dateStr !== 'string') return false
        return /^(\d{4})(-|\/)(\d{2})(-|\/)(\d{2})\s(\d{2}):(\d{2})$/.test(dateStr)
    }
</script>
</html>
