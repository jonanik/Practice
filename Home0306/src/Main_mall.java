
import java.util.ArrayList;
import java.util.Scanner;

public class Main_mall {

   public static void main(String[] args) {

      ArrayList<Member> signIn = new ArrayList<Member>();
      ArrayList<Member> logIn = new ArrayList<Member>();
      ArrayList<ShoppinList> sList = new ArrayList<ShoppinList>();
      Member m = new Member();
      Product p = new Product();
      m.mNum = 0;

      String[] memCategory = { "ȸ����ȣ", "ID", "PSW", "�����ݾ�", "����Ʈ" };
      String id = "";
      String psw = "";
      

      Scanner scan = new Scanner(System.in);
      loop2: while (true) {
         System.out.println("���θ�");
         System.out.println("1.ȸ������   2.�α���   3.�α׾ƿ�   4.��ǰ����");
         System.out.println("5.ȸ���˻�   6.ȸ����������  7.���Ÿ�� Ȯ�� 0.���α׷� ����");
         System.out.println("�޴��� �����ϼ���.");
         int select = scan.nextInt();
         switch (select) {
         case 1:
            loop1: while (true) {
               System.out.println("ȸ������ �޴��Դϴ�.");
               System.out.println("ID�� �Է����ּ���.(�����޴�:99)");
               m.id = scan.next();
               if (m.id.equals("99")) {
                  break;
               }
               for (int i = 0; i < signIn.size(); i++) {
                  Member m0 = signIn.get(i);
                  if (signIn.isEmpty()) {
                     System.out.println("��ϵ� ID�� �����ϴ�.");
                  } else if (m.id.equals(m0.id)) {
                     System.out.println("���� ���̵� �����մϴ�. �ٸ� ���̵� �Է����ּ���.");
                     continue loop1;
                  }

               }

               if (m.id.length() < 3) {
                  System.out.println("���̵� 3�ڸ� �̻����� �Է����ּ���.");
                  continue;
               }
               loop3:
               while(true) {

                  int pswCount=0;
               System.out.println("PSW�� �Է����ּ���.");
               m.psw = scan.next();
               for (int i = 0; i < m.psw.length(); i++) {
                  if (m.psw.charAt(i) >= 'A' && m.psw.charAt(i) <='Z' ) {
                     pswCount++;
                  }
                  
               }
               if(pswCount==0) {
                  System.out.println("�빮�ڸ� 1�� �̻� �Է��ϼ���.");
                  continue loop3;
               }
               break;
               }
               m.mNum++;
               signIn.add(new Member(m.mNum, m.id, m.psw));
               
            }
            break;
         case 2:
            loop1: while (true) {
               System.out.println("�α��� �޴��Դϴ�.(�����޴�:99)");
               System.out.println("ID�� �Է����ּ���.");
               id = scan.next();
               if (id.equals("99")) {
                  break;
               }
               if (signIn.isEmpty()) {
                  System.out.println("ȸ�� ����� �����ϴ�.");
                  break;
               }

               for (int i = 0; i < signIn.size(); i++) {
                  Member m1 = (Member) signIn.get(i);
                  if ((id.equals(m1.id))) {
                     System.out.println("���̵� ��ġ�մϴ�.");
                     System.out.println("PSW�� �Է����ּ���");
                     psw = scan.next();
                     if ((psw.equals(m1.psw))) {
                        System.out.println("�α��� �ϼ̽��ϴ�.");
                        logIn.add(new Member(m1.id, m1.psw));
                        continue loop2;
                     } else {
                        System.out.println("���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
                        continue loop1;
                     }

                  }

               }

            }

            break;
         case 3:
            System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?(y/n)");
            String yn1 = scan.next();
            if (yn1.equals("y")) {
               System.out.println("�α׾ƿ��մϴ�.");
               logIn.clear();
            } else if (yn1.equals("n")) {
               System.out.println("�����޴��� ���ư��ϴ�.");
               break;
            }

            break;

         case 4:
            
            if (logIn.isEmpty()) {         
               System.out.println("�α����� �ϼž� �̿��� �����մϴ�.");

            } else {
               while (true) {
                  System.out.println("��ǰ���� �޴��Դϴ�.");
                  System.out.println("��ǰ���Ÿ� ���� ��ǰ�� �������ּ���(�����޴�:99)");
                  System.out.println("1.LCDTV  2.LEDTV  3.OLEDTV");
                  System.out.println("4.�Ϲݳ����  5.�繮�������");
                  System.out.println("6.�뵹�̼�Ź��  7.�巳��Ź��  8.�巳������Ź��");
                  int look1 = scan.nextInt();
                  if (look1 == 99) {
                     break;
                  }
                  switch (look1) {
                  case 1:
                     System.out.println("LCDTV�Դϴ�.");
                     p.see(new LCDTV());
                     Product t7=new LCDTV();
                     System.out.println("LCDTV�� �����Ͻðڽ��ϱ�?(y/n)");
                     String yn = scan.next();
                     if (yn.equals("y")) {
                        m.buy(new LCDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t7.name));
                     } else if (yn.equals("n")) {
                        break;
                     }
                     break;
                  case 2:
                     System.out.println("LEDTV�Դϴ�.");
                     p.see(new LEDTV());
                     Product t6=new LEDTV();
                     System.out.println("LEDTV�� �����Ͻðڽ��ϱ�?(y/n)");
                     String yn0 = scan.next();
                     if (yn0.equals("y")) {
                        m.buy(new LEDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t6.name));
                     } else if (yn0.equals("n")) {
                        break;
                     }
                     break;
                  case 3:
                     System.out.println("OLEDTV�Դϴ�.");
                     p.see(new OLEDTV());
                     Product t5=new OLEDTV();
                     System.out.println("OLEDTV�� �����Ͻðڽ��ϱ�?(y/n)");
                     String yn2 = scan.next();
                     if (yn2.equals("y")) {
                        m.buy(new OLEDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t5.name));
                     } else if (yn2.equals("n")) {
                        break;
                     }
                     break;
                  case 4:
                     System.out.println("�Ϲݳ�����Դϴ�.");
                     p.see(new Onegate());
                     Product t4=new Onegate();
                     System.out.println("�Ϲݳ���� �����Ͻðڽ��ϱ�?(y/n)");
                     String yn3 = scan.next();
                     if (yn3.equals("y")) {
                        m.buy(new Onegate());
                        sList.add(new ShoppinList(logIn.get(0).id,t4.name));

                     } else if (yn3.equals("n")) {
                        break;
                     }
                     break;
                  case 5:
                     System.out.println("�繮��������Դϴ�.�Դϴ�.");
                     p.see(new Twogate());
                     Product t3=new Twogate();
                     System.out.println("�繮������� �����Ͻðڽ��ϱ�?(y/n)");
                     String yn4 = scan.next();
                     if (yn4.equals("y")) {
                        m.buy(new Twogate());
                        sList.add(new ShoppinList(logIn.get(0).id,t3.name));
                     } else if (yn4.equals("n")) {
                        break;
                     }
                     break;
                  case 6:
                     System.out.println("�뵹�̼�Ź���Դϴ�.");
                     p.see(new TongLaun());
                     Product t=new TongLaun();
                     System.out.println("�뵹�̼�Ź�⸦ �����Ͻðڽ��ϱ�?(y/n)");
                     String yn5 = scan.next();
                     if (yn5.equals("y")) {
                        m.buy(new TongLaun());
                        sList.add(new ShoppinList(logIn.get(0).id, t.name));

                     } else if (yn5.equals("n")) {
                        break;
                     }
                     break;
                  case 7:
                     System.out.println("�巳��Ź���Դϴ�.");
                     p.see(new DrumLaun());
                     Product t1=new DrumLaun();
                     System.out.println("�巳��Ź�⸦ �����Ͻðڽ��ϱ�?(y/n)");
                     String yn6 = scan.next();
                     if (yn6.equals("y")) {
                        m.buy(new DrumLaun());
                        sList.add(new ShoppinList(logIn.get(0).id,t1.name));
                     } else if (yn6.equals("n")) {
                        break;
                     }
                     break;
                  case 8:
                     System.out.println("�巳������Ź���Դϴ�.");
                     p.see(new DDLaun());
                     Product t2=new DDLaun();
                     System.out.println("�巳������Ź�⸦ �����Ͻðڽ��ϱ�?(y/n)");
                     String yn7 = scan.next();
                     if (yn7.equals("y")) {
                        m.buy(new DDLaun());
                        sList.add(new ShoppinList(logIn.get(0).id,t2.name));
                        System.out.println(sList.get(0).toString());
                     } else if (yn7.equals("n")) {
                        break;
                     }
                     break;

                  }

               }
            }

            break;

         case 5:
            System.out.println("ȸ���˻� �޴��Դϴ�.");
            System.out.println("�˻��Ͻ� ȸ���� ID�� �Է��ϼ���.");
            String searchM = scan.next();
            for (int i = 0; i < signIn.size(); i++) {
               Member m3 = (Member) signIn.get(i);
               if (signIn.isEmpty()) {
                  System.out.println("ȸ�� ����� �����ϴ�.");
               } else {
                  if (searchM.equals(m3.id)) {
                     System.out.println(m3);
                     break;
                  }
               }

            }
            break;
         case 6:
            System.out.println("ȸ���������� �޴��Դϴ�.");
            for (int i = 0; i < memCategory.length; i++) {
               System.out.print(memCategory[i] + "\t");
            }
            System.out.println();
            for (int i = 0; i < signIn.size(); i++) {
               Member e = signIn.get(i);
               System.out.println(e);
            }
            break;
         case 0:
            System.out.println("���α׷��� �����մϴ�.");
            break loop2;

         case 7:
            for (int i = 0; i < sList.size(); i++) {
               
               System.out.println(sList.get(i).toString());
            }
            break;
         }

      }
   }
}
