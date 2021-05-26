package com.AssiaTanji;

public class UserFonction {
	
	public static int addUser(User u) 
	{				
		int nb=0;
		 UserDB.connect();
		String sql = "insert into user(Name,Prenom,log,motPass) values ('"+u.getNom()+ "','"+u.getPrenom()+"' ,'"+u.getLogin()+"', '"+u.getmotPass()+"' )";
		nb=UserDB.Maj(sql);
		UserDB.disconnect();
				
			return nb;	 
				
	}
}
