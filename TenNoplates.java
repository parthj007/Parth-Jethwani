import java.util.*;

public class TenNoplates {
	public static void main(String[] args) {
		int i=0;
		for(i = 0;i<10;i++)
		{
			int no = (int) (Math.random()*10000);
			
			System.out.println("AGM-"+Math.abs(no));
			
		}
	}

}