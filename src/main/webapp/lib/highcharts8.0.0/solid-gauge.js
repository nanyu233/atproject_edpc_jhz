/*
 Highcharts JS v8.0.0 (2019-12-10)

 Solid angular gauge module

 (c) 2010-2019 Torstein Honsi

 License: www.highcharts.com/license
*/
(function (b) { "object" === typeof module && module.exports ? (b["default"] = b, module.exports = b) : "function" === typeof define && define.amd ? define("highcharts/modules/solid-gauge", ["highcharts", "highcharts/highcharts-more"], function (k) { b(k); b.Highcharts = k; return b }) : b("undefined" !== typeof Highcharts ? Highcharts : void 0) })(function (b) {
  function k(b, e, k, t) { b.hasOwnProperty(e) || (b[e] = t.apply(null, k)) } b = b ? b._modules : {}; k(b, "modules/solid-gauge.src.js", [b["parts/Globals.js"], b["parts/Utilities.js"]], function (b, e) {
    var k =
      e.clamp, t = e.extend, v = e.isNumber, u = e.pick, w = e.pInt; e = e.wrap; e(b.Renderer.prototype.symbols, "arc", function (a, b, f, d, g, c) { a = a(b, f, d, g, c); c.rounded && (d = ((c.r || d) - c.innerR) / 2, c = ["A", d, d, 0, 1, 1, a[12], a[13]], a.splice.apply(a, [a.length - 1, 0].concat(["A", d, d, 0, 1, 1, a[1], a[2]])), a.splice.apply(a, [11, 3].concat(c))); return a }); var x = {
        initDataClasses: function (a) {
          var m = this.chart, f, d = 0, g = this.options; this.dataClasses = f = []; a.dataClasses.forEach(function (c, h) {
            c = b.merge(c); f.push(c); c.color || ("category" === g.dataClassColor ?
              (h = m.options.colors, c.color = h[d++], d === h.length && (d = 0)) : c.color = b.color(g.minColor).tweenTo(b.color(g.maxColor), h / (a.dataClasses.length - 1)))
          })
        }, initStops: function (a) { this.stops = a.stops || [[0, this.options.minColor], [1, this.options.maxColor]]; this.stops.forEach(function (a) { a.color = b.color(a[1]) }) }, toColor: function (a, b) {
          var f = this.stops, d = this.dataClasses, g; if (d) for (g = d.length; g--;) {
            var c = d[g]; var h = c.from; f = c.to; if (("undefined" === typeof h || a >= h) && ("undefined" === typeof f || a <= f)) {
              var m = c.color; b && (b.dataClass =
                g); break
            }
          } else { this.isLog && (a = this.val2lin(a)); a = 1 - (this.max - a) / (this.max - this.min); for (g = f.length; g-- && !(a > f[g][0]);); h = f[g] || f[g + 1]; f = f[g + 1] || h; a = 1 - (f[0] - a) / (f[0] - h[0] || 1); m = h.color.tweenTo(f.color, a) } return m
        }
      }; b.seriesType("solidgauge", "gauge", { colorByPoint: !0, dataLabels: { y: 0 } }, {
        drawLegendSymbol: b.LegendSymbolMixin.drawRectangle, translate: function () { var a = this.yAxis; t(a, x); !a.dataClasses && a.options.dataClasses && a.initDataClasses(a.options); a.initStops(a.options); b.seriesTypes.gauge.prototype.translate.call(this) },
        drawPoints: function () {
          var a = this, b = a.yAxis, f = b.center, d = a.options, g = a.chart.renderer, c = d.overshoot, h = v(c) ? c / 180 * Math.PI : 0, e; v(d.threshold) && (e = b.startAngleRad + b.translate(d.threshold, null, null, null, !0)); this.thresholdAngleRad = u(e, b.startAngleRad); a.points.forEach(function (c) {
            if (!c.isNull) {
              var e = c.graphic, l = b.startAngleRad + b.translate(c.y, null, null, null, !0), r = w(u(c.options.radius, d.radius, 100)) * f[2] / 200, n = w(u(c.options.innerRadius, d.innerRadius, 60)) * f[2] / 200, p = b.toColor(c.y, c), q = Math.min(b.startAngleRad,
                b.endAngleRad), m = Math.max(b.startAngleRad, b.endAngleRad); "none" === p && (p = c.color || a.color || "none"); "none" !== p && (c.color = p); l = k(l, q - h, m + h); !1 === d.wrap && (l = k(l, q, m)); q = Math.min(l, a.thresholdAngleRad); l = Math.max(l, a.thresholdAngleRad); l - q > 2 * Math.PI && (l = q + 2 * Math.PI); c.shapeArgs = n = { x: f[0], y: f[1], r: r, innerR: n, start: q, end: l, rounded: d.rounded }; c.startR = r; e ? (r = n.d, e.animate(t({ fill: p }, n)), r && (n.d = r)) : c.graphic = e = g.arc(n).attr({ fill: p, "sweep-flag": 0 }).add(a.group); a.chart.styledMode || ("square" !== d.linecap &&
                  e.attr({ "stroke-linecap": "round", "stroke-linejoin": "round" }), e.attr({ stroke: d.borderColor || "none", "stroke-width": d.borderWidth || 0 })); e && e.addClass(c.getClassName(), !0)
            }
          })
        }, animate: function (a) { a || (this.startAngleRad = this.thresholdAngleRad, b.seriesTypes.pie.prototype.animate.call(this, a)) }
      }); ""
  }); k(b, "masters/modules/solid-gauge.src.js", [], function () { })
});
//# sourceMappingURL=solid-gauge.js.map