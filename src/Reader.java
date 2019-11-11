import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <TennisPlayer> playersList=new ArrayList<>();

        File file = new File("C:\\Users\\oskar\\IdeaProjects\\ZPO_Lab5_Zad1_new\\src\\File.txt");
        String line;
        Scanner scanner=null;

        try {
            scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (scanner.hasNext()){
            line=scanner.nextLine().replaceFirst(" ","\t");
            String[] fileDivision=line.split("\t",8);

            TennisPlayer player=new TennisPlayer(Integer.parseInt(fileDivision[0]),fileDivision[1],fileDivision[2]
                    ,fileDivision[3],Integer.parseInt(fileDivision[4]),Integer.parseInt(fileDivision[5])
                    ,Integer.parseInt(fileDivision[6]));
            playersList.add(player);
        }//end o while

        System.out.println(playersList);
        System.out.println();

        Collections.sort(playersList);
        System.out.println(playersList);

        Collections.sort(playersList,new LastNameComparatorFromTheHighest());
        System.out.println(playersList);

    }//end of main
}//end of class
