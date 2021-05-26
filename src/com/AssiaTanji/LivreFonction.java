package com.AssiaTanji;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LivreFonction {
	//lister par categorie
	public static Livre consultAuteur(String auteur) {
		Livre l = null;
		LivreDB.connect();
		ResultSet rs = LivreDB.select("select * from user where Auteur="+auteur);
		try {
			if(rs.next())
			{
				l=new Livre();
				l.setIdLivre(rs.getInt(1));
				l.setTitre(rs.getString(2));
				l.setAuteur(rs.getString(3));
				l.setCategorie(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
}
	//lister par categorie
	public static Livre consultCategorie(String cate) {
		Livre l = null;
		LivreDB.connect();
		ResultSet rs = LivreDB.select("select * from user where Auteur="+cate);
		try {
			if(rs.next())
			{
				l=new Livre();
				l.setIdLivre(rs.getInt(1));
				l.setTitre(rs.getString(2));
				l.setAuteur(rs.getString(3));
				l.setCategorie(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
}
	//Add livre
	public static int addBook(Livre l) 
	{				
		int nb=0;
		 LivreDB.connect();
		String sql = "insert into user(idLivre,Titre,Auteur,Categorie) values ('"+l.getIdLivre()+ "','"+l.getTitre()+"' ,'"+l.getAuteur()+"', '"+l.getCategorie()+"' )";
		nb=LivreDB.Maj(sql);
		LivreDB.disconnect();
				
			return nb;	 
				
	}
	
	
	
}
