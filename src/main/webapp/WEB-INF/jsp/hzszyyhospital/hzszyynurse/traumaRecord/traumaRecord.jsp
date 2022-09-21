<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
  <meta http-equiv="Pragma" content="no-cache" />
  <meta http-equiv="Expires" content="0" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>急诊创伤记录表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link type="text/css" rel="stylesheet" href="${baseurl}css/hems/page/traumaRecord.css?v=${versionDay}">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _currentRecordName = '${sessionScope.activeUser.usrname}',
      _currentRecordCod = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div ms-controller="traumaRecord" class="body-div">
    <div class="main-wrap">
      <p class="title">急诊创伤记录表</p>
      <div class="basic-wrap">
        <label>
          姓名：<input class="under-bottom-input" ms-duplex-string="basicInfo.cstNam" type="text" readonly unselectable='on'>
        </label>
        <label class="m-l10">
          性别：<input class="under-bottom-input" ms-duplex-string="basicInfo.cstSexCod" type="text" readonly unselectable='on'>
        </label>
        <label class="m-l10">
          年龄：<input class="under-bottom-input" ms-duplex-string="basicInfo.cstAgeTotal" type="text" readonly
            unselectable='on'>
        </label>
        <label class="m-l10">
          单位/地址：<input class="under-bottom-input long-under-input" ms-duplex-string="basicInfo.cstAdr" type="text"
            readonly unselectable='on'>
        </label>
      </div>
      <div class="content-wrap">
        <ul class="content-ul">
          <!-- 先留着到 -->
          <!-- <li class="four-li">
            <label class="lab-title">姓名：</label>
            <input type="text" ms-duplex-string="basicInfo.cstNam">
          </li>
          <li class="four-li">
            <label class="lab-title">性别：</label>
            <select ms-duplex-string="basicInfo.cstSexCod">
              <option value=""></option>
              <option ms-repeat="msgList.cstSexCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </li>
          <li class="four-li">
            <label class="lab-title">年龄：</label>
            <input class="age" type="text" ms-duplex-string="basicInfo.cstAge" maxlength="4" ms-keyup="onlyNum('cstAge')" ms-change="onlyNum('cstAge')" ms-input="onlyNum('cstAge')">&ensp;
            <select class="age-type" ms-duplex-string="basicInfo.cstAgeCod">
              <option ms-repeat="msgList.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </li>
          <li class="four-li">
            <label class="lab-title">单位/地址：</label>
            <input type="text" ms-duplex-string="basicInfo.cstAdr">
          </li> -->
          <li class="four-li">
            <label class="lab-title">就诊时间：</label>
            <input type="text" class="Wdate input-sdate" ms-duplex-string="basicInfo.emgDat" readonly />
          </li>
          <li class="four-li">
            <label class="lab-title">首诊科室：</label>
            <input type="text" ms-duplex-string="basicInfo.emgFkName" readonly />
          </li>
          <li class="four-li">
            <label class="lab-title">首诊医生：</label>
            <!-- <input type="text" ms-duplex-string="basicInfo.sqlDctNbr" /> -->
            <span class="relative-block">
              <input type="text" ms-duplex-string="basicInfo.sqlDctNbr" autocomplete="off" id="showSqlName" ms-keyup="cleanSqlText()"
                maxlength="5" />
              <ul class="userList topList" ms-visible="isShowDocList">
                <li ms-repeat="msgList.fzDocList" ms-click="chooseSqlDoc(el.usrname)">
                  {{el.usrname}}
                </li>
              </ul>
            </span>
          </li>
          <li class="full-li">
            <label class="span-title">生命体征：</label>
          </li>
          <li class="full-li">
            <label class="lab-title">创伤部位：</label>
            <label>
              T
              <input type="text" ms-duplex-string="basicInfo.csbwT" class="small-input" maxlength="4" ms-change="onlyNum('csbwT',1, 100)"
                ms-blur="onlyNum('csbwT',1, 100)" ms-input="onlyNum('csbwT',1, 100)">
              ℃
            </label>
            <label class="m-l10">
              P
              <input type="text" ms-duplex-string="basicInfo.csbwP" class="small-input" maxlength="4" ms-change="onlyNum('csbwP')"
                ms-blur="onlyNum('csbwP')" ms-input="onlyNum('csbwP')">
              次/分
            </label>
            <label class="m-l10">
              R
              <input type="text" ms-duplex-string="basicInfo.csbwR" class="small-input" maxlength="4" ms-change="onlyNum('csbwR')"
                ms-blur="onlyNum('csbwR')" ms-input="onlyNum('csbwR')">
              次/分
            </label>
            <label class="m-l10">
              BP
              <input type="text" ms-duplex-string="basicInfo.sbpUpNbr" class="small-input" maxlength="4" ms-change="onlyNum('sbpUpNbr')"
                ms-blur="onlyNum('sbpUpNbr')" ms-input="onlyNum('sbpUpNbr')"> /
              <input type="text" ms-duplex-string="basicInfo.sbpDownNbr" class="small-input" maxlength="4" ms-change="onlyNum('sbpDownNbr')"
                ms-blur="onlyNum('sbpDownNbr')" ms-input="onlyNum('sbpDownNbr')">
              mmHg
            </label>
            <label class="m-l10">
              <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod()">[查看]</a>诊断&nbsp;
              <div class="readonlyZ" id="show_text">{{basicInfo.jbzdDes}}</div>
            </label>
          </li>
        </ul>
        <div class="image-table">
          <div class="image-wrap">
            <img src="${baseurl}images/hzszyyhems/nurse/body-img.png" />
          </div>
          <div class="right-tab">
            <p class="small-title span-title">急救传呼情况</p>
            <div class="full-div">
              <!-- <img class="cursor-type" src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" ms-click="addNewTr()" /> -->
              <a class="my-linkbutton cursor-type" data-options="toggle:true,plain:true" ms-click="addNewTr()">[新增]</a>
            </div>
            <div class="tableScroll">
              <table class="edit-tab tableHeader">
                <tbody>
                  <tr>
                    <th class="firstTd">值班医生</th>
                    <th class="secondTd">呼叫时间</th>
                    <th class="thirdTd">到达时间</th>
                    <th class="fourthTd">呼叫者姓名</th>
                    <th class="fifTd">操作</th>
                    <th class="scrollTd"></th>
                    <!-- <th class="scrollTd" ms-visible="vm.basicInfo.phoneCallList.length > 14"></th> -->
                  </tr>
                </tbody>
              </table>
              <div class="scrollBox">
                <table class="tableBody">
                  <tbody>
                    <tr ms-repeat-item="basicInfo.phoneCallList">
                      <td class="firstTd"><input type="text" ms-duplex-string="item.ksNam"></td>
                      <td class="secondTd"><input type="text" ms-duplex-string="item.hjDat" class="Wdate" ms-class="hjDat{{$index}}"
                          onclick="WdatePicker({dateFmt: 'yyyy/MM/dd HH:mm:ss'})" /></td>
                      <td class="thirdTd"><input type="text" ms-duplex-string="item.ddDat" class="Wdate" ms-class="ddDat{{$index}}"
                          onclick="WdatePicker({dateFmt: 'yyyy/MM/dd HH:mm:ss'})" /></td>
                      <td class="fourthTd">
                        <span class="spanRelative floatLeft">
                          <input type="text" ms-attr-id="userSign{{$index}}" maxlength="10" ms-keydown="getUerList(event, $index, 'userSign')"
                            autocomplete="off" ms-duplex-string="item.callerNam" />
                          <input type="text" ms-attr-id="userSignNum{{$index}}" ms-duplex-string="item.callerNbr" class="hidden" />
                          <div class="userList" ms-attr-id="userList{{$index}}"></div>
                        </span>
                      </td>
                      <td class="fifTd">
                        <span class="url-link">
                          <a class="cursor-type" ms-click="deleteCurrent($index, 'phoneCallList')">删除</a>
                        </span>
                      </td>
                      <!-- <td class="scrollTd" ms-visible="vm.basicInfo.phoneCallList.length > 14"></td> -->
                      <td class="scrollTd"></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="skin-test-wrap">
          <div class="floatLeft input-line">
            <label class="lab-title">过敏史：</label>
            <label class="middleLabel" ms-repeat="msgList.algHonList">
              <input ms-attr-id="algHon{{el.infocode}}" name="algHon" type="radio" ms-attr-value="el.infocode"
                ms-duplex-string="basicInfo.algHon" /> {{el.info}}
            </label>
            <label class="middleLabel check-label" ms-repeat="msgList.algTypCodList">
              <input ms-attr-id="algTypCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex-string="basicInfo.algTypCod" />
              {{el.info}}
              <input ms-if="basicInfo.isShowAlgTypDes && el.infocode == 6" maxlength="50" type="text" ms-duplex-string="basicInfo.algTypDes" />
            </label>
            <input class="hidden" type="text" ms-duplex-string="hideMsg.algTypCod" />
          </div>
          <div class="full-div">
            <a class="my-linkbutton cursor-type" data-options="toggle:true,plain:true" ms-click="addDrugNewTr()">[新增]</a>
            <!-- <img class="cursor-type" src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" ms-click="addDrugNewTr()" /> -->
          </div>
          <div class="tableScroll">
            <table class="edit-tab tableHeader">
              <tbody>
                <tr>
                  <th class="firstTd">药物名称</th>
                  <th class="secondTd">注射时间</th>
                  <th class="thirdTd">结果时间</th>
                  <th class="fourthTd">皮试结果</th>
                  <th class="fiveTd">签名</th>
                  <th class="sixTd center">操作</th>
                  <!-- <th class="scrollTd" ms-visible="vm.basicInfo.skinTestList.length > 14"></th> -->
                  <th class="scrollTd"></th>
                </tr>
              </tbody>
            </table>
            <div class="scrollBox">
              <table class="tableBody">
                <tbody>
                  <tr ms-repeat-item="basicInfo.skinTestList">
                    <td class="firstTd"><input type="text" ms-duplex-string="item.ywNam"></td>
                    <td class="secondTd"><input type="text" ms-duplex-string="item.zsDat" class="Wdate" ms-class="zsDat{{$index}}"
                        onclick="WdatePicker({dateFmt: 'yyyy/MM/dd HH:mm:ss'})" /></td>
                    <td class="thirdTd"><input type="text" ms-duplex-string="item.jgDat" class="Wdate" ms-class="jgDat{{$index}}"
                        onclick="WdatePicker({dateFmt: 'yyyy/MM/dd HH:mm:ss'})" /></td>
                    <td class="fourthTd">
                      <input type="text" ms-duplex-string="item.jg">
                    </td>
                    <td class="fiveTd">
                      <span class="spanRelative floatLeft">
                        <input type="text" ms-attr-id="username{{$index}}" maxlength="10" ms-keydown="getUerList(event, $index, 'username')"
                          autocomplete="off" ms-duplex-string="item.sigNam" />
                        <input type="text" ms-attr-id="usernameNum{{$index}}" class="hidden" ms-duplex-string="item.sigNbr" />
                        <div class="userList" ms-attr-id="userNameList{{$index}}"></div>
                      </span>
                    </td>
                    <td class="sixTd center">
                      <span class="url-link">
                        <a class="cursor-type" ms-click="deleteCurrent($index, 'skinTestList')">删除</a>
                      </span>
                    </td>
                    <!-- <td class="scrollTd" ms-visible="vm.basicInfo.skinTestList.length > 14"></td> -->
                    <td class="scrollTd"></td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
        <ul class="content-ul otherUl">
          <li class="full-li">
            <span class="span-title">创伤有关情况</span>
          </li>
          <li>
            <label class="lab-title">
              创伤者身份：
            </label>
            <label class="check-label" ms-repeat="msgList.cszsfCodList" ms-attr-for="cszsfCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="cszsfCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="basicInfo.cszsfCod"
                ms-change="arrToStr('cszsfCod', $index)"> {{el.info}}
                <input ms-if="el.infocode == 4 && hideMsg.cszsfCod.indexOf('4') != -1" class="shortOther" type="text" ms-duplex-string="basicInfo.cszsfOther">
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideMsg.cszsfCod">
          </li>
          <li>
            <label class="lab-title">
              创伤原因：
            </label>
            <label class="check-label" ms-repeat="msgList.csyyCodList" ms-attr-for="csyyCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="csyyCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="basicInfo.csyyCod"
                ms-change="arrToStr('csyyCod', $index)"> {{el.info}}
                <input ms-if="el.infocode == 6 && hideMsg.csyyCod.indexOf('6') != -1" class="shortOther" type="text" ms-duplex-string="basicInfo.csyyOther">
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideMsg.csyyCod">
          </li>
          <li>
            <label class="lab-title">
              发生地点：
            </label>
            <label class="check-label" ms-repeat="msgList.fsddCodList" ms-attr-for="fsddCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="fsddCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="basicInfo.fsddCod"
                ms-change="arrToStr('fsddCod', $index)"> {{el.info}}
                <input ms-if="el.infocode == 5 && hideMsg.fsddCod.indexOf('5') != -1" class="shortOther" type="text" ms-duplex-string="basicInfo.fsddOther">
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideMsg.fsddCod">
          </li>
          <li>
            <label class="lab-title">
              护送方式：
            </label>
            <label class="check-label" ms-repeat="msgList.hsfsCodList" ms-attr-for="hsfsCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="hsfsCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="basicInfo.hsfsCod"
                ms-change="arrToStr('hsfsCod', $index)"> {{el.info}}
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideMsg.hsfsCod">
          </li>
          <li>
            <label class="lab-title">
              护送人：
            </label>
            <label class="check-label" ms-repeat="msgList.hsrCodList" ms-attr-for="hsrCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="hsrCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="basicInfo.hsrCod"
                ms-change="arrToStr('hsrCod', $index)"> {{el.info}}
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideMsg.hsrCod">
          </li>
          <li>
            <label class="lab-title">
              紧急联系：
            </label>
            <span class="span-wrapper">
              <span class="span-wth">
                <label>联系人姓名：</label><input type="text" maxlength="10" ms-duplex-string="basicInfo.lxrNam">
              </span>
              <span class="span-wth">
                <label>电话：</label><input type="text" maxlength="11" ms-duplex-string="basicInfo.lxrTel" ms-blur="onlyNum('lxrTel')"
                  ms-change="onlyNum('lxrTel')" ms-input="onlyNum('lxrTel')">
              </span>
              <span class="mar-left-gap">
                欠款：
                <label ms-repeat="msgList.qkCodList" ms-attr-for="qkCod{{el.infocode}}" class="check-label">
                  <input ms-attr-id="qkCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="basicInfo.qkCod"
                    ms-change="arrToStr('qkCod', $index)">
                  {{el.info}}
                </label>
                <input class="hidden" type="text" ms-duplex-string="hideMsg.qkCod">
              </span>
            </span>
          </li>
          <li class="full-li">
            <span class="floatRight">
              <span class="spanTitle">记录者签名：</span>
              <span class="relative-block">
                <input type="text" id="recordName" maxlength="10" ms-duplex-string="basicInfo.recorderNam" ms-keydown="getRecordUerList(event, 'recordName')" />
                <div class="userList" id="recordNameList"></div>
                <input type="text" id="recordNameNum" ms-duplex-string="basicInfo.recorderNbr" class="hidden" />
              </span>
            </span>
          </li>
        </ul>
      </div>
    </div>
    <div class="center last-post-btn">
      <a class="easyui-linkbutton" iconcls="icon-reload" onclick="reloadLocalPage()">刷新</a>
      <a class="easyui-linkbutton" iconcls="icon-ok" onclick="postBasicInfo()">保存</a>
      <a class="easyui-linkbutton" iconcls="icon-print" onclick="postBasicInfo('p')">打印</a>
    </div>
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/traumaRecord/printTraumaRecord.jsp"></jsp:include>
  </div>
  <script type="text/javascript">
    var _algTypCodList = publicFun.getDict('ALG_TYP_COD'),
      _cstSexCodList = publicFun.getDict('CST_SEX_COD');
    var vm = avalon.define({
      $id: 'traumaRecord',
      basicInfo: {
        mpi: '',
        bedNum: '',
        cstNam: '',
        jzcsId: '',
        cstSexCod: '',
        cstAge: '',
        cstAgeCod: '',
        cstAgeName: '',
        cstAgeTotal: '',
        cstAdr: '',
        emgDat: '',
        emgFkCod: '',
        emgFkName: '',
        sqlDctNbr: '',
        csbwT: '',
        csbwP: '',
        csbwR: '',
        sbpUpNbr: '',
        sbpDownNbr: '',
        jbzdDes: '',
        phoneCallList: [
          { ksNam: '外科', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' },
          { ksNam: '脑外科', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' },
          { ksNam: '骨科', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' },
          { ksNam: '急诊科', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' },
          { ksNam: '胸外科', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' }
        ],
        algHon: '',
        algTypCod: [],
        algTypDes: '',
        isShowAlgTypDes: false,
        skinTestList: [
          { ywNam: '青霉素', zsDat: '', jgDat: '', jg: '', sigNam: '', sigNbr: '' },
          // { ywNam: '普鲁卡因', zsDat: '', jgDat: '', jg: '', sigNam: '', sigNbr: '' },
          // { ywNam: 'TAT', zsDat: '', jgDat: '', jg: '', sigNam: '', sigNbr: '' },
          // { ywNam: '先锋霉素', zsDat: '', jgDat: '', jg: '', sigNam: '', sigNbr: '' }
        ],
        cszsfCod: [],
        csyyCod: [],
        fsddCod: [],
        hsfsCod: [],
        hsrCod: [],
        lxrNam: '',
        lxrTel: '',
        qkCod: [],
        recorderNbr: _currentRecordCod,
        recorderNam: _currentRecordName ,// 记录者签名

        cszsfOther: '',  //创伤者身份其它
        fsddOther: '',  //发生地点其它
        csyyOther: ''  //创伤原因其它
      },
      hideMsg: {
        algTypCod: '',
        cszsfCod: '',
        csyyCod: '',
        fsddCod: '',
        hsfsCod: '',
        hsrCod: '',
        qkCod: ''
      },
      msgList: {
        cstSexCodList: _cstSexCodList,
        cstAgeCodList: [{ infocode: '0', info: '岁' }, { infocode: '1', info: '月' }, { infocode: '2', info: '天' }],
        algHonList: [{ infocode: '0', info: '无' }, { infocode: '1', info: '不详' }, { infocode: '2', info: '有' }],
        algTypCodList: _algTypCodList,
        cszsfCodList: [{ infocode: '0', info: '行人' }, { infocode: '1', info: '摩托车手' }, { infocode: '2', info: '骑自行车人' }, { infocode: '3', info: '驾驶员' }, { infocode: '4', info: '其他' }],
        csyyCodList: [{ infocode: '0', info: '交通意外' }, { infocode: '1', info: '钝器/殴斗' }, { infocode: '2', info: '枪伤' }, { infocode: '3', info: '工伤' }, { infocode: '4', info: '坠落' }, { infocode: '5', info: '坠落' }, { infocode: '6', info: '其他' }],
        fsddCodList: [{ infocode: '0', info: '居住地' }, { infocode: '1', info: '单位' }, { infocode: '2', info: '工地' }, { infocode: '3', info: '途中' }, { infocode: '4', info: '交通工具内' }, { infocode: '5', info: '其他' }],
        hsfsCodList: [{ infocode: '0', info: '自己步行' }, { infocode: '1', info: '汽车' }, { infocode: '2', info: '救护车' }, { infocode: '3', info: '三轮车' }, { infocode: '4', info: '警车' }],
        hsrCodList: [{ infocode: '0', info: '家属' }, { infocode: '1', info: '同事' }, { infocode: '2', info: '过路人' }, { infocode: '3', info: '公务人员' }, { infocode: '4', info: '医务人员' }],
        qkCodList: [{ infocode: '1', info: '有' }, { infocode: '0', info: '无' }],
        fzDocList: []
      },
      isShowDocList: false,
      onlyNum: function (attr, step, max) { //限定只能输入数字
        vm.basicInfo[attr] = publicFun.onlyNumber(vm.basicInfo[attr], step, max)
      },
      getUerList: function (e, idx, name) {
        if (e.keyCode == 13) {
          if (name === 'username') {
            publicFun.SearchList('username' + idx, 'userNameList' + idx);
          } else {
            publicFun.SearchList('userSign' + idx, 'userList' + idx);
          }
        }
      },
      getRecordUerList: function (e, name) {
        if (e.keyCode == 13) {
          publicFun.SearchList('recordName', 'recordNameList');
        }
      },
      deleteCurrent: function (idx, listName) {
        _confirm('确定删除该数据吗？', null, function () {
          vm.basicInfo[listName].splice(idx, 1)
        });
      },
      addNewTr: function () {
        vm.basicInfo.phoneCallList.push(
          { ksNam: '', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' }
        )
      },
      addDrugNewTr: function () {
        vm.basicInfo.skinTestList.push(
          { ywNam: '', zsDat: '', jgDat: '', jg: '', sigNam: '', sigNbr: '' }
        )
      },
      arrToStr: function (objName, idx) {
        if (idx !== '' && idx != null) {
          var _list = vm.msgList[objName + 'List'];
          if (vm.basicInfo[objName].$model.length > 1) {
            vm.basicInfo[objName] = [_list[idx].infocode]
          }
        }
        if (vm.basicInfo[objName].$model.length > 0) {
          vm.hideMsg[objName] = vm.basicInfo[objName].$model.join(',')
        } else {
          vm.hideMsg[objName] = ''
        }
      },
      getEmgFkDocList: function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/findHspDctNbrList.do' }, { 'dstuserCustom.emgsysid': vm.basicInfo.emgFkCod, 'dstuserCustom.outCall': '1', _t: Date.parse(new Date()) }, function (res) {
          var _fkList = res.msg.findHspDctNbrLsit;
          if (_fkList.length == 0) {
            // publicFun.alert('对应科室下面没有相应的医生！');
          }
          vm.msgList.fzDocList = _fkList;
        });
      },
      chooseSqlDoc: function (name) {
        vm.basicInfo.sqlDctNbr = name;
        vm.isShowDocList = false;
      },
      cleanSqlText: function () {
        // vm.basicInfo.sqlDctNbr = '';
        vm.isShowDocList = false;
      }
    })

    vm.hideMsg.$watch('cszsfCod', function (newVal, oldVal) {
      if (newVal.indexOf('4') == -1) {
        vm.basicInfo.cszsfOther = ''
      }
    });
    vm.hideMsg.$watch('fsddCod', function (newVal, oldVal) {
      if (newVal.indexOf('5') == -1) {
        vm.basicInfo.fsddOther = ''
      }
    });
    vm.hideMsg.$watch('csyyCod', function (newVal, oldVal) {
      if (newVal.indexOf('6') == -1) {
        vm.basicInfo.csyyOther = ''
      }
    });

    vm.basicInfo.algTypCod.$watch('$all', function (name, newVal, oldVal) {
      var _algTypCod = vm.basicInfo.algTypCod.$model;
      vm.hideMsg.algTypCod = _algTypCod.join();
      if ($.inArray('6', _algTypCod) > -1) {
        vm.basicInfo.isShowAlgTypDes = true
      } else {
        vm.basicInfo.isShowAlgTypDes = false
        vm.basicInfo.algTypDes = ''
      }
      if (newVal != '') {
        vm.basicInfo.algHon = '2';
      }
    })

    vm.basicInfo.$watch('algHon', function (newVal, oldVal) {
      if (newVal === '0' || newVal === '1') {
        vm.basicInfo.algTypCod = [];
      }
    });

    $('body').click(function () {
      $('.userList').hide()
    })

    function toFillRightTab(isPrint) {
      var _list = vm.basicInfo.phoneCallList;
      if (_list.length < 9) {
        for (var i = 0; i < 9; i++) {
          vm.basicInfo.phoneCallList.push({ ksNam: '', hjDat: '', ddDat: '', callerNam: '', callerNbr: '' })
        }
      }
      getAjaxVal(isPrint)
    }

    function postBasicInfo (isPrint) {
      var _postMsg = vm.basicInfo, _stringMsg = vm.hideMsg;
      var _hspJjchqkInfList = JSON.parse(JSON.stringify(_postMsg.phoneCallList)),
        _hspJzpsInfList = JSON.parse(JSON.stringify(_postMsg.skinTestList));
      for (var i = 0; i < _hspJjchqkInfList.length; i++) {
        _hspJjchqkInfList[i].emgSeq = '${emgSeq}';
        _hspJjchqkInfList[i].hjDat = $('.hjDat' + i).val();
        _hspJjchqkInfList[i].ddDat = $('.ddDat' + i).val();
        _hspJjchqkInfList[i].jzcsId = _postMsg.jzcsId;
        _hspJjchqkInfList[i].indexNum = i;
      }
      for (var i = 0; i < _hspJzpsInfList.length; i++) {
        _hspJzpsInfList[i].emgSeq = '${emgSeq}';
        _hspJzpsInfList[i].zsDat = $('.zsDat' + i).val();
        _hspJzpsInfList[i].jgDat = $('.jgDat' + i).val();
        _hspJzpsInfList[i].jzcsId = _postMsg.jzcsId;
        _hspJzpsInfList[i].indexNum = i;
      }
      publicFun.httpServer({ url: '${baseurl}hlpgb/updateJzcsjlb.do', requestDataType: 'json' }, {
        'hspJzcsjlbInfCustom': {
          'emgSeq': '${emgSeq}',
          'jzcsId': _postMsg.jzcsId,
          'cstNam': _postMsg.cstNam,
          'cstSexCod': _postMsg.cstSexCod,
          'cstAge': _postMsg.cstAge,
          'cstAgeCod': _postMsg.cstAgeCod,
          'cstAdr': _postMsg.cstAdr,
          'emgDat': _postMsg.emgDat,
          'emgFkCod': _postMsg.emgFkCod,
          'sqlDctNbr': _postMsg.sqlDctNbr,
          'csbwT': _postMsg.csbwT,
          'csbwP': _postMsg.csbwP,
          'csbwR': _postMsg.csbwR,
          'sbpUpNbr': _postMsg.sbpUpNbr,
          'sbpDownNbr': _postMsg.sbpDownNbr,
          'algHon': _postMsg.algHon,
          'algTypCod': _stringMsg.algTypCod,
          'algTypDes': _postMsg.algTypDes,
          'cszsfCod': _stringMsg.cszsfCod,
          'csyyCod': _stringMsg.csyyCod,
          'fsddCod': _stringMsg.fsddCod,
          'hsfsCod': _stringMsg.hsfsCod,
          'hsrCod': _stringMsg.hsrCod,
          'lxrNam': _postMsg.lxrNam,
          'lxrTel': _postMsg.lxrTel,
          'qkCod': _stringMsg.qkCod,
          'recorderNam': _postMsg.recorderNam,
          'recorderNbr': _postMsg.recorderNbr,
          "cszsfOther":_postMsg.cszsfOther,
          "fsddOther":_postMsg.fsddOther,
          "csyyOther":_postMsg.csyyOther
        },
        'hspJjchqkInfList': _hspJjchqkInfList,
        'hspJzpsInfList': _hspJzpsInfList
      }, function (res) {
        if (res.resultInfo.type == '1') {
          if (isPrint === 'p') {
             toFillRightTab('p')
          } else {
            message_alert(res)
            setTimeout(function () {
              window.location.reload();
            }, 800)
          }
        }
      })
    }

    function getAjaxVal(isPrint) {
      var _basicInfoKeyList = ['cstNam','mpi', 'cstSexCod', 'cstAge', 'cstAgeCod', 'cstAdr', 'emgDat', 'emgFkName','jbzdDes'];
      publicFun.httpServer({ url: '${baseurl}hlpgb/queryjzcsjlb_result.do' }, { 'emgSeq': '${emgSeq}' }, function (res) {
        var _infoRes = res.hspemginfCustom;
        var _currentRes = res.hspJzcsjlbInfCustom;
        for (var key in _infoRes) {
          if (vm.basicInfo.hasOwnProperty(key)) {
            if (key === 'emgDat') {
              _infoRes[key] = publicFun.timeFormat(new Date(_infoRes[key]), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'cstSexCod') {
              if (_infoRes[key] === '0') {
                _infoRes[key] = '男'
              }
              if (_infoRes[key] === '1') {
                _infoRes[key] = '女'
              }
            }
            _infoRes.cstAgeName = '';
            if (_infoRes.cstAgeCod === '0') {
              _infoRes.cstAgeName = '岁'
            } else if (_infoRes.cstAgeCod === '1') {
              _infoRes.cstAgeName = '月'
            } else if (_infoRes.cstAgeCod === '2') {
              _infoRes.cstAgeName = '天'
            }
            vm.basicInfo.cstAgeName = _infoRes.cstAgeName;
            vm.basicInfo.jbzdDes = _infoRes.jbzdDes;
            if (_infoRes.cstAge !== '' && _infoRes.cstAge != null) {
              vm.basicInfo.cstAgeTotal = _infoRes.cstAge + _infoRes.cstAgeName;
            }
            if (key === 'algTypCod') {
              vm.hideMsg[key] = _infoRes[key]
              if (_infoRes[key] !== '' && _infoRes[key] != null) {
                vm.basicInfo[key] = _infoRes[key].split(',')
              }
            } else {
              if (key !== 'sbpUpNbr' && key !== 'sbpDownNbr') {
                vm.basicInfo[key] = _infoRes[key]
              } else {
                if (_currentRes) {
                  if (_currentRes.emgSeq == null || _currentRes.emgSeq === '') {
                    vm.basicInfo[key] = _infoRes[key];
                  }
                } else {
                  vm.basicInfo[key] = _infoRes[key];
                }
              }
            }
          } else {
            if (_currentRes) {
              if (_currentRes.emgSeq == null || _currentRes.emgSeq === '') {
                vm.basicInfo.csbwT = _infoRes.tmpNbr;
                vm.basicInfo.csbwP = _infoRes.hrtRte;
                vm.basicInfo.csbwR = _infoRes.breNbr;
              }
            } else {
              vm.basicInfo.csbwT = _infoRes.tmpNbr;
              vm.basicInfo.csbwP = _infoRes.hrtRte;
              vm.basicInfo.csbwR = _infoRes.breNbr;
            }
          }
        }

        if (_currentRes) {
          for (var key in _currentRes) {
            if (vm.hideMsg.hasOwnProperty(key)) {
              if (_currentRes[key] !== '' && _currentRes[key] != null) {
                vm.hideMsg[key] = _currentRes[key]
                vm.basicInfo[key] = _currentRes[key].split(',')
              }
            } else {
              if (vm.basicInfo.hasOwnProperty(key)) {
                if ($.inArray(key, _basicInfoKeyList) < 0) {
                  vm.basicInfo[key] = _currentRes[key];
                }
              }
            }
          }
        }
        if (res.hspJjchqkInfList) {
          vm.basicInfo.phoneCallList = res.hspJjchqkInfList
        }
        if (res.hspJzpsInfList) {
          vm.basicInfo.skinTestList = res.hspJzpsInfList
        }
      })
      setTimeout(function () {
        if (isPrint) {
          print()
        }
        vm.getEmgFkDocList()
      }, 1000);
    }

    $('#showSqlName').click(function (e) {
      e.stopPropagation();
      vm.isShowDocList = true;
    });

    function reloadLocalPage() {
      window.location.reload();
    }

    //新增会诊诊断
    function addPreDgnCod() {
      createmodalwindow("初步诊断", 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${emgSeq}&&jbzdType=1&&trnumber=', 'no');
    }

    $(function () {
      toFillRightTab()
    })
  </script>
</body>

</html>