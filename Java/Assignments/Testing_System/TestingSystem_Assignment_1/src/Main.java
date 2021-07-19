import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // create department
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marking";

        // create group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Fresher";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "C# Fresher";

        // Create position
        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Sale";

        Position position2 = new Position();
        position1.id = 2;
        position1.name = "Marketing";

        // Create account
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "haidnag@gmail.com";
        account1.groups = new Group[] { group1, group2 };
        account1.position = position1;
        account1.department = department1;
        account1.fullname = "Nguyen Hai Dang";
        account1.createDate = LocalDate.now();
        account1.username = "hai_dang";

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "nguyenhaidang@gmail.com";
        account2.groups = new Group[] { group1 };
        account2.position = position2;
        account2.department = department2;
        account2.fullname = "Nguyen Hải Gang";
        account2.createDate = LocalDate.now();
        account2.username = "dang_black";

        // print department
        System.out.println("Department 1 information: ");

        System.out.println("name: " + department1.name);
        System.out.println("id: " + department1.id);
        System.out.println("\n");

        System.out.println("Department 2 information: ");

        System.out.println("name: " + department2.name);
        System.out.println("id: " + department2.id);
        System.out.println("\n");

        // print account
        System.out.println("Account 1 information: ");

        System.out.println("id: " + account1.id);
        System.out.println("Email: " + account1.email);
        System.out.println("Department Name: " + account1.department.name);
        System.out.println("Create Date: " + account1.createDate);



        //Question 1:
        System.out.println("Exe 1");
        if(account2.department==null){
            System.out.println("Nhân viên này chưa có phòng ban");
        }
        else{
            System.out.println("Phòng ban của nhân viên này là "+ account2.department.name);
        }

        //Question 2:
        System.out.println("Exe 2");
        if(account2.groups==null){
            System.out.println("Nhân viên này chưa có group");
        }
        else if(account2.groups.length <=2 && account2.groups.length >=1 ){
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        }
        else if(account2.groups.length==3 ){
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }
        else{
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        //Question 3:
        System.out.println("Exe 3");
        System.out.println(account2.department==null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là "+ account2.department.name);

        //Question 4:
        System.out.println("Exe 4");
        System.out.println(account1.position.name == "Dev" ? "Đây là Developer" : "Người này không phải là Developer" );

        //Question 5:
        System.out.println("Exe 5");
        int x=account1.groups.length;
        switch(x){
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Default");
                break;
            }

        //Question 6:
        System.out.println("Exe 6");
        int y =account2.groups.length ;
        switch(y){
            case 1:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            case 4:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;

            default:
                System.out.println("Nhân viên này chưa có group");
                break;
        }
        //Question 7:
        System.out.println("Exe 7");
        int z = account1.position.name.length();
            switch (z) {
                case 1:
                    System.out.println("Đây là Developer");
                    break;
                default:
                    System.out.println("Người này không phải là Developer");
                    break;
            }
        //Question 8:
        System.out.println("Exe 8");
        List<String> list = new ArrayList<String>();
        list.add(account1.fullname);
        list.add(account1.email);
        list.add(account1.department.name);
        list.add(account2.fullname);
        list.add(account2.email);
        list.add(account2.department.name);
        for(String obj : list){
            System.out.println(obj);
        }
        //Question 10:
        System.out.println("Exe 10");
        for(int i=1;i<=2;i++){
            System.out.println("Thông tin account thứ " + i + " là:");
            if(i==1){
                System.out.println("Email:"+ account1.email);
                System.out.println("Full name:"+ account1.fullname);
                System.out.println("Phòng ban:"+ account1.position.name);
            }
            else{
                System.out.println("Email:"+ account2.email);
                System.out.println("Full name:"+ account2.fullname);
                System.out.println("Phòng ban:"+ account2.position.name);
            }
        }
        //Question 16:
        System.out.println("Exe 16");
        int i=1;
        while ( i < 3){
            System.out.println("Thông tin account thứ " + i + " là:");
            if(i==1){
                System.out.println("Email:"+ account1.email);
                System.out.println("Full name:"+ account1.fullname);
                System.out.println("Phòng ban:"+ account1.position.name);
            }
            else{
                System.out.println("Email:"+ account2.email);
                System.out.println("Full name:"+ account2.fullname);
                System.out.println("Phòng ban:"+ account2.position.name);
            }
            i++;
        }
        //Question 17:
        System.out.println("Exe 17");
        do {
            System.out.println("Thông tin account thứ " + i + " là:");
            if(i==1){
                System.out.println("Email:"+ account1.email);
                System.out.println("Full name:"+ account1.fullname);
                System.out.println("Phòng ban:"+ account1.position.name);
            }
            else{
                System.out.println("Email:"+ account2.email);
                System.out.println("Full name:"+ account2.fullname);
                System.out.println("Phòng ban:"+ account2.position.name);
            }
            i++;
        }
        while (i<3);
        //Question 17:
        System.out.println("Exe 17");
    }

}
