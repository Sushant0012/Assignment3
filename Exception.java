package Assign5;
public class Exception {
	public static void main(String[] args) {  
        int array[] = null;  
        int arraySize = 4;  
        int arrayInc = -0;  
        int output;  
        for (int i = 0; i < 6; i++) {  
            try {  
                switch (i) {  
                    case 0:  
                        output = array[0];  
                        break;  
                    case 1:  
                        array = new int[arrayInc];   
                        output = array[arrayInc];  
                        break;  
                    case 2:  
                        array = new int[arraySize];   
                        output = array[arraySize];  
                        break;  
                    case 3:  
                        array = new int[5];  
                        output = array[5];  
                    case 4:  
                        Object newArray = new Integer(0);
                        System.out.println((String) newArray);  
                    case 5:  
                        Object X[] = new String[-5]; 
                        X[0] = new Integer(0);  
                        System.out.println(X);  
                }  
            } catch (NullPointerException ex1) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex1.getMessage());  
                ex1.printStackTrace();  
            } catch (NegativeArraySizeException ex2) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex2.getMessage());  
                ex2.printStackTrace();  
            } catch (ArrayIndexOutOfBoundsException ex3) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex3.getMessage());  
                ex3.printStackTrace();  
            } catch (IndexOutOfBoundsException ex4) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex4.getMessage());  
                ex4.printStackTrace();  
            } catch (ClassCastException ex5) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex5.getMessage());  
                ex5.printStackTrace();  
            } catch (ArrayStoreException ex6) {  
                System.out.println("\n Exception Generated: "  
                    +  
                    ex6.getMessage());  
                ex6.printStackTrace();  
            }  
        }  
    }  
} 
