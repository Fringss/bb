package bb;


public class ViewStart implements Start {



	String inscription = "start";
	
	String GetInscription()
	{
		return inscription;
	}
	
public void view()
{
	System.out.println(inscription);
}

}
