import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {
public String menu();
public void join(ArrayList<Member>member,HashMap<String,String>loginId);//ȸ������
public void logIn(ArrayList<Member>member,HashMap<String,String>loginId);//�α���
public void logout(HashMap<String,String>loginId);//�α׾ƿ�
public void searchMem(ArrayList<Member>member);//ȸ�������˻�
public void showMem(ArrayList<Member>member,Admin a);
public void setProduct(ArrayList<Product>product);
public void buy(ArrayList<Member>member,HashMap<String,String>loginId,ArrayList<Product>product,
ArrayList<BuyList>buyList);
public void showBuyList(ArrayList<BuyList>buyList);


}
