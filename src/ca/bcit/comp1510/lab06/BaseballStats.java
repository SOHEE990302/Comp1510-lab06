package ca.bcit.comp1510.lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * BaseballStats class reads a file with baseball stats and prints each part of
 * the file as well as counts and prints the number of hits, outs, walks, and
 * sacrifices as well as the batting average for each player.
 * 
 * The file should be organized as follows: each line of the file contains the
 * name of the player followed by a list of symbols indicating what happened on
 * each at-bat for the player. The letter h indicates a hit, o an out, w a walk,
 * and s a sacrifice fly. Each item on the line is separated by a comma. There
 * are no blank spaces except in the player name.
 * 
 * @author soheehwang
 * @version 2023
 */
public class BaseballStats {

    /**
     * adfsd.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = scan.nextLine();
        scan.close();
        try {
            Scanner fileScan = new Scanner(new File("resource/", fileName));
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String playerName = lineScan.next();
                int numHits = 0;
                int numOuts = 0;
                int numWalks = 0;
                int numSacrifices = 0;
                while (lineScan.hasNext()) {
                    String atBatCode = lineScan.next();
                    System.out.println(atBatCode);
                    if (atBatCode.equals("h")) {
                        numHits++;
                    } else if (atBatCode.equals("o")) {
                        numOuts++;
                    } else if (atBatCode.equals("w")) {
                        numWalks++;
                    } else if (atBatCode.equals("s")) {
                        numSacrifices++;
                    }
                }
                lineScan.close();
                double battingAverage = (double) numHits / (numHits + numOuts);
                System.out.println(playerName + " stats:" + "  Hits: " + numHits
                        + "  Outs: " + numOuts + "  Walks: " + numWalks
                        + "  Sacrifices: " + numSacrifices
                        + "  Batting Average: " + battingAverage);

            }
            fileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}


