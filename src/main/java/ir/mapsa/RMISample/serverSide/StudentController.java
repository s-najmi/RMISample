package ir.mapsa.RMISample.serverSide;

import ir.mapsa.RMISample.common.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private static List<Student> stdList = new ArrayList<>();
    static {
        stdList.add(new Student(1, "soheila najmi", "123123"));
        stdList.add(new Student(2, "maryam gholami", "123456"));
        stdList.add(new Student(3, "ali asgari", "123789"));
        stdList.add(new Student(4, "emad noori", "456456"));
        stdList.add(new Student(5, "taghi taghavi", "456789"));
        stdList.add(new Student(6, "mozhgan tavakoli", "789789"));
        stdList.add(new Student(7, "zohreh hasani", "789123"));
        stdList.add(new Student(8, "asad akbari", "147147"));
    }

    public static Student getByID(long id){
        for(Student st: stdList){
            if (st.getId() == id){
                return st;
            }
        }
        return null;
    }

    public static List<Student> getAll(){
        return stdList;
    }
}
