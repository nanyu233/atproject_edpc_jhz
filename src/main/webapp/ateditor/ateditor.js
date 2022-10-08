/*! (c) 2017 Andrea Giammarchi (ISC) */
(function() {
  "use strict";

  var EventTarget = (function() {
    "use strict";
    var t = "object" == typeof global ? global : self,
        e =
            [].findIndex ||
            function(t, e) {
              for (var n = this.length; n--; ) if (t.call(e, this[n])) return n;
              return n;
            },
        n = Object.defineProperty,
        r = "__event-target__" + Math.random(),
        i =
            t.WeakMap ||
            function() {
              return {
                get: function(t) {
                  return t[r];
                },
                set: function(t, e) {
                  n(t, r, { configurable: !0, value: e });
                },
              };
            },
        a = t.EventTarget;
    try {
      new a();
    } catch (o) {
      a = (function() {
        function t() {}
        function r(t) {
          var e = t.options;
          e && e.once && u.call(t.target, this.type, t.listener, t.options), "function" == typeof t.listener ? t.listener.call(t.target, this) : t.listener.handleEvent(this);
        }
        function a(t) {
          return this === t.listener;
        }
        function o(t, n, r) {
          var i = f(this),
              o = i[t] || (i[t] = []);
          e.call(o, a, n) < 0 && o.push({ target: this, listener: n, options: r });
        }
        function c(t) {
          var e = f(this),
              n = e[t.type];
          return n && (h(t, { currentTarget: this, target: this }), n.forEach(r, t), delete t.currentTarget, delete t.target), !0;
        }
        function u(t, n, r) {
          var i = f(this),
              o = i[t];
          if (o) {
            var c = e.call(o, a, n);
            -1 < c && o.splice(c, 1);
          }
        }
        function l() {}
        var s = new i(),
            f = function(t) {
              return s.get(t) || v(t);
            },
            v = function(t) {
              var e = new l();
              return s.set(t, e), e;
            },
            h = function(t, e) {
              for (var r in e) n(t, r, { configurable: !0, value: e[r] });
            };
        return h(t.prototype, { addEventListener: o, dispatchEvent: c, removeEventListener: u }), (l.prototype = Object.create(null)), t;
      })();
    }
    return a;
  })();

  /**
   * @category utils/lang
   * @param {Function} fn
   * @returns {boolean}
   */
  function isConstructor(fn) {
    try {
      new fn();
      return true;
    } catch (e) {
      return false;
    }
  }

  if (window.EventTarget === undefined || !isConstructor(window.EventTarget)) {
    window.EventTarget = EventTarget;
  }
})();

// Core
(function() {
  "use strict";

  /**
   * @category EventEmitter
   */
  function EventEmitter() {
    this.target = new EventTarget();
  }
  EventEmitter.prototype.on = function(eventName, listener) {
    return this.target.addEventListener(eventName, listener);
  };
  EventEmitter.prototype.once = function(eventName, listener) {
    return this.target.addEventListener(eventName, listener, { once: true });
  };
  EventEmitter.prototype.off = function(eventName, listener) {
    return this.target.removeEventListener(eventName, listener);
  };
  EventEmitter.prototype.dispatch = function(eventName, detail) {
    if (navigator.userAgent.indexOf("MSIE") !== -1 || navigator.appVersion.indexOf("Trident/") > 0) {
      var evt = document.createEvent("CustomEvent");
      evt.initCustomEvent(eventName, false, true, detail);
      return this.target.dispatchEvent(evt);
    }

    return this.target.dispatchEvent(new CustomEvent(eventName, { detail: detail, cancelable: true }));
  };

  /**
   * @category utils/lang
   * @param {*} value
   * @returns {boolean}
   */
  function isNullable(value) {
    return value === null || value === undefined;
  }

  /**
   * @category utils/lang
   * @param {*} value
   * @returns {boolean}
   */
  function isEmptyString(value) {
    return isNullable(value) || value === "";
  }

  /**
   * @category utils/lang
   * @param {string} type 'Object' | 'Array' | 'String' | 'Boolean' | 'Number'
   * @returns {(value) => boolean}
   */
  function isType(type) {
    return function(value) {
      return Object.prototype.toString.call(value) === "[object " + type + "]";
    };
  }

  var isString = isType("String");
  var isObject = isType("Object");
  var isArray = isType("Array");

  /**
   * @category utils/lang
   * @param {any[]} arr
   * @param {(value, index) => boolean} filter
   * @returns
   */
  function ArrayFilter(arr, filter) {
    if (!isArray(arr) || arr.length === 0) return [];

    var newArr = [];

    for (var i = 0; i < arr.length; i++) {
      var value = arr[i];

      if (filter(value, i)) {
        newArr.push(value);
      }
    }

    return newArr;
  }

  /**
   * @category utils/lang
   * @param {ArrayLike} arrayLike
   * @returns {Array}
   */
  function ArrayFrom(arrayLike) {
    return Array.prototype.slice.call(arrayLike);
  }

  /**
   * @category utils/lang
   * @param {any[]} arr
   * @param {(value, index) => any} mapper
   * @returns
   */
  function ArrayMap(arr, mapper) {
    if (!isArray(arr) || arr.length === 0) return [];

    var newArr = [];

    for (var i = 0; i < arr.length; i++) {
      var value = arr[i];
      newArr[i] = mapper(value, i);
    }

    return newArr;
  }

  var ObjectAssign =
      Object.assign ||
      function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
          s = arguments[i];
          for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p)) t[p] = s[p];
        }
        return t;
      };

  /**
   * @category utils/url
   * @param {string} url
   * @returns {string}
   */
  function removeURLPrefixSlash(url) {
    return url.replace(/^\/+/, "");
  }

  /**
   * @category utils/url
   * @param {string} url
   * @returns {string}
   */
  function removeURLSuffixSlash(url) {
    return url.replace(/\/+$/, "");
  }

  /**
   * @category utils/url
   * @param {string[]} urls
   * @returns {string}
   */
  function buildFullPath() {
    var urls = ArrayFrom(arguments);
    if (urls.length === 0) return "";

    var removedPrefixSlashUrls = ArrayMap(urls, function(url, i) {
      return i === 0 ? url : removeURLPrefixSlash(url);
    });
    var removedSuffixSlashUrls = ArrayMap(removedPrefixSlashUrls, removeURLSuffixSlash);
    var filteredNonNullableUrls = ArrayFilter(removedSuffixSlashUrls, function(url) {
      return url && url !== "";
    });
    var result = filteredNonNullableUrls.join("/");
    return result;
  }

  /**
   * @category utils/url
   * @param {string} url
   * @returns {string} origin
   */
  function getOrigin(url) {
    try {
      var _url = new URL(url);

      return _url.origin;
    } catch (e) {
      return removeURLSuffixSlash(url);
    }
  }

  /**
   *
   * @typedef {import('./types').AtEditorConfig} AtEditorConfig
   */

  /**
   * @category editor
   * @param {Partial<AtEditorConfig>} config
   * @returns {AtEditorConfig}
   */
  function normalizeConfig(config) {
    config = ObjectAssign({}, window.atEditorConfig || {}, config);
    var id = config.id;
    var clientBaseUrl = config.clientBaseUrl;
    var page = config.page;
    var systemId = config.systemId;
    var userId = config.userId;
    var userName = config.userName;
    var patientId = config.patientId;
    var patientName = config.patientName;
    var debug = config.debug;
    var showEditorToolbar = config.showEditorToolbar;
    var showCaseHistoryList = config.showCaseHistoryList;

    var pageEnum = ["structtext", "cases"];
    var pageCases = pageEnum[1];

    function requiredError(option) {
      throw Error("editor config => " + option + " is required");
    }

    if (isEmptyString(id)) return requiredError("id");
    if (isEmptyString(clientBaseUrl)) return requiredError("clientBaseUrl");
    if (isEmptyString(systemId)) return requiredError("systemId");
    if (isEmptyString(userId)) return requiredError("userId");
    if (isEmptyString(userName)) return requiredError("userName");

    if (isEmptyString(page)) return requiredError("page");
    if (pageEnum.indexOf(page) === -1) throw Error("editor config => page error, allowed pages: " + pageEnum.join(","));
    if (page === pageCases) {
      if (isEmptyString(patientId)) return requiredError("patientId");
      if (isEmptyString(patientName)) return requiredError("patientName");
    }

    if (isNullable(debug)) config.debug = false;
    if (debug == true) config.debug = true;
    if (isNullable(showEditorToolbar)) config.showEditorToolbar = false;
    if (showEditorToolbar == true) config.showEditorToolbar = true;
    if (isNullable(showCaseHistoryList)) config.showCaseHistoryList = false;
    if (showCaseHistoryList == true) config.showCaseHistoryList = true;

    return config;
  }

  /**
   * @category editor
   * @param {AtEditorConfig} config
   * @returns {string}
   */
  function buildEditorFrameUrl(config) {
    var clientBaseUrl = config.clientBaseUrl;
    var page = config.page;
    var systemId = config.systemId;
    var userId = config.userId;
    var userName = config.userName;
    var patientId = config.patientId;
    var patientName = config.patientName;

    if (config.page === "structtext") {
      return buildFullPath(clientBaseUrl, page, "system", systemId, "user", userId, userName);
    }

    return buildFullPath(clientBaseUrl, page, "system", systemId, "user", userId, userName, "patient", patientId, patientName);
  }

  /**
   *
   * @param config
   * @return {AtEditorFrame}
   */
  function defineEditorFrame(config) {
    config = normalizeConfig(config);
    var debug = config.debug;
    var frameId = config.id;
    var frameName = config.id;
    var frameBaseUrl = config.clientBaseUrl;
    var frameUrl = buildEditorFrameUrl(config);
    var frameOrigin = getOrigin(frameBaseUrl);

    var frameElem = document.getElementById(frameId);
    if (!frameElem) throw Error("Couldn't find target element: #" + frameId);
    if (frameElem.tagName !== "IFRAME") throw Error("target element: #" + frameId + "is not iframe");

    var frameWin = frameElem.contentWindow;
    var frameEventEmitter = new EventEmitter();

    frameElem.name = frameName;
    frameElem.src = frameUrl;
    frameElem.onload = function() {
      debug && console.log("#" + frameId + ": loaded");
    };
    frameElem.onerror = function(e) {
      this.dataset.loaded = "error";
      throw e;
    };

    /**
     *
     * @param {MessageEvent} event
     */
    function _handleMessageEvent(event) {
      if (event.origin !== frameOrigin) return false;
      switch (event.data.type) {
        case "connecting": {
          frameElem.dataset.loaded = "loaded";
          debug && console.log("parent: connecting");
          return dispatch({
            type: "connected",
          });
        }
        default: {
          debug && console.log("parent:", event.data);
          frameEventEmitter.dispatch(event.data.type, event.data.payload || event.data);
        }
      }
    }

    window.removeEventListener("message", _handleMessageEvent);
    window.addEventListener("message", _handleMessageEvent, false);

    function _requiredMessageError(key) {
      throw Error("editor dispatch => message." + key + " is required");
    }

    function _dispatchMessageError(message) {
      throw Error("editor dispatch => message is invalid\nYour args:" + JSON.stringify(message) + '\navaliable args: { type: string, payload: any } || ("type", "payload")');
    }

    function _normalizeMessage(args) {
      args = ArrayFrom(args);
      var arg0 = args[0];
      var arg1 = args[1];
      var message;

      if (args.length === 1 && isObject(arg0)) {
        if (isEmptyString(arg0.type)) return _requiredMessageError("type");
        message = arg0;
      } else if (args.length === 1 && isString(arg0)) {
        message = { type: arg0 };
      } else if (args.length === 2 && isString(arg0)) {
        message = { type: arg0 };
        message.payload = arg1;
      } else {
        return _dispatchMessageError(message);
      }

      return message;
    }

    function _postMessage(message) {
      frameWin.postMessage({ type: message.type, payload: message.payload, id: "editor" }, "*");
    }

    function _listenerMapper(listener) {
      listener._listener = function _listener(event) {
        event.data = event.detail || {};
        listener(event);
      };
      return listener._listener;
    }

    function unsubscribe() {
      window.removeEventListener("message", _handleMessageEvent);
    }

    function dispatch() {
      var message = _normalizeMessage(arguments);
      var isLoaded = frameElem.dataset.loaded === "loaded";
      var isLoadError = frameElem.dataset.loaded === "error";

      if (isLoaded) {
        _postMessage(message);
      } else if (isLoadError) {
        debug && console.error("iframe load error");
      } else {
        var _onload = frameElem.onload;
        frameElem.onload = function onload() {
          _onload.apply(this, arguments);
          _postMessage(message);
        };
      }
    }

    function on(type, listener) {
      return frameEventEmitter.on(type, _listenerMapper(listener));
    }

    function once(type, listener) {
      return frameEventEmitter.once(type, _listenerMapper(listener));
    }

    function off(type, listener) {
      return frameEventEmitter.off(type, listener._listener);
    }

    return {
      unsubscribe: unsubscribe,
      dispatch: dispatch,
      on: on,
      once: once,
      off: off,
    };
  }

  window.defineEditorFrame = defineEditorFrame;
})();
