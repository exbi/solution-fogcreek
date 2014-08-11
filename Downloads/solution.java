import java.util.ArrayList;


public class solution {

	
	/**
	 * @author Dan 
	 *  
	 */
	
	static String letters = "acdegilmnoprstuw";
	
	public static void main(String[] args) {
		 
		 //System.out.println(hash("leepadg"));
		 System.out.println(locate(910897038977002L));
		 
	}

	 
	static long hash (String s) {
	        long h = 7;
	        //long temp = 0, index_num = 0;
	        for(int i = 0; i < s.length(); i++) {
	        	//temp = h;
	            h = (h * 37 + letters.indexOf(s.charAt(i)));
	           
	           //System.out.println("INDEX NUM OR " +letters.indexOf(s.charAt(i)));
	           //index_num = (h - (temp*37));
	           // System.out.println("INDEX NUM " + index_num);
	            
	            System.out.println(h);
	        }
	            return h;
	    }
	 
	 
	 static String locate(long _h){
		 StringBuilder b = new StringBuilder(); 
		 int e, i = 0; 
		 ArrayList <Integer> n = new ArrayList<Integer>(); 
		 //System.out.println(_h);
		 while(_h > 37) {
		 e = (int) (_h % 37); _h = (_h/37);
		 n.add(e);
		 //System.out.println(n.get(i));
		 i++;
		 }
		 
		for(int k = n.size() - 1; k >= 0; k--) {
		  b.append( letters.charAt(n.get(k)));
		 }
		 
		 
		 return b.toString();
	}
	 
	 
}
