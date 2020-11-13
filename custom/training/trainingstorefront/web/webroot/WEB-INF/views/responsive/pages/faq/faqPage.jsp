<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<template:page pageTitle="${pageTitle}">

    <c:url value="/" var="homePageUrl" />

    <cms:pageSlot position="MiddleContent" var="comp" element="div" class="errorNotFoundPageMiddle">
        <cms:component component="${comp}" element="div" class="errorNotFoundPageMiddle-component" />
    </cms:pageSlot>
    <cms:pageSlot onclick="BottomContent" position="BottomContent" var="comp" element="div" class="errorNotFoundPageBottom">
        <cms:component component="${comp}" element="div" class="errorNotFoundPageBottom-component"/>
    </cms:pageSlot>
    <cms:pageSlot position="LowerContent" var="feature" element="div" class="termsLowerContent">
        <cms:component component="${feature}" element="div" class="errorNotFoundPageSide-component"/>
    </cms:pageSlot>

</template:page>