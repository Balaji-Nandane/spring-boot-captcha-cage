
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

   <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee</title>
	<c:set var="path" value="${pageContext.request.contextPath}"/>
	<link rel="stylesheet" href="${path}/webjars/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="${path}/webjars/font-awesome/4.7.0/css/font-awesome.min.css">   </head>

   <body>
      <form:form  method="POST" action="${path}/saveExpense" modelAttribute="expense">
      <div class="form-group">
      								<div class="col-md-12">
      									<div class="input-group input-group-md">
      										<span class="input-group-addon">
      											<span class="glyphicon glyphicon-user"></span>
      										</span>
         <form:input class="form-control" path="item" placeholder="item" required="true"/>
         <br>
               <div class="form-group">
               								<div class="col-md-12">
               									<div class="input-group input-group-md">
               										<span class="input-group-addon">
               											<span class="glyphicon glyphicon-user"></span>
               										</span>
         <form:input  class="form-control"  path="amount" placeholder="amount" required="true"/>
         </div>
         								</div>
         							</div>


         									<div class="form-group">
                                            								<div class="col-md-12" align="right">
                                            									<a href="${path}/listExpense" class="btn btn-primary btn-xs">
                                            										<span class="glyphicon glyphicon-list List"></span> Employee List
                                            									</a>
                                            									<button type="submit" class="btn btn-success btn-xs">
                                            										<span class="glyphicon glyphicon-floppy-disk"></span> Save
                                            									</button>
                                            								</div>
                                            							</div>
      </form:form>
   </body>

</html>