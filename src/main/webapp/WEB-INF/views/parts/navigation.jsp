<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>       
<!DOCTYPE html>



<div class="cointainer">
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">Welcome to my assignment 2</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="${pageContext.request.contextPath}/">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>

          <li class="nav-item">
		  		<a class="nav-link" href="${pageContext.request.contextPath}/page2">Page 2</a>
          </li>
          
          <li class="nav-item">
            	<form:form action="${pageContext.request.contextPath}/logout" method="post">
            		<input type="submit" value="logout" class="nav-link" id="logout">
            	</form:form>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</div>

