# AtEditor

## 使用

```html
<!-- 全局默认配置 -->
<script type="text/javascript" src="${baseurl}ateditor/config.js"></script>
<script type="text/javascript" src="${baseurl}ateditor/ateditor.js"></script>


<iframe id="editor"></iframe>


<script>
    // 访问全局默认配置
    console.log(window.atEditorConfig)
    // 初始化编辑器
    var atEditor = defineEditorFrame({
        id: 'editor',
        // ... 会继承全局默认配置
    })
</script>
```

## 触发和监听事件

`atEditor.dispatch`触发事件, `atEditor.on`监听事件, 触发的事件都会有对应的监听

> *不区分大小写* 但是触发和监听的事件类型大小写要一致

```js
// 触发事件
atEditor.dispatch(/* type */ "save");
atEditor.dispatch({ type: "save" });
// 监听事件
atEditor.on("save", function saveListener(event){ /* event.data 编辑器返回的数据 */ })

// 触发事件 - 传参
atEditor.dispatch(/* type */ "insertCase", /* payload */ "caseno");
atEditor.dispatch({ type: "insertCase", payload: "caseno"});
```

## 可使用的事件

[查看](./types.d.ts)
