import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        // khai báo mảng
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        // khai báo biến lưu tên tìm kiếm và gán giá trị nhập vào.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String inputName = scanner.nextLine();
        // Duyệt mảng tìm phần tử có giá trị bằng tên đã nhập.
        boolean Find = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)){
                System.out.printf("The student %s is finded at position %d",inputName,i);
                Find = true;
                break;
            }
        }
        if (!Find){
            System.out.printf("Not found %s in the list",inputName);
        }

    }
}
