<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/sblogheader.jsp"%>

<%-- p98 목록화면 --%>
<div class="container-fluid mt-3">
	<form>
		<div class="mb-3">
			<label for="username" class="form-label">Password:</label> <input
				type="text" class="form-control" id="username"
				placeholder="Enter password" name="username">
		</div>
		<div class="mb-3">
			<label for="pwd" class="form-label">Password:</label> <input
				type="password" class="form-control" id="password"
				placeholder="Enter password" name="password">
		</div>
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <input
				type="email" class="form-control" id="email"
				placeholder="Enter email" name="email">
		</div>
	</form>
	<button id="btn-save" class="btn btn-primary">Submit회원가입</button>
</div>

<%@ include file="../layout/sblogfooter.jsp"%>