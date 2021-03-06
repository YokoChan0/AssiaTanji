<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.83.1">
    <title>Page1</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

    <!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/5.0/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.0/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/5.0/assets/img/favicons/safari-pinned-tab.svg" color="#7952b3">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      .identi{
            padding-left: 350px;
            padding-top:100px;
            border-radius: 4px;
            width: 700px;
            height: 900px;
      }
      .lien_autenti{
             text-decoration: none;
      }
      .mb-4{
            justify-content: center;
      }
      h1{
             text-align: center;
      }
      p{
         text-align: center;
         font-size: 1.1em;
      }
      .ajouterlivre{
           font-size: 1.5em;
      }
       .identi{
            padding-left: 350px;
            padding-top:100px;
            border-radius: 4px;
            width: 700px;
            height: 900px;
      }
    </style>
    
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
</head>
<body>
<div class="identi">
      <% String login = request.getParameter("login"); %>
     <h1>Bonjour Mr/Mlle: <%out.print(login); %></h1>
     <p>Vous pouvez Acces d'un livre soit par : </p>
     <a href="http://localhost:8082/TanjiAssia/EnterCategorie.jsp"  class="w-100 btn btn-lg btn-primary" role="button"> Recherche par categorie</a><br>
      <p>ou par : </p>
       <a href="http://localhost:8082/TanjiAssia/EnterAuteur.jsp"  class="w-100 btn btn-lg btn-primary" role="button"> lister par auteur</a><br><br>
       <a href="ConsultAllBookServlet"  class="w-100 btn btn-lg btn-primary" role="button"> Consulter tout les livres</a><br>
       <br><br><p class="ajouterlivre">Voulez-vous ajouter un autre livre : </p>
        <a href="http://localhost:8082/TanjiAssia/AddBook.jsp"  class="w-100 btn btn-lg btn-primary" role="button"> Ajouter livre</a>
</div>


















</body>
</html>