import java.util.*;

public class TablePrinter {
    public static void print(Table table){
        int col = table.column;
        //title
        System.out.println("---------------" + table.name + "---------------");
        //columnName
        for (int i = 0; i < col; i++) {
            System.out.printf("%" + 20 + "s",table.title.get(i));
        }
        //content
        Iterator<ArrayList<String>> iterator = table.content.iterator();
        ArrayList<String> columnStr = new ArrayList<>();
        while (iterator.hasNext()) {
            columnStr = iterator.next();
            for (int i = 0; i < col; i++) {
                System.out.printf("%" + 20 + "s", columnStr.get(i));
            }
        }
    }
}
