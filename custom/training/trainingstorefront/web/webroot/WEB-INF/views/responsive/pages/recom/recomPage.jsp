<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>


<spring:htmlEscape defaultHtmlEscape="true"/>


<template:page pageTitle="${pageTitle}">

    <c:url value="/" var="homePageUrl"/>

    <cms:pageSlot position="MiddleContent" var="comp" element="div" class="errorNotFoundPageMiddle">
        <cms:component component="${comp}" element="div" class="errorNotFoundPageMiddle-component"/>
    </cms:pageSlot>

    <%--<cms:pageSlot position="BottomContent" var="comp" element="div" class="errorNotFoundPageBottom">--%>
    <%--<cms:component component="${comp}" element="div" class="errorNotFoundPageBottom-component"/>--%>
    <%--</cms:pageSlot>--%>

    <%--<c:forEach items="${​​​​​​​​productListData}​​​​​​​​" var="productData" varStatus="loop">--%>
    <%--<h1>${productData.name}</h1>--%>
    <%--</c:forEach>--%>

    <%--<table>--%>
    <%--<div class="col-sm-12 col-md-9">--%>
    <div class="container">
        <div class="row">
            <c:forEach items="${productListData}" var="productData" varStatus="loop">
                <div class="col-md-4">
                    <div class="list-product">
                        <div class="image-product">
                                <product:productPrimaryImage product="${product}" format="product"/>
                        </div>
                        <h3><c:out value="${productData.name}"/></h3>
                        <p>Sku: <c:out value="${productData.sku}"/></p>
                        <p>Material: <c:out value="${productData.material}"/></p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <%--</div>--%>
    <%--</table>--%>
    <%--<c:forEach items="${myMap}" var="entry">--%>
    <%--Key : <c:out value="${entry.key}"/> Value: <c:out value="${entry.value}"/> <br/>--%>
    <%--</c:forEach>--%>

    <%--<c:if test="${​​​​​​​​not empty ​​​​​​​​productListData}​​​​​​​​">--%>
    <%--</c:if>--%>
    <%--<h1>${product.name}</h1>--%>

    <%--<cms:pageSlot position="LowerContent" var="comp" element="div" class="termsLowerContent">--%>
    <%--<cms:component component="${comp}" element="div" class="errorNotFoundPageBottom-component"/>--%>
    <%--</cms:pageSlot>--%>

</template:page>