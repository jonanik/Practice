import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {
public String menu();
public void join(ArrayList<Member>member,HashMap<String,String>loginId);//회원가입
public void logIn(ArrayList<Member>member,HashMap<String,String>loginId);//로그인
public void logout(HashMap<String,String>loginId);//로그아웃
public void searchMem(ArrayList<Member>member);//회원정보검색
public void showMem(ArrayList<Member>member,Admin a);
public void setProduct(ArrayList<Product>product);
public void buy(ArrayList<Member>member,HashMap<String,String>loginId,ArrayList<Product>product,
ArrayList<BuyList>buyList);
public void showBuyList(ArrayList<BuyList>buyList);


}
