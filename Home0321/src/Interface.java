import java.util.ArrayList;

public interface Interface {
String main();
void inputScore(ArrayList<Student> stuList);
void printScore(ArrayList<Student> stuList,String[] category);
void searchStu(ArrayList<Student> stuList,ArrayList<Student> reinput);
void reinput(ArrayList<Student> stuList,ArrayList<Student> reinput);
void rankprocess(ArrayList<Student> stuList,String[] category);
void printRank();

}
