package _02_File_Encrypt_Decrypt;

public class Encryption {
    
    public static String encryptMessage( String message, int step ) {
        switch( step ) {
        case 0:
            message = message.replace( 'a', '5' );
            message = message.replace( 'e', '4' );
            message = message.replace( 'i', '3' );
            message = message.replace( 'o', '2' );
            message = message.replace( 'u', '1' );
            break;
        case 1:
            String reverse = "";
            for( int i = message.length()-1; i >= 0; i-- ) {
                reverse += message.charAt( i );
            }
            message = reverse;
            break;
        case 2:
            message = message.replace( '5', 'a' );
            message = message.replace( '4', 'e' );
            message = message.replace( '3', 'i' );
            message = message.replace( '2', 'o' );
            message = message.replace( '1', 'u' );
            break;
        default:
            break;
        }
        
        return message;
    }
}
