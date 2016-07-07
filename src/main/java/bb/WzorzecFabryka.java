package bb;

public class WzorzecFabryka {

	public static Start getInstance(int q){
		if (q==1)
		return new ViewStart();
		else
			return new VievStart2();
		
	}
	
}
