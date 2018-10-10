import java.util.Scanner;

public class Underscore {
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println ("Kelime girin");
		String str = s.next();
		
		int uzunluk = str.length();
		
		char[] karakterDizisi = new char[uzunluk];
		karakterDizisi = str.toCharArray();	
		
		ReplaceUnderscoreWithSpace (karakterDizisi);
		
		System.out.println (karakterDizisi);
	}
	
	static void ReplaceUnderscoreWithSpace (char[] s) {                     
		
		int ilk = IlkIndisBulma(s);
		int son = SonIndisBulma(s);
		
		for (int i = ilk + 1; i < son; i++)
			if (s[i] == '_')
				s[i] = ' ';
			
		for (int j = 0; j < ilk; j++)
			s[j] = '_';
		
		for (int k = s.length - 1; k > son; k--)
			s[k] = '_';
	}
	
	static int IlkIndisBulma (char[] dizi) {
		
		int i;
		for (i = 0; i < dizi.length & dizi[i] == '_'; i++)
			;
		return i;
	}
	
	static int SonIndisBulma (char[] dizi) {
		
		int j;
		for (j = dizi.length-1 ; j >= 0 & dizi[j] == '_'; j--)
			;
		return j;
	}
}
