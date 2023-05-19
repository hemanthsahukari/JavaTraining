
//Generic Method

/*
//Type parameters
T - Type
E - Element
K - Key
N - Number
V - Value
 */

package Generecs;

class TestGenerics2{

    public static < E > void printArray(E[] elements) {       //E denote element
        for ( E element : elements){
            System.out.println(element );
        }
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'H','E','M','A','N','T' ,'H'};

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }
}
