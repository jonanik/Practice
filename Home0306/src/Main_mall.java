
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

      String[] memCategory = { "회원번호", "ID", "PSW", "보유금액", "포인트" };
      String id = "";
      String psw = "";
      

      Scanner scan = new Scanner(System.in);
      loop2: while (true) {
         System.out.println("쇼핑몰");
         System.out.println("1.회원가입   2.로그인   3.로그아웃   4.상품구매");
         System.out.println("5.회원검색   6.회원정보보기  7.구매목록 확인 0.프로그램 종료");
         System.out.println("메뉴를 선택하세요.");
         int select = scan.nextInt();
         switch (select) {
         case 1:
            loop1: while (true) {
               System.out.println("회원가입 메뉴입니다.");
               System.out.println("ID를 입력해주세요.(이전메뉴:99)");
               m.id = scan.next();
               if (m.id.equals("99")) {
                  break;
               }
               for (int i = 0; i < signIn.size(); i++) {
                  Member m0 = signIn.get(i);
                  if (signIn.isEmpty()) {
                     System.out.println("등록된 ID가 없습니다.");
                  } else if (m.id.equals(m0.id)) {
                     System.out.println("같은 아이디가 존재합니다. 다른 아이디를 입력해주세요.");
                     continue loop1;
                  }

               }

               if (m.id.length() < 3) {
                  System.out.println("아이디를 3자리 이상으로 입력해주세요.");
                  continue;
               }
               loop3:
               while(true) {

                  int pswCount=0;
               System.out.println("PSW를 입력해주세요.");
               m.psw = scan.next();
               for (int i = 0; i < m.psw.length(); i++) {
                  if (m.psw.charAt(i) >= 'A' && m.psw.charAt(i) <='Z' ) {
                     pswCount++;
                  }
                  
               }
               if(pswCount==0) {
                  System.out.println("대문자를 1개 이상 입력하세요.");
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
               System.out.println("로그인 메뉴입니다.(이전메뉴:99)");
               System.out.println("ID를 입력해주세요.");
               id = scan.next();
               if (id.equals("99")) {
                  break;
               }
               if (signIn.isEmpty()) {
                  System.out.println("회원 목록이 없습니다.");
                  break;
               }

               for (int i = 0; i < signIn.size(); i++) {
                  Member m1 = (Member) signIn.get(i);
                  if ((id.equals(m1.id))) {
                     System.out.println("아이디가 일치합니다.");
                     System.out.println("PSW를 입력해주세요");
                     psw = scan.next();
                     if ((psw.equals(m1.psw))) {
                        System.out.println("로그인 하셨습니다.");
                        logIn.add(new Member(m1.id, m1.psw));
                        continue loop2;
                     } else {
                        System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
                        continue loop1;
                     }

                  }

               }

            }

            break;
         case 3:
            System.out.println("로그아웃 하시겠습니까?(y/n)");
            String yn1 = scan.next();
            if (yn1.equals("y")) {
               System.out.println("로그아웃합니다.");
               logIn.clear();
            } else if (yn1.equals("n")) {
               System.out.println("이전메뉴로 돌아갑니다.");
               break;
            }

            break;

         case 4:
            
            if (logIn.isEmpty()) {         
               System.out.println("로그인을 하셔야 이용이 가능합니다.");

            } else {
               while (true) {
                  System.out.println("상품구매 메뉴입니다.");
                  System.out.println("상품구매를 위해 제품을 선택해주세요(이전메뉴:99)");
                  System.out.println("1.LCDTV  2.LEDTV  3.OLEDTV");
                  System.out.println("4.일반냉장고  5.양문형냉장고");
                  System.out.println("6.통돌이세탁기  7.드럼세탁기  8.드럼건조세탁기");
                  int look1 = scan.nextInt();
                  if (look1 == 99) {
                     break;
                  }
                  switch (look1) {
                  case 1:
                     System.out.println("LCDTV입니다.");
                     p.see(new LCDTV());
                     Product t7=new LCDTV();
                     System.out.println("LCDTV를 구매하시겠습니까?(y/n)");
                     String yn = scan.next();
                     if (yn.equals("y")) {
                        m.buy(new LCDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t7.name));
                     } else if (yn.equals("n")) {
                        break;
                     }
                     break;
                  case 2:
                     System.out.println("LEDTV입니다.");
                     p.see(new LEDTV());
                     Product t6=new LEDTV();
                     System.out.println("LEDTV를 구매하시겠습니까?(y/n)");
                     String yn0 = scan.next();
                     if (yn0.equals("y")) {
                        m.buy(new LEDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t6.name));
                     } else if (yn0.equals("n")) {
                        break;
                     }
                     break;
                  case 3:
                     System.out.println("OLEDTV입니다.");
                     p.see(new OLEDTV());
                     Product t5=new OLEDTV();
                     System.out.println("OLEDTV를 구매하시겠습니까?(y/n)");
                     String yn2 = scan.next();
                     if (yn2.equals("y")) {
                        m.buy(new OLEDTV());
                        sList.add(new ShoppinList(logIn.get(0).id,t5.name));
                     } else if (yn2.equals("n")) {
                        break;
                     }
                     break;
                  case 4:
                     System.out.println("일반냉장고입니다.");
                     p.see(new Onegate());
                     Product t4=new Onegate();
                     System.out.println("일반냉장고를 구매하시겠습니까?(y/n)");
                     String yn3 = scan.next();
                     if (yn3.equals("y")) {
                        m.buy(new Onegate());
                        sList.add(new ShoppinList(logIn.get(0).id,t4.name));

                     } else if (yn3.equals("n")) {
                        break;
                     }
                     break;
                  case 5:
                     System.out.println("양문형냉장고입니다.입니다.");
                     p.see(new Twogate());
                     Product t3=new Twogate();
                     System.out.println("양문형냉장고를 구매하시겠습니까?(y/n)");
                     String yn4 = scan.next();
                     if (yn4.equals("y")) {
                        m.buy(new Twogate());
                        sList.add(new ShoppinList(logIn.get(0).id,t3.name));
                     } else if (yn4.equals("n")) {
                        break;
                     }
                     break;
                  case 6:
                     System.out.println("통돌이세탁기입니다.");
                     p.see(new TongLaun());
                     Product t=new TongLaun();
                     System.out.println("통돌이세탁기를 구매하시겠습니까?(y/n)");
                     String yn5 = scan.next();
                     if (yn5.equals("y")) {
                        m.buy(new TongLaun());
                        sList.add(new ShoppinList(logIn.get(0).id, t.name));

                     } else if (yn5.equals("n")) {
                        break;
                     }
                     break;
                  case 7:
                     System.out.println("드럼세탁기입니다.");
                     p.see(new DrumLaun());
                     Product t1=new DrumLaun();
                     System.out.println("드럼세탁기를 구매하시겠습니까?(y/n)");
                     String yn6 = scan.next();
                     if (yn6.equals("y")) {
                        m.buy(new DrumLaun());
                        sList.add(new ShoppinList(logIn.get(0).id,t1.name));
                     } else if (yn6.equals("n")) {
                        break;
                     }
                     break;
                  case 8:
                     System.out.println("드럼건조세탁기입니다.");
                     p.see(new DDLaun());
                     Product t2=new DDLaun();
                     System.out.println("드럼건조세탁기를 구매하시겠습니까?(y/n)");
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
            System.out.println("회원검색 메뉴입니다.");
            System.out.println("검색하실 회원의 ID를 입력하세요.");
            String searchM = scan.next();
            for (int i = 0; i < signIn.size(); i++) {
               Member m3 = (Member) signIn.get(i);
               if (signIn.isEmpty()) {
                  System.out.println("회원 목록이 없습니다.");
               } else {
                  if (searchM.equals(m3.id)) {
                     System.out.println(m3);
                     break;
                  }
               }

            }
            break;
         case 6:
            System.out.println("회원정보보기 메뉴입니다.");
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
            System.out.println("프로그램을 종료합니다.");
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
