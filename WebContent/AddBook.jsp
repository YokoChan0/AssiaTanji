<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.83.1">
    <title>Add book</title>

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
            padding: 20px;
            margin-left: 270px;
            margin-top:100px;
            border-radius: 4px;
            width: 500px;
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
    </style>
    
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
     
<main class="form-signin">
<div class="identi">
  <form action="AddBookServlet" method="Post">
   <img class="mb-4" src="images/AddBook.png" alt="AddBook" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Ajouter un livre</h1>

    <div class="form-floating">
      <label for="floatingInput">Titre  </label><br><br>
      <input type="Text"  name="titre" class="form-control" id="floatingInput" placeholder="Titre">
    </div>
    <div class="form-floating">
      <label for="floatingInput">Auteur  </label><br><br>
      <input type="Text"  name="auteur" class="form-control" id="floatingInput" placeholder="Auteur">
    </div>
    <div class="form-floating">
      <label for="floatingInput">Categorie   </label><br><br>
      <input type="Text"  name="cate" class="form-control" id="floatingInput" placeholder="Categorie"><br><br>
    </div>

    <button class="w-100 btn btn-lg btn-primary" type="submit">Ajouter</button>
  </form>
  </div>
</main>
  
  </body>
</html>