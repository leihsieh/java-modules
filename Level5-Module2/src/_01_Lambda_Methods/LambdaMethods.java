package _01_Lambda_Methods;

public class LambdaMethods {
    public static void main(String[] args) {
        // 1. Look at the SpecialPrinter function interface.

        // Here is an example of calling the printCustomMessage method with a lambda.
        // This prints the passed in String 10 times.
        printCustomMessage( (s)-> {
            for( int i = 0; i < 10; i++ ) {
                System.out.println( s );
            }
        }, "repeat" );

        // 2. Call the printCustonMessage method using a lambda so that the String
        // prints backwards.
        printCustomMessage( (str)-> {
            for( int i = str.length() - 1; i >= 0; i-- ) {
                System.out.print( str.charAt( i ) );
            }
            System.out.println( "" );
        }, "backwards" );

        // 3. Call the printCustonMessage method using a lambda so that the String
        // prints with a mix between upper an lower case characters.
        printCustomMessage( (str)-> {
            for( int i = 0; i < str.length(); i++ ) {
                if( i%2 == 0 ) { 
                    System.out.print( str.substring( i, i+1 ).toUpperCase() );
                } else {
                    System.out.print( str.substring( i, i+1 ).toLowerCase() );
                }
            }
            System.out.println( "" );
        }, "mixed case word" );

        // 4. Call the printCustonMessage method using a lambda so that the String
        // prints with a period in between each character.
        printCustomMessage( (str)-> {
            for( int i = 0; i < str.length(); i++ ) {
                
                System.out.print( str.charAt( i ) );
                
                if( i != str.length() - 1 ) {
                    System.out.print( "." );
                }
            }
            System.out.println( "" );
        }, "mixedperiodstring" );
        
        // 5. Call the printCustonMessage method using a lambda so that the String
        // prints without any vowels.
        printCustomMessage( (str)-> {
            for( int i = 0; i < str.length(); i++ ) {
                char c = str.charAt( i );
                if( c != 'a' && c != 'e' && c!= 'i' && c != 'o' && c != 'u' ) {
                    System.out.print( c );
                }
            }
        }, "This text has no vowels" );
    }

    public static void printCustomMessage(SpecialPrinter sp, String value) {
        sp.printSpecial( value );
    }
}
