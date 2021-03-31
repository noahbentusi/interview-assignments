<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://jhorstmann.net/taglib/i18n" prefix="i" %>

<%@ taglib uri="http://smarket.ods.com/base" prefix="base" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="title" value=""/>

<script type="text/javascript">
var $ctx = "${ctx}";
var $lang = "${lang}";
</script>

