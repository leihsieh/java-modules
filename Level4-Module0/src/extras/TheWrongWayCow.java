
public class TheWrongWayCow {
    public static int[] findWrongWayCow(final char[][] field) {
        int numCows = 0;
        int xCowCoord = -1;
        int yCowCoord = -1;
        final int NORTH = 0;
        final int EAST = 1;
        final int SOUTH = 2;
        final int WEST = 3;
        String strToSearch = "cow";
        String strToSearchRev = "woc";

        for( int direction = NORTH; direction <= WEST; direction++ ) {
            numCows = 0;

            switch( direction ){

            case EAST:
            case WEST:

                // Check if column width is large enough to fit a cow
                // Can use row 0 because field is guaranteed to be rectangular
                if( field[0].length >= strToSearch.length() ) {

                    for( int row = 0; row < field.length; row++ ) {

                        for( int col = 0; col <= field[row].length - strToSearch.length(); col++ ) {
                            String curWord = "";

                            for( int letter = col; letter < col + strToSearch.length(); letter++ ) {
                                curWord += field[row][letter];
                            }

                            if( direction == EAST && curWord.equals( strToSearchRev ) ) {
                                xCowCoord = row;
                                yCowCoord = col + ( strToSearch.length() - 1 );
                                col += strToSearch.length();
                                numCows++;
                            } else if( direction == WEST && curWord.equals( strToSearch ) ) {
                                xCowCoord = row;
                                yCowCoord = col;
                                col += strToSearch.length();
                                numCows++;
                            }
                        }
                    }
                    // Else, there can't be any cows here so leave cow count at 0
                }
                break;

            case NORTH:
            case SOUTH:

                // Check if row height is large enough to fit a cow
                if( field.length >= strToSearch.length() ) {

                    // Can use row 0 because field is guaranteed to be rectangular
                    for( int col = 0; col < field[0].length; col++ ) {

                        for( int row = 0; row <= field.length - strToSearch.length(); row++ ) {
                            String curWord = "";

                            for( int letter = row; letter < row + strToSearch.length(); letter++ ) {
                                curWord += field[letter][col];
                            }

                            if( direction == SOUTH && curWord.equals( strToSearchRev ) ) {
                                xCowCoord = row + ( strToSearch.length() - 1 );
                                yCowCoord = col;
                                row += strToSearch.length();
                                numCows++;
                            } else if( direction == NORTH && curWord.equals( strToSearch ) ) {
                                xCowCoord = row;
                                yCowCoord = col;
                                row += strToSearch.length();
                                numCows++;
                            }
                        }
                    }
                }
                // Else, there can't be any cows here so leave cow count at 0
                break;

            default:
                // Should never get here
                break;
            }

            // Rules say there is exactly 1 WWC
            if( numCows == 1 ) {
                break;
            }
        } // end for directions

        return new int[] { yCowCoord, xCowCoord };
    }

}