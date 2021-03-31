<%@ page language="java" import="java.util.*" contentType="text/javascript" pageEncoding="UTF-8"%>

<%@ taglib uri="http://smarket.ods.com/base" prefix="base" %>

<%
response.addHeader("Cache-Control", "max-age=3600");
%>

var _I = (function() {
    var msgs = ${base:json(msgs)};
    
    var i18n = function(msgid) {
        var msg = msgs[msgid];

        return msg != null? msg: msgid;
    };
    
    return {
        mark: i18n,
        tr: i18n
    };
})();

