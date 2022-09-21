/* To avoid CSS expressions while still supporting IE 7 and IE 6, use this script */
/* The script tag referencing this file must be placed before the ending body tag. */

/* Use conditional comments in order to target IE 7 and older:
	<!--[if lt IE 8]><!-->
	<script src="ie7/ie7.js"></script>
	<!--<![endif]-->
*/

(function() {
	function addIcon(el, entity) {
		var html = el.innerHTML;
		el.innerHTML = '<span style="font-family: \'icomoon\'">' + entity + '</span>' + html;
	}
	var icons = {
		'at-fa-down': '&#xe900;',
		'at-fa-icon-auxilium': '&#xe901;',
		'at-fa-icon-nurse-station': '&#xe902;',
		'at-fa-icon-qjsgl': '&#xe903;',
		'at-fa-icon-quality-control': '&#xe904;',
		'at-fa-icon-stat-control': '&#xe905;',
		'at-fa-icon-system-manage': '&#xe906;',
		'at-fa-mini': '&#xe907;',
		'at-fa-put-away': '&#xe908;',
		'0': 0
		},
		els = document.getElementsByTagName('*'),
		i, c, el;
	for (i = 0; ; i += 1) {
		el = els[i];
		if(!el) {
			break;
		}
		c = el.className;
		c = c.match(/at-fa-[^\s'"]+/);
		if (c && icons[c[0]]) {
			addIcon(el, icons[c[0]]);
		}
	}
}());
