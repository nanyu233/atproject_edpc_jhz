(function() {
    /**
     * @type {Partial<import('./types').AtEditorConfig>}
     */
    var config = {
      systemId: "emis",
      clientBaseUrl: "http://192.168.3.25:20910/",
      serverBaseUrl: "http://192.168.3.25:8400/atEditor/",// 编辑器独立后台地址
      // serverBaseUrl: "http://192.168.3.25:20900/api/",// 编辑器独立后台地址
    };
  
    window.atEditorConfig = Object.freeze(config);
  })();
  