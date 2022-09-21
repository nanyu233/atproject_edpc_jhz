var ruleMixin = {
  mounted: function () {
    this.$nextTick(function () {
      this.getParentList();
    })
  },
  methods: {
    _radioClick: function (idx, infocode, listName, obj) {
      var list = vm.getMsg[listName];
      var currentChecked = list[idx]['checked'];
      list.forEach(function (element) {
        element['checked'] = false
      })
      list[idx]['checked'] = !currentChecked;
      if (list[idx]['checked'] == true) {
        vm.getSonMsg(infocode, 'checkSuper');
        vm.msgInfo[obj + 'Cod'] = vm.getMsg[listName][idx]['infocode'];
      } else {
        vm.msgInfo[obj + 'Cod'] = '';
        vm.getMsg.zbnhList = [];
        vm.msgInfo[obj + 'SubCod'] = [];
      }
    },
    checkClick: function (idx, obj) {
      var list = vm.getMsg['zbnhList'];
      var currentData = $.inArray((list[idx]['infocode']), vm.msgInfo[obj + 'SubCod']);
      if (list[idx]['checked'] == false) {
        list[idx]['checked'] = true;
        if (currentData == -1) {
          vm.msgInfo[obj + 'SubCod'].push(list[idx]['infocode'])
        }
      } else {
        list[idx]['checked'] = false;
        if (currentData != -1) {
          vm.msgInfo[obj + 'SubCod'].splice(currentData, 1)
        }
      }
    },
    vueGetList: function (listName, cod) {
      var _res = parent.jsbrjz;
      $.each(_res, function (key, val) {
        if (key == listName) {
          val.forEach(function (value) {
            value['checked'] = false;
          })
        }
      });
      for (var i in _res) {
        if (vm['getMsg'].hasOwnProperty(i)) {
          vm['getMsg'][i] = _res[i]
        }
      }
      var getMsgList = vm.getMsg[listName];
      getMsgList.forEach(function (value) {
        if (value['infocode'] == cod) {
          value['checked'] = true;
        }
      })
    }
  }
}