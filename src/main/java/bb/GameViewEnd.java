package bb;


public class GameViewEnd implements Zakonczenie{

	String inscription = "end";
	
	public String GetInscription()
	{
		return inscription;
	}
	
	public void view()
	{
		System.out.println(inscription);
	}

}
