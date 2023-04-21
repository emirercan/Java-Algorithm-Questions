/*Return the century of the input year.
The input will always be a 4 digit string, so there is no need for validation.

        Examples
        "1999" --> "20th"
        "2011" --> "21st"
        "2154" --> "22nd"
        "2259" --> "23rd"
        "1124" --> "12th"
        "2000" --> "20th"
*/
public class WhatCenturyIsIt {
    public static String whatCentury(int year) {
        int century = year/100;

        if(century%100 != 0){
            century++;
        }

        if(century/10 == 1) {
            return century + "th";
        }

        return switch (century % 10) {
            case 1 -> century + "st";
            case 2 -> century + "nd";
            case 3 -> century + "rd";
            default -> century + "th";
        };
    }
}
