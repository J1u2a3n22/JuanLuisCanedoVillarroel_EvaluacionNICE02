/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion;

/**
 *
 * @author Juan Luis
 */
public class Evaluacion {

    /**
     * @param args the command line arguments
     */
    /*
   public static void main(String[] args) {
		String str = "DelfStack";
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
	}
    
     */
    public static String sortInnerContent(String word) {
        String[] words = word.split(" ");
        String result = "";
        int size=0,count=0;
        for (var element : words) {
            String wordAux = element;
            size=wordAux.length();
            StringBuilder auxString = new StringBuilder(element);
            word = auxString.reverse().toString();
            if(word.length()!=1)
            {
                word=wordAux.charAt(0)+word.substring(0,size-1)+wordAux.charAt(size-1); 
            }
            if(count==0){
               result=result+word;
            }else{
                result=result+" "+word;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
        var result1=sortInnerContent("sort the inner content in descending order");
        System.out.println(result1);
    }

}
