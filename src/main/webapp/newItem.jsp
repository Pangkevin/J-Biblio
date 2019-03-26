<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Basic interface</title>
	</head>
	<body>
		<form method="POST" action="../item">
			<div>
				<h1>Create Person</h1>
				<input type="text" name="idItem" placeholder="ID (Number)"/>
				<input type="text" name="idManifestation" placeholder="ID Manifestation"/>
				<input type="text" name="itemIdentifier" placeholder="Identifier"/>
				<input type="text" name="fingerprint" placeholder="Fingerprint"/>
				<input type="text" name="provenanceOfTheItem" placeholder="Provenance"/>
			</div>
		</form>
	</body>
</html>