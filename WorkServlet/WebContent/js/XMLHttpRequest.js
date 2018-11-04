
	var httprequest;
	function createXMLHttpRequest() {
		if (window.XMLHttpRequest) {
			httprequest = new XMLHttpRequest();
		} else {
			try {
				httprequest = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				httprequest = new ActiveXObject(" Msxml2.XMLHTTP ");
			}
		}
	}
