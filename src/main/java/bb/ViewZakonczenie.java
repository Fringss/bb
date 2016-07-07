package bb;


public class ViewZakonczenie implements Zakonczenie {



	String inscription = "Koniec programu. Przedstawienie wzorca adapter is done.";
	
	String GetInscription()
	{
		return inscription;
	}
	
	public void view() {
		System.out.println(inscription);
		
	}

}
