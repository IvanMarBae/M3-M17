
package practicap18;

import java.util.Scanner;


public class PracticaP18 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int option = -1;
        int euro;
        double dolarsDouble;
        float dolarsf;
        
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    
                    System.out.println("Euros");
                    euro=keyboard.nextInt();
                    dolarsf = functionIntToFloat(euro);
                    System.out.println(dolarsf);
                    break;
                case 2:
                    
                    System.out.println("Euros");
                    euro=keyboard.nextInt();
                    dolarsDouble = functionIntToDouble(euro);
                    System.out.println(dolarsDouble);
                    break;
                case 3:
                    
                    System.out.println("Euros");
                    euro=keyboard.nextInt();
                    String euros = functionIntToString(euro);
                    System.out.println(euros);
                    break;
                    
                case 4:
                    System.out.println("Euros");
                    String eurotext=keyboard.next();
                    int resultadoInt = functionStringToInt(eurotext);
                    System.out.println(resultadoInt);
                    break;
                case 5:
                    System.out.println("Euros");
                    float floatresult = keyboard.nextFloat();
                    int intresult =functionFloatToInt(floatresult);
                    System.out.println(intresult);
                    break;
                case 6:
                    
                    System.out.println("Euros");
                    euro=keyboard.nextInt();
                    String eurostexto = functionFloatToString(euro);
                    System.out.println(eurostexto);
                    
                    break;
                case 7:
                    System.out.println("Letra");
                    String letras =keyboard.next();
                    char letra = letras.charAt(0);
                    functionCharToAscii (letra);
                    break;
                case 8:
                    System.out.println("name?:");
                    String name=keyboard.next();
                    
                    String nameBinary= functionStringToBinary(name);
                    System.out.println(nameBinary);
                    
                    break;
                case 9:
                    System.out.print("Number?:");
                    int number= keyboard.nextInt();
                    char ch=functionIntToChar(number);
                    System.out.println(number + ":" +ch);
                    break;
                case 10:
                    ascii();
                    
                    
                    break;
                case 0:
                    //p0();
                    break;
                default:
                    System.out.println("Option no aviable");
            }
        }
    }
        private static void userMenu() {
        System.out.println("Iván Martínez");
        System.out.println("Option 1-(euros)");
        System.out.println("Option 2-(Marks)");
        System.out.println("Option 3-(DADO)");
        System.out.println("Option 4-(Numbers 2)");
        System.out.println("Option 5-(Marks M3)");
        System.out.println("Option 6-(Dates M3)");
        System.out.println("Option 7-(Said a number)");
        System.out.println("Option 0- ");
        System.out.print("\nOption == ? ");
    }

        
    private static float functionIntToFloat(int boxEuro){
        float result=0;
      
       // result = (float) (boxEuro * 1.1f);
        result= Float.valueOf(boxEuro*1.1f);
        return result;
    }
    private static String functionFloatToString(int boxEuro){
        
        String result= String.valueOf(boxEuro*1.1f);
        return result;
    }
    private static double functionIntToDouble(int boxEuro){
        double result=0;
        result= Double.valueOf(boxEuro*1.1f);
        return result;
    }
    private static String functionIntToString(int boxEuro){
        float result=0;
        result= functionIntToFloat(boxEuro);
        String texto= String.valueOf(result);
        return texto;
       
    }
    private static int functionStringToInt(String boxEuro){
        float result=0;
        result = Float.valueOf(boxEuro);
        result = result * 1.1f;
        int resultadoInt = (int)result;
        return resultadoInt;
    }
    private static int functionFloatToInt(float boxEuro){
        int result=0;
        float resultFloat = boxEuro*1.1f;
        result = (int)resultFloat;
        return result;
    }
    private static void functionCharToAscii(char letra){
        int ascii = (int)letra;
        System.out.println(ascii);
        System.out.println(Integer.toBinaryString(ascii));
    }
    private static String functionStringToBinary(String name){
        String result="";
        char ch;
        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i);
        result += Integer.toBinaryString(ch)+" ";
        }
        
        return result;
    }
    private static char functionIntToChar(int number){
        char ch=' '; 
        ch=(char)number;// hacer una conversion forzadaç(explicita) CAST
        return ch;
    }
    private static void ascii(){
        for ( int i=0; i<255; i++){
            System.out.println(i + "\t" + Integer.toString(i, 16)+ "t" + (char)i);
        }
    }
    } 
    

