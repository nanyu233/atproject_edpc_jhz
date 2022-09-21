function smallGenerate(indexCod) {
  var obj = {
    jbzdDes: 'hspemginfCustom.jbzdDes' + indexCod,
    jbzdComm: 'hspJbzdInfCustom.jbzdComm' + indexCod,
    jbzdPrefixStr: 'hspJbzdInfCustom.jbzdPrefixStr' + indexCod,
    jbzdSuffixStr: 'hspJbzdInfCustom.jbzdSuffixStr' + indexCod,
    jbzdFlgStr: 'hspJbzdInfCustom.jbzdFlgStr' + indexCod
  }
  var _indexCodList = [{ cod: '1', jbzdDes: 'ryzdZyDes', jbzdComm: 'ryzdZy' }, { cod: '2', jbzdDes: 'ryzdXyDes', jbzdComm: 'ryzdXy' }, { cod: '3', jbzdDes: 'cyzdZyDes', jbzdComm: 'cyzdZy' }, { cod: '4', jbzdDes: 'cyzdXyDes', jbzdComm: 'cyzdXy' }, { cod: '5', jbzdDes: 'deathZdDes', jbzdComm: 'deathZd' }];
  $.each(_indexCodList, function(idx, val) {
    if (val.cod == indexCod) {
      obj.jbzdDes = val.jbzdDes
      obj.jbzdComm = val.jbzdComm
    }
  })
  var initHtmlDom = [];
  initHtmlDom.push(
    '<div class=\"input readonly\" id=\"show_text',indexCod,'\"></div>',
    '<input class=\"hidden\" id=\"jbzdSeq', indexCod, '\"></input>',
    '<input class=\"hidden\" id=\"jbzdDes', indexCod, '\" name=\"',obj.jbzdDes,'\"></input>',
    '<input class=\"hidden\" id=\"jbzdComm', indexCod, '\" name=\"', obj.jbzdComm,'\"></input>',
    '<input class=\"hidden\" id=\"diagnosePre', indexCod, '\" name=\"', obj.jbzdPrefixStr,'\"></input>',
    '<input class=\"hidden\" id=\"diagnoseSuf', indexCod, '\" name=\"', obj.jbzdSuffixStr,'\"></input>',
    '<input class=\"hidden\" id=\"jbzdBetFixStr', indexCod, '\"></input>',
    '<input class=\"hidden\" id=\"sourceFlg', indexCod, '\" name=\"', obj.jbzdFlgStr,'\"></input>',
    '<div class=\"hidden\" id=\"bz_id', indexCod, '\"></div>'
  );
  $('.diagnoseDivHtml' + indexCod).html(initHtmlDom.join(''));
}

function setChildBrost(url, emg, indexCod) {
  if (indexCod !== '') {
    setDiagnoseValue(url, emg, indexCod)
  } else {
    setDiagnoseValue(url, emg, [''])
  }
}
function setDiagnoseValue(url, emg, indexCodList) {
    var obj = {
      hzzdCod: [],
      hzzdCodname: [],
      jbzdSuffix: [],
      jbzdPrefix: [],
      jbzdFlg: [],
      hzzdCod1: [],
      hzzdCodname1: [],
      jbzdSuffix1: [],
      jbzdPrefix1: [],
      jbzdFlg1: [],
      hzzdCod2: [],
      hzzdCodname2: [],
      jbzdSuffix2: [],
      jbzdPrefix2: [],
      jbzdFlg2: [],
      hzzdCod3: [],
      hzzdCodname3: [],
      jbzdSuffix3: [],
      jbzdPrefix3: [],
      jbzdFlg3: [],
      hzzdCod4: [],
      hzzdCodname4: [],
      jbzdSuffix4: [],
      jbzdPrefix4: [],
      jbzdFlg4: [],
      hzzdCod5: [],
      hzzdCodname5: [],
      jbzdSuffix5: [],
      jbzdPrefix5: [],
      jbzdFlg5: []
    }
    publicFun.httpServer({url: url}, { emgSeq: emg}, function (res) {
      var data;
      $.each(indexCodList, function (_idx, _val) {
        if (_val == '5') {
          data = res.hspJbzdInfDeathList;
        } else {
          data = res['hspJbzdInfCustomList' + _val];
        }
        if (data.length > 0) {
          $.each(data, function (idx, val) {
            for (var key in obj) {
              if (val[key] !== undefined) {
                obj[key + _val].push(val[key])
              }
            }
          })
        }
      })
      
      var _fieldList = [{ arrName: 'hzzdCod', idName: 'jbzdSeq', smy: ',' }, { arrName: 'hzzdCodname', idName: 'jbzdBetFixStr', smy: ';' },
      { arrName: 'jbzdSuffix', idName: 'diagnoseSuf', smy: '$' }, { arrName: 'jbzdPrefix', idName: 'diagnosePre', smy: '$' },
      { arrName: 'jbzdFlg', idName: 'sourceFlg', smy: ';' }];
      var _stringVal = '';
      $.each(indexCodList, function (_idx, _val) {
        if (_val == '5') {
          $.each(_fieldList, function (idx, val) {
            if (obj[val.arrName + _val]) {
              _stringVal = obj[val.arrName + _val].join(val.smy)
            }
            if (val.idName === 'jbzdSeq') {
              var _seqSingle = '';
              if (res.hspJbzdInfDeath) {
                _seqSingle = res.hspJbzdInfDeath[val.idName] || '';
              }
              if (_stringVal === '') {
                $('#' + val.idName + _val).attr({ 'value': _seqSingle });
              } else {
                $('#' + val.idName + _val).attr({ 'value': _stringVal });
              }
            } else {
              $('#' + val.idName + _val).attr({ 'value': _stringVal });
            }
          })
        } else {
          $.each(_fieldList, function (idx, val) {
            if (obj[val.arrName + _val]) {
              _stringVal = obj[val.arrName + _val].join(val.smy)
            }
            if (val.idName === 'jbzdSeq') {
              var _seqSingle = '';
              if (res.hspJbzdInfCustom) {
                _seqSingle = res['hspJbzdInfCustom' + _val][val.idName] || '';
              }
              if (_stringVal === '') {
                $('#' + val.idName + _val).attr({ 'value': _seqSingle });
              } else {
                $('#' + val.idName + _val).attr({ 'value': _stringVal });
              }
            } else {
              $('#' + val.idName + _val).attr({ 'value': _stringVal });
            }
          })
        }
      })


      var list;
      var _nameFieldList = [{ val: 'jbzdSeqList', cod: '' }, { val: 'ryzdZyList', cod: '1' }, { val: 'ryzdXyList', cod: '2' }, { val: 'cyzdZyList', cod: '3' }, { val: 'cyzdXyList', cod: '4' }, { val: 'deathZdList', cod: '5' }];
      $.each(_nameFieldList, function (idx, value) {
        $.each(indexCodList, function (_idx, _val) {
          list = '';
          if (_val == value.cod) {
            if (obj['hzzdCod' + _val]) {
              for (var i = 0; i < obj['hzzdCod' + _val].length; i++) {
                list += "<input type='checkbox' name='" + value.val + "' value='" + obj['hzzdCod' + _val][i] + "' checked>";
              }
            }
            $('#bz_id' + _val).html(list);
          }
        })
      })

      var _singleObj = {
        jbzdComm: ''
      }
      $.each(indexCodList, function (_idx, _val) {
        for (var key in _singleObj) {
          if (res['hspJbzdInfCustom' + _val]) {
            $('#' + key + _val).attr({ 'value': res['hspJbzdInfCustom' + _val][key] });
          }
        }
        if (res.hspemginfCustom) {
          var _listDes = [{ cod: '', fid: 'jbzdDes' }, { cod: '1', fid: 'ryzdXy' }, { cod: '2', fid: 'jbzdDes' }, { cod: '3', fid: 'cyzdZy' }, { cod: '4', fid: 'cyzdXy' }, { cod: '5', fid: 'deathDiagnosis' }];
          $.each(_listDes, function (idx, val) {
            var _show_des = '';
            if (_val == val.cod) {
              _show_des = res.hspemginfCustom[val.fid];
              if (_show_des) {
                $('#_' + val.fid).val(_show_des);
                $('#jbzdDes' + _val).val(_show_des);
                $('#show_text' + _val).text(_show_des);
              }
            }
          })
        }
      })
    })
  }