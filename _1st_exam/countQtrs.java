/*
takes an int representing a number of cents as a param and
returning the number of quarter coins represented by that many cents.
Don't count any whole dollars
*/

public static int countQtrs(int c) {
    int qtrs = c / 25 ;
    int change;

    if (c >= 100) {
        qtrs = qtrs % 4;
        change = qtrs;
    } else {
        change = qtrs;
    }
    return change;
}

// alternatively, not using IF statement

public static int countQtrs(int c) {
    int change = (c%100)/25;
    return change;
}