
public class AnagramDetection {

	public static int Anagramdetect(String src, String pat){
		int [] asciiset = new int [256];
		for(int i=0; i < pat.length(); i++)
			asciiset[pat.charAt(i)]++;
		int [] patcopy = new int [256];
		System.arraycopy(asciiset, 0, patcopy, 0, 256);
		int cnt=0;
		int len=pat.length();
		for(int j=0; j < src.length()-len; j++){
			int k=0;
			while ((k < len) && patcopy[src.charAt(j+k)] >0){
				--patcopy[src.charAt(j+k)];
				++k;
			}
			if (k == len)cnt++;
			if( k > 0){
				System.arraycopy(asciiset, 0, patcopy, 0, 256);
			}
			
		}
		return cnt;
			
	}
	public static void main(String [] args){
		System.out.println(Anagramdetect("AdnBndAndBdaBn", "dAn"));
		System.out.println(Anagramdetect("AbrAcAadAbRa", "cAdaA"));
	}
}
